//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int phanDu = a % b;
        System.out.printf("Tổng 2 số a + b = %d\n",tong);
        System.out.printf("Hiệu 2 số a - b = %d\n",hieu);
        System.out.printf("Tích 2 số a * b = %d\n",tich);
        System.out.printf("Thương 2 số a / b = %d\n",thuong);
        System.out.printf("Số dư khi chia a cho b là %d\n",phanDu);
    }
}