import java.util.Scanner;

/**
 * Encargada de mostrar todos los datos
 */
public class View {
    /**
     * Menu de opciones
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        do {
            System.out.println("Menu");
            System.out.println("1. Avanzar");
            System.out.println("2. Poner Gasolina");
            System.out.println("3. Ver Gasolina");
            System.out.println("0. Cerrar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    int metros = pedirMetros();
                    int recorridos = Controller.avanzar(metros);
                    System.out.println("Se avanzaron " + recorridos + " metros.");
                    break;
                case 2:
                    int litros = pedirGasolina();
                    Controller.ponerGasolina(litros);
                    if(litros < 70) {
                        System.out.println("Se añadieron " + litros + " litros de gasolina.");
                    }else{
                        System.out.println("Solo se añadieron 70 litros");
                    }
                    break;
                case 3:
                    System.out.println("Gasolina actual: " + Controller.verGasolina() + " litros.");
                    break;
                case 0:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (op != 0);
    }

    /**
     * Pedir cuanta gasolina se desea introducir
     * @return gasolina deseada a introducir
     */
    private static int pedirGasolina() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuánta gasolina quieres poner? ");
        int gasolina = sc.nextInt();
        return gasolina;
    }

    /**
     * Metros que se desean recorrer
     * @return metros deseados
     */
    private static int pedirMetros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos metros quieres avanzar? ");
        int metros = sc.nextInt();
        return metros;
    }
}
