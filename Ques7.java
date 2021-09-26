import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please Enter seconds");
        int seconds = sc.nextInt();
        SectoDayHourMinutes(seconds);
    }
    public static void SectoDayHourMinutes(int sec){
        System.out.println("seconds " + sec);
        int minutes = sec/60;
        System.out.println("Minutes " + minutes);
         int hours = minutes/60;
        System.out.println("Hours " + hours);
        int day = hours/24;
        System.out.println("days " + day);
    }
}
