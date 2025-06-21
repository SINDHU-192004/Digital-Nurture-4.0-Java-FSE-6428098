public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        // Simulated data lookup
        if (id == 101) {
            return "Customer: SINDHU T (ID: 101)";
        } else {
            return "Customer not found for ID: " + id;
        }
    }
}
