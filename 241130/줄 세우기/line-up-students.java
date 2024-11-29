import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    int height, weight, number;

    Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student other) {
        if (this.height != other.height)
            return other.height - this.height;
        if (this.weight != other.weight)
            return other.weight - this.weight;
        return this.number - other.number;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i+1);
        }

        Arrays.sort(students);
        for (Student s : students)
            System.out.println(s.height + " " + s.weight + " " + s.number);
    }
}