import ra.business.ProductBusiness;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductBusiness productBusiness = new ProductBusiness();

        int choice;

        do {
            System.out.println("*********************QUẢN LÝ SẢN PHẨM********************\n" +
                                            "1. Thêm sản phẩm\n" +
                                            "2. Danh sách sản phẩm\n" +
                                            "3. Cập nhật sản phẩm theo mã sản phẩm\n" +
                                            "4. Xóa sản phẩm theo mã sản phẩm\n" +
                                            "5. Tìm kiếm sản phẩm theo tên\n" +
                                            "6. Sắp xếp sản phẩm theo giá tăng dần\n" +
                                            "7. Sắp xếp sản phẩm theo số lượng giảm dần\n" +
                                            "8. Thoát\n" +
                                    "==================================================\n" +
                                                    "Lựa chọn của bạn: "
            );
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    productBusiness.addProduct();
                    break;

                case 2:
                    productBusiness.displayProducts();
                    break;

                case 3:
                    productBusiness.updateProductById();
                    break;

                case 4:
                    productBusiness.deleteProductById();
                    break;

                case 5:
                    productBusiness.searchByName();
                    break;

                case 6:
                    productBusiness.sortByPriceAsc();
                    productBusiness.displayProducts();
                    break;

                case 7:
                    productBusiness.sortByQuantityDesc();
                    productBusiness.displayProducts();
                    break;

                case 8:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập từ 1–8");
            }

            System.out.println(); // dòng trống cho đẹp

        } while (choice != 8);
    }
}
