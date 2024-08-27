import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    private static Pessoa criarPessoa(int id) {
        Random random = new Random();
        String sexo = random.nextBoolean() ? "M" : "F";
        int idade = 18 + random.nextInt(73);  // Idade entre 18 e 90 anos
        boolean gestante = sexo.equals("F") && random.nextBoolean();
        boolean lactante = sexo.equals("F") && random.nextBoolean();
        boolean necessidadeEspecial = random.nextBoolean();

        return new Pessoa(id, sexo, idade, gestante, lactante, necessidadeEspecial);
    }

    public static void simularAtendimento() {
        ArrayDeque<Pessoa> fila = new ArrayDeque<>();
        List<Pessoa> atendidos = new ArrayList<>();
        List<Pessoa> naoAtendidos = new ArrayList<>();

        // Criar 100 pessoas aleatórias e adicionar à fila
        for (int i = 1; i <= 100; i++) {
            Pessoa pessoa = criarPessoa(i);
            fila.addLast(pessoa);
        }

        int grupo = 1;
        int totalAtendidos = 0;

        while (!fila.isEmpty() && totalAtendidos < 100) {
            int numAtendimentos = Math.min(grupo, 100 - totalAtendidos);
            List<Pessoa> atendidosPorGrupo = new ArrayList<>();

            for (int i = 0; i < numAtendimentos; i++) {
                if (fila.isEmpty()) {
                    break;
                }
                Pessoa pessoa = fila.stream().max(Comparator.comparingInt(Pessoa::getPrioridade)).orElse(null);
                if (pessoa != null) {
                    fila.remove(pessoa);
                    atendidosPorGrupo.add(pessoa);
                }
            }

            atendidos.addAll(atendidosPorGrupo);
            totalAtendidos += atendidosPorGrupo.size();
            grupo++;
        }

        naoAtendidos.addAll(fila);

        // Mostrar os resultados
        System.out.println("Pessoas atendidas:");
        for (Pessoa pessoa : atendidos) {
            System.out.println(pessoa);
        }

        System.out.println("\nPessoas não atendidas:");
        for (Pessoa pessoa : naoAtendidos) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) {
        simularAtendimento();
    }
}