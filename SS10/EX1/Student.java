public class Student {
    private String name;
    private int age;
    private double avgScore;

    public Student(String name, int age, double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Điêm trung bình: " + avgScore);
    }
}
