package EjercicioVehiculo;

public class Vehiculo {
    private String modelo;
    private String marca;
    private String color;
    private String combustible;
    private int potencia;
    private int cilindrada;
    private String matricula;
    private String fechaMatriculacion;

    private static String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String marca, String color, String combustible,
                    int potencia, int cilindrada, String matricula, String fechaMatriculacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }


    public void mostrar(){

        System.out.println("El modelo es: "+getModelo());
        System.out.println("La marca es: "+getMarca());
        System.out.println("El color es: "+getColor());
        System.out.println("El combustible es: "+getCombustible());
        System.out.println("La potencia es: "+getPotencia());
        System.out.println("La cilindrada es: "+getCilindrada());
        System.out.println("La matrícula es: "+getMatricula());
        System.out.println("La fecha de matriculación es: "+getFechaMatriculacion());
    }
    public void show(){
        System.out.println("El modelo es: "+modelo);
        System.out.println("La marca es: "+marca);
        System.out.println("El color es: "+color);
        System.out.println("El combustible es: "+combustible);
        System.out.println("La potencia es: "+potencia);
        System.out.println("La cilindrada es: "+cilindrada);
        System.out.println("La matrícula es: "+matricula);
        System.out.println("La fecha de matriculación es: "+fechaMatriculacion);
    }
    public tiempo(int mes, int ano){
        

    }




}
