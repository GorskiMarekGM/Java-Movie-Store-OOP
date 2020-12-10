package pl.wsb.students.course.model;

public class BluRayMovie extends Movie {
    private final int PRICE = 20;
    private final int LOYALTY_POINTS = 10;
    @Override
    protected int getPrice() {
        return PRICE;
    }

    @Override
    protected int getLoyaltyPoints() {
        return LOYALTY_POINTS;
    }
}
