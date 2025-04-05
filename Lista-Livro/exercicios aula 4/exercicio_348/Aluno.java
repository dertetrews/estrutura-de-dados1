import java.util.Scanner;

public class Aluno {
    private Scanner scanner = new Scanner(System.in);
    private String alunos[] = new String[5];
    private Double nota1[] = new Double[5];
    private Double nota2[] = new Double[5];
    private Double media[] = new Double[5];
    public void menu() {

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do "+(i+1)+" aluno:\t");
            alunos[i] = scanner.nextLine();
            System.out.println("Digite a nota dele(a)");
            nota1[i] = scanner.nextDouble();
            System.out.println("Digite a nota dele(a)");
            nota2[i] = scanner.nextDouble();
            media[i] = (nota1[i] + nota2[i]) / 2;
            scanner.nextLine();
        }
    }
    public void media() {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome\t" + alunos[i] + "\n" + "Prova1\t" + nota1[i] + "\tProva2\t" + nota2[i] + "\tMedia\t" + media[i]);
        }
    }

}
