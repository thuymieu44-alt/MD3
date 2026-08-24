import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        String replaceStr = str.replaceAll("\\d", "*");
        System.out.print(replaceStr);
    }
}