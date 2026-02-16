import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoGato extends JFrame implements ActionListener {
    private JButton[] botones = new JButton[9];
    private boolean turnoX = true; // True para Jugador 1 (X), False para Jugador 2 (O)
    private String nombreJugador1, nombreJugador2;
    private JLabel etiquetaTitulo;

    /* Constructor para los nombres de los jugadores */
    public JuegoGato() {
        nombreJugador1 = JOptionPane.showInputDialog("Nombre del Jugador 1 (X):");
        nombreJugador2 = JOptionPane.showInputDialog("Nombre del Jugador 2 (O):");

        /* Deja los nombres por defecto en caso de que no se ingresen al iniciar */
        if (nombreJugador1 == null || nombreJugador1.isEmpty()) nombreJugador1 = "Jugador 1";
        if (nombreJugador2 == null || nombreJugador2.isEmpty()) nombreJugador2 = "Jugador 2";

        /* Configuración de la ventana del juego */
        setTitle("El gato - The cat - Tic Tac Toe");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        /* Esta línea sirve para agregar color al fondo */
        getContentPane().setBackground(new Color(00, 00, 00));

        /* Agrega texto al contenido de la ventana, en este caso el titulo del juego y la fuente */
        etiquetaTitulo = new JLabel("El gato, the cat", SwingConstants.CENTER);
        etiquetaTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        etiquetaTitulo.setForeground(Color.YELLOW);
        etiquetaTitulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(etiquetaTitulo, BorderLayout.NORTH);

        /* Configuración para el panel o tablero de juego de 3x3 */
        JPanel panelTablero = new JPanel();

        /* Elegimos el tamaño de 3 filas, 3 columnas con un espaciado de 5 pixeles entre ellas */
        panelTablero.setLayout(new GridLayout(3, 3, 5, 5));
        panelTablero.setBackground(Color.DARK_GRAY);

        /* Aquí definimos el tamaño y color de los recuadros */
        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("");
            botones[i].setFont(new Font("Arial", Font.BOLD, 60));
            botones[i].setFocusable(false);
            botones[i].setBackground(new Color(236, 240, 241));
            botones[i].addActionListener(this);
            panelTablero.add(botones[i]);
        }

        add(panelTablero, BorderLayout.CENTER);
        setLocationRelativeTo(null); /* Centra el juego en la pantalla */
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botonClickeado = (JButton) e.getSource();

        /* Creamos el verificador de recuadro para únicamente utilizar los que estén vacíos */
        if (botonClickeado.getText().equals("")) {
            if (turnoX) {
                botonClickeado.setText("X");
                botonClickeado.setForeground(Color.RED); // Color para X
                turnoX = false;
            } else {
                botonClickeado.setText("O");
                botonClickeado.setForeground(Color.BLUE); // Color para O
                turnoX = true;
            }
            verificarGanador();
        }
    }

    public void verificarGanador() {
        String ganador = "";

        /* Se crea el método para verificar al ganador ingresando las posibles maneras de ganar */
        int[][] combinaciones = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Filas
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columnas
                {0, 4, 8}, {2, 4, 6}             // Diagonales
        };

        /* Se añade el verficador para elegir si el ganador fue el jugador "X" o el "O" */
        for (int[] c : combinaciones) {
            if (botones[c[0]].getText().equals(botones[c[1]].getText()) &&
                    botones[c[0]].getText().equals(botones[c[2]].getText()) &&
                    !botones[c[0]].getText().equals("")) {

                if (botones[c[0]].getText().equals("X")) {
                    ganador = nombreJugador1;
                } else {
                    ganador = nombreJugador2;
                }
                mostrarResultado("¡Felicidades " + ganador + "! Has ganado.");
                return;
            }
        }

        /* este es el verificador del empate */
        boolean empate = true;
        for (JButton b : botones) {
            if (b.getText().equals("")) {
                empate = false;
                break;
            }
        }

        if (empate) {
            mostrarResultado("¡Es un Empate!");
        }
    }

    /* Muestra el resultado y cierra el juego */
    private void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
        System.exit(0);
    }

    public static void main(String[] args) {
        // Ejecutar el programa
        new JuegoGato();
    }
}