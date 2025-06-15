import java.util.Stack;

public class Prefixa {
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

    public String paraPrefixa(String expressao) {
        StringBuilder prefixa = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (int i = expressao.length() - 1; i >= 0; i--) {
            char c = expressao.charAt(i);

            if (Character.isDigit(c)) {
                prefixa.insert(0, c);

                if (i - 1 >= 0 && !Character.isDigit(expressao.charAt(i - 1))) {
                    prefixa.insert(0, " ");
                }
            } else if (isOperator(c)) {
                while (!pilha.isEmpty() && precedence(c) < precedence(pilha.peek())) {
                    prefixa.insert(0, " " + pilha.pop());
                }

                if (i - 1 >= 0 &&
                        !isOperator(expressao.charAt(i - 1)) &&
                        expressao.charAt(i - 1) != ')' &&
                        expressao.charAt(i - 1) != '(') {
                    prefixa.insert(0, " ");
                }

                pilha.push(c);
            } else if (c == ')') {
                pilha.push(c);
            } else if (c == '(') {
                while (!pilha.isEmpty() && pilha.peek() != ')') {
                    prefixa.insert(0, " " + pilha.pop());
                }

                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
            }
        }

        while (!pilha.isEmpty()) {
            char operador = pilha.pop();

            if (!pilha.isEmpty() &&
                    !isOperator(pilha.peek()) &&
                    pilha.peek() != ')' &&
                    pilha.peek() != '(') {
                prefixa.insert(0, " ");
            }

            prefixa.insert(0, operador + " ");
        }

        return prefixa.toString().trim();
    }
}