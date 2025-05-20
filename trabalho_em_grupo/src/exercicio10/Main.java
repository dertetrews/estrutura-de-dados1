package exercicio10;

import exercicio10.Potencia;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Potencia pot = new Potencia();
        Scanner scan = new Scanner(System.in);
        System.out.println(pot.calcular(scan.nextInt(),scan.nextInt()));
    }
}
