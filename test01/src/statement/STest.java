package statement;

import java.util.Scanner;

public class STest {

    public static void IsNegative(int value, int value2) {
        System.out.println(value + value2);
    }

    public static void getTax() {
        System.out.print("年終獎：");
        Scanner scanner = new Scanner(System.in);
        int YearMoney = scanner.nextInt();
        int MouthMoney = YearMoney / 12;
        if (MouthMoney <= 1500) {
            System.out.println("应缴税款" + (YearMoney * .03) + "\n税后收入" + (YearMoney - (YearMoney * .03)));
        } else if (MouthMoney <= 4500) {
            System.out.println("应缴税款" + (YearMoney * .10 - 105) + "\n税后收入" + (YearMoney - (YearMoney * .10 - 105)));
        } else if (MouthMoney <= 9000) {
            System.out.println("应缴税款" + (YearMoney * .20 - 555) + "\n税后收入" + (YearMoney - (YearMoney * .20 - 555)));
        } else if (MouthMoney <= 35000) {
            System.out.println("应缴税款" + (YearMoney * .25 - 1005) + "\n税后收入" + (YearMoney - (YearMoney * .25 - 1005)));
        } else if (MouthMoney <= 55000) {
            System.out.println("应缴税款" + (YearMoney * .30 - 2755) + "\n税后收入" + (YearMoney - (YearMoney * .30 - 2755)));
        } else if (MouthMoney <= 80000) {
            System.out.println("应缴税款" + (YearMoney * .35 - 5505) + "\n税后收入" + (YearMoney - (YearMoney * .35 - 5505)));
        } else {
            System.out.println("应缴税款" + (YearMoney * .45 - 13505) + "\n税后收入" + (YearMoney - (YearMoney * .45 - 13505)));
        }
    }

    public static void getOneTax() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
/**
 * 判斷
 */

    public static boolean IsSushu(int number) {
        if (number < 2 ) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number > 2) {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void getSum(){
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 || i % 5 == 0 ){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//         IsNegative(2,3);
//         getTax();
//         getOneTax();
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(number+"是素數?:"+IsSushu(number));
        getSum();
//        int x = 3;int y =4;
//        System.out.println((x++ > 4) && (y++ > 5));
//        System.out.println(x);
//        System.out.println(y);

    }
}
