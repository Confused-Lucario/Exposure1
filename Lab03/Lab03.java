package Lab03;
import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        System.out.println("Lab03, 80 Point Version\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Input many Milli-Seconds?");

        int startingSeconds = input.nextInt();
        int hours = startingSeconds / 3600000;
        int secondsRemaining = startingSeconds % 3600000;
        int minutes = secondsRemaining / 60000;
        int seconds = secondsRemaining % 60000 / 1000;
        int milliseconds = secondsRemaining % 1000;

        System.out.println("Starting Seconds: " + startingSeconds);
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds, " + milliseconds + " milliseconds");

    }

}