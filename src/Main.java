import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа определяет порядок цветов ночью по прошествии n-го количества дней");

        System.out.print("Через какое количество дней вы хотите узнать порядок цветов? : ");
        int day = scanner.nextInt();

        if (day % 3 == 0)
            System.out.println("Порядок цветов на  " + day + " день : GCV");
        else if (day % 3 == 1)
            System.out.println("Порядок цветов на  " + day + " день : VGC");
        else
            System.out.println("Порядок цветов на  " + day + " день : CVG");






    }



}