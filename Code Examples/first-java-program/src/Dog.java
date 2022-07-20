public class Dog {
    private String name;
    private int size;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void size(int size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Bark Bark Bark!");
    }

    public String toString() {
        return name + " " + size;
    }
}
