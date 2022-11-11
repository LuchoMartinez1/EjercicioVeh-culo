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

}
