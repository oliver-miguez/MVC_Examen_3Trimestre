/**
 * Actua de intermediario entre View y Model
 */
public class Controller {
   private static Coche coche = new Coche(10); //crea un coche

   /**
    * Llama al metodo avanzar del Model
    * @param metros distancia recorrida
    * @return La distancia recorrida del vehiculo
    */
   public static int avanzar(int metros) {
      return Model.avanzar(coche, metros);
   }

   /**
    * Añade gasolina al vehiculo(máximo 70 litros)
    * @param litros
    */
   public static void ponerGasolina(int litros) {
      Model.ponerGasolina(coche, litros);
   }

   /**
    * Muestra la gasolina del vehiculo
    * @return gasolina del vehiculo
    */
   public static int verGasolina() {
      return coche.getGasolina();
   }
}
