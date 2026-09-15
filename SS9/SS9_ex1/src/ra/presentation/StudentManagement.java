package ra.presentation;
import ra.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("***********************QUẢN LÝ SINH VIÊN***********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã sinh viên");
            System.out.println("4. Xóa sinh viên theo mã sinh viên");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sách sinh viên trống");
                    }else for (Student s : studentList) {
                        s.displayData();
                    }
                    break;
                }
                case 2: {
                    Student s = new Student();
                    s.inputData(scanner);
                    studentList.add(s);
                    System.out.print("Thêm sinh viên thành công");
                    break;
                }
                case 3: {
                    System.out.print("Nhập mã sinh viên cần cập nhật: ");
                    String id = scanner.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        Student s = studentList.get(i);

                        if (s.getStudentID().equals(id)) {
                            System.out.print("Nhập thông tin mới: ");
                            s.inputData(scanner);
                            System.out.print("Cập nhật thành công!");
                        }
                    }
                    System.out.println("Mã sinh viên không tồn tại!");
                    break;
                }
                case 4: {
                    System.out.println("Nhập mã sinh viên cần xóa: ");
                    String id = scanner.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        Student s = studentList.get(i);
                        if (s.getStudentID().equals(id)) {
                            studentList.remove(i);
                            System.out.println("Xóa thành công!");
                        }
                    }
                    System.out.println("Không tìm thấy mã sinh viên muốn xóa!");
                    break;
                }
                case 5: {
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String name = scanner.nextLine();

                    int count = 0;

                    for (int i = 0; i < studentList.size(); i++) {
                        Student s = studentList.get(i);

                        if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                            s.displayData();
                            count++;
                        }
                    }

                    System.out.println("Tổng số sinh viên tìm thấy: " + count);
                    break;
                }
                case 6: {
                    System.out.println("Thoát chương trình");
                    break;
                }
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6) ;
    }
}
