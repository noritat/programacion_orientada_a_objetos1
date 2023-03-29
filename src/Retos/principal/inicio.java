package Retos.principal;

import Retos.Salud.Persona;
import Retos.Salud.Persona2;

public class inicio {
    public static void main(String[] args) {

        String valormensaje;

       /* Persona dato=new Persona();
        dato.pedirDatos();
        dato.mostrarPersona();
        dato.calcularImc();
        dato.mayorEdad();*/ 
         

Persona2 dato2=new Persona2();

dato2.pedirDatos();
dato2.mostrarPersona();
dato2.mayorEdad();
valormensaje=dato2.calcularImc();
System.out.println("Su peso es : "+valormensaje);




    }
}
