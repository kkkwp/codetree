import java.util.Scanner;

class Info {
    String name, addr, city;

    Info (String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] info = new Info[n];
        for (int i=0; i<n; i++)
            info[i] = new Info(sc.next(), sc.next(), sc.next());
        
        System.out.println("name " + info[n-1].name);
        System.out.println("addr " + info[n-1].addr);
        System.out.print("city " + info[n-1].city);
    }
}