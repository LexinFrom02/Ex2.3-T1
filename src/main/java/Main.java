import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сумма покупки");
        long amount = scanner.nextLong();
        System.out.println("Пользователь зарегистрирован? (true/false)");
        boolean registered = scanner.nextBoolean();

        long actual = bonusService.calculate(amount, registered);

        System.out.println("Начислено бонусов - " + actual);
    }
}
