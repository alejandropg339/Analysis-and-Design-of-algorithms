/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludioh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuDiOh {

    private static final int converterInt(String a) {
        return Integer.parseInt(a);
    }

    private static final String vencedor(int podermarcos, int poderleonardo) {
        if (podermarcos > poderleonardo) {
            return "Marcos";
        }
        if (podermarcos < poderleonardo) {
            return "Leonardo";
        }
        return "Empate";

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String numeror;
        String[] cartasq;
        String[] cartasEscogidas;
        int[][] matrizmarcos;
        int[][] matrizleonardo;
        String[] carta2;
        String[] carta;
        while ((numeror = br.readLine()) != null) {
            cartasq = br.readLine().split(" ");
            matrizmarcos = new int[Integer.parseInt(numeror)][Integer.parseInt(cartasq[0])];
            matrizleonardo = new int[Integer.parseInt(numeror)][Integer.parseInt(cartasq[1])];
            for (int i = 0; i < matrizmarcos[0].length; i++) {
                carta = br.readLine().split(" ");
                for (int j = 0; j < matrizmarcos.length; j++) {
                    matrizmarcos[j][i] = converterInt(carta[j]);
                }
            }
            for (int i = 0; i < matrizleonardo[0].length; i++) {
                carta2 = br.readLine().split(" ");
                for (int j = 0; j < matrizleonardo.length; j++) {
                    matrizleonardo[j][i] = converterInt(carta2[j]);
                }
            }
            cartasEscogidas = br.readLine().split(" ");
            int a = converterInt(cartasEscogidas[0]) - 1;
            int b = converterInt(cartasEscogidas[1]) - 1;
            String atributos = br.readLine();
            int podermarcos = matrizmarcos[converterInt(atributos) - 1][a];
            int poderleonardo = matrizleonardo[converterInt(atributos) - 1][b];
            System.out.println(vencedor(podermarcos, poderleonardo));
        }

    }

}
