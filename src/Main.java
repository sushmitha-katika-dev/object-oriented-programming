import com.java.oop.Customer;

public class Main {
    public static void main(String[] args) {

        //Customer1 object creation
        Customer customer = new Customer();
        customer.id = 1;
        customer.name = "sushmihta";
        customer.age = 21;
        customer.address = "Bhongir";
        customer.phoneNumber = "9849733219";

        System.out.println(customer.id);
        System.out.println(customer.name);
        System.out.println(customer.age);
        System.out.println(customer.address);
        System.out.println(customer.phoneNumber);

        //Customer2 object creation
        Customer customer2 = new Customer(2,"krishna",25,"Mumbai","9849861479");

        System.out.println(customer2.id);
        System.out.println(customer2.name);
        System.out.println(customer2.age);
        System.out.println(customer2.address);
        System.out.println(customer2.phoneNumber);

        //Customer3 object creation
        Customer customer3 = new Customer(3,"sai",23,"chennai","9845874129");

        System.out.println(customer3.id);
        System.out.println(customer3.name);
        System.out.println(customer3.age);
        System.out.println(customer3.address);
        System.out.println(customer3.phoneNumber);

        //Customer4 object creation
        Customer customer4 = new Customer(4,"sai ram",24,"keralam","9845842129");

        System.out.println(customer4.id);
        System.out.println(customer4.name);
        System.out.println(customer4.age);
        System.out.println(customer4.address);
        System.out.println(customer4.phoneNumber);

        //Customer3 object creation
        Customer customer5 = new Customer(5,"shiva",19,"hyderabad","9814874129");

        System.out.println(customer5.id);
        System.out.println(customer5.name);
        System.out.println(customer5.age);
        System.out.println(customer5.address);
        System.out.println(customer5.phoneNumber);

        //Customer6 object creation
        Customer customer6 = new Customer(6,"shivasai",27,"warangal","6845874129");

        System.out.println(customer6.id);
        System.out.println(customer6.name);
        System.out.println(customer6.age);
        System.out.println(customer6.address);
        System.out.println(customer6.phoneNumber);
    }
}