public class Main {
    public static void main(String[] args) {
       // int salary = 15000;
       // int total = 0;
      //  int i = 0;

       // while (total < 2_459_000) {
         //   i++;
          //  total = total + total / 100;
          //  total = total + salary;
           // System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
           // System.out.println(total);
      //  }
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter + " ");
            counter++;

        }
        System.out.println(" ");
        int one = 10;
        for (one = 10; one > 0; one--) {

            System.out.print(one + " ");

        }
        System.out.println(" ");
        int peopleInCountry = 12000000;
        int peopleFertility = (peopleInCountry * 17) / 1000;
        int peopleDeath = (peopleInCountry * 8) / 1000;
        int year = 0;
        int peopleInCountryNow = peopleInCountry + peopleFertility - peopleDeath;
        int peopleGrowthForYear = peopleFertility - peopleDeath;
        while (year < 10) {
            year++;
            peopleInCountry = peopleInCountry + peopleGrowthForYear;
            peopleInCountry = peopleInCountry + peopleGrowthForYear;
            System.out.println("Год " + year + " численность населения составляет " + peopleInCountry);
        }
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total < 12_000_000) {
            i++;
            total = total + total / 70;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                System.out.println(total);
            }
        }
        int money = 15000;
        int all = 0;
        int years = 0;
        while (years < 118) {
            years++;
            all = all + all/70;
            all = all + money;
            if (years % 6 ==0) {
                System.out.println( "Месяц " + years + " Сумма накоплений " + all);
            }
        }
        int friday = 3;
        while (friday < 32) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необхоимо подготовить отчет.");
            friday +=7;
        }
    }
}

