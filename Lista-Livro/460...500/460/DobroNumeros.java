import java.util.Scanner;

public class DobroNumeros {

    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();


            int dobro = calcularDobro(numero);
            System.out.println("Dobro: " + dobro);
        }

        scanner.close();
    }
}