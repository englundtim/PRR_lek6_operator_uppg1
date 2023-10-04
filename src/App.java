import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a)");
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv in tal 1");
        int tal1 = in.nextInt();
        System.out.println("Skriv in tal 2");
        int tal2 = in.nextInt();

        System.out.println("Är tal1 = tal2?");
        System.out.println(tal1==tal2);
        System.out.println("Är tal1 < tal2?");
        System.out.println(tal1<=tal2);
        System.out.println("Är tal1 > tal2?");
        System.out.println(tal1>=tal2);

    }
}
