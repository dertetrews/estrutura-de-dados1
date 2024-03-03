import java.util.Scanner;

public class AlunoB {
    String nome;
    double pr1, pr2, media;
    String situacao;

    public AlunoB(String nome, double pr1, double pr2) {
        this.nome = nome;
        this.pr1 = pr1;
        this.pr2 = pr2;
        this.media = (pr1 + pr2) / 2;
        this.situacao = (this.media >= 7.0) ? "AP" : "RP";
    }

    public String toString() {
        return "Nome: " + nome + ", PR1: " + pr1 + ", PR2: " + pr2 + ", Média: " + String.format("%.1f", media) + ", Situação: " + situacao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a nota da PR1 do aluno " + (i + 1) + ": ");
            double pr1 = scanner.nextDouble();
            System.out.print("Digite a nota da PR2 do aluno " + (i + 1) + ": ");
            double pr2 = scanner.nextDouble();
            scanner.nextLine(); // Consume the '\n'
            alunos[i] = new Aluno(nome, pr1, pr2);
        }

        System.out.println("\nListagem de alunos:");
        System.out.println("Nome\tPR1\tPR2\tMédia\tSituação");
        System.out.println("-----------------------------------------------");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }

        scanner.close();
    }
}
