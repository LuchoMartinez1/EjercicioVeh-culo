package EjercicioVehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args)throws IOException {
         String modelo;
         String marca;
         String color;
         String combustible;
         int potencia;
         int cilindrada;
         String matricula;
         String fechaMatriculacion;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Intrduce el modelo:");
        modelo=br.readLine();
        System.out.println("Intrduce el marca:");
        marca= br.readLine();
        System.out.println("Intrduce el color:");
        color= br.readLine();
        System.out.println("Intrduce el combustible:");
        combustible= br.readLine();
        System.out.println("Intrduce la potencia:");
        potencia= Integer.parseInt(br.readLine());
        System.out.println("Intrduce el cilindrada:");
        cilindrada= Integer.parseInt(br.readLine());
        System.out.println("Intrduce el matricula:");
        matricula= br.readLine();
        System.out.println("Intrduce el fechaMatriculacion:");
        fechaMatriculacion= br.readLine();

        Vehiculo coche1 = new Vehiculo(modelo,marca,color,combustible,potencia,cilindrada,matricula,fechaMatriculacion);

        Vehiculo coche2 = new Vehiculo();

        System.out.println("Intrduce el modelo:");
        coche2.setModelo(br.readLine());
        System.out.println("Intrduce el marca:");
        coche2.setMarca(br.readLine());
        System.out.println("Intrduce el color:");
        coche2.setColor(br.readLine()) ;
        System.out.println("Intrduce el combustible:");
        coche2.setCombustible(br.readLine());
        System.out.println("Intrduce la potencia:");
        coche2.setPotencia(Integer.parseInt(br.readLine()));
        System.out.println("Intrduce el cilindrada:");
        coche2.setCilindrada(Integer.parseInt(br.readLine()));
        System.out.println("Intrduce el matricula:");
        coche2.setMatricula(br.readLine());
        System.out.println("Intrduce el fechaMatriculacion:");
        coche2.setFechaMatriculacion(br.readLine());


        Vehiculo coche3 = new Vehiculo("ram","Ford","Rojo",
                "100 litros",300,5000,"SJD456L","11/11/2022");



    }




}
