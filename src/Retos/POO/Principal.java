package Retos.POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float lado=0,base=0,altura=0,radioC=0,baseT=0,alturaT=0;
        int cantidad;
        String Circulo="C",Rectangulo="R",Triangulo="T",resultado;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingresa la cantidad para calcular el area de las figuras ");
        cantidad=lectura.nextInt();

      
        for(int i=0;i<cantidad;i++){
            System.out.println("elige una figura que quieras \n Circulo:C \n Rectangulo:R \n Triangulo:T");
resultado=lectura.next();
            if(Circulo.equalsIgnoreCase("C")){
                System.out.println("Ingrese lado circulo");
                lado=lectura.nextFloat();
                System.out.println("Ingrese el radio del circulo");
                radioC=lectura.nextFloat();
     Circulo c1=new Circulo(lado,radioC);
     c1.calcularArea();
    
    }



     else if(Rectangulo.equalsIgnoreCase("R")){
        System.out.println("Ingrese la base");
        lado=lectura.nextFloat();
        System.out.println("Ingrese la altura");
        radioC=lectura.nextFloat();
        Rectangulo c1=new Rectangulo(base,altura);
        c1.calcularArea();
     }

         else if(Triangulo.equalsIgnoreCase("T")){

            Triangulo c1=new Triangulo(baseT,alturaT);
        c1.calcularArea();

        System.out.println("Ingrese la base");
        baseT=lectura.nextFloat();
        System.out.println("Ingrese la altura");
        alturaT=lectura.nextFloat();
         }   


        }

        lectura.close();


    }
}
