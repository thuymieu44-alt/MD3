package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập một số nguyên ");
        int number = scanner.nextInt();
        if(number == 0) {
            System.out.print("Số không phải chẵn cũng không phải lẻ");
        } else if(number % 2 == 0 ){
            System.out.printf("Số %d là số chẵn", number);
        } else {
            System.out.printf("Số %d là số lẻ", number);
        }
    }
}