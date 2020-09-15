# Packages
- Forma de ordenar las clases/interfaces que se desarroyan dentro de una organización
- Hay que seguir una estructura. [Naming a package](https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html)
# Ejercicio
- Ejercicio usando paquetes [Ejercicio](https://docs.oracle.com/javase/tutorial/java/package/QandE/packages-questions.html)
    - Modificar las clases
    - Compilar
    - Estructura de clases / código por separado
    - Transformar lo anterior en un ".jar"


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