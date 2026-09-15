package ra.entity;

import java.util.Scanner;

public class Student {
    private static int autoID =1;
    private int studentID;
    private String name;
    private int age;
    private String major;

    public Student() {
     this.studentID = autoID++;
    }

    public Student(int studentID, String name, int age, String major) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputData(Scanner scanner) {
        studentID = studentID;
        studentID++;
        System.out.print("Mời nhập tên Sv: ");
        name = scanner.nextLine();
        System.out.print("Mời nhập tuổi SV: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhập chuyên ngành: ");
        major = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã SV: " + studentID +
                " | Tên SV: " + name +
                " | Tuổi SV: " + age +
                " | Chuyên ngành: " + major);
    }

}