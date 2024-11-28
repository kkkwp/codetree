import java.util.Scanner;

class Code {
    String code;
    String point;
    int time;

    Code(String code, String point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }    
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String meetingPoint = sc.next();
        int time = sc.nextInt();
        
        Code c = new Code(secretCode, meetingPoint, time);
        System.out.println("secret code : " + c.code);
        System.out.println("meeting point : " + c.point);
        System.out.println("time : " + c.time);
    }
}