import java.util.Arrays;

public class SortedCustomers {

    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
            customers[0] = new Customer("mike@gmail.com", "Mike", "Grabin");
            customers[1] = new Customer("eric@gmail.com", "Eric", "Brown");
            customers[2] = new Customer("brandon@gmail.com", "Brandon", "Smith");
            Arrays.sort(customers);

            for (Customer i : customers) {
                System.out.println(
                        i.getEmail() + " " +
                        i.getFirstName() + " " +
                        i.getLastName());
            }
    }
}
