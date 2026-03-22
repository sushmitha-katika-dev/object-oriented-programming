package com.java.oop;

public class Main {
    public static void main(String[] args) {

        // Customer1 object creation
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
        //static variables need to be called using class
        System.out.println(Customer.companyName);

        //Customer2 object creation
        Customer customer2 = new Customer(2,"krishna",25,"Mumbai","9849861479");

        //Customer3 object creation
        Customer customer3 = new Customer(3,"sai",23,"chennai","9845874129");

        //Customer4 object creation
        Customer customer4 = new Customer(4,"sai ram",24,"keralam","9845842129");

        //Customer5 object creation
        Customer customer5 = new Customer(5,"shiva",19,"hyderabad","9814874129");

        //Customer6 object creation
        Customer customer6 = new Customer(6, "shivasai", 27, "warangal", "6845874129");

        //Customer Profile Display
        customer6.displayCustomerDetails();

        //Update Customer Address
        String newAddress = "Karimnagar";
        boolean updated = customer6.updateCustomerAddress(newAddress);
        System.out.println("Address updated: " + updated);

        //Check Customer Active Status
        System.out.println("Customerr Active Status: "+customer6.isCustomerActive());

        //Deactivate Customer Account
        customer6.deactivateAccount();

        //Validate Customer Contact Details
        System.out.println("Contact details valid: "+customer6.validateContactDetails());


        //Order object
        Order order = new Order();
        order.id = 100;
        order.restaurantName = "Italian Food Factory";
        order.customerName = "Sushmitha";
        order.deliveryAddress ="Teachers colony";

        order.foodItem = "Pasta";
        order.quantity = 1;
        order.price = 250;

        order.gst = 12.3;
        order.deliveryFee = 20;
        order.platformFee = 5;
        order.paymentMethod = "Cash";
        order.orderStatus = "delivered";
        order.orderTime = "2:30";
        order.deliveryPartnerName = "shiva";

        // Calculate Total Order Amount
        double total = order.calculateTotalAmount();
        System.out.println("Total Amount: "+total);

        // Update order status
        order.updateOrderStatus("CANCELLED");

        // Check If Order Is Paid
        order.isOrderPaid();

        // Cancel an order
        boolean cancelled = order.cancelOrder();
        System.out.println("order Cancelled: "+cancelled);

        // Display order summary
        order.displayOrderSummary();


        System.out.println(order.id);
        System.out.println(order.restaurantName);
        System.out.println(order.customerName);
        System.out.println(order.foodItem);
        System.out.println(order.quantity);
        System.out.println(order.grandTotal);
        System.out.println(order.orderStatus);

        //Order1 object creation
        // Argument constructor objects
        Order order1 = new Order(101,"Chef Food Factory","Sushmitha","ABHP Colony",
                "Pizza",2,250,12.3,20,5,537.3,"Cash","Delivered","2:30 PM","Shiva");

        System.out.println(order1.id);
        System.out.println(order1.restaurantName);
        System.out.println(order1.customerName);
        System.out.println(order1.foodItem);
        System.out.println(order1.grandTotal);

        //Order2 object creation
        Order order2 = new Order(102,"Pizza Hut","Krishna","Mumbai",
                "Burger",1,180,10,25,5,220,"UPI","Preparing","3:00 PM","Ravi");

        System.out.println(order2.id);
        System.out.println(order2.restaurantName);
        System.out.println(order2.customerName);
        System.out.println(order2.foodItem);
        System.out.println(order2.grandTotal);

        //Order3 object creation
        Order order3 = new Order(103,"Dominos","Sai","Chennai",
                "Pasta",2,200,11,30,6,447,"Card","Out for delivery","3:30 PM","Arjun");

        System.out.println(order3.id);
        System.out.println(order3.restaurantName);
        System.out.println(order3.customerName);
        System.out.println(order3.foodItem);
        System.out.println(order3.grandTotal);

        //Order4 object creation
        Order order4 = new Order(104,"KFC","Shiva","Hyderabad",
                "Fried Chicken",3,220,12,35,7,714,"Cash","Preparing","4:00 PM","Rahul");

        System.out.println(order4.id);
        System.out.println(order4.restaurantName);
        System.out.println(order4.customerName);
        System.out.println(order4.foodItem);
        System.out.println(order4.grandTotal);

        //Order5 object creation
        Order order5 = new Order(105,"Burger King","Sai Ram","Kerala",
                "Veg Burger",2,150,9,20,5,334,"UPI","Delivered","4:30 PM","Kiran");

        System.out.println(order5.id);
        System.out.println(order5.restaurantName);
        System.out.println(order5.customerName);
        System.out.println(order5.foodItem);
        System.out.println(order5.grandTotal);

        //Product class object creation
        Product product = new Product();
        product.id = 107;
        product.name = "car";
        product.maxRetailPrice = 230000L;
        product.discountPercentage = 20;

        // Display Product Details
        product.displayProductDetails();

        // Get Discount Amount
        System.out.println("Discount Amount: "+product.getDiscountAmount());

        //Update Stock
        boolean stockUpdated = product.updateStock(2);
        System.out.println("Stock update succes: "+stockUpdated);


        Payment payment = new Payment();
        payment.paymentId = 301201;
        payment.amount = 350;
        payment.paymentMethod = "Cash";
        payment.paymentStatus = "Paid";
        payment.transactionId = "xxxxx320";

        //Initiate Payment
        boolean initiated = payment.initiatePayment(order, payment.paymentMethod);
        System.out.println("Payment initiated: "+initiated);

        // Validate Payment Amount
        boolean valid = payment.validatePayment(order.grandTotal);
        System.out.println("Payment valid: "+valid);

        // Process Payment
        boolean processed = payment.processPayment(payment.paymentMethod);
        System.out.println("Payment processed: "+processed);

        // Refund Payment
        boolean refunded = payment.refundPayment(order);
        System.out.println("Refund status: "+refunded);

        // Check Payment Status
        String status = payment.checkPaymentStatus();
        System.out.println("Payment status: "+status);

    }
}