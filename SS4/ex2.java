import java.util.Scanner;

public class  ex2 {
    public static void main(String[] args) {
//        khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        tính tổng và  hiển thị
        int sum = 0;
        for(int j = 0; j < n; j++) {
            sum += arr[j];
        }
            System.out.printf("Tổng các phần tử trong mảng là: %d", sum);
    }
}