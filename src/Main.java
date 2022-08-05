public class Main {
    public static void main(String[] args) {


        //задание 1

        int box = 8;
        byte bottle = 15;
        long cat = 90L;
        short dog = 2;
        double saltWeight = 7.6;
        float mouseWeight = 7.5f;
        boolean boxWeight = box > 10;
        char bar = 33;
        System.out.println(bar);



        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightSum = boxer1 + boxer2;
        System.out.println("Вес двух боксеров составит" + weightSum + "кг");
        double weightDifference = boxer1 - boxer2;
        System.out.println("Разница в весе составит " + weightDifference + "кг");




        // Задание 3

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int egg = 4;
        int weightProducts = bananas * 80 + milk / 100 * 105 + iceCream * 100 + egg * 70;
        System.out.println("Вес продуктов составил " + weightProducts + "гр");
        double inKg = weightProducts / 1000.0;
        System.out.println("Вес в килограммах составляет" + inKg + "кг");

        // Задание 4

        int weight1 = 7;
        int weight2 = 250;
        int weight3 = 500;
        double weightKg = weight2 / 1000.0;
        System.out.println("вес в кг составляет" + weightKg + " кг");
        double days = weight1 / weightKg;
        System.out.println("колличество дней при первом рационе" + days + "дн");
        double weightKg2 = weight3 / 1000.0;
        System.out.println("вес в кг составляет" + weightKg2 + " кг");
        double days2 = weight1 / weightKg2;
        System.out.println("колличество дней при втором рационе" + days2 + "дн");
        double averageValue = days / 2 + days2 / 2;
        System.out.println("средний показатель дней" + averageValue + "дн");

        //задание 5

        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76230;
        var Masha1 = Masha + Masha * 0.1;
        var Denis1 = Denis + Denis * 0.1;
        var Kristina1 = Kristina + Kristina * 0.1;
        System.out.println("Зп Маши" + Masha1 + "руб./мес.");
        System.out.println("Зп Дениса" + Denis1 + "руб./мес.");
        System.out.println("Зп Кристины" + Kristina1 + "руб./мес.");
        var Masha2 = Masha1 * 12;
        var Denis2 = Denis1 * 12;
        var Kristina2 = Kristina1 * 12;
        System.out.println("новая годовая зп Маши" + Masha2 + "руб/год");
        System.out.println("новая годовая зп Дениса" + Denis2 + "руб/год");
        System.out.println("новая годовая зп Кристины" + Kristina2 + "руб/год");
        var Masha3 = 12 * Masha1 - Masha * 12;
        var Denis3 = 12 * Denis1 - Denis * 12;
        var Kristina3 = 12 * Kristina1 - Kristina * 12;
        System.out.println("разница годовой зп Маши" + Masha3 + "руб/год");
        System.out.println("разница годовой зп Дениса" + Denis3 + "руб/год");
        System.out.println("разница годовой зп Кристины" + Kristina3 + "руб/год");

























    }
}