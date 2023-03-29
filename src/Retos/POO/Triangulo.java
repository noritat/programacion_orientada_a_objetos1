package Retos.POO;

public class Triangulo extends Figura {
    private float baseT;
    private float alturaT;

    public Triangulo(float base, float altura) {
        this.baseT = base;
        this.alturaT = altura;

    }

    public float getBaseT() {
        return baseT;
    }

    public void setBaseT(float baseT) {
        this.baseT = baseT;
    }

    public float getAlturaT() {
        return alturaT;
    }

    public void setAlturaT(float alturaT) {
        this.alturaT = alturaT;
    }

    public void calcularArea() {
        float area = 0;
        area = baseT * alturaT;

        System.out.println("la base es  " + baseT + "la altura es:  " + alturaT + "el areea del triangulo es: " + area);

    }

}
