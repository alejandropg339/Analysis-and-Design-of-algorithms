package parcial;

import static java.util.Collections.frequency;
import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de estrellas que tiene la esfera que encontro");
//        int c_estrellas = sc.nextInt();
//        System.out.println("ingrese la cantidad total de esferas");
//        int c_esferas = sc.nextInt();
//        if (c_estrellas == 1) {
//            System.out.println(c_esferas % c_estrellas + 5);
//        }
//        if (c_estrellas == 4) {
//            int op = c_esferas % c_estrellas;
//            System.out.println(op + 2);
//        }

        int i, num;

        System.out.println("Digite un numero");
        num = sc.nextInt();
        System.out.println("Divisores del numero " + num);
        int cont = 0;
        int cont2 = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont = cont + 1;
            }

        }
        System.out.println(cont);
    }

//            System.out.println(cont);8
}
