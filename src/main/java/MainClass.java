import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("디비를 연결 해보자");
        Scanner sc = new Scanner(System.in);
        System.out.println("아이템 등록:");
        String name = sc.next();
        System.out.println("속성 입력:");
        String att = sc.next();
        System.out.println("데미지 입력(숫자만):");
        String dam = sc.next();
        System.out.println("효과 입력:");
        String hyo = sc.next();

        DBClass dc = new DBClass();
        dc.insertItem(name, att, dam, hyo);
        dc.selectItem();

    }
}
