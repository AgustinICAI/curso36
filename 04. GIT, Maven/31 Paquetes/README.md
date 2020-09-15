# Modificadores
- Documentación oficial: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

## Para clases
|Modifier||
|--------|------------------------------------------|
|public|The class is accessible by any other class|
|default|The class is only accessible by classes in the same package. This is used when you don't specify a modifier.|


## Para atributos, métodos y constructores
|Modifier|Class|Package|Subclass|World|
|--------|-----|-------|--------|-----|
|public|Y|Y|Y|Y|
|protected|Y|Y|Y|N|
|no modifier|Y|Y|N|N|
|private|Y|N|N|N|


# Paquetes
Previo a los paquetes la primera buena práctica es separar código de clases
- src/: "source" files to build and develop the project. 
- dist/: "distribution", the compiled code/library, also named public/ or build/.

Hay que seguir una estructura. [Naming a package](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html). 

Separar por paquetes permite en la organizacion que no sea todo un caos, o lo intenta:
- es.icai.gitt.practicaDibujo.domain - contiene la lógica propia de la aplicación
- es.icai.gitt.practicaDibujo.ui - contiene la parte gráfica
- es.icai.gitt.practicaDibujo.util - contiene todas las clases desarrolladas de apoyo

A modo de simplificación, las primeras clases vamos a definirlas del tipo:
practicaDibujo.domain
practicaDibujo.ui
practicaDibujo.util

Para ello habrá que:
- Cambiar las clases de carpetas
- Revisar modificadores
- Revisar imports

## Ejercicio
- Ejercicio usando paquetes [Ejercicio](https://docs.oracle.com/javase/tutorial/java/package/QandE/packages-questions.html)
    - Modificar las clases
    - Compilar
    - Estructura de clases / código por separado
    - Transformar lo anterior en un ".jar"


# Generación de JARS
## tips:
### Compilar las clases por separado
```console
#El siguiente comando genera los ficheros compilados en el directorio que se le indique
javac client/*.java server/*.java shared/*.java -d dist
java mygame.server.Server
```

### Cómo generar un ".jar"
1. Compile your java code, generating all of the program's class files.
2. Create a manifest file containing the following 2 lines:
```
Manifest-Version: 1.0
Main-Class: name of class containing main
```
3. The name of the file should end with the .mf suffix. It is important that the file ends with a blank line.

4. Generar el jar
```
jar --help
[...]
 # Create an archive called classes.jar with two class files:
 jar --create --file classes.jar Foo.class Bar.class
 # Create an archive using an existing manifest, with all the files in foo/:
 jar --create --file classes.jar --manifest mymanifest -C foo/ .
[...]

```
5. To view the contents of the JAR, type:
```
jar tf jar-file
```
6. Execute the application from the command line by typing:
java -jar jar-file
