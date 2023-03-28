public class Main {
    private static Object calculateWhatYear;

    public static void main(String[] args) {
        calculateWhatYear (2024);
        operatingSystemSelection(1, 2016);
        calculateDeliveryTime(90);
    }

    public static void calculateWhatYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
     }
     public static void operatingSystemSelection(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
     }

     public static void calculateDeliveryTime(int deliveryDistance) {
         if (deliveryDistance > 100) {
             System.out.println("Доставки нет!");
         } else {
             int deliveryDays = 1;
             if (deliveryDistance >20) {
                 deliveryDays++;
             }
             if (deliveryDistance > 60) {
                 deliveryDays++;
             }
             System.out.println("Потребуется дней: " + deliveryDays);
         }
     }
}
