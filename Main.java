import java.util.*;

class Customer {
    private int id;
    private String firstName, lastName;
    private double balance;

    public Customer(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getBalance() { return balance; }

    @Override
    public String toString() {
        return "Customer[ID=" + id + ", First Name=" + firstName + ", Last Name=" + lastName + ", Balance=" + balance + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(3, "Vipin", "Choudhary", 2500.50),
                new Customer(1, "Shyam", "Sundar", 1800.75),
                new Customer(2, "Aditya", "Kumar", 3000.00),
                new Customer(4, "Priyanshu", "Kumar", 1500.25)
        );

        System.out.println("Before Sorting:");
        customers.forEach(System.out::println);

        customers.sort(Comparator.comparing(Customer::getFirstName)
                .thenComparing(Customer::getLastName)
                .thenComparingInt(Customer::getId)
                .thenComparingDouble(Customer::getBalance));

        System.out.println("\nAfter Sorting:");
        customers.forEach(System.out::println);
    }
}
