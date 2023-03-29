package Retos.principal;

import java.util.Scanner;

import Retos.Salud.Empleado;

public class Ejecucion {
    
    public static void main(String[] args) {
        String tipoDocumento;
        int doc;
        String nombre;
        String apellido;
        double horastrabajadas;
        double valorHora;
        String cargo;
        String departamento;

      
      
        Scanner lectura=new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDocumento=lectura.next();
        System.out.println("digite su documento");
        doc=lectura.nextInt();
        System.out.println("digite su nombre");
        nombre=lectura.next();
        System.out.println("digite su apellido");
        apellido=lectura.next();
        System.out.println("digite su horas trabajadas");
        horastrabajadas=lectura.nextDouble();
        System.out.println("digite su valor Hora");
        valorHora=lectura.nextDouble();
        System.out.println("digite su cargo");
        cargo=lectura.next();
        System.out.println("digite su departamento");
        departamento=lectura.next();
        Empleado empleado=new Empleado(tipoDocumento, doc, nombre, apellido, horastrabajadas, valorHora, cargo, departamento);
empleado.calcularHonorarios();
    }
}
