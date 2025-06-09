/**
 * Define los valores del coche
 */
public class Coche {
    private int gasolina;

    /**
     * Constructor
     * @param gasolina del vehiculo
     */
    public Coche(int gasolina) {
        this.gasolina = gasolina;
    }

    /**
     * Gasolina del vehiculo
     * @return la gasolina que tiene el vehiculo
     */
    public int getGasolina() {
        return gasolina;
    }

    /**
     * Modifica la gasolina del vehiculo
     * @param gasolina del vehiculo
     */
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}
