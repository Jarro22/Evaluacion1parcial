package Ejercicio2;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
   public void mostrarDatos(){
       System.out.println("Mosttrar vehiculos entre 2500$ -  4000$: ");
       System.out.println("Marca del vehiculo: "+ marca );
       System.out.println("Modelo del vehiculo: "+ modelo );
       System.out.println("Precio del vehiculo: "+ precio );
    }
}
