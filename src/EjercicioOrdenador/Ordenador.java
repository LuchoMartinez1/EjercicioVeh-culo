package EjercicioOrdenador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ordenador {
    public static byte formaPago;
    public static float pi;
    public static float pf;
    public static float mensualidad;
    public static String marcaOrdenador;


    public static float getPi() {
        return pi;
    }

    public static void setPi(float pi) {
        Ordenador.pi = pi;
    }

    public static float getPf() {
        return pf;
    }

    public static void setPf(float pf) {
        Ordenador.pf = pf;
    }

    public static float getMensualidad() {
        return mensualidad;
    }

    public static void setMensualidad(float mensualidad) {
        Ordenador.mensualidad = mensualidad;
    }

    public static String getMarcaOrdenador() {
        return marcaOrdenador;
    }

    public static void setMarcaOrdenador(String marcaOrdenador) {
        Ordenador.marcaOrdenador = marcaOrdenador;
    }

    public Ordenador() {
    }

    public void datos() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Seleccione un método de pago, siendo:");
        System.out.println(" 1: al contado");
        System.out.println(" 2: en 6 meses");
        System.out.println(" 3: en 12 meses");
        formaPago=Byte.parseByte(br.readLine());
        System.out.println("Marca del ordenador");
        setMarcaOrdenador(br.readLine());
        System.out.println("Introduce el precio inicial: ");
        setPi(Float.parseFloat(br.readLine()));


        calculo();salida();

    }


    public void calculo() {
        switch (formaPago) {
            case 1 -> {
                setPf(pi);
                setMensualidad(0);
            }
            case 2 -> {
                setPf(pi + (pi / 100 * 8));
                setMensualidad(getPf()/ 6);

            }
            case 3 -> {
                setPf(pi + (pi / 100 * 12));
                setMensualidad(getPf()/ 12);
            }
            default -> System.out.println("Introduce una opción válida.");
        }
    }

    public void salida(){

        System.out.println( "Marca del ordenador: " + getMarcaOrdenador()+"\nPrecio inicial:" + getPi()+
                "\nPrecio final:"+getPf()+ "\nMensualidad:" + getMensualidad());
    }


}
