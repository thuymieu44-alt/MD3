package ex3;

import java.util.Scanner;

public class ex3 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập bán kính hình tròn:");
        int r = scanner.nextInt();
        double A = Math.PI * Math.pow(r,2);
        System.out.print(A);
    }
}

