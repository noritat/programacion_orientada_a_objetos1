package Retos.Salud;

public class Empleado extends Persona3 {
    private String cargo;
    private double valorHora;
    private double horastrabajadas;
    private String departamento;

    public Empleado(String tipoDoc, int doc, String nombrep, String ape,double horast,double valorh,String car,String depa) {
        super(tipoDoc, doc, nombrep, ape);
this.setCargo(car);
this.setHorastrabajadas(horast);
this.setValorHora(valorh);
this.setDepartamento(depa);


    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void calcularHonorarios() {
        double valort=this.getHorastrabajadas()*this.getValorHora();
        double reteica=0.966*valort/100;
        double honorarios=valort-reteica;

        System.out.println("tipo documento: "+getTipoDocumento());
        System.out.println("documento: "+getDocumento());
        System.out.println("Nombre: "+getNombre());
        System.out.println("apellido: "+getApellido());
        System.out.println("Cargo : "+getCargo());
        System.out.println("horas trabajadas: "+getHorastrabajadas());
        System.out.println("valor por hora: "+getValorHora());
        System.out.println("total a pagar: "+honorarios);


    }


    

}
