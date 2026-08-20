import java.util.Scanner;

import static java.lang.Double.sum;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while (true) {
            System.out.print("* * * * * * * MENU NHẬP ĐIỂM * * * * * * *\n" +
                    "1. Nhập điểm học viên\n" +
                    "2.Hiển thị thống kê\n" +
                    "3. Thoát\n" +
                    "= = = = = = = =\n" +
                    " Mời bạn lựa chọn:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        double score = Double.parseDouble(sc.nextLine());
                        if (score == -1) {
                            break;
                        }

                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue;
                        }
                        if (score < 5) {
                            System.out.println("Học lực: Yếu");
                        } else if (score < 7) {
                            System.out.println("Học lực: Trung bình");
                        } else if (score < 8) {
                            System.out.println("Học lực: Khá");
                        } else if (score < 9) {
                            System.out.println("Học lực: Giỏi");
                        } else {
                            System.out.println("Học lực: Xuất sắc");
                        }
                        // Cập nhật thống kê
                        count++;
                        sum += score;
                        max = Math.max(max, score);
                        min = Math.min(min, score);
                    }
                    break;
                }
                case 2: {
                    if (count == 0) {
                        System.out.print("Chưa có dữ liệu.");
                    } else {
                        System.out.printf("Số học viên đã nhập: %d\n" +
                                "Điểm trung bình: %.2f\n" +
                                "Điểm cao nhất: %.2f\n" +
                                "Điểm thấp nhất: %.2f", count, sum / count, max, min);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Kết thúc chương trình!");
                    return;
                }
                default:
                    System.out.print("Lựa chọn không hợp lệ.");
            }
        }
    }
}