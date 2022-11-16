import java.util.Scanner;

public class Meth {

    public static String name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = sc.next();
        return name;
    }

    public static int age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int age = sc.nextInt();
        return age;
    }
    public static int weight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("А сколько ты весишь?");
        int weight = sc.nextInt();
        return weight;
    }
    public static String colour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("И какого ты цвета?");
        String colour = sc.next();
        return colour;
    }
}
