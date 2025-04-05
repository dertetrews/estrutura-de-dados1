import java.util.Scanner;

public class Nome {
        // Criando um vetor para armazenar os nomes
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        // Inserindo 5 nomes no vetor
    public void Menu() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Pedindo ao usuário para inserir um índice
        System.out.print("Digite o índice do nome que você deseja procurar: ");
        int indiceProcurado = scanner.nextInt();

        // Verificando se o índice está dentro do intervalo válido
        if (indiceProcurado >= 0 && indiceProcurado < nomes.length) {
            System.out.println("O nome no índice " + indiceProcurado + " é " + nomes[indiceProcurado]);
        } else {
            System.out.println("Índice inválido. Por favor, insira um índice válido.");
        }
    }
}
