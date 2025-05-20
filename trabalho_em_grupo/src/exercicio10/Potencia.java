package exercicio10;

import java.util.Scanner;

public class Potencia {
    public int calcular(int a, int b){
        if (b == 1){
            return a;
        }
        return a * calcular(a,b-1);
    }
}
