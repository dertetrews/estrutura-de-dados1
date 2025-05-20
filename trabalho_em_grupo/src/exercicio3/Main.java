package exercicio3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Aviao> filaDecolagem = new LinkedList<>();

        int opcao;
        do {
            System.out.println("\n--- CONTROLE DE PISTA DE DECOLAGEM ---");
            System.out.println("1 - Listar número de aviões na fila");
            System.out.println("2 - Autorizar decolagem do primeiro avião");
            System.out.println("3 - Adicionar avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila");
            System.out.println("5 - Mostrar o primeiro avião da fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Aviões na fila: " + filaDecolagem.size());
                    break;

                case 2:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Não há aviões na fila para decolar.");
                    } else {
                        Aviao decolando = filaDecolagem.poll();
                        System.out.println("Autorizada decolagem do avião:");
                        decolando.exibirDados();
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o identificador do avião: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Aviao novoAviao = new Aviao(nome, id);
                    filaDecolagem.add(novoAviao);
                    System.out.println("Avião adicionado à fila.");
                    break;

                case 4:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Aviões na fila:");
                        for (Aviao aviao : filaDecolagem) {
                            aviao.exibirDados();
                        }
                    }
                    break;

                case 5:
                    if (filaDecolagem.isEmpty()) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Primeiro avião da fila:");
                        filaDecolagem.peek().exibirDados();
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
