public class ex2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuỗi ban đầu: "
                + sb);
//        Xóa từ vị trí 5-9
        sb.delete(5,9);
        System.out.println("Chuỗi sau khi xóa: "
                +sb);
//        Thay thế từ "World" bằng "Universe"
        int index = sb.indexOf("World");
        if (index != -1) {
            sb.replace(index, index + "World".length(), "Universe");
        }
        System.out.println("Chuỗi sau khi thay thế: " + sb);
    }
}
