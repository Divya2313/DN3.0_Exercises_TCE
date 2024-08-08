public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create a concrete repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Create a service instance with the repository instance
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.findCustomerById(1);

        // Display the customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
    }
}