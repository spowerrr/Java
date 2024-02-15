public class Main{
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Main person = new Main("John", 30);
        person.getDetails();
    }
}
