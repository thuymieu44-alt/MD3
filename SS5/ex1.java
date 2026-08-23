import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = sc.nextLine();

        System.out.print("Nhập từ cần tìm: ");
        String word = sc.nextLine().trim();
        int index = str.indexOf(word);
        if(index != -1){
            System.out.printf("Từ %s xuất hiện tại vị trí %d trong chuỗi.", word, index);
        } else {
            System.out.printf("Không tìm thấy từ %s trong chuỗi.", word);
        }
    }
}