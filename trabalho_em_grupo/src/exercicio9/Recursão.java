package exercicio9;

public class Recursão {
    public int soma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + soma(n - 1);
    }
}
