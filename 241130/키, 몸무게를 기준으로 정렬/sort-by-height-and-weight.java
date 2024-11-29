import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person> {
    String name;
    int height, weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person other) {
        if (this.height == other.height)
            return other.weight - this.weight;
        return this.height - other.height;
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
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }
        
        Arrays.sort(people);
        for (Person p : people)
            System.out.println(p.name + " " + p.height + " " + p.weight);
    }
}