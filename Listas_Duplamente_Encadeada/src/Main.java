public class Main {
    public static void main (String[] args) {
        Lista_Ligada dll = new Lista_Ligada();

        dll.adicionarPrimeiro("paraguai");
        dll.adicionarPrimeiro("mingal");
        dll.adicionar("joakin guilherme");
        dll.adicionar("pidamonhangaba");
        dll.adicionar("jaguara");
        dll.adicionar("cleiton");

        System.out.println("Lista em ordem normal");
        dll.mostrarLista();
        System.out.println("Lista em ordem contraria");
        dll.mostrarUltimo();
    }
}
