import java.util.Scanner;

public class Aluno {
    String nome;
    double nota1, nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getMedia() {
        return (nota1 + nota2) / 2;
    }

    public String toString() {
        return "Nome: " + nome + ", Nota 1: " + nota1 + ", Nota 2: " + nota2 + ", Média: " + getMedia();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a primeira nota do aluno " + (i + 1) + ": ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota do aluno " + (i + 1) + ": ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); // Consume o '\n'
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("\nListagem de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}