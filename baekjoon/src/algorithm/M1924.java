package algorithm;


import java.util.Scanner;

// 1924. 2007년
// https://www.acmicpc.net/problem/1924

public class M1924 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int day = scan.nextInt();

        scan.close();

        int totalDay = 0;
        for (int i = 1;i < month;i++) {

            switch (i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDay +=30;
                    break;
                case 2:
                    totalDay += 28;
                    break;
                default:
                    totalDay += 31;
                    break;
            }
        }

        totalDay += day;

        switch (totalDay%7) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            default:
                break;
        }
    }
}
