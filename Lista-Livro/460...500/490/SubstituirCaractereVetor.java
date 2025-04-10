import java.util.Scanner;

public class SubstituirCaractereVetor {
    // Função para substituir todas as ocorrências de um caractere por '*'
    public static int substituirCaractere(char[] vetor, int tamanho, char caractere) {
    int totalRetirado = 0;
    
      // Convertendo o caractere para minúsculas
    caractere = Character.toLowerCase(caractere);
    
    for (int i = 0; i < tamanho; i++) {
          // Convertendo o caractere do vetor para minúsculas
        char caractereAtual = Character.toLowerCase(vetor[i]);
        
        if (caractereAtual == caractere) {
            vetor[i] = '*';
            totalRetirado++;
        }
    }
    
    return totalRetirado;
}

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as palavras
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a palavra em letras minúsculas " + i + ": ");
            String palavra = scanner.next();
            char[] vetor = palavra.toCharArray();

            int totalRetirado = substituirCaractere(vetor, vetor.length, 'a');

            System.out.print(i + " - ");
            for (char c : vetor) {
                System.out.print(c);
            }
            System.out.println();
        }

        scanner.close();
    }
}
