import java.util.Scanner;

public class NumeroPrimo {

        public static boolean isPrimo (int numero){
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
        }

    public void Inicio(){
        int numero;
            do {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                if(numero !=0) {
                    System.out.println(numero + " é primo? " + isPrimo(numero));
                }
            }while(numero != 0);
    }
}
