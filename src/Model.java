/**
 * Define los metodos de avanzar y poner gasolina
 */
public class Model {

    /**
     * La distancia a recorrer
     * @param coche vehiculo de la clase Coche
     * @param metros distancia deseada a recorrer
     * @return metros
     */
    public static int avanzar(Coche coche, int metros) {
        if (coche.getGasolina() <= 0) {
            System.out.println("No hay gasolina");
            return 0;
        }

        // Cada litro permite avanzar 5000 metros (5 km)
        int maxMetros = coche.getGasolina() * 5000;

        // Limita los metros a avanzar según la gasolina disponible
        int metrosRecorridos = metros;
        if (metros > maxMetros) {
            metrosRecorridos = maxMetros;
        }

        // Calcular cuántos litros se necesitan
        int litrosNecesarios = metrosRecorridos / 5000;
        if (metrosRecorridos % 5000 != 0) {
            litrosNecesarios += 1; // Si hay sobrante, se necesita un litro más
        }

        coche.setGasolina(coche.getGasolina() - litrosNecesarios);

        System.out.println("Avanza " + metrosRecorridos + " metros");
        return metrosRecorridos;
    }

    /**
     * Añade gasolina al vehiculo
     * @param coche vehiculo de la clase Coche
     * @param litros litros a añadir al vehiculo
     */
    public static void ponerGasolina(Coche coche, int litros) {
        int gasolinaActual = coche.getGasolina();
        int nuevaGasolina = gasolinaActual + litros;

        if (nuevaGasolina > 70) {
            nuevaGasolina = 70;
            System.out.println("El deposito está lleno. Solo se han puesto hasta 70 litros.");
        }

        coche.setGasolina(nuevaGasolina);
    }

}
