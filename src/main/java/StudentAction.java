import java.util.Scanner;

public class StudentAction {
    public Student inputStudent(Scanner sc){
        // Dùng while để lặp nếu người dùng nhập sai, sẽ yêu cầu nhập lại
        while (true){
            try{
                System.out.println("Mời b nhập tên: ");
                String name = sc.nextLine();
                System.out.println("Mời b nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Mời b nhập học lực: ");
                String rank = sc.nextLine();
                // Nếu nhập đúng hết rồi sẽ tự động thoát vòng lặp và trả về Student
                return new Student(name, age, rank);
            } catch (Exception e){
                System.out.println("Lỗi input student, vui lòng nhập lại");
            }
        }
    }
}
