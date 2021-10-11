package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {

        //задача 1

        byte bytes = -111;
        short shorts = 22222;
        int integers = -333333;
        long dong = 444444444L;
        float floats = -55.555f;
        double doubles = 666.6666;
        char chars1 = 77;
        char chars2 = '!';
        boolean myAge = true;

        //задача 2
        System.out.println("Задача 2: ");

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;

        float totalWeight = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;

        System.out.println("Общий вес двух бойцов: " + totalWeight);
        System.out.println("Разница между весами бойцов: " + weightDifference);

        System.out.println(" ");

        //задача 3
        System.out.println("Задача 3: ");

        byte bananas = 5;
        byte oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;

        byte milks = 2;
        byte oneMilkWeight = 105;
        int milksWeight = milks * oneMilkWeight;

        byte iceCreams = 2;
        byte oneIceCreamWeight = 100;
        int iceCreamsWeight = iceCreams * oneIceCreamWeight;

        byte eggs = 4;
        byte oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;

        float brkfstGrammWeight = bananasWeight+milksWeight+iceCreamsWeight+eggsWeight;
        //задал переменные типа float, чтобы при выводе значения в килограммах
        // в консоль выводилось точное значение с числами после запятой
        System.out.println("Общий вес завтрака в граммах: "+brkfstGrammWeight);
        float brkfstKgWeight = brkfstGrammWeight/1000;
        System.out.println("Общий вес завтрака в килограммах: "+brkfstKgWeight);

        System.out.println(" ");

        //задача 4
        System.out.println("Задача 4: ");

        byte boxerWeight = 78;
        byte weightLoss = 7;

        float firstDietWeigh = 0.250f;
        float firstDietDays = weightLoss/firstDietWeigh;
        int firstDietDaysInt = (int)firstDietDays;
        //при вычислении кол-ва дней нужно использовать тип переменных с плавающей точкой,
        //поэтому, чтобы в отображаемом результате не было знаков после запятой, чтобы смотрелось красивее,
        // использовал приведение значения с плавающей точкой к целочисленному
        System.out.println(firstDietDaysInt + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");

        float secondDietWeight = 0.500f;
        float secondDietDays = weightLoss/secondDietWeight;
        int secondDietDaysInt = (int)secondDietDays;
        System.out.println(secondDietDaysInt + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");

        int avDays = (firstDietDaysInt+secondDietDaysInt)/2;
        System.out.println(avDays + " может потребоваться дней в среднем, чтобы добиться результата похудения");

        System.out.println(" ");

        //задача 5
        System.out.println("Задача 5: ");

        int zpMaria = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;

        int increasedZPMaria = (zpMaria * 10 / 100)+zpMaria;
        int increasedZPDenis = (zpDenis * 10 / 100)+zpDenis;
        int increasedZPKristina = (zpKristina * 10 / 100)+zpKristina;

        System.out.println("Зарплата Марии до повышения: "+zpMaria + " ; Зарплата Марии после повышения: "+increasedZPMaria);
        System.out.println("Зарплата Дениса до повышения: "+zpDenis + " ; Зарплата Дениса после повышения: "+increasedZPDenis);
        System.out.println("Зарплата Кристины до повышения: "+zpKristina + " ; Зарплата Кристины после повышения: "+increasedZPKristina);

        int incomeZPMaria = zpMaria * 12;
        int incomeIncreasedZPMaria = increasedZPMaria * 12;
        int differenceMaria = incomeIncreasedZPMaria - incomeZPMaria;
        System.out.println("Разница между годовым доходом до и после повышения зарплаты у Марии: "+ differenceMaria);

        int incomeZPDenis = zpDenis * 12;
        int incomeIncreasedZPDenis = increasedZPDenis * 12;
        int differenceDenis = incomeIncreasedZPDenis - incomeZPDenis;
        System.out.println("Разница между годовым доходом до и после повышения зарплаты у Дениса: "+ differenceDenis);

        int incomeZPKristina = zpKristina * 12;
        int incomeIncreasedZPKristina = increasedZPKristina * 12;
        int differenceKristina = incomeIncreasedZPKristina - incomeZPKristina;
        System.out.println("Разница между годовым доходом до и после повышения зарплаты у Кристины: "+ differenceKristina);

        System.out.println(" ");

        //задача 6
        System.out.println("Задача 6: ");

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a*(b+(c-d*e));
        result = result*(-1);

        System.out.println("result = "+ result);

        System.out.println(" ");

        //задача 7
        System.out.println("Задача 7: ");

        int aa = 5, bb = 7;

        System.out.println("Значения 'aa' и 'bb': " + aa + " и " + bb);

        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;

        System.out.println("Теперь значения 'aa' и 'bb' соответственно: " + aa + " и " + bb);

        System.out.println(" ");

        //задача 8
        System.out.println("Задача 8: ");

        int f = 170;
        int g = f/100;
        int h = g*100;
        int mid = (f - h)/10;

        System.out.println(mid);

    }
}
