# Practica02 de Laboratorio de la clase Modelado y Programación. Semestre 2022-2.

# Sergio "Eduardo" Medina Guzmán

Es un ejercicio sencillo, por lo que me di la libertad de quebrarlo en pedacitos para hacer mis primeras pruebas unitarias bajo el concepto de Test Driven Programming.

Para compilar, posicionarse en la carpeta Practica y ejecutar

$ javac *.java

Para ejecutar las pruebas unitarias basta con ejecutar

$ java test

Para ejecutar el validador de contrasenas, basta con ejecutar

$ java Main

Para salir del validador en terminal usar Ctrl+C.

Al ejecutar el Main, sólo las contraseñas que cumplan lo siguiente generarán un "Senha valida." en terminal.
- Tienen al menos una mayúscula, una minúscula y un número
- Son de una longitud de entre 6 y 32 caracteres
- No tienen acentos, signos de puntuación ni espacios

Las demás contraseñas generarán un "Senha invalida." en terminal.
