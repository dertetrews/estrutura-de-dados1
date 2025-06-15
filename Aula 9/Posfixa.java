import java.util.Stack;

public class Posfixa {
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private int precedence(char c) {
        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    public String paraPosfixa(String expressao) {
        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) {
                numero.append(c);
            } else {
                if (numero.length() > 0) {
                    resultado.append(numero.toString()).append(" ");
                    numero.setLength(0);
                }

                if (Character.isLetterOrDigit(c)) {
                    resultado.append(c).append(" ");
                } else if (c == '(') {
                    pilha.push(c);
                } else if (c == ')') {
                    while (!pilha.isEmpty() && pilha.peek()!= '(') {
                        resultado.append(pilha.pop()).append(" ");
                    }
                    pilha.pop();
                } else if (isOperator(c)) {
                    while (!pilha.isEmpty() && precedence(c) <= precedence(pilha.peek())) {
                        resultado.append(pilha.pop()).append(" ");
                    }
                    pilha.push(c);
                }
            }
        }

        if (numero.length() > 0) {
            resultado.append(numero.toString()).append(" ");
        }

        while (!pilha.isEmpty()) {
            char topo = pilha.pop();
            if (topo == '(') {
                throw new RuntimeException("Não há parênteses correspondentes.");
            }
            resultado.append(topo).append(" ");
        }

        return resultado.toString().trim();
    }
}