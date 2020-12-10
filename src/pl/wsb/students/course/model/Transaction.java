package pl.wsb.students.course.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
    private List<Movie> movies = new ArrayList<>();
    private Date date;
    private double amount = 0;
    private int soldDVDs = 0;
    private int soldBluRays = 0;
    private int loyaltyPoints = 0;
    private Customer customer;
    public List<Movie> getMovies() {
        return movies;
    }
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getSoldDVDs() {
        return soldDVDs;
    }
    public void setSoldDVDs(int soldDVDs) {
        this.soldDVDs = soldDVDs;
    }
    public int getSoldBluRays() {
        return soldBluRays;
    }
    public void setSoldBluRays(int soldBluRays) {
        this.soldBluRays = soldBluRays;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}