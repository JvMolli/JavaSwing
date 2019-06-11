# Proyecto JavaSwing 2daw.

---

- [Que es Java swing](#introducción)
- [Instalación](#instalación)
- [Despliegue](#despliegue)
- [Explicación](#explicación)
- [Clases](#apis)
- [Presentación](#presentación)
- [Enlaces y agradecimientos](#enlaces-de-interés)

---

# Java Swing+(j2D&JFX) con NetBeans

Este repositorio ha sido creado como proyecto final de DAW, decidi hacer este proyecto dado el buen 'feeling' que tuve con el lenguaje java desde el primer año y gracias a lo aprendido en el periodo de practicas en las que profundice en el lenguaje y en la herramienta Swing y sus ventajas gracias a NetBeans.


**⚠ Esta aplicación de escritorio, multiplataforma simula una aplicacion interna de un despacho de abogados, El contenido utilizado como extra(Musica, fotos, noticias, etc) pertenece a sus creadores y se ha utilizado sin animo de lucro.. ⚠**

Aparte de JSwing tiene contiene el tipico juego Pong, hecho en java 2D.



## Que es Java Swing?


Java Swing es una herramienta de interfaz gráfica de usuario (GUI) ligera que incluye un amplio conjunto de widgets. Incluye paquete que le permite crear componentes de GUI para sus aplicaciones Java, y es independiente de la plataforma.

La biblioteca Swing está construida sobre el conjunto de herramientas de widgets abstractos de Java ( AWT ), un kit de herramientas GUI más antiguo que depende de la plataforma. Puede utilizar los componentes de la GUI de Java como el botón, el cuadro de texto, etc. de la biblioteca y no tiene que crear los componentes desde cero.


## Instalación 

<a href="https://https://netbeans.org//">Web de NetBeans</a>
Aqui podemos encontrar este fantastico IDE que trae swing y un editor "drag & drop" de serie.
Para importar las bibliotecas de 2d y Fx debemos tener el JDK 1.8 e importar en todos los archivos necesarios:
import java.awt.Graphics2D
import javafx.*

OJO!! el openJDK no trae incluido javaFX y tiene algunos problemas de conflicos con algunos metodos de 2D, no he descubierto ningun conflicto o incompatibilidad con Swing.

### Requerimientos:

Cualquier IDE como eclipse o Intelligent son compatibles.

#### Algunas librerias utilizadas:

```java
- import java.applet.AudioClip;
- import java.awt.Color;
- import java.awt.Dimension;
- import java.awt.GridLayout;
- import java.awt.event.KeyEvent;
- import java.io.IOException;
- import java.util.ArrayList;
- import java.util.logging.Level;
- import java.util.logging.Logger;
- import javax.sound.sampled.AudioInputStream;
- import javax.sound.sampled.AudioSystem;
- import javax.sound.sampled.Clip;
- import javax.sound.sampled.LineUnavailableException;
- import javax.swing.JFrame;
- import javax.swing.JOptionPane;
- import javax.swing.table.DefaultTableModel;
```

### Build/Compilacion

Descarga el repositorio:

```
git clone https://github.com/JvMolli/JavaSwing.git
```

Importe el proyecto : 
File >> Open Proyect >> `selecciona el proyecto`
Pinche sobre icono del martillo y la escoba, espere a que finalice el proceso.
Vaya a su explorador de archivos y a la carpeta del proyecto, /dist/AplicacionGen.jar
Es el archivo que debe ejecutar.(en el caso de compilar en Windows la extension sera .exe)

### ¿Cómo funciona?

La aplicacion tiene una clase general que se Llama Main, es la interfaz principal, en ella encontramos un JTabPannel con tres pestañas, en la primera encontramos una combinacion de las tres tecnologias. las mas llamativas son una grafica con JavaFX, un reloj dinamico con Swing que se ejecuta en un Hilo, y un reproductor musical.
En la segunda pestalla encontraremos 3 graficas distintas hecas en JAVAFX.
En la tercera encontramos dos botones uno ejecuta una calculadora y la otra un videojuego basado en el famoso videojuego "PONG"

#### Clases y Functiones mas importantes:

Clases
- **SWING**
```JFrame, JPanel, JButton, JTextField```

JFrame es un componente, contenedor, que abre una nueva ventana.
JPanel es otro componente contenedor que podria considerarse como un div de html
Las otras dos clases se explican por si mismo.

- **JAVAFX**
``` Scene, JFXPanel```
Scene es una clase que en resumen crea una especia de JPAnel con un canvas dentro donde pinta los componentes de FX


Funciones
- **SWING**
```KeyEvent, MouseEvent, ActionEvent```
KeyEvent son todos los eventos del teclado.
MouseEvent son los eventos del teclado

- **Grphics2D**
```drawString, drawImage, drawFillRect```

Grphics2D.drawString es una funcion para pintar encima de un canvas cadenas de texto


## Presentación

<a href="https://docs.google.com/presentation/d/1oaOL1J_8zCYa9q_vTFpAxN5WGAZCndsVx-ulWDgnw08/edit#slide=id.gc6f80d1ff_0_0">Presentación aportada del proyecto</a>

## Enlaces de interés



- <a href="https://www.oracle.com/es/index.html">Web de Next</a>
- <a href="https://netbeans.org/">github</a>
- <a href="https://docs.oracle.com/javase/tutorial/2d/index.html">ejemplos prácticos</a>
- <a href="https://docs.oracle.com/javase/8/javafx/get-started-tutorial/hello_world.htm">Documentación</a>


### Fuentes principales y Agradecimientos

- **YouTube**
- **Alexander Huacon**
- **Oracle**


Podra encontrar mas informacion en la documentacion que dejo en el enlace
