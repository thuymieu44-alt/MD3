import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ---------------------- Category ----------------------
class Category {
    private int id;
    private String name;
    private String description;

    public Category() {}

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// ---------------------- ICRUD ----------------------
interface ICRUD {
    List<Category> findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteById(int id);
}

// ---------------------- CategoryManagement ----------------------
class CategoryManagement implements ICRUD {

    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Danh mục đã được thêm.");
    }

    @Override
    public void updateCategory(Category category) {
        for (Category c : categories) {
            if (c.getId() == category.getId()) {
                c.setName(category.getName());
                c.setDescription(category.getDescription());
                System.out.println("Danh mục đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID để cập nhật.");
    }

    @Override
    public void deleteById(int id) {
        for (Category c : categories) {
            if (c.getId() == id) {
                categories.remove(c);
                System.out.println("Danh mục đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID để xóa.");
    }
}

// ---------------------- Main ----------------------
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoryManagement manager = new CategoryManagement();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1: Thêm danh mục");
            System.out.println("2: Hiển thị danh mục");
            System.out.println("3: Cập nhật danh mục");
            System.out.println("4: Xóa danh mục");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID danh mục: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên danh mục: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập mô tả danh mục: ");
                    String desc = sc.nextLine();

                    manager.addCategory(new Category(id, name, desc));
                    break;

                case 2:
                    System.out.println("Danh sách danh mục:");
                    for (Category c : manager.findAll()) {
                        System.out.println("ID: " + c.getId() +
                                ", Name: " + c.getName() +
                                ", Description: " + c.getDescription());
                    }
                    break;

                case 3:
                    System.out.print("Nhập ID cần cập nhật: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Mô tả mới: ");
                    String newDesc = sc.nextLine();

                    manager.updateCategory(new Category(updateId, newName, newDesc));
                    break;

                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    int deleteId = sc.nextInt();
                    manager.deleteById(deleteId);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
