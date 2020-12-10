package pl.wsb.students.course;

import pl.wsb.students.course.model.Customer;
import pl.wsb.students.course.model.Movie;
import pl.wsb.students.course.model.Transaction;
import pl.wsb.students.course.service.StoreManager;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        StoreManager storeManager = new StoreManager();

        storeManager.sell(customer);
        storeManager.sell(customer);
        storeManager.sell(customer);
        System.out.printf("Customer loyalty points: %s %n", customer.getPoints());

        for (Transaction transaction: storeManager.getTransactions()) {
            System.out.printf("Transaction amount: %s %n", transaction.getAmount());
        }

        for (Movie movie: storeManager.getMovies()) {
            System.out.printf("Movie title: %s %n", movie.getTitle());
            System.out.printf("Movie stock: %s %n", movie.getStock());
        }
    }
}
