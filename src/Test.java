public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);// đúng

        Triangle triangle2 = new Triangle(1,4,5);// sai

        try {
            System.out.println(triangle.getParameter());
            System.out.println(triangle2.getParameter());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getErrorMessage());
        }
    }
}
