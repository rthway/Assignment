class Customer {
    private String name;
    private String membership;

    public Customer(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public String getMembership() {
        return membership;
    }
}

class Discount {
    public static double getServiceDiscountRate(String membership) {
        switch (membership.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0.0; // No discount for non-members
        }
    }

    public static double getProductDiscountRate() {
        return 0.10; // Flat 10% discount for all members
    }
}

class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double calculateTotalExpense() {
        double serviceDiscount = serviceExpense * (1 - Discount.getServiceDiscountRate(customer.getMembership()));
        double productDiscount = productExpense * (1 - Discount.getProductDiscountRate());

        return serviceDiscount + productDiscount;
    }

    public String getCustomerName() {
        return customer.getName();
    }
}

public class BeautySaloonTest {
    public static void main(String[] args) {
        // Create a customer with Premium membership
        Customer premiumCustomer = new Customer("Alice", "Premium");

        // Create a visit with service expense $100 and product expense $50
        Visit visit = new Visit(premiumCustomer, 100, 50);

        // Calculate and display the total expense for the visit
        double totalExpense = visit.calculateTotalExpense();
        System.out.println("Customer: " + visit.getCustomerName());
        System.out.println("Total Expense: $" + totalExpense);
    }
}
