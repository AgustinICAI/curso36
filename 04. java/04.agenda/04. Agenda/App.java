public class App {
    private static Agenda agenda = new Agenda();
    private static String[] opciones = {"Crear persona","Buscar persona","Eliminar persona","Modificar persona","Mostrar lista"};
    public static void main(String[] args) {
        String opcion = null;
        Agenda a = new Agenda();
        do {
            App.limpiar();
            opcion = App.menu();
            App.limpiar();
            App.evaluar(opcion);
        } while (!opcion.equals("9"));
    }

    static String menu() {
        System.out.println("################################");
        System.out.println("######       AGENDA       ######");
        System.out.println("################################");
        for (int i = 0;i<opciones.length;i++)
            System.out.println(String.format("###%2d. %-20s ####",i+1,opciones[i]));
        System.out.println("################################");
        System.out.println("###  9. SALIR               ####");
        System.out.println("################################");
        System.out.print("  > ");
        return Leer.porTeclado();
    }

    static void evaluar(String x) {
        String nif = "";
        int edad = 0;
        if (x.equals("1")) {
            System.out.println("*** NUEVA PERSONA ***");
            if (!agenda.isFull()) {
                System.out.println("Datos de la persona");
                System.out.print("NIF: ");
                nif = Leer.porTeclado();
                System.out.print("Edad: ");
                edad = Integer.parseInt(Leer.porTeclado());
                agenda.add(new Persona(nif, edad));
            } else {
                System.out.println("No se pueden añadir mas personas. Array lleno");
                System.out.print("Pulse enter para continuar...");
                Leer.porTeclado();
            }
        }
        else if (x.equals("2")) {
            System.out.println("*** BUSCAR PERSONA ***");
            System.out.println("Datos de la persona");
            System.out.print("NIF: ");
            nif = Leer.porTeclado();
            int pos = agenda.indexOf(new Persona(nif));
            if (pos != -1)
                System.out.print("Encontrado en la posición " + pos);
            else
                System.out.print("No encontrado");
            System.out.print("\nPulse enter para continuar...");
            Leer.porTeclado();
        }
        else if (x.equals("3")) {
            System.out.println("*** ELIMINAR PERSONA ***");
            int pos = App.mostrarPersonasElegirPosicion();
            agenda.remove(pos);
            System.out.print("Objeto borrado");
            System.out.print("\nPulse enter para continuar...");
            Leer.porTeclado();
        }
        else if (x.equals("4")) {
            System.out.println("*** MODIFICAR PERSONA ***");
            int pos = App.mostrarPersonasElegirPosicion();
            Persona p = agenda.get(pos);
            if (p != null) {
                System.out.print("\nIntroduzca la nueva edad: ");
                edad = Integer.parseInt(Leer.porTeclado());
                p.setEdad(edad);
            } else
                System.out.print("\nPersona no encontrada");
        }
        else if (x.equals("5")) {
            System.out.print(agenda.toString());
            System.out.print("\nPulse enter para continuar...");
            Leer.porTeclado();
        }
    }

    private static void limpiar() {
        //Funciona en todos los terminales que soportan ANSI
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int mostrarPersonasElegirPosicion() {
        System.out.println("Posición de la persona a modificar: ");
        System.out.print(agenda);
        System.out.print("  > ");
        int pos = Integer.parseInt(Leer.porTeclado());
        return pos;
    }
}
