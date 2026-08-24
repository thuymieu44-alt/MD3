import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào email của bạn: ");
        String email = sc.nextLine().trim();
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";
        if (email.matches(regex)){
            System.out.print("Email hợp lệ.");
        } else {
            System.out.print("Email không hợp lệ!");
        }
    }
}