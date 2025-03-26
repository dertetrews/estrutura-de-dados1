public class Main {
    public static void main (String[] args) {
        int a,b;
        for(a=1;a<=10;a++){
            for(b=a;b <=a;b++){
                System.out.println("\t"+a+"-"+b);
            }
            for(int c = 1;c <= a;c++){
                System.out.print("\t");
            }
        }
    }
}
