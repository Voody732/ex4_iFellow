import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите, сколько сейчас часов(не более 23):");
        double hours = scanner.nextDouble();
        if (hours >= 12) {
            hours = hours - 12;
        }
        System.out.println(hours);
        System.out.print("Введите, сколько сейчас минут(не более 59):");
        double minutes = scanner.nextDouble();
        double hourAngle = 30 * (hours + minutes / 60);
        double minuteAngle = minutes * 6;
        double angleBetweenHoursAndMinutes = hourAngle - minuteAngle;
        if (Math.abs(angleBetweenHoursAndMinutes) > 180) {
            angleBetweenHoursAndMinutes = 360 - Math.abs(angleBetweenHoursAndMinutes);
        }
        System.out.println("Угол между часовой и минутной стрелкой составляет:" + angleBetweenHoursAndMinutes);
    }
}