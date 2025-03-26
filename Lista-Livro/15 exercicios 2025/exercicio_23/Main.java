import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static int x = entrada.nextInt();
    static int y = (x % 100) /10;

    public static void main (String[] args) {
        System.out.println(y);
    }
}
