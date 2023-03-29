package Retos.Salud;

import java.util.Scanner;

public class Persona {
    //atributos
    private int tipoDocumento; 
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
   


    ///metodos 

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);

        System.out.println("digite su tipo de documento");
        tipoDocumento=lectura.nextInt();
        System.out.println("digite su documento");
        documento=lectura.nextInt();
        System.out.println("digite su nombre");
        nombre=lectura.next();
        System.out.println("digite su apellido");
        apellido=lectura.next();
        System.out.println("digite su peso");
        peso=lectura.nextDouble();
        System.out.println("digite su estatura");
        estatura=lectura.nextDouble();
        System.out.println("digite su edad");
        edad=lectura.nextInt();
        System.out.println("digite su sexo");
        sexo=lectura.next();

    }

    public void mostrarPersona(){
        
        System.out.println("Su tipo de documento es: "+tipoDocumento);
        System.out.println("Su  documento es: "+documento);
        System.out.println("Su nombre: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su sexo es: "+sexo);
        

    }

    public void calcularImc(){
        peso=peso/Math.pow(estatura,2);
        if(peso<20){
            System.out.println("El peso está por debajo de lo ideal ");

        }
        else if(peso>=20 && peso<=25){
            System.out.println("El peso es ideal ");
        }
        else if(peso>25){
            System.out.println("Sobrepeso ");
        }
    }

    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad ");
        }
        else{
            System.out.println("Es menor de edad ");
        }
    }
}
