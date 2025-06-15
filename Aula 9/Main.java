import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Infixa infixa = new Infixa();
            Posfixa posfixa = new Posfixa();
            Prefixa prefixa = new Prefixa();
            Resultado resultado = new Resultado();
            byte operacao;

            System.out.println("Bem vindo à calculadora polonesa!");

            do {
                System.out.print("\nQual expressão você quer converter?\n 1 - Infixa\n 2 - Pós-fixa\n 3 - Pré-fixa\n 4 - Encerrar programa\nOperação: ");
                operacao = entrada.nextByte();
                entrada.nextLine();

                switch(operacao) {
                    case 1 -> {
                        System.out.print("\n\nDigite a expressão em notação infixa: ");
                        String expressaoInfixa = entrada.nextLine();

                        System.out.println("\n\nExpressão Infixa: " + expressaoInfixa);
                        System.out.println("Expressão Pós-fixa: " + posfixa.paraPosfixa(expressaoInfixa));
                        System.out.println("Expressão Pré-fixa: " + prefixa.paraPrefixa(expressaoInfixa));
                        System.out.println("Resultado da expressão: " + resultado.calcularExpressao(expressaoInfixa));
                    }

                    case 2 -> {
                        System.out.print("\n\nDigite a expressão em notação Pós-fixa: ");
                        String expressaoPosfixa = entrada.nextLine();

                        System.out.println("\n\nExpressao Pós-fixa: " + expressaoPosfixa);
                        String normalPosFixa = infixa.paraNormalPosFixa(expressaoPosfixa);
                        System.out.println("Expressão Infixa: " + normalPosFixa);
                        System.out.println("Expressão Pré-fixa: " + prefixa.paraPrefixa(normalPosFixa));
                        System.out.println("Resultado da expressão: " + resultado.calcularExpressao(normalPosFixa));
                    }

                    case 3 -> {
                        System.out.print("\n\nDigite a expressão em notação Pré-fixa: ");
                        String expressaoPrefixa = entrada.nextLine();

                        System.out.println("\n\nExpressão Pré-fixa: " + expressaoPrefixa);
                        String normalPrefixa = infixa.paraNormalPreFixa(expressaoPrefixa);
                        System.out.println("Expressão Infixa: " + normalPrefixa);
                        System.out.println("Expressão Pós-fixa: " + posfixa.paraPosfixa(normalPrefixa));
                        System.out.println("Resultado da expressão: " + resultado.calcularExpressao(normalPrefixa));
                    }

                    case 4 -> System.out.println("\n\nO programa será encerrado.");

                    default -> System.out.println("Operação inválida!");
                }
            } while (operacao != 4);
        }
    }
}