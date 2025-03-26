import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro cateto");
        double a = scan.nextDouble();
        System.out.println("Digite o segundo cateto");
        double b = scan.nextDouble();
        double R = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("Hipotenusa: "+R);
    }
}
