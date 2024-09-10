package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    private static ArrayList<Empleado> empleados=new ArrayList<>();
    private static Scanner scanner= new Scanner(System.in);
    public static void  main(String[]args){
        int opcion;
        do{
            System.out.println("\n---Gestion de Empleados---");
            System.out.println("1.- Agregar Empleado");
            System.out.println("2.- Mostrar todos los empleados");
            System.out.println("3.- Apliacr aumento de salario");
            System.out.println("4.- Salir");
            System.out.println("Seleccione una opcion:");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                   agregarEmpleado();
                   break;
                case 2:
                   mostrarEpleados();
                   break;
                case 3:
                   aplicarAumentos();
                   break;
                case 4:
                    System.out.println("Saliendo...");
                 break;
                default:
                    System.out.println("opcion invalido intente nuevamente.");
            }
        } while (opcion !=4);
    }
    private static void agregarEmpleado(){
        scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        String nombre= scanner.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado :");
        double salario = scanner.nextDouble();
        Empleado empleado = new Empleado (nombre , edad , salario );
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente.");
    }
    private static void mostrarEpleados(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados registrados. ");
        }else {
            System.out.println("\n--- Lista de empleados---");
            for (Empleado emp : empleados){
                emp.mostrarDetalles();
            }
        }
    }
    private static void aplicarAumentos(){
    if (empleados.isEmpty()){
        System.out.println("No hay empleados para apliacar aumentos.");
    }else{
        System.out.println("\n Aplicando aumento de salario manor  a 3000 ");
        for (Empleado emp :empleados){
            emp.aplicarAumento();
        }

    }
    }
}
