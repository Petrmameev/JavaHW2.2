public class Main {
    public static void main(String[] args) {
        int sum = 1000;
        int replenishment = 1001;
        if (replenishment > 1000) {
            System.out.println("Итоговый счет:");
            System.out.println(sum + replenishment + (replenishment / 100));
            System.out.println("Количество бонусных рублей:");
            System.out.println(replenishment / 100);

        } else {
            System.out.println("Итоговый счет:");
            System.out.println(sum + replenishment);
            System.out.println("Количество бонусных рублей: 0");
        }
    }
}
