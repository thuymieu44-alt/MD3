import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void addStudent(Scanner sc, ArrayList<Student> list) {
        String name;
        int age;
        double avgScore;

        // Nhập tên
        while (true) {
            System.out.print("Nhập tên sinh viên: ");
            name = sc.nextLine();
            if (name.trim().isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            } else break;
        }

        // Nhập tuổi
        while (true) {
            try {
                System.out.print("Nhập tuổi sinh viên: ");
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Tuổi phải là số! Nhập lại.");
            }
        }

        // Nhập điểm
        while (true) {
            try {
                System.out.print("Nhập điểm trung bình: ");
                avgScore = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Điểm phải là số! Nhập lại.");
            }
        }

        list.add(new Student(name, age, avgScore));
        System.out.println("Thêm sinh viên thành công!");
    }

    public static void showList(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Student s : list) {
            s.display();
        }
    }

}

