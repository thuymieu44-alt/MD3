package ra.business;

import ra.entity.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductBusiness {
    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("=== Nhập thông tin sản phẩm mới ===");

        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Giá sản phẩm: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.print("Danh mục sản phẩm: ");
        String category = scanner.nextLine();

        System.out.print("Số lượng tồn kho: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Product p = new Product(name, price, category, quantity);

        // Kiểm tra xem setter có set được không (nếu lỗi thì thuộc tính vẫn null hoặc 0)
        if (p.getProductName() == null || p.getPrice() == 0 || p.getCategory() == null) {
            System.out.println("Dữ liệu không hợp lệ, không thể thêm sản phẩm");
            return;
        }

        productList.add(p);
        System.out.println("✔ Thêm sản phẩm thành công!");
    }

    public void displayProducts() {
        System.out.println("=== Danh sách sản phẩm ===");
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào!");
            return;
        }

        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void updateProductById() {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product found = null;
        for (Product p : productList) {
            if (p.getProductID() == id) {
                found = p;
                break;
            }
        }

        if (found == null) {
            System.out.println("Không tìm thấy sản phẩm với mã: " + id);
            return;
        }

        System.out.println("=== Cập nhật thông tin sản phẩm ===");

        System.out.print("Tên mới: ");
        String newName = scanner.nextLine();
        found.setProductName(newName);

        System.out.print("Giá mới: ");
        float newPrice = Float.parseFloat(scanner.nextLine());
        found.setPrice(newPrice);

        System.out.print("Danh mục mới: ");
        String newCategory = scanner.nextLine();
        found.setCategory(newCategory);

        System.out.print("Số lượng mới: ");
        int newQuantity = Integer.parseInt(scanner.nextLine());
        found.setQuantity(newQuantity);

        System.out.println("✔ Cập nhật thành công!");
    }

    public void deleteProductById() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product found = null;
        for (Product p : productList) {
            if (p.getProductID() == id) {
                found = p;
                break;
            }
        }

        if (found == null) {
            System.out.println(" Không tìm thấy sản phẩm để xóa");
            return;
        }

        productList.remove(found);
        System.out.println("✔ Xóa sản phẩm thành công!");
    }


    public void searchByName() {
        System.out.print("Nhập từ khóa tìm kiếm: ");
        String keyword = scanner.nextLine().toLowerCase();

        System.out.println("=== Kết quả tìm kiếm ===");
        boolean foundAny = false;

        for (Product p : productList) {
            if (p.getProductName().toLowerCase().contains(keyword)) {
                System.out.println(p);
                foundAny = true;
            }
        }

        if (!foundAny) {
            System.out.println("Không tìm thấy sản phẩm phù hợp");
        }
    }


    public void sortByPriceAsc() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        System.out.println("✔ Đã sắp xếp theo giá tăng dần");
    }


    public void sortByQuantityDesc() {
        Collections.sort(productList, (a, b) -> b.getQuantity() - a.getQuantity());
        System.out.println("✔ Đã sắp xếp theo số lượng giảm dần");
    }
}

