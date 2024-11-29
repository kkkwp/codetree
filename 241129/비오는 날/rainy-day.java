import java.util.Scanner;

class Data {
    String date, day, weather;

    Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Data latest = null;
        for (int i=0; i<n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            Data data = new Data(date, day, weather);

            if (data.weather.equals("Rain"))
                if (latest == null || data.date.compareTo(latest.date) < 0)
                    latest = data;
        }
        System.out.print(latest.date + " " + latest.day + " " + latest.weather);
    }
}