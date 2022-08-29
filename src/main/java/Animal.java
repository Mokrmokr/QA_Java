public class Animal {

    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say () {
        System.out.println("Я говорю");
    }

    public void go () {
        System.out.println("Я иду");
    }

    public void drink () {
        System.out.println("Я пью");
    }

    public void eat () {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String str;
        if (age % 10 == 1 & age != 11) {
            str = "Привет! меня зовут " + name + ", мне " + age + " год, я вешу - " + weight + " кг, мой цвет - " + color;
        } else if (age % 10 > 1 & age % 10 < 6 & age != 12 & age != 13 & age != 14) {
            str = "Привет! меня зовут " + name + ", мне " + age + " года, я вешу - " + weight + " кг, мой цвет - " + color;
        } else {
            str = "Привет! меня зовут " + name + ", мне " + age + " лет, я вешу - " + weight + " кг, мой цвет - " + color;
        }
        return str;
    }
}
