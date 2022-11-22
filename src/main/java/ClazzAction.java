import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClazzAction {
    public Clazz inputClass(Scanner scanner) throws InputMismatchException{
        System.out.println("Bạn muốn nhập bn student: ");
        //Đầu tiên mình cho người dùng nhập số lượng học sinh và mình để là kiểu string
        String number  =scanner.nextLine();
        // Mình có hàm is numericSpare để kiểm tra 1 string xem string đó có phải là số hay k
        if(!StringUtils.isNumericSpace(number) || Integer.parseInt(number)<=0)
            // Nếu không thỏa mãn điều kiện, mình sẽ đẩy ra exception
            throw new InputMismatchException("Số lượng học sinh không hợp lệ");
        StudentAction action = new StudentAction();
        ArrayList<Student> students = new ArrayList<>();
        for (int i=0;i< Integer.parseInt(number); i++ ){
            Student student = action.inputStudent(scanner);
            students.add(student);
        }
        return new Clazz(students);
    }

    // Hoặc các b có thể tự viết một hàm check xem người dùng nhập vào có phải number k
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
