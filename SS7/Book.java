public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    private void setPrice(double price) {
        if (price < 0) {
            System.out.println("Giá sách không được âm!");
        } else {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Book myBook = new Book();

//        Thiết lập thuộc tính
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");

//        Thiết lập giá hợp lệ
        myBook.setPrice(29.99);

//        Hiển thị thông tin sách
        System.out.println("Tiêu đề: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

//    Thử thay đổi giá thành công
        myBook.setPrice(35.55);
        System.out.println("Giá mới: " + myBook.getPrice());

//        Thử thay đổi giá không hợp lệ
        myBook.setPrice(-5.00);
    }
}