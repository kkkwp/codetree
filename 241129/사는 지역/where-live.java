import java.util.Scanner;

class Person {
    String name, addr, city;

    Person (String name, String addr, String city) {
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

        Person[] people = new Person[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            people[i] = new Person(name, addr, city);
        }

        Person slowest = people[0];
        for (int i=1; i<n; i++) {
            if (people[i].name.compareTo(slowest.name) > 0)
                slowest = people[i];
        }

        System.out.println("name " + slowest.name);
        System.out.println("addr " + slowest.addr);
        System.out.print("city " + slowest.city);
    }
}