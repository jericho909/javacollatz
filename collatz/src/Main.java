import java.util.*;
public class Main {
    static int steps = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz: ");
        int N = input.nextInt();
        collatz(N);
    }

    static void collatz(int i){
       if (i == 1){
            System.out.println("1'e "+ steps +" adımda ulaşıldı.");
       } else if (i % 2 == 0) {
           System.out.println(i + " çift sayı, 2'ye bölünüyor.");
           steps++;
           collatz(i / 2);
       } else {
           System.out.println( i + " tek sayı, 3 ile çarpılıp 1 ekleniyor.");
           steps++;
           collatz(3 * i + 1);
       }
    }


}