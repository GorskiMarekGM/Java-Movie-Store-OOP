package pl.wsb.students.course.model;

public class DVDMovie extends Movie {
    private final int PRICE = 10;
    private final int LOYALTY_POINTS = 5;
    @Override
    protected int getPrice() {
        return PRICE;
    }
    @Override
    protected int getLoyaltyPoints() {
        return LOYALTY_POINTS;
    }
}
