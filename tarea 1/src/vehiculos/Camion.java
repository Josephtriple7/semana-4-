package vehiculos;
/**
 * esta clase representa un Camion.
 * hereda de Vehiculo e implementa la interfaz Combustible.
 */
public class Camion extends Vehiculo implements Combustible {
    /**
     * Constructor de Camion.
     * la marca del camion
     * el modelo del camion
     */
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }
    /**
     * implementacion del metodo mover() para camion.
     * muestra un mensaje indicando como se mueve un camion.
     */
    @Override
    public void mover() {
        System.out.println("El camion " + marca + " " + modelo + " transporta transporta 20 cajillas de cocacola por la carretera.");
    }
    /**
     * implementacion del metodo recargar() de la interfaz Combustible.
     * muestra un mensaje indicando que el camion esta recargando diesel.
     */
    @Override
    public void recargar() {
        System.out.println("Recargando diesel del camion " + marca + " " + modelo);
    }
}

