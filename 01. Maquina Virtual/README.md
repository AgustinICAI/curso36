# Maquina virtual
Máquina virtual o virtual machine (VM) es una emulación de un sistema de computación.

## Máquinas virtuales de sistema
Las máquinas virtuales de sistema, también llamadas máquinas virtuales de hardware, permiten a la máquina física subyacente multiplicarse entre varias máquinas virtuales, cada una ejecutando su propio sistema operativo.
A la capa de software que permite la virtualización se la llama hipervisor.
Un hipervisor puede ejecutarse o bien directamente sobre el hardware o bien sobre un sistema operativo.

El overhead que introducen los hipervisor modernos está entre 9-12% de CPU.

## Aplicaciones
- Virtualbox
- Vmware
- Hyper-V (sólo a partir de W8)

![alt text](https://raw.githubusercontent.com/AgustinICAI/curso36/master/images/virtualizacionArchitecture.png)

## Máquinas virtuales de proceso
Una máquina virtual de proceso, a veces llamada "máquina virtual de aplicación" o PVM (siglas del inglés Process-level Virtual Machine), se ejecuta como un proceso normal dentro de un sistema operativo sirviendo de enlace entre un lenguaje de programación y el sistema operativo, realizando una interpretación u otra técnica de enlace entre fuente y código máquina. La máquina se inicia automáticamente cuando se lanza el proceso que se desea ejecutar o manualmente para ejecutar código interactivamente y se detiene para cuando éste finaliza o se le pide terminar al entorno de ejecución. Su objetivo es el de proporcionar un entorno de ejecución independiente de la plataforma de hardware y del sistema operativo, que oculte los detalles de la plataforma subyacente y permita que un programa se ejecute siempre de la misma forma sobre cualquier plataforma.

El ejemplo más conocido actualmente de este tipo de máquina virtual es la *máquina virtual de Java* que interpreta un código intermedio entre Java y código máquina. 

Desarrollos realizados directamente sobre la máquina con lenguajes como c++ son un 10-50% más eficientes en cpu y memoria.

## Contenedores
La virtualización a nivel de sistema operativo es un método de virtualización de servidor en el cual el núcleo de un sistema operativo permite que existan múltiples instancias aisladas de espacios de usuario, en lugar de solo uno. Estos contenedores son totalmente independientes y aislados entre las distintas aplicaciones que corren.
Motores principales para correr contenedores
- Docker
- Kubernetes

# Instalar VirtualBox Windows y MAC
https://www.virtualbox.org/wiki/Downloads

# Descargar imagen Ubuntu
https://releases.ubuntu.com/20.04/
- Se descargará una ISO que es la que hay que cargar en virtualbox

Here's what Canonical lists as the recommended minimum system requirements for installing the desktop edition of Ubuntu 20.04 Focal Fossa (source). Keep in mind that this pertains to physical installs. Virtualized installs can actually get by with less.
- 2 GHz dual core processor
- 4 GiB RAM (system memory)
- 25 GB of hard drive space (or USB stick, memory card or external drive but see LiveCD for an alternative approach)
- VGA capable of 1024x768 screen resolution

