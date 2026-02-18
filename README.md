# El-gato-The-cat.


## INTRODUCCIÓN
Juego del gato porteado de JavaScript por @marcft a Java para la versión 25.0.2


## REQUISITOS E INSTALACIÓN
 **Requisitos técnicos**
-	Versión actualizada de Java (8 o superior) 
-	Versión de Java JDK 25.0.2
-	Sistema operativo Windows
**Instalación y ejecución**
- Paso 1: Entrar a GitHub 
Abre tu navegador y escribe en la barra de direcciones: github.com. También puedes simplemente buscar "GitHub" en Google y hacer clic en el primer resultado.

- Paso 2: Buscar el repositorio 
Una vez ingresado a la página de GitHub nos dirigiremos a la esquina superior derecha y ubicaremos la barra de búsqueda al lado izquierdo de los botones Sign in y Sign up. 
Y escribiremos lo siguiente “El gato. The cat”

- Paso 3: Ingresar al repositorio.
Como indica la flecha nos dirigiremos al repositorio “motionblur69/El-gato-The-cat.” Indicado en la imagen

- Paso 4: descargar el juego y ejecutarlo.
Después de entrar en el repositorio iremos al apartado de “Releases” 
Y daremos clic para descargar el archivo “TheGatoGame.rar”
  
- Paso 5: Una vez descargado el rar procederemos a extraer los archivos con clic derecho sobre el archivo rar, después en la opción WinRar y por últtimo extraer aquí, esto empezará a descomprimir los archivos del juego y el juego

- Paso 6: Ahora haremos doble clic sobre el icono del juego (Icono del gato) 

- Paso 7: Damos clic sobre la opción de “Mas información”

- Paso 8: Ahora daremos clic sobre “Ejecutar de todas formas” y podremos empezar a jugar 

## EXPLICACIÓN DEL CÓDIGO
Para dejar el contenido del código más claro, se dividió en 5 secciones diferentes, que indican desde que se abre la primera ventana hasta que se cierra el juego.
1.- Definición de la Clase y Variables
En esta sección preparamos los “cimientos del programa. Heredamos de JFrame para crear la ventana y definimos los elementos que usaremos en todo el código, como el arreglo de 9 botones y los nombres de los jugadores.
2.- Constructor: Configuración Visual y Bienvenida
En esta sección es donde el juego arranca. Se piden los nombres mediante ventanas emergentes y se define el diseño de la ventana (colores, fuentes y el título).
3.- El Tablero
Para no crear 9 botones manualmente, usamos un ciclo for. El GridLayout es la clave aquí, ya que organiza los botones en una cuadrícula de 3x3 de forma automática
4.- Control de turnos
Esta parte detecta los clics. Valida que no se pueda marcar un cuadro ya ocupado y alterna el símbolo (X o O) y el color dependiendo del turno actual.
5.- Verificación de ganador y empate
Es la lógica de victoria. El código compara el contenido de los botones basándose en una matriz de combinaciones posibles (filas, columnas y diagonales).


## GENERAR FORMATO PORTABLE
Utilizar herramientas como JDK y Java Runtime Script
- Comandos a ejecutar en símbolo del sistema:
```bash
javac JuegoGato.java
jar cfe ElGato.jar JuegoGato *.class
"C:\Program Files\Java\jdk-25.0.2\bin\jpackage" --type app-image --name "TheGatoGame" --input . --main-jar ElGato.jar --main-class JuegoGato --icon gato.ico
```
Utilizar herramientas para la compresión de archivos en formato .rar

## USO Y CONCLUSIÓN
El sistema que se desarrolló es una adaptación del juego del “Gato” o Tic Tac Toe, originalmente fue diseñado en Javascript y posteriormente reestructurado en Java. Se utiliza una interfaz gráfica organizada en una cuadrícula de 3x3. 
Para utilizarse, es necesario contar con Java JDK 25.0, sistema operativo compatible (Windows). Descargar el programa desde el repositorio, extraer en la carpeta de su elección, luego ejecutar el archivo desde la terminal, utilizando los comandos correspondientes.

A través de este proyecto se consiguió adaptar un código inicialmente estructurado en JavaScript  a una implementación en Java, permitiendo de esta manera analizar las diferencias estructurales propias de cada lenguaje.
Esta actividad representa un acercamiento hacia las formalidades del área pertinentes a la carrera, a través de una división organizada de tareas en las cuales cada integrante debía involucrarse. Haciendo evidente que la planificación, la documentación técnica, la portabilidad y la asignación de tareas con un mismo objetivo,  son partes esenciales dentro del área de desarrollo de software. 
Documentar un sistema no solo resulta facilitador de la comprensión de su uso, sino que permite analizar todos los aspectos que corresponden y estar disponible a actualizaciones, mantenimiento y correctas implementaciones. La documentación no debe entenderse como un proceso opcional sino parte fundamental y complementaria al trabajo técnico y de diseño. Para mejorar el proyecto podríamos transformarlo para que pueda ser empleado en múltiples plataformas y a su vez que nos sea posible entender las diferencias entre la estructura propia de una plataforma u otra.
