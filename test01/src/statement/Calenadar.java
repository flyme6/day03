package statement;

public class Calenadar {
    //    1.判断给定年是否为闰年
    static boolean IsLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    //    2.求給定年,有的多少天？
    static int getDay(int year) {
        return IsLeap(year) ? 366 : 365;
    }

    //    3.求给定年,月有多少天
    static int getDay(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return IsLeap(year) ? 29 : 28;
        }
        return 0;
    }

    //        4.求给定年月日周几
//    定义基准点，我们定位 1年 1月 1日 星期一，给定年月日与基准点差多少天。根据公式算星期几？
    static int getWeekday(int year, int monoth, int weekday) {
        int days = 0; //总天数

        //根据1年，获取相差年的天数
        for (int i = 1; i < year; i++) {
            days += getDay(i);
        }
        //根据1月份，获取相差月的天数
        for (int i = 1; i < monoth; i++) {
            days += getDay(year, i);
        }
        //根据1日，获取相差日的天数
        days += weekday - 1;
        //获取周一，获取相差周数
        return days % 7 + 1;
    }

    //        5.输出年历
    static void print(int year) {
        for (int i = 1; i <= 12; i++) {
            print(year, i);
        }
    }

    //    6.输出月历
    static void print(int year, int month) {
        System.out.printf("\n%4d年%2d月\n", year, month);
        System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");

        // 例如 当前是2018年3月1号周四，对应万年历中，1号前面 有3个空格。
        int weekday = getWeekday(year, month, 1);
        for (int i = 0; i < weekday; i++)
            System.out.print("\t");

        int Lastday = getDay(year, month);
        for (int i = 1; i <= Lastday; i++) {
            System.out.printf("%2d\t", i);
            if (getWeekday(year, month, i) == 6)
                System.out.println();
        }
    }

    public static void main(String[] args) {
//        System.out.println(getDay(2018));
        System.out.println(getDay(2018, 2));
        System.out.println(getWeekday(2018, 3, 7));
        print(2018, 2);
        print(2018);
    }
}
