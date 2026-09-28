package ra.entity;

import java.util.HashSet;
import java.util.Set;

    public class Validate {

        // Dùng để kiểm tra trùng tên sản phẩm
        private static Set<String> productNames = new HashSet<>();

        // Kiểm tra tên sản phẩm
        public static boolean validateName(String name) {
            if (name == null) {
                System.out.println("Tên sản phẩm không được trống!");
                return false;
            }

            name = name.trim();

            if (name.length() < 10 || name.length() > 50) {
                System.out.println("Tên sản phẩm phải từ 10-50 ký tự!");
                return false;
            }

            if (productNames.contains(name.toLowerCase())) {
                System.out.println("Tên sản phẩm đã tồn tại!");
                return false;
            }

            // Nếu hợp lệ → lưu vào danh sách để kiểm tra trùng lặp
            productNames.add(name.toLowerCase());
            return true;
        }

        // Kiểm tra giá sản phẩm
        public static boolean validatePrice(float price) {
            if (price <= 0) {
                System.out.println("Giá sản phẩm phải lớn hơn 0");
                return false;
            }
            return true;
        }

        // Kiểm tra loại sản phẩm
        public static boolean validateCategory(String category) {
            if (category == null || category.trim().length() > 200) {
                System.out.println("Loại sản phẩm tối đa 200 ký tự");
                return false;
            }
            return true;
        }

        // Kiểm tra số lượng tồn kho
        public static boolean validateQuantity(int quantity) {
            if (quantity < 0) {
                System.out.println("Số lượng tồn kho không được âm");
                return false;
            }
            return true;
        }
    }

