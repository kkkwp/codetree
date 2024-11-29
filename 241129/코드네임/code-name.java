import java.util.Scanner;

class Agent {
    char codename;
    int score;

    Agent(char codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        int minVal = 101;
        int idx = -1;
        for (int i=0; i<5; i++) {
            char codename = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new Agent(codename, score);
            if (score < minVal) {
                minVal = score;
                idx = i;
            }
        }
        System.out.print(agents[idx].codename + " "  + agents[idx].score);
    }
}