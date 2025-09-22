package vehiculos;
/**
 * esta clase representa una Moto.
 * hereda de Vehiculo pero no implementa la interfaz combustible.
 */
public class Moto extends Vehiculo {
    /**
     * constructor de Moto.
     * la marca de la moto
     * el modelo de la moto
     */
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    /**
     * implementacion del metodo mover() para Moto.
     * muestra un mensaje indicando como se mueve una moto.
     */
    @Override
    public void mover() {
        System.out.println("La moto " + marca + " " + modelo + " se mueve super rapido por la calle.");
    }
}

