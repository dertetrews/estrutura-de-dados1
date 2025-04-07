import java.util.Scanner;

public class EscolaViva {
    public void Inicio(){
        final int MAX_ALUNOS = 50;
        String[] nomes = new String[MAX_ALUNOS];
        double[] nota1 = new double[MAX_ALUNOS];
        double[] nota2 = new double[MAX_ALUNOS];
        double[] media = new double[MAX_ALUNOS];

        boolean temNome = false, temNota1 = false, temNota2 = false;

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n--- ESCOLA VIVA ---");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar 1ª nota");
            System.out.println("3 - Entrar 2ª nota");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Listar no display");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o \n

            switch (opcao) {
                case 1:
                    for (int i = 0; i < MAX_ALUNOS; i++) {
                        System.out.print("Digite o nome do aluno " + (i + 1) + " (até 30 letras MAIÚSCULAS): ");
                        nomes[i] = scanner.nextLine().toUpperCase();
                        while (nomes[i].length() > 30) {
                            System.out.print("Nome muito longo. Digite novamente: ");
                            nomes[i] = scanner.nextLine().toUpperCase();
                        }
                        // Completa com espaços se quiser manter 30 caracteres
                        while (nomes[i].length() < 30) {
                            nomes[i] += " ";
                        }
                    }
                    temNome = true;
                    break;

                case 2:
                    if (!temNome) {
                        System.out.println("Você precisa cadastrar os nomes primeiro!");
                        break;
                    }
                    for (int i = 0; i < MAX_ALUNOS; i++) {
                        System.out.print("Digite a 1ª nota do aluno " + nomes[i].trim() + ": ");
                        nota1[i] = scanner.nextDouble();
                    }
                    temNota1 = true;
                    break;

                case 3:
                    if (!temNome) {
                        System.out.println("Você precisa cadastrar os nomes primeiro!");
                        break;
                    }
                    for (int i = 0; i < MAX_ALUNOS; i++) {
                        System.out.print("Digite a 2ª nota do aluno " + nomes[i].trim() + ": ");
                        nota2[i] = scanner.nextDouble();
                    }
                    temNota2 = true;
                    break;

                case 4:
                    if (!temNome || !temNota1 || !temNota2) {
                        System.out.println("Nem todos os dados foram cadastrados!");
                        break;
                    }
                    for (int i = 0; i < MAX_ALUNOS; i++) {
                        media[i] = (nota1[i] * 3 + nota2[i] * 7) / 10.0;
                    }
                    System.out.println("Médias calculadas com sucesso!");
                    break;

                case 5:
                    if (!temNome || !temNota1 || !temNota2) {
                        System.out.println("Nem todos os dados foram cadastrados!");
                        break;
                    }
                    System.out.printf("\n%-30s %-7s %-7s %-7s\n", "NOME", "NOTA1", "NOTA2", "MÉDIA");
                    for (int i = 0; i < MAX_ALUNOS; i++) {
                        System.out.printf("%-30s %-7.2f %-7.2f %-7.2f\n", nomes[i], nota1[i], nota2[i], media[i]);
                    }
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
