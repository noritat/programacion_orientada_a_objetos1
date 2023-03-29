package Retos.POO;

public class Circulo extends Figura{
    private float lado;
    private float radioC;
public Circulo (float lado,float radio){
    this.lado=lado;
    this.radioC=radio;


}  
    public float getRadioC() {
        return radioC;
    }



    public void setRadioC(float radioC) {
        this.radioC = radioC;
    }



    public float getLado() {
        return lado;
    }



    public void setLado(float lado) {
        this.lado = lado;
    }
    
   
    public void calcularArea() {
        float area=0;
        float radioElevado=0;
        radioElevado=radioC*radioC;
        area=lado* radioElevado;
        System.out.println("el Radio del circulo es "+radioElevado+ "y el area es "+area
        );

      
          }
    
}
