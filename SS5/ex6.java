import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mật khẩu của bạn: ");
        String password = sc.nextLine().trim();
        String regexPass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%])[A-Za-z\\d@#$!%]{8,}$";
        if(password.matches(regexPass)){
            System.out.print("Mật khẩu hợp lệ.");
        } else {
            System.out.print("Mật khẩu không hơp lệ!");
        }
    }
}
