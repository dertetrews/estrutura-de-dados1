import java.util.Stack;

public class Infixa {
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    public String paraNormalPosFixa(String expressao) {
        String[] tokens = expressao.split(" ");
        Stack<String> pilha = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                String operand2 = pilha.pop();
                String operand1 = pilha.pop();
                String resultado = "(" + operand1 + " " + token + " " + operand2 + ")";
                pilha.push(resultado);
            } else {
                pilha.push(token);
            }
        }

        return pilha.pop();
    }

    public String paraNormalPreFixa(String expressao) {
        Stack<String> stack = new Stack<>();


        String[] tokens = expressao.split(" ");


        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (!isOperator(token)) {
                stack.push(token);
            } else {

                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String infixExp = "(" + operand1 + " " + token + " " + operand2 + ")";
                stack.push(infixExp);
            }
        }
        return stack.pop();
    }
}