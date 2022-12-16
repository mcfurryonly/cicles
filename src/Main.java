public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
            for (int f = 10; f>0; f--){
                System.out.println(f);
            }
            for (int d = 0; d < 17; d+=2 ){
                System.out.println(d);
            }
            for (int g = 10; g > -11; g--)
            {
                System.out.println(g);
            }
            for (int year = 1904; year < 2096; year +=4){
                System.out.println(year + "год является високостным");
            }
            for (int number = 7; number < 99; number += 7) {
                System.out.println(number);
            }
            for (int number1 = 1; number1 < 513; number1 *= 2){
                System.out.println(number1);
            }
            int salary = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++){
                total = total + total/100;
                total = total + salary;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
