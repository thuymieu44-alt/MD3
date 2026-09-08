
import java.util.ArrayList;
public class Animals {
    protected String name;
    protected int age;
public Animals(String name, int age){
   setName(name);
   setAge(age);
}
    public void setName(String name){
    if(name == null || name.trim().isEmpty()){
        throw new IllegalArgumentException ("Tên không được để trống!");
    }
    this.name = name;
    }
    public String getName(){
    return name;
    }

    public void setAge(int age) {
    if(age < 0){
        throw new IllegalArgumentException("Tuổi không được âm!");
    }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    public String makeSound() {
        return "Some generic sound";
    }
}
// ---------------------- Dog ----------------------
class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}

// ---------------------- Cat ----------------------
class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
// ---------------------- Main ----------------------
class Main {
    public static void main(String[] args) {
        ArrayList<Animals> list = new ArrayList<>();

        list.add(new Dog("Buddy", 3, "Golden Retriever"));
        list.add(new Cat("Whiskers", 2, "Ghi"));

        for (Animals a : list) {
            a.displayInfo();
            System.out.println("Âm thanh: " + a.makeSound());
            System.out.println();
        }
    }
}