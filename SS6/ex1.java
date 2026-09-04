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
                        case 1:
                            scores = inputScores(sc);
                            break;

                        case 2:
                            printScores(scores);
                            break;

                        case 3:
                            calcAverage(scores);
                            break;

                        case 4:
                            findMinMax(scores);
                            break;

                        case 5:
                            countPassFail(scores);
                            break;

                        case 6:
                            sortScores(scores);
                            break;

                        case 7:
                            countGoodExcellent(scores);
                            break;

                        case 8:
                            System.out.println("Thoát chương trình...");
                            return;

                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                    }
                }
            }

            // 1. Nhập danh sách điểm
            public static double[] inputScores(Scanner sc) {
                System.out.print("Nhập số lượng sinh viên: ");
                int n = sc.nextInt();
                double[] arr = new double[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Điểm sinh viên " + (i + 1) + ": ");
                    arr[i] = sc.nextDouble();
                }
                return arr;
            }

            // 2. In danh sách điểm
            public static void printScores(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                System.out.println("Danh sách điểm: " + Arrays.toString(arr));
            }

            // 3. Tính điểm trung bình
            public static void calcAverage(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                double sum = 0;
                for (double d : arr) sum += d;
                System.out.println("Điểm trung bình: " + (sum / arr.length));
            }

            // 4. Tìm điểm cao nhất và thấp nhất
            public static void findMinMax(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                double min = arr[0], max = arr[0];
                for (double d : arr) {
                    if (d < min) min = d;
                    if (d > max) max = d;
                }
                System.out.println("Điểm thấp nhất: " + min);
                System.out.println("Điểm cao nhất: " + max);
            }

            // 5. Đếm số lượng sinh viên đạt và trượt
            public static void countPassFail(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                int pass = 0, fail = 0;
                for (double d : arr) {
                    if (d >= 5) pass++;
                    else fail++;
                }
                System.out.println("Số sinh viên đạt: " + pass);
                System.out.println("Số sinh viên trượt: " + fail);
            }

            // 6. Sắp xếp điểm tăng dần
            public static void sortScores(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                Arrays.sort(arr);
                System.out.println("Danh sách sau khi sắp xếp: " + Arrays.toString(arr));
            }

            // 7. Thống kê sinh viên giỏi và xuất sắc
            public static void countGoodExcellent(double[] arr) {
                if (arr == null) {
                    System.out.println("Chưa có dữ liệu!");
                    return;
                }
                int count = 0;
                for (double d : arr) {
                    if (d >= 8) count++;
                }
                System.out.println("Số sinh viên giỏi & xuất sắc: " + count);
    }
}