import javax.swing.*;

public class Main {
    public static void main(String[] arg) {
        String opcao = JOptionPane.showInputDialog("Escolha a forma geométrica (quadrado, triangulo, retangulo, circulo): ");

        switch (opcao.toLowerCase()) {
            case "quadrado":
                Quadrado quadrado = new Quadrado();
                String base = JOptionPane.showInputDialog("Digite o valor da base quadrado ");
                quadrado.b = Integer.parseInt(base);
                String altura = JOptionPane.showInputDialog("valor da altura quadrado ");
                quadrado.h = Integer.parseInt(altura);
                JOptionPane.showMessageDialog(null,"Resultado base do quadrado "+ quadrado.h * quadrado.b);
                break;
            case "triangulo":
                Triangulo triangulo = new Triangulo();
                String baset = JOptionPane.showInputDialog("Digite o valor da base triangulo ");
                triangulo.b = Integer.parseInt(baset);
                String alturat = JOptionPane.showInputDialog("Valor da altura triangulo ");
                triangulo.h = Integer.parseInt(alturat);
                JOptionPane.showMessageDialog(null,"Resultado base do triangulo : "+ triangulo.b * triangulo.h);
                break;
            case "retangulo":
                Retangulo retangulo = new Retangulo();
                String baser = JOptionPane.showInputDialog("Digite o valor da base retangulo ");
                retangulo.b = Integer.parseInt(baser);
                String alturar = JOptionPane.showInputDialog("valor da altura retangulo ");
                retangulo.h = Integer.parseInt(alturar);
                JOptionPane.showMessageDialog(null, "Resultado do retangulo : "+ retangulo.b * retangulo.h);
                break;
            case "circulo":
                Circulo circulo = new Circulo();
                String basec = JOptionPane.showInputDialog("Digite o valor da base circulo ");
                circulo.b = Integer.parseInt(basec);
                String alturac = JOptionPane.showInputDialog("valor da altura circulo ");
                circulo.h = Integer.parseInt(alturac);
                JOptionPane.showMessageDialog(null,"Resultado do circulo : "+ circulo.b * circulo.h);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
