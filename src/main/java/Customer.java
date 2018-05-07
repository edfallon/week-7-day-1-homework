public class Customer {

    private int height;
    private int money;
    private int age;

    public Customer(int height, int age, int money) {
        this.height = height;
        this.age = age;
        this.money = money;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }


    public void payForRide(int price) {
        this.money -= price;
    }
}
