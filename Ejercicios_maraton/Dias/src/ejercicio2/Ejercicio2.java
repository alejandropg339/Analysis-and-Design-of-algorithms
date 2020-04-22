package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int año = 365;
        int mes = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor de tipo entero");
        int dias = sc.nextInt();
        Metodos m = new Metodos(dias);

        System.out.println(m.CalcularAnios() + " anio(s)"
                + "\n" + m.CalcularMeses() + " mes(es)"
                + "\n" + m.CalcularDias() + " dia(s)");
    }

}
