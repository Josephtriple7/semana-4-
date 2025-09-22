package vehiculos;
/**
 * es la clase principal que contiene el metodo main().
 * aqui se prueba el polimorfismo con un arreglo de vehiculo
 * y se verifica el uso de la interfaz Combustible.
 */
public class Main {
    public static void main(String[] args) {
        //creamos un arreglo polimorfico de vehiculos
        Vehiculo[] vehiculos = {
                new Carro("Toyota", "Corolla"),
                new Moto("Yamaha", "R15"),
                new Camion("Volvo", "FH16")
        };

        //recorremos el arreglo y usamos los metodos
        for (Vehiculo v : vehiculos) {
            //llamada polimorfica: cada objeto ejecuta su propio mover()
            v.mover();

            //verificamos si el vehiculo implementa Combustible
            if (v instanceof Combustible) {
                //hacemos un cast para poder llamar recargar()
                ((Combustible) v).recargar();
            }

            System.out.println(); //separador visual
        }
    }
}
