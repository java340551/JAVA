public class isleap {
    public static void main(String[] args) {
        int year = 2012;
        int year2 = 2010;
        boolean leap = (year % 400 == 0 || year % 100 != 0) && year % 4 == 0;
        System.out.println(year + "是不是闰年？ " + leap);
        leap = (year2 % 400 == 0 || year2 % 100 != 0) && year2 % 4 == 0;
        System.out.println(year2 + "是不是闰年？ " + leap);
    }
}
