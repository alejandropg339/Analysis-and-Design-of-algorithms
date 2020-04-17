package parcial;

import java.util.ArrayList;
import java.util.Scanner;


public class Punto1 {

    public static void main(String[] args) {
        ArrayList camisetas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de camisas que se hharan para esa clase");
        int c_camisas = sc.nextInt();
        for (int i = 0; i < c_camisas; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            String nom = sc.next();
            System.out.println("Ingrese el color");
            String color = sc.next();
            System.out.println("Ingrese la talla");
            String talla = sc.next();
            camisetas.add(color + " " + talla + " " + nom);
        }
        for (int i = 0; i < camisetas.size(); i++) {
            System.out.println(camisetas.get(i));
        }

    }

}
