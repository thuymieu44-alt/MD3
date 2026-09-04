import java.util.Scanner;

public class ex2 {

    // ====== THUỘC TÍNH NGƯỜI DÙNG ======
    private String fullName;
    private String email;
    private String phone;
    private String password;

    // ====== CONSTRUCTOR ======
    public ex2(String fullName, String email, String phone, String password) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // ====== GETTER & SETTER ======
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    // ====== MAIN MENU ======
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex2 user = null;

        while (true) {
            System.out.println("********************QUẢN LÝ NGƯỜI DÙNG********************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // CASE 1: Nhập thông tin
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    String fullName = sc.nextLine();

                    System.out.print("Nhập email: ");
                    String email = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    String password = sc.nextLine();

                    user = new ex2(fullName, email, phone, password);
                    System.out.println("Đã nhập xong!");
                    break;

                // CASE 2: Chuẩn hóa họ tên
                case 2:
                    if (user == null) {
                        System.out.println("Chưa nhập thông tin!");
                        break;
                    }

                    String name = user.getFullName().trim().toLowerCase();
                    String[] parts = name.split("\\s+");
                    StringBuilder sb = new StringBuilder();

                    for (String p : parts) {
                        sb.append(Character.toUpperCase(p.charAt(0)))
                                .append(p.substring(1))
                                .append(" ");
                    }

                    user.setFullName(sb.toString().trim());
                    System.out.println("Tên sau khi chuẩn hóa: " + user.getFullName());
                    break;

                // CASE 3: Kiểm tra email hợp lệ
                case 3:
                    if (user == null) {
                        System.out.println("Chưa nhập thông tin!");
                        break;
                    }

                    // Regex email theo đề bài
                    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

                    if (user.getEmail().matches(emailRegex)) {
                        System.out.println("Email hợp lệ");
                    } else {
                        System.out.println("Email không hợp lệ");
                    }
                    break;

                // CASE 4: Kiểm tra số điện thoại hợp lệ
                case 4:
                    if (user == null) {
                        System.out.println("Chưa nhập thông tin!");
                        break;
                    }

                    // Regex số điện thoại Việt Nam theo đề bài
                    String phoneRegex = "^(03|05|07|08|09)\\d{8}$";

                    if (user.getPhone().matches(phoneRegex)) {
                        System.out.println("Số điện thoại hợp lệ");
                    } else {
                        System.out.println("Số điện thoại không hợp lệ");
                    }
                    break;

                // CASE 5: Kiểm tra mật khẩu hợp lệ
                case 5:
                    if (user == null) {
                        System.out.println("Chưa nhập thông tin!");
                        break;
                    }

                    // Regex mật khẩu theo đề bài
                    String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

                    if (user.getPassword().matches(passRegex)) {
                        System.out.println("Mật khẩu hợp lệ");
                    } else {
                        System.out.println("Mật khẩu không hợp lệ (tối thiểu 8 ký tự, gồm chữ thường, chữ hoa, số và ký tự đặc biệt)");
                    }
                    break;

                // CASE 6: Thoát
                case 6:
                    System.out.println("Thoát chương trình...");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
