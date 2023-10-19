public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int addend = 5000;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBalance = initialBalance + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
