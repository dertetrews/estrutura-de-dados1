public class TorredeHanoi {

    // Função recursiva para resolver a Torre de Hanói
    public static void resolverHanoi(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimentos++;
            return;
        }
        resolverHanoi(n - 1, origem, auxiliar, destino);
        movimentos++;
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }

    public static long movimentos = 0;

    public static void main(String[] args) {
        long pecas = 30;

        // Representando as torres como caracteres
        char origem = 'A';
        char destino = 'C';
        char auxiliar = 'B';

        // Captura o tempo de início
        long startTime = System.nanoTime();

        // Chama a função para resolver a Torre de Hanói
        resolverHanoi(pecas, origem, destino, auxiliar);

        // Captura o tempo de fim
        long endTime = System.nanoTime();

        // Calcula o tempo de execução
        long duration = endTime - startTime; // em nanosegundos

        // Converte o tempo de execução para minutos, segundos e milissegundos
        long milliseconds = (duration / 1000000) % 1000;
        long seconds = (duration / 1000000000) % 60;
        long minutes = (duration / 60000000000L) % 60;

        System.out.println(String.format("Tempo de execução: %d minutos, %d segundos, %d milissegundos", minutes, seconds, milliseconds));
        System.out.println("Número mínimo de movimentos: " + movimentos);
    }
}
