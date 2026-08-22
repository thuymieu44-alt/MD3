import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Nhập các phần tử cho mảng (theo từng hàng):");
        for (int i = 0; i < rows; i++) {
            System.out.print("Hàng " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các số chẵn: " + sumEven);
        System.out.println("Tổng các số lẻ: " + sumOdd);
    }
}

