package vehiculos;
/**
 * es clase abstracta que representa un Vehiculo generico.
 * se definen atributos comunes (marca y modelo) y un metodo abstracto mover()
 * que se implementan de forma distinta en cada subclase.
 */
public abstract class Vehiculo {
    //atributos protegidos, accesibles desde subclases
    protected String marca;
    protected String modelo;
    /**
     * constructor de la clase Vehiculo.
     * la marca del vehiculo
     * el modelo del vehiculo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * el metodo abstracto define como se mueve un vehiculo.
     * cada subclase (Carro, Moto, Camion) debe implementar su propia version.
     */
    public abstract void mover();
}
