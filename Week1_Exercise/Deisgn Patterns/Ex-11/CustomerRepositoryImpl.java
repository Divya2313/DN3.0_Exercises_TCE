public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Simulate database query
        Customer customer = new Customer(id, "John Doe", "john.doe@example.com");
        return customer;
    }
}