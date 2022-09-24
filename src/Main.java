import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        int c = 0;

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                b++;
            } else {
                c++;
            }
        }
        if (b > c) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }
}


