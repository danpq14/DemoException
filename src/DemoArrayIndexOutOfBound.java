import java.util.Random;
import java.util.Scanner;

public class DemoArrayIndexOutOfBound {
    public static int[] creatRandomArray() {
        Random rd = new Random();
        int[] myArr = new int[100];
        for (int i=0; i< myArr.length; i++) {
            myArr[i] = rd.nextInt(100);
        }
        return myArr;
    }

    public static void main(String[] args) {
           int[] arr = DemoArrayIndexOutOfBound.creatRandomArray();
           try  {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Nhập vào index bạn muốn ktra : ");
               int index = scanner.nextInt();
               System.out.println("Phần tử tại vị trí " +index+ " là : " + arr[index]);
           }
           catch (IndexOutOfBoundsException ex) {
               System.out.println("index ko chính xác trong khoảng 0 - 99");
           }
    }
}
