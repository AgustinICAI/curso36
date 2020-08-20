# Directorios principales de linux

Es importante que el administrador conozca a fondo la estructura de los sistemas de archivos y la
distribución de los ficheros en el árbol. La siguiente tabla muestra los directorios de mayor
importancia en Linux


| Directorio | Comentario |
| ---------- | ---------- |
| /etc | Ficheros de configuración de la máquina. |
| /etc/rc.d | Ficheros de configuración del arranque. |
| /sbin | Ficheros esenciales del arranque, montaje del /usr y recuperación del sistema. |
| /bin | Ejecutables del sistema |
| /lib | Bibliotecas de los programas de /sbin y /bin. |
| /usr | Ficheros compartibles por todo el sistema. Tiene un árbol de subdirectorios con una estructura similar al raíz. Suele montarse sólo para lectura. |
| /usr/local | Programas instalados independientes del sistema operativo. |
| /var | Ficheros varios (administrativos, históricos, bloqueos, ...). |
| /tmp | Ficheros temporales. |
| /home/xxxx | Datos de las cuentas de los usuarios |


Casi la totalidad de los directorios está gestionada por root, por lo que deben estar bien protegidos contra intrusiones de otros usuarios.

# Comandos básicos

- Mostrar el contenido del directorio raíz. Nótese que el símbolo $ es el punto indicativo del intérprete de mandatos.
```
$ls
```

- Ver el contenido del directorio /usr incluyendo los archivos ocultos. Un archivo se considera oculto cuando su nombre comienza por punto. El directorio actual se denota por el fichero . (punto) y el directorio padre por .. (punto punto).
```
$ ls –a /home/usuario
```

- Examinar el contenido completo del directorio actual. La salida se divide en varias columnas, mostrando: permisos, número de enlaces, propietario, grupo, tamaño, fecha y nombre.
```
$ ls –al
```

- Conocer todos las variantes del comando que se pueden lanzar
```
$ls --help
```

- Conocer directorio actual
``` 
pwd
```

- La orden man permite leer las páginas de manuales del sistema operativo y obtener una ayuda completa de cualquier mandato Linux
```
man ls
```

- Para seguir revisando comandos recomiendo seguir uno de los múltiples enlaces de internet donde explican los principales comandos básicos: cd, cp, mv, mkdir, rmdir, chown, chmod, locate, cat, grep.
[Alguno de los comandos principales](https://likegeeks.com/main-linux-commands-easy-guide/#ls-command)


# Directorios: rutas absolutas y relativas
- Los ficheros y directorios se agrupan en forma de árbol, cuyo directorio raíz se denota por /. El mismo carácter barra inclinada se utiliza como separador de subdirectorios. 
- Para hacer referencia a un fichero en el directorio actual, basta con dar su nombre. Sin embargo, el camino completo de dicho fichero se obtiene precediendo al nombre del fichero el camino completo del directorio que lo contiene.
- Pero también podemos referirnos al mismo fichero de forma relativa respecto al directorio actual. Teniendo en cuenta que el directorio padre de uno dado se denota por . (directorio actual) o .. (directorio padre)

# Permisos
Uno de los elementos fundamentales de la seguridad en UNIX es el buen uso de los permisos para acceder a ficheros y directorios, ya que permiten gestionar los permisos y visibilidad entre usuarios.

- Cada usuario tiene un nombre de conexión único en el ordenador y pertenecerá a uno o varios grupos de usuarios
- Teniendo esto en cuenta, un fichero o directorio tiene 3 conjuntos de permisos: permisos para el propietario, para el grupo y para el resto de usuarios.
- El propietario de dicho fichero puede seleccionar qué permisos desea activar y cuales deshabilitar.
Ejemplo:
```
$ls -l
```
• 1 carácter mostrando el tipo: fichero (-), directorio (d), enlace (l), tubería (p), …
• 3 caracteres para los permisos del propietario.
• 3 caracteres para los permisos para otros usuarios del grupo.
• 3 caracteres para los permisos para el resto de usuario.

- Los ficheros pueden tener estos permisos:
• Lectura (r): el usuario puede leer el fichero.
• Escritura (w): el usuario puede escribir en el fichero.
• Ejecución (x): el usuario puede ejecutar el fichero (siempre que sea un ejecutable o un guión de intérprete de mandatos).

- Los directorios pueden tener estos permisos:
• Lectura (r): el usuario puede leer el contenido del directorio.
• Escritura (w): el usuario puede crear, modificar y borrar entradas del directorio.
• Acceso (x): el usuario puede acceder al directorio, permitiendo colocarse en él como directorio actual (utilizando el mandato cd). Este tipo de permiso permite proteger cierta información de un d

Mandato Permiso directorio origen Permisos fichero Permisos directorio destino
cd X No aplicable No aplicable
ls R No aplicable No aplicable
mkdir W, X No aplicable No aplicable
rmdir W, X No aplicable No aplicable
cat X R No aplicable
rm W, X - No aplicable
cp X R W, X
mv W, X - W, X

# Procesos
Puede entenderse por proceso todo programa o mandato en ejecución. Un proceso tiene las siguientes características:
- Consta de zona de código, de datos y de pila.
- Los procesos existen en una jerarquía de árbol (varios hijos, un sólo padre).
- El sistema asigna un identificador de proceso (PID) único al iniciar el proceso.
- El planificador de tareas asigna un tiempo compartido para el proceso según su prioridad (sólo root puede aumentar la prioridad de un proceso).
- Cada proceso almacena su identificador (PID) el de su proceso padre (PPID), el propietario y grupo del proceso y las variables de entorno.
Tipos de procesos:
- Ejecución en 1er plano: proceso iniciado por el usuario o interactivo.
- Ejecución en 2do plano: proceso no interactivo que no necesita ser iniciado por el usuario. Tiene una prioridad menor que un proceso interactivo.
- Procesos especiales:
  - Proceso servidor o demonio: proceso en 2º plano siempre disponible y que da servicio a varias tareas (debe ser propiedad del usuario root).
  - Proceso zombi: proceso parado que queda en la tabla de procesos hasta que termine la ejecución de su padre. Este hecho se produce cuando el proceso padre no recoge el código de salida del proceso hijo.
  - Proceso huérfano: proceso en ejecución cuyo padre ha finalizado. El nuevo identificador de proceso padre (PPID) coincide con el identificador del proceso init (1).
```
$ps (lanzar ejemplo de sleep 100 &)
$ps -fu
$top
$ps -aux
$kill
```

# Redirecciones y tuberías
## Redirecciones
Para cada proceso en ejecución el sistema abre 3 ficheros especiales:
0. Entrada normal (stdin): datos de entrada por teclado.
1. Salida normal (stdout): datos de salida a la pantalla.
2. Salida de error (stderr): datos de errores a la pantalla.

Estos valores por omisión pueden modificarse utilizando las redirecciones. Es importante no confundir la redirección con los parámetros de un mandato. Los operadores de redirección son:
| operador | utilidad |
| -- | -------------------------------------- |
| <  | Redirigir la entrada desde un fichero. |
| >  | Redirigir la salida a un fichero. |
| >> | Añadir la salida a un fichero. |
| 2> | Redirigir la salida de error a un fichero. |
| 2>> | Añadir la salida de error a un fichero. |


- El fichero /dev/null se utiliza como papelera para hacer redirecciones nulas.
Un filtro es un programa que lee datos de la entrada normal, los procesa y escribe los resultados
en la salida normal. Filtros típicos de UNIX son los mandatos grep, sort, cut, sed, …
Una asociación es enviar una redirección al mismo fichero que se utiliza para otra redirección.
Es muy importante saber que las sustituciones se realizan de izquierda a derecha y se representan
de la siguiente manera:

| operador | utilidad |
| -- | ----------------------------- |
| 0  | Sustituye la entrada normal.  |
| &1 | Sustituye la salida normal.   |
| &2 | Sustituye la salida de error. |

Ejemplos que ilustran los conceptos anteriores.
- Ordenar la entrada del fichero fich1.ent, añadir la salida a fich2.sal e ignorar los errores:
```
$ sort <fich1.ent >>fich2.sal 2>/dev/null
```
- Copiar datos.sal y los posibles errores de esta operación en datos.copia.
```
$ cat datos.sal >datos.copia 2>&1
```
- Listar todo el árbol de directorios, mandar los errores a la salida normal (pantalla) y redirigir
la salida normal a todoelarbol.sal:
```
$ ls –alR / 2>&1 >todoelarbol.sal
```
- Buscar todos los directorios, mandar la salida a direc.sal, los errores a direc.err y hacer la
ejecución del mandato en 2º plano:
```
$ find / -type d –ls >direc.sal 2>direc.err &
```
## Tuberías
Una tubería es un mecanismo entre 2 procesos por el cual la salida normal de uno de ellos se
sincroniza con la entrada normal del segundo. Para representar una tubería los procesos se
separan por el carácter barra vertical (|).
Los filtros suelen utilizarse para procesar datos recogidos por otras órdenes utilizando este
mecanismo.
Más ejemplos:
• Mostrar el número de entradas no ocultas del directorio actual:
```
$ ls | wc -w
```
• Contar el número de intérpretes bash que hay en ejecución en el ordenador:
```
$ ps -aux | grep bash | wc -l
```
• Mandar el contenido del directorio a ls.sal y mostrarlo en pantalla con orden inverso (la
orden tee copia la salida a pantalla y a un fichero):
```
$ ls | tee ls.sal | sort –r
```