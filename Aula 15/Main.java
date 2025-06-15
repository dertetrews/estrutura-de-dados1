import java.util.Scanner;

public class Main {
    public static boolean estaBalanceada(String expressao) {
        Pilha pilha = new Pilha();
        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) return false;
                char topo = pilha.pop();
                if (!combina(topo, c)) return false;
            }
        }
        return pilha.isEmpty();
    }

    private static boolean combina(char abre, char fecha) {
        return (abre == '(' && fecha == ')') ||
                (abre == '[' && fecha == ']') ||
                (abre == '{' && fecha == '}');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a expressão: ");
        String entrada = sc.nextLine();

        if (estaBalanceada(entrada)) {
            System.out.println("Expressão CORRETA!");
        } else {
            System.out.println("Expressão INCORRETA!");
        }
        sc.close();
    }
}
