import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application extends Meth{
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите комманду:");
            Commands command = Commands.valueOf(sc.next().toUpperCase(Locale.ROOT).trim());

            switch (command){
                case ADD:
                    System.out.println("Какое животное? (cat/dog/duck)");
                    String animalType = sc.next();
                    if (animalType.equals("cat")) {
                        String name = name();
                        int age = age();
                        int weight = weight();
                        String colour = colour();
                        Animal cat = new Cat(name, age, weight, colour);
                        animals.add(cat);
                        cat.say();
                    } else if (animalType.equals("dog")) {
                        String name = name();
                        int age = age();
                        int weight = weight();
                        String colour = colour();
                        Animal dog = new Dog(name, age, weight, colour);
                        animals.add(dog);
                        dog.say();
                    } else if (animalType.equals("duck")) {
                        String name = name();
                        int age = age();
                        int weight = weight();
                        String colour = colour();
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
                    System.out.println("Заврешение работы (играет спокойная музыка)");
                    System.exit(0);
                    break;
            }
        }
    }
}
