package Ejercicio2;

import java.util.Scanner;

public class main {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   Vehiculo [] carro =new Vehiculo[3];
    for (int i=0 ; i< carro.length; i++){
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("Modelo: ");
        String modelo = sc.next();
        System.out.println("Precio: ");
        int precio= sc.nextInt();
        System.out.println("Vehiculo"+ (i+1)+"Registrar");
        carro[i]= new Vehiculo(marca, modelo ,precio);
    }
    for ((carro[i].getPrecio() > 2500) && (carro[i].getPrecio()<4000)){
        carro[0]= carro[i];
        carro[0].mostrarDatos();
    }
  }
}



