package ex5_ss2;

import java.util.Scanner;

public class ex5_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số nguyên từ 1 đến 12 (12 tháng): ");
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:{
                System.out.printf("Tháng %d có 31 ngày.", month);
                break;
            }
            case 4, 6, 9, 11: {
                System.out.printf("Tháng %d có 30 ngày.", month);
                break;
            }
            case 2: {
                System.out.printf("Tháng 2 có 28 hoặc 29 ngày.");
                break;
            }
            default: {
                System.out.println("Tháng không hợp lệ.");
            }
            scanner.close();
        }
    }
}