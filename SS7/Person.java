import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

    class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Person person1 = new Person();
            Person person2 = new Person();
//            nhập thông tin người thứ nhất
            System.out.print("Nhập tên người thứ nhất: ");
            person1.setName(sc.nextLine());
            System.out.print("Nhập tuổi người thứ nhất: ");
            person1.setAge(sc.nextInt());
            sc.nextLine();
//            nhập thông tin người thứ hai
            System.out.print("Nhập tên người thứ hai: ");
            person2.setName(sc.nextLine());
            System.out.print("Nhập tuổi người thứ hai: ");
            person2.setAge(sc.nextInt());
//            so sánh tuổi và in ra
            if (person1.getAge() > person2.getAge()){
                System.out.println(person1.getName() + " lớn tuối hơn " + person2.getName());
            }else if (person2.getAge() > person1.getAge()){
                System.out.println(person2.getName() + " lớn tuổi hơn " + person1.getName());
            }else{
                System.out.print("Hai người bằng tuổi nhau");
            }
        }
    }
