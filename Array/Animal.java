public class Animal {
    String name;
    int age;
    int weight;
    int height;

    public Animal(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String toString() {
        return name + " " + age + " " + weight + " " + height + "\n";
    }
}
