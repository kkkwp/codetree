import java.util.Arrays;
import java.util.Scanner;

class Element implements Comparable<Element> {
    int value, idx;

    Element(int value, int idx) {
        this.value = value;
        this.idx = idx;
    }

    @Override
    public int compareTo(Element other) {
        if (this.value == other.value)
            return this.idx - other.idx;
        return this.value - other.value;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Element[] elements = new Element[n];
        for (int i=0; i<n; i++)
            elements[i] = new Element(sc.nextInt(), i+1);
        
        Arrays.sort(elements);
        
        int[] rank = new int[n];
        for (int i=0; i<n; i++)
            rank[elements[i].idx-1] = i+1;
        
        for (int r : rank)
            System.out.print(r + " ");
    }
}