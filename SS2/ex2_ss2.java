package ex2_ss2;

import java.util.Scanner;

public class ex2_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số nguyên từ 1 đến 7: ");
        int inNumber = scanner.nextInt();
        switch(inNumber){
            case 1: {
                System.out.print("Chủ nhật");
            }
            break;
            case 2: {
                System.out.print("Thứ hai");
            }
            break;
            case 3 :{
                System.out.print("Thứ ba");
            }
            break;
            case 4 :{
                System.out.print("Thứ tư");
            }
            break;
            case 5 :{
                System.out.print("Thứ năm");
            }
            break;
            case 6:{
                System.out.print("Thứ sáu");
            }
            break;
            case 7:{
                System.out.print("Thứ bảy");
            }
            break;
            default:
                System.out.print("Số nhập vào không hợp lệ");
        }
    }
}