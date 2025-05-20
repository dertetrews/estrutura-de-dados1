package exercicio3;

public class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void exibirDados() {
        System.out.println("Avião: " + nome + " | ID: " + identificador);
    }
}
