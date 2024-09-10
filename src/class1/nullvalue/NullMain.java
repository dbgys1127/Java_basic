package class1.nullvalue;

public class NullMain {
    public static void main(String[] args) {
        NullData nullData = null;
        System.out.println("1. data = "+nullData);
        nullData = new NullData();
        System.out.println("2. data = "+nullData);
        nullData = null;
        System.out.println("3. data = "+nullData);
    }
}
