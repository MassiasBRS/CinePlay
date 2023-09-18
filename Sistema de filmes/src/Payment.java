public class Payment {
    private final double ticketValue;
    private double paymentCustomer;

    private int ticketsQuantity;

    public Payment(double paymentCustomer) {
        this.ticketValue = 15;
        this.paymentCustomer = paymentCustomer;
    };

    public void payToTicket(Payment value, int quantity){
        double needToPay = quantity * ticketValue;
        if(value.paymentCustomer >= needToPay){
            System.out.println("Successful transation! Well Movie1");
        }else{
            System.out.println("Payment is invalid! the Payment of customeer is low to the real to pay!");
        };
    };
}
