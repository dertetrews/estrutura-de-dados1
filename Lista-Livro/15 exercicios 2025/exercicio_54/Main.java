import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a base: ");
        int b = scan.nextInt();
        System.out.println("digite a altura: ");
        int a = scan.nextInt();
        System.out.println("Area = "+ (b*a)/2);
    }
}
