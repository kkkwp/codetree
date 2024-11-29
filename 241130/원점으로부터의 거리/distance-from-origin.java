import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x, y, number;

    Point(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    public int compareTo(Point other) {
        int dist1 = Math.abs(this.x) + Math.abs(this.y);
        int dist2 = Math.abs(other.x) + Math.abs(other.y);
        if (dist1 == dist2)
            return this.number - other.number;
        return dist1 - dist2;
    }
}
    
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] points = new Point[n];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y, i+1);
        }

        Arrays.sort(points);
        for (Point p : points)
            System.out.println(p.number);
    }
}