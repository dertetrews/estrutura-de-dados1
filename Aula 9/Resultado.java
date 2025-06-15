import java.util.Stack;

public class Resultado {

    public double calcularExpressao(String expressao) {
        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            if (caractere == ' ')
                continue;

            if (caractere == '(') {
                operadores.push(caractere);
            } else if (Character.isDigit(caractere)) {
                StringBuilder sb = new StringBuilder();
                while (i < expressao.length() && (Character.isDigit(expressao.charAt(i)) || expressao.charAt(i) == '.')) {
                    sb.append(expressao.charAt(i));
                    i++;
                }
                numeros.push(Double.valueOf(sb.toString()));
                i--;
            } else if (caractere == ')') {
                while (operadores.peek() != '(') {
                    numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
                }
                operadores.pop();
            } else if (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/' || caractere == '^') {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(caractere)) {
                    numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
                }
                operadores.push(caractere);
            }
        }

        while (!operadores.isEmpty()) {
            numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
        }

        return numeros.pop();
    }

    private int precedencia(char operador) {
        if (operador == '+' || operador == '-')
            return 1;
        if (operador == '*' || operador == '/')
            return 2;
        if (operador == '^')
            return 3;
        return 0;
    }

    private double aplicarOperador(char operador, double b, double a) {
        switch (operador) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b == 0) throw new
                        UnsupportedOperationException("Não é possível dividir por zero");
                return a / b;
            }
            case '^' -> {
                return Math.pow(a, b);
            }
        }
        return 0;
    }
}