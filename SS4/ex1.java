import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  ex1{
    public static void main(String[] args) {
//        khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//       sắp xếp và tìm giá trị lớn nhất trong mảng
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
//        hiển thị mảng sau sắp xếp + phần tử lớn nhất5
        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Phần tử lớn nhất trong mảng là: " + arr[0]);

    }
}