import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();


        if (a1 != a2 && a1 != a3){
            System.out.println("A");
        } else if (a2 != a1 && a2 != a3) {
            System.out.println("B");
        } else if (a3 != a1 && a3 != a2) {
            System.out.println("C");
        } else {
            System.out.println("*");
        }
    }
}
