package ra;

public class StudentManagerment {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("SV002","Nguyễn Văn B");
        Student student3 = new Student("SV003","Nguyễn Văn C", 23, true, "Hồ Chí Minh");
        System.out.println("***************Thông tin sinh viên****************");
        student1.displayData();
        System.out.println("****************Thông tin sinh viên****************");
        student2.displayData();
        System.out.println("****************Thông tin sinh viên****************");
        student3.displayData();
    }
}
