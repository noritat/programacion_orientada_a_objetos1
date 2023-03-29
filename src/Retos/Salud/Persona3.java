package Retos.Salud;
import java.util.Scanner;
public class Persona3 {
    


//metodo constructor 

public Persona3(String tipoDoc, int doc, String nombrep,String ape){

this.tipoDocumento=tipoDoc;
this.documento=doc;
this.nombre=nombrep;
this.apellido=ape;

}


    //atributos8
    private String tipoDocumento; 
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private int estatura;
    private int edad;
    private String sexo;
   


    ///metodos 

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);

        System.out.println("digite su tipo de documento");
        tipoDocumento=lectura.next();
        System.out.println("digite su documento");
        documento=lectura.nextInt();
        System.out.println("digite su nombre");
        nombre=lectura.next();
        System.out.println("digite su apellido");
        apellido=lectura.next();
        System.out.println("digite su peso");
        peso=lectura.nextInt();
        System.out.println("digite su estatura");
        estatura=lectura.nextInt();
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

    public String calcularImc(){
        peso=peso/Math.pow(estatura,2);
        if(peso<20){
            return("bajo peso es ideal ");

        }
        else if(peso>=20 && peso<=25){
            return("El peso es ideal ");
        }
        else if(peso>25){
           return("Sobrepeso ");
        }return(" ");
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