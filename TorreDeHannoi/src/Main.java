public class Main {
    public static void main(String[] args) {
        Recursivo recursivo = new Recursivo();
        long comeco = System.nanoTime();
        recursivo.hannoi(4,'A','C','B');
        long fim = System.nanoTime();
        long media = fim-comeco;
        long segundo = (media / 1_000_000_000)%60;
        System.out.println("segundos: "+segundo+"\n minutos: ");
    }
}