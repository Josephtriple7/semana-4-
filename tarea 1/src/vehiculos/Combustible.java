package vehiculos;
/**
 * es la interfaz que representa el comportamiento de los vehiculos
 * que funcionan con combustible.
 * obliga a implementar el metodo recargar().
 */
public interface Combustible {
    /**
     * este metodo se usa para recargar el combustible del vehiculo.
     */
    void recargar();
}
