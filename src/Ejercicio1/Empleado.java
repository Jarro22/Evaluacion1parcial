package Ejercicio1;

public class Empleado {
 private String nombre;
 private int edad;
 private  double salario;
 public Empleado(String nombre, int edad, double salario){
     this.nombre=nombre;
     this.edad=edad;
     this.salario=salario;
 }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public double getSalario(){
     return salario;
}

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void aplicarAumento(){
     if (this.salario<3000){
         double aumento =this.salario*0.10;
         this.salario+=aumento;
         System.out.println("Aumento aplica a"+this.nombre+".Nuevo salario:"+this.salario);
         } else{
         if (this.salario>300){
             System.out.println("No aplica al aumento"+this.nombre);
     }

    }
     }
     public void mostrarDetalles(){
         System.out.println("_Nombre:"+nombre+",Edad:"+edad +".Salario:"+salario );
 }
}
