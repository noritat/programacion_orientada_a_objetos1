package Retos.POO;

public class Cuadrado extends Figura{
    private float lado;
public Cuadrado (float lado){
    this.lado=lado;

}  
   
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public void calcularArea() {
        float area=0;
        area=lado*lado;
        System.out.println("el lado del cuadrado es "+lado+ "y el area es "+area
        );

      
          }
    
    
}
