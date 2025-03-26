import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int a = 1;a <= 5; a++) {
            System.out.print("digite um numero:");
            double num = scan.nextDouble();
            System.out.println("Quadrado: " + Math.pow(num, 2));
        }
    }
}
