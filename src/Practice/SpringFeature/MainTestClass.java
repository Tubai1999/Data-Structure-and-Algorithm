package Practice.SpringFeature;

public class MainTestClass {
    public static void main(String[] args) {
        PaymentService paymentService = new Razorpay();
        Checkout checkout = new Checkout(paymentService);
        checkout.pay();
    }
}
class Juspay implements PaymentService{
    @Override
    public void paymentGateway() {
        System.out.println("using juspay gateway");
    }
}
class Razorpay implements PaymentService{
    @Override
    public void paymentGateway() {
        System.out.println("using razorpay gateway");
    }
}

interface PaymentService{
    void paymentGateway();
}

class Checkout{
    private PaymentService paymentService;
    public Checkout(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void pay(){
        paymentService.paymentGateway();
    }
}
