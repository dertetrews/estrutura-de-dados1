import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota da Prova1: ");
        float p1 = scan.nextFloat();
        System.out.print("Nota da Prova2: ");
        float p2 = scan.nextFloat();
        float mf = (p1+p2)/2;
        int mt = (int) mf;
        int ma = Math.round(mf);
        System.out.println("Media truncada ="+mt+"\nMedia arredondada ="+ma);
    }
}
