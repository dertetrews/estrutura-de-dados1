import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite seu nome: ");
        String a = scan.nextLine();
        System.out.println("\nDigite sua idade: ");
        int b = scan.nextInt();
        System.out.println("\n\n");
        System.out.println("Nome ="+a+"\nIdade ="+b);

    }
}
