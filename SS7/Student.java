import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String className;
    private double avgScore;

    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public String toString() {
        return ("Tên: " + name + ", Tuổi: " + age + ", Lớp: " + className + ", Điểm trung bình: " + avgScore);
    }
}

 class main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // Tạo danh sách có sẵn
         ArrayList<Student> list = new ArrayList<>();
         list.add(new Student("Bob", 21, "A1", 7.0));
         list.add(new Student("Alice", 22, "A1", 6.5));
         list.add(new Student("Eve", 20, "A1", 8.0));
         list.add(new Student("John", 19, "A2", 9.1));
         list.add(new Student("David", 23, "A3", 5.8));

         // Nhập min và max
         System.out.print("Nhập điểm min: ");
         double min = sc.nextDouble();

         System.out.print("Nhập điểm max: ");
         double max = sc.nextDouble();

         // Hiển thị sinh viên có avgScore trong khoảng min-max
         System.out.println("\nDanh sách sinh viên có điểm trung bình từ " + min + " đến " + max + ":");
         for (Student s : list) {
             if (s.getAvgScore() >= min && s.getAvgScore() <= max) {
                 System.out.println(s);
             }
         }
     }
 }

