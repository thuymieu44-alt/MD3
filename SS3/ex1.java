import java.util.Scanner;

public  class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên khách hàng: ");
        String customerName = sc.nextLine();

        System.out.print("Mời nhập tên sản phẩm: " );
        String productName = sc.nextLine();

        System.out.print("Mời nhập số lượng: ");
        int productQuantity = Integer.parseInt(sc.nextLine());

        System.out.print("Mời nhập giá sản phẩm: ");
        double productPrice = Double.parseDouble(sc.nextLine());

        System.out.print("Bạn có thẻ thành viên hay không? (true/false): ");
        boolean membershipCard = Boolean.parseBoolean(sc.nextLine());

        double discount = 0;
        if (membershipCard == true){
            discount = (productPrice * productQuantity) * 0.1;
        } else {
            discount = 0;
        }
        System.out.printf("Khách hàng: %s\n Sản phẩm: %s\n Giá: %.2fVND\n Số lượng: %d\n Thành tiền: %.2fVND\n" +
                "Giảm giá: %.2fVND\n Thuế VAT: %.2fVND\n Tổng thanh toán: %.2fVND",
                customerName, productName, productPrice, productQuantity,productPrice*productQuantity, discount, (productPrice*productQuantity)*0.08,
                (productPrice*productQuantity) - discount + ((productPrice*productQuantity)*0.08));
    }
}