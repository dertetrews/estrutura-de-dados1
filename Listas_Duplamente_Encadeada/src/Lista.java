class Lista {
    String data;
    Lista atual;
    Lista proximo;

    // Construtor que aceita uma String como dado
    public Lista(String data) {
        this.data = data;
        this.atual = null;
        this.proximo = null;
    }
}