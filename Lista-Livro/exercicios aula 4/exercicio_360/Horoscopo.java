import java.util.Scanner;

public class Horoscopo {
    String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};

    public String getSigno(int dia, int mes) {
        if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
            return signos[0];
        } else if (dia >= 21 && mes == 1 || dia <= 18 && mes == 2) {
            return signos[1];
        } else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
            return signos[2];
        } else if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
            return signos[3];
        } else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
            return signos[4];
        } else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            return signos[5];
        } else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
            return signos[6];
        } else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
            return signos[7];
        } else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
            return signos[8];
        } else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
            return signos[9];
        } else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
            return signos[10];
        } else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
            return signos[11];
        } else {
            return "Data inválida";
        }
    }

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        Horoscopo horoscopo = new Horoscopo();

        int dia, mes;
        System.out.println("Digite a data de nascimento (ddmm) para calcular o horóscopo. Digite 9999 para sair.");
        do {
            System.out.print("Dia: ");
            dia = scanner.nextInt();
            System.out.print("Mês: ");
            mes = scanner.nextInt();
            scanner.nextLine(); // Consume the '\n'
            String signo = horoscopo.getSigno(dia, mes);
            System.out.println("Horóscopo: " + signo);
            System.out.println();
        } while (dia != 9999);

        scanner.close();
    }
}