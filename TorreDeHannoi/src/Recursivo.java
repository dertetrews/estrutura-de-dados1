class Recursivo {
    public void hannoi(long a, char origem, char destino, char auxiliar) {
        if (a == 1) {
            movimentos++;
            System.out.println("Movendo disco de " + origem + " para " + destino);
            System.out.println(movimentos);
            return;
        }
        hannoi(a - 1, origem, auxiliar, destino);
        movimentos++;
        System.out.println("Movendo disco de " + origem + " para " + destino);
        System.out.println(movimentos);
        hannoi(a - 1, auxiliar, destino, origem);
    }
    private long movimentos = 0;
}