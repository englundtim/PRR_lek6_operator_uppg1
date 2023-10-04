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

        System.out.println("Uppgift b)");

        int[] fält1 = {4,5,2};
        System.out.println("Är 4 < 5 eller 2?");
        System.out.println(fält1[0]<=fält1[1]);
        System.out.println(fält1[0]<=fält1[2]);
        System.out.println("Är 4 > 5 eller 2?");
        System.out.println(fält1[0]>=fält1[1]);
        System.out.println(fält1[0]>=fält1[2]);
        System.out.println("Är 4 = 5 eller 2?");
        System.out.println(fält1[0]==fält1[1]);
        System.out.println(fält1[0]==fält1[2]);

        System.out.println("Uppgift c)");
        int tal = in.nextInt();
        int talStart=tal;
        tal+=7;
        tal*=2;
        tal-=6;
        tal/=2;
        tal+=3;
        tal-=talStart;
        System.out.println("Blev talet 7?");
        System.out.println(tal==7);
    }
}
