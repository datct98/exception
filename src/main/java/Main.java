import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TechMasterAction action = new TechMasterAction();
        TechMaster techMaster = action.inputTechMaster(sc);
        System.out.println(techMaster);
    }
}
