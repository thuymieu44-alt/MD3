public class Rectangle {
    private double length;
    private double width;

    // Constructor mặc định
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Constructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Tính diện tích
    public double getArea() {
        return length * width;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("---------------------------");
    }

    // MAIN để kiểm tra
    public static void main(String[] args) {
        // Hình chữ nhật 1: dùng constructor mặc định
        Rectangle r1 = new Rectangle();
        System.out.println("Hình chữ nhật 1:");
        r1.display();

        // Hình chữ nhật 2: dùng constructor có tham số
        Rectangle r2 = new Rectangle(5.0, 3.0);
        System.out.println("Hình chữ nhật 2:");
        r2.display();
    }
}
