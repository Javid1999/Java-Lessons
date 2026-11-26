package DesignPatterns.StructureDesignPattern.Facade;

public class InsuranceFacade {

    private final CustomerService customerService;

    private final PricingService pricingService;

    private final PaymentService paymentService;

    private final PolicyService policyService;

    public InsuranceFacade() {
        this.customerService = new CustomerService();
        this.pricingService = new PricingService();
        this.paymentService = new PaymentService();
        this.policyService = new PolicyService();

    }

    public void buyPolicy(String customerId, double insuredAmount) {
        if (!customerService.validateCustomer(customerId)) {
            System.out.println("Customer validation failed");
            return;
        }


        double price = pricingService.calculatePrice(insuredAmount);
        if(!paymentService.processPayment(price)){
            System.out.println("Payment failed");
        return;
        }

        policyService.createPolicy(customerId);

        System.out.println("Insurance policy created successfully");

    }
}
