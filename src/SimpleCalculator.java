public class SimpleCalculator {
    public void calculator(int x, int y) {
        try {
            int add = x + y;
            int sub = x - y;
            int multi = x * y;
            int div = x / y;
            System.out.println("Tổng 2 số là : " + add);
            System.out.println("Hiệu 2 số là : " + sub);
            System.out.println("Tích 2 số là : " + multi);
            System.out.println("Thương 2 số là : " + div);
        }
        catch (Exception e) {
            System.out.println("------Ngoại lệ : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SimpleCalculator test1 = new SimpleCalculator();
        SimpleCalculator test2 = new SimpleCalculator();
        SimpleCalculator test3 = new SimpleCalculator();
        test1.calculator(8, 4);
        test2.calculator(3, 0);
        test3.calculator(0, 3);
    }
}
