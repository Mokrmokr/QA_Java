import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите комманду:");
            Commands command = Commands.valueOf(sc.next().toUpperCase(Locale.ROOT).trim());

            switch (command){
                case ADD:
                    System.out.println("Какое животное? (cat/dog/duck)");
                    String animalType = sc.next();
                    if (animalType.equals("cat")) {
                        System.out.println("Как тебя зовут?");
                        String name = sc.next();
                        System.out.println("Сколько тебе лет?");
                        int age = sc.nextInt();
                        System.out.println("А сколько ты весишь?");
                        int weight = sc.nextInt();
                        System.out.println("И какого ты цвета?");
                        String colour = sc.next();
                        Animal cat = new Cat(name, age, weight, colour);
                        animals.add(cat);
                        cat.say();
                    } else if (animalType.equals("dog")) {
                        System.out.println("Как тебя зовут?");
                        String name = sc.next();
                        System.out.println("Сколько тебе лет?");
                        int age = sc.nextInt();
                        System.out.println("А сколько ты весишь?");
                        int weight = sc.nextInt();
                        System.out.println("И какого ты цвета?");
                        String colour = sc.next();
                        Animal dog = new Dog(name, age, weight, colour);
                        animals.add(dog);
                        dog.say();
                    } else if (animalType.equals("duck")) {
                        System.out.println("Как тебя зовут?");
                        String name = sc.next();
                        System.out.println("Сколько тебе лет?");
                        int age = sc.nextInt();
                        System.out.println("А сколько ты весишь?");
                        int weight = sc.nextInt();
                        System.out.println("И какого ты цвета?");
                        String colour = sc.next();
                        Animal duck = new Duck(name, age, weight, colour);
                        animals.add(duck);
                        duck.say();
                    }

                    break;
                case LIST:
                    for (Animal animal: animals){
                        System.out.println(animal.toString());
                    }
                    break;
                case EXIT:
                    System.out.println("Заверешение работы (играет спокойная музыка)");
                    System.exit(0);
                    break;
            }
        }
    }
}
