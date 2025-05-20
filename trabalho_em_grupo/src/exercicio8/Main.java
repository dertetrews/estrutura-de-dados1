package exercicio8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TestaPilha testaPilha = new TestaPilha();
        Random random = new Random();

        System.out.println("Sorteando 1000 números entre -100 e 100...\n");

        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(201) - 100;
            testaPilha.processaNumero(numeroSorteado);
        }

        testaPilha.exibeEstadoPilhas();
    }
}