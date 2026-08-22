import java.util.Scanner;

public class  ex4 {
    public static void main(String[] args) {
//        Kiểm tra rỗng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("Kích thước rỗng.");
            return;
        }
//        khởi tạo mảng
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//     Hiển thị mảng ban đầu
        System.out.print("Mảng ban đầu: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
//     Đảo ngược mảng và hiển thị
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("Mảng sau khi đảo ngược: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}