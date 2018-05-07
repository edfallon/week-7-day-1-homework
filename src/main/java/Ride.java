public abstract class Ride implements ICanRide {

    private int price;
    private int minHeight;

    public Ride(int price, int minHeight){
        this.price = price;
        this.minHeight = minHeight;
    }

    public int getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }


    public boolean canRide(Customer customer) {
        if ((customer.getHeight() >= minHeight) && (customer.getMoney() >= price)){
            customer.payForRide(price);
            return true;
        }
        return false;
    }


}
