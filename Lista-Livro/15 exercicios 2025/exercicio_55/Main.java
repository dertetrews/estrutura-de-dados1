import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o diametro maior");
        int a = scan.nextInt();
        System.out.println("diametro menor");
        int b = scan.nextInt();
        System.out.println("Area = " + (a*b)/2);
    }
}
