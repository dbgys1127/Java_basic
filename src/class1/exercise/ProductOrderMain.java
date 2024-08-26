package class1.exercise;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 삼품의 주문정보를 담는 배열
        ProductOrder[] productOrders = new ProductOrder[3];

        //주문정보 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        //주문정보 저장
        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        //주문정보 저장
        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;
        productOrders[2] = productOrder3;

        int sum = 0 ;


        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price* productOrder.quantity;
        }
        System.out.println("총 금액 : "+sum);
    }
}
