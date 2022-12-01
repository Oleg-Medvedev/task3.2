public class Main {

    public static void main(String[] args) {

        int balance = 32;
        int depositedMoney = 1450;

        int bonus;
        if (depositedMoney > 1000) {
            bonus = (int) depositedMoney / 100;
        }
        else {
            bonus = 0;
        }
        int finalBalance = depositedMoney + balance;

        System.out.println("Бонусов:"+ bonus);
        System.out.println("Ваш баланс:" + finalBalance);
    }
}
