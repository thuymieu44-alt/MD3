package ex4_ss2;

import java.util.Scanner;

class ex4_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            System.out.println("Vui lòng nhập số tuổi của bạn: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
                scanner.next();
                continue;
            }
            age = scanner.nextInt();
            if (age <= 0) {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0.");
            } else {
                break;
            }
        }
        System.out.printf("Tuổi của bạn là %d", age);
        scanner.close();
    }
}