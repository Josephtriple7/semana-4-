package vehiculos;
/**
 * esta es la clase que representa un Carro.
 * tambien hereda de Vehiculo e implementa la interfaz combustible.
 */
public class Carro extends Vehiculo implements Combustible {
    /**
     * el constructor de Carro.
     * la marca del carro
     * el modelo del carro
     */
    public Carro(String marca, String modelo) {
        super(marca, modelo); // Llama al constructor de la clase padre
    }
    /**
     * implementacion del metodo mover() para carro.
     * muestra un mensaje indicando como se mueve un carro.
     */
    @Override
    public void mover() {
        System.out.println("El carro " + marca + " " + modelo + " se mueve por el reparto chick.");
    }
    /**
     * implementacion del metodo recargar() de la interfaz Combustible.
     * este muestra un mensaje indicando que el carro esta recargando gasolina.
     */
    @Override
    public void recargar() {
        System.out.println("Recargando gasolina en el carro " + marca + " " + modelo);
    }
}
