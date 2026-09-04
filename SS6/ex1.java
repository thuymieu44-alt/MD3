import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = null;

        while (true) {
            System.out.println("******************QUẢN LÝ ĐIỂM SV******************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();

            switch (choice) {

                // CASE 1: Nhập danh sách điểm
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();
                    scores = new double[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Điểm sinh viên " + (i + 1) + ": ");
                        scores[i] = sc.nextDouble();
                    }
                    System.out.println("Đã nhập xong!");
                    break;

                // CASE 2: In danh sách điểm
                case 2:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    System.out.println("Danh sách điểm: " + Arrays.toString(scores));
                    break;

                // CASE 3: Tính điểm trung bình
                case 3:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    double sum = 0;
                    for (double d : scores) sum += d;
                    System.out.println("Điểm trung bình: " + (sum / scores.length));
                    break;

                // CASE 4: Tìm điểm cao nhất và thấp nhất
                case 4:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    double min = scores[0], max = scores[0];
                    for (double d : scores) {
                        if (d < min) min = d;
                        if (d > max) max = d;
                    }
                    System.out.println("Điểm thấp nhất: " + min);
                    System.out.println("Điểm cao nhất: " + max);
                    break;

                // CASE 5: Đếm số lượng sinh viên đạt và trượt
                case 5:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    int pass = 0, fail = 0;
                    for (double d : scores) {
                        if (d >= 5) pass++;
                        else fail++;
                    }
                    System.out.println("Số sinh viên đạt: " + pass);
                    System.out.println("Số sinh viên trượt: " + fail);
                    break;

                // CASE 6: Sắp xếp điểm tăng dần
                case 6:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    Arrays.sort(scores);
                    System.out.println("Danh sách sau khi sắp xếp: " + Arrays.toString(scores));
                    break;

                // CASE 7: Thống kê sinh viên giỏi & xuất sắc
                case 7:
                    if (scores == null) {
                        System.out.println("Chưa có dữ liệu!");
                        break;
                    }
                    int good = 0;
                    for (double d : scores) {
                        if (d >= 8) good++;
                    }
                    System.out.println("Số sinh viên giỏi & xuất sắc: " + good);
                    break;

                // CASE 8: Thoát
                case 8:
                    System.out.println("Thoát chương trình...");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
