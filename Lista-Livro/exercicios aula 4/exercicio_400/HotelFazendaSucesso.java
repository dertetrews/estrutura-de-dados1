import java.util.Scanner;

public class HotelFazendaSucesso {

    public void Inicio(){
        final int MAX_QUARTOS = 50;
        int[] leitos = new int[MAX_QUARTOS];
        double[] precos = new double[MAX_QUARTOS];
        String[] situacao = new String[MAX_QUARTOS]; // "L" = livre, "A" = alugado, "R" = reservado
        String[] dataEntrada = new String[MAX_QUARTOS];
        String[] dataSaida = new String[MAX_QUARTOS];
        String[] nome = new String[MAX_QUARTOS];
        String[] telefone = new String[MAX_QUARTOS];
        double[] despesas = new double[MAX_QUARTOS];
        int[] numeroDias = new int[MAX_QUARTOS];

        boolean cadastrados = false;
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n\nHotel Fazenda Sucesso");
            System.out.println("1. Cadastra quartos");
            System.out.println("2. Lista todos os quartos");
            System.out.println("3. Lista quartos ocupados");
            System.out.println("4. Aluguel/Reserva de quarto");
            System.out.println("5. Entrar despesas extras");
            System.out.println("6. Calcular despesa do quarto");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (op) {
                case 1:
                    if (cadastrados) {
                        System.out.println("Atenção: quartos já cadastrados.");
                    } else {
                        for (int i = 0; i < MAX_QUARTOS; i++) {
                            System.out.println("Quarto " + (i + 1));
                            System.out.print("Quantidade de leitos: ");
                            leitos[i] = sc.nextInt();
                            System.out.print("Preço do quarto: ");
                            precos[i] = sc.nextDouble();
                            sc.nextLine(); // limpar buffer
                            situacao[i] = "L";
                            despesas[i] = 0.0;
                            dataEntrada[i] = "XXXX";
                            dataSaida[i] = "XXXX";
                            nome[i] = "";
                            telefone[i] = "";
                            numeroDias[i] = 0;
                        }
                        cadastrados = true;
                    }
                    break;

                case 2:
                    if (!cadastrados) {
                        System.out.println("Escolha a opção 1 primeiro.");
                    } else {
                        for (int i = 0; i < MAX_QUARTOS; i++) {
                            System.out.println("\nQuarto: " + (i + 1));
                            System.out.println("Situação: " + situacao[i]);
                            if (!situacao[i].equals("L")) {
                                System.out.println("Nome: " + nome[i]);
                                System.out.println("Telefone: " + telefone[i]);
                            }
                            System.out.println("Leitos: " + leitos[i]);
                            System.out.println("Preço: R$ " + precos[i]);
                            System.out.println("Despesas: R$ " + despesas[i]);
                            System.out.println("Entrada: " + dataEntrada[i]);
                            System.out.println("Saída: " + dataSaida[i]);
                            System.out.println("Diárias: " + numeroDias[i]);
                        }
                    }
                    break;

                case 3:
                    if (!cadastrados) {
                        System.out.println("Escolha a opção 1 primeiro.");
                    } else {
                        System.out.println("\nQuartos ocupados:");
                        for (int i = 0; i < MAX_QUARTOS; i++) {
                            if (situacao[i].equals("A")) {
                                System.out.println("\nQuarto: " + (i + 1));
                                System.out.println("Nome: " + nome[i]);
                                System.out.println("Despesas: R$ " + despesas[i]);
                                System.out.println("Entrada: " + dataEntrada[i]);
                                System.out.println("Saída: " + dataSaida[i]);
                                System.out.println("Diárias: " + numeroDias[i]);
                            }
                        }
                    }
                    break;

                case 4:
                    if (!cadastrados) {
                        System.out.println("Escolha a opção 1 primeiro.");
                    } else {
                        System.out.print("Digite A (aluguel) ou R (reserva): ");
                        String tipo = sc.nextLine().toUpperCase();

                        if (tipo.equals("A")) {
                            System.out.print("Tinha reserva? (S/N): ");
                            String temReserva = sc.nextLine().toUpperCase();
                            if (temReserva.equals("S")) {
                                System.out.print("Nome da reserva: ");
                                String nomeBusca = sc.nextLine();
                                int i;
                                for (i = 0; i < MAX_QUARTOS; i++) {
                                    if (nome[i].equalsIgnoreCase(nomeBusca)) {
                                        situacao[i] = "A";
                                        despesas[i] = 0.0;
                                        System.out.print("Data de entrada: ");
                                        dataEntrada[i] = sc.nextLine();
                                        System.out.print("Data de saída: ");
                                        dataSaida[i] = sc.nextLine();
                                        System.out.print("Número de diárias: ");
                                        numeroDias[i] = sc.nextInt();
                                        sc.nextLine();
                                        break;
                                    }
                                }
                                if (i == MAX_QUARTOS) {
                                    System.out.println("Reserva não encontrada.");
                                }
                            } else {
                                // aluguel novo
                                for (int i = 0; i < MAX_QUARTOS; i++) {
                                    if (situacao[i].equals("L")) {
                                        System.out.println("\nQuarto: " + (i + 1));
                                        System.out.println("Leitos: " + leitos[i]);
                                        System.out.println("Preço: R$ " + precos[i]);
                                    }
                                }

                                System.out.print("Número do quarto: ");
                                int q = sc.nextInt();
                                sc.nextLine();
                                if (q < 1 || q > 50 || situacao[q - 1].equals("A")) {
                                    System.out.println("Quarto inválido ou ocupado.");
                                } else {
                                    situacao[q - 1] = "A";
                                    despesas[q - 1] = 0.0;
                                    System.out.print("Nome: ");
                                    nome[q - 1] = sc.nextLine();
                                    System.out.print("Telefone: ");
                                    telefone[q - 1] = sc.nextLine();
                                    System.out.print("Data de entrada: ");
                                    dataEntrada[q - 1] = sc.nextLine();
                                    System.out.print("Data de saída: ");
                                    dataSaida[q - 1] = sc.nextLine();
                                    System.out.print("Número de diárias: ");
                                    numeroDias[q - 1] = sc.nextInt();
                                    sc.nextLine();
                                }
                            }
                        } else if (tipo.equals("R")) {
                            for (int i = 0; i < MAX_QUARTOS; i++) {
                                if (situacao[i].equals("L")) {
                                    System.out.println("\nQuarto: " + (i + 1));
                                    System.out.println("Leitos: " + leitos[i]);
                                    System.out.println("Preço: R$ " + precos[i]);
                                }
                            }

                            System.out.print("Número do quarto: ");
                            int q = sc.nextInt();
                            sc.nextLine();
                            if (q < 1 || q > 50 || situacao[q - 1].equals("A")) {
                                System.out.println("Quarto inválido ou ocupado.");
                            } else {
                                situacao[q - 1] = "R";
                                System.out.print("Nome: ");
                                nome[q - 1] = sc.nextLine();
                                System.out.print("Telefone: ");
                                telefone[q - 1] = sc.nextLine();
                                System.out.print("Data de entrada: ");
                                dataEntrada[q - 1] = sc.nextLine();
                                System.out.print("Data de saída: ");
                                dataSaida[q - 1] = sc.nextLine();
                                System.out.print("Número de diárias: ");
                                numeroDias[q - 1] = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                    }
                    break;

                case 5:
                    if (!cadastrados) {
                        System.out.println("Escolha a opção 1 primeiro.");
                    } else {
                        System.out.print("Número do quarto: ");
                        int q = sc.nextInt();
                        sc.nextLine();
                        if (q < 1 || q > 50) {
                            System.out.println("Número de quarto inválido.");
                        } else {
                            System.out.print("Valor da despesa: R$ ");
                            double valor = sc.nextDouble();
                            sc.nextLine();
                            despesas[q - 1] += valor;
                        }
                    }
                    break;

                case 6:
                    if (!cadastrados) {
                        System.out.println("Escolha a opção 1 primeiro.");
                    } else {
                        System.out.print("Número do quarto: ");
                        int q = sc.nextInt();
                        sc.nextLine();
                        if (q < 1 || q > 50) {
                            System.out.println("Número de quarto inválido.");
                        } else {
                            double total = despesas[q - 1] + (numeroDias[q - 1] * precos[q - 1]);
                            System.out.printf("Total a pagar: R$ %.2f\n", total);
                            situacao[q - 1] = "L";
                            despesas[q - 1] = 0.0;
                            dataEntrada[q - 1] = "XXXX";
                            dataSaida[q - 1] = "XXXX";
                            nome[q - 1] = "";
                            telefone[q - 1] = "";
                            numeroDias[q - 1] = 0;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 7);

        sc.close();
    }
}
