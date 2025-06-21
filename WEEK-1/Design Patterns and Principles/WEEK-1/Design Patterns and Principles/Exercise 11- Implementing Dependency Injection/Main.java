public class Main {
    public static void main(String[] args) {
        // Injecting the dependency manually (constructor injection)
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        // Use the service
        service.getCustomerDetails(101);    // Existing customer
        service.getCustomerDetails(999);    // Non-existent customer
    }
}
