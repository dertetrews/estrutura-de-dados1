import java.util.Random;
import java.util.Stack;

public class PilhasDinamicas2 {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();
        for (int i = 0; i < 100; i++) {
            int numeroSorteado = random.nextInt(9) + 1;

            if (numeroSorteado >= 1 && numeroSorteado <= 3) {
                pilha1.push(numeroSorteado);
            } else if (numeroSorteado >= 4 && numeroSorteado <= 6) {
                pilha2.push(numeroSorteado);
            } else if (numeroSorteado >= 7 && numeroSorteado <= 9) {
                pilha3.push(numeroSorteado);
            }
        }
        System.out.println("Estado inicial das pilhas:");
        exibirPilhas(pilha1, pilha2, pilha3);
        for (int i = 0; i < 100; i++) {
            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                System.out.println("O programa foi encerrado porque uma das pilhas está vazia.");
                break;
            }
            int pilhaEscolhida = random.nextInt(3) + 1;
            switch (pilhaEscolhida) {
                case 1:
                    if (!pilha2.isEmpty() && !pilha3.isEmpty()) {
                        int topoPilha2 = pilha2.pop();
                        int topoPilha3 = pilha3.pop();
                        System.out.println("Empilhando os números " + topoPilha2 + " e " + topoPilha3 + " na pilha 1");
                        pilha1.push(topoPilha2);
                        pilha1.push(topoPilha3);
                    }
                    break;
                case 2:
                    if (!pilha1.isEmpty() && !pilha3.isEmpty()) {
                        int topoPilha1 = pilha1.pop();
                        int topoPilha3 = pilha3.pop();
                        System.out.println("Empilhando os números " + topoPilha1 + " e " + topoPilha3 + " na pilha 2");
                        pilha2.push(topoPilha1);
                        pilha2.push(topoPilha3);
                    }
                    break;
                case 3:
                    if (!pilha1.isEmpty() && !pilha2.isEmpty()) {
                        int topoPilha1 = pilha1.pop();
                        int topoPilha2 = pilha2.pop();
                        System.out.println("Empilhando os números " + topoPilha1 + " e " + topoPilha2 + " na pilha 3");
                        pilha3.push(topoPilha1);
                        pilha3.push(topoPilha2);
                    }
                    break;
            }
        }
        System.out.println("\nEstado final das pilhas:");
        exibirPilhas(pilha1, pilha2, pilha3);
    }
    private static void exibirPilhas(Stack<Integer> pilha1, Stack<Integer> pilha2, Stack<Integer> pilha3) {
        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
        System.out.println();
    }
}
