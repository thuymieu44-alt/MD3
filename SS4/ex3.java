import java.util.Scanner;

public class  ex3 {
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
        boolean swapped;
        for( int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j = 0; j < n -1 - i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}