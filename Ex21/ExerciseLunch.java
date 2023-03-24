package Ex21;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;

    private static final double maxPrice = 5;

    private int numberOfTimesWeHaveGotPrice = 0;
    static final int MAX_WEEK = 12;
    static final int MAX_HOUR= 24;
    static final int MAX_DAY = 7;

    public  ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printMaxPrice() {
        System.out.println(maxPrice);
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    public void setPrice(double price) {
        if (price > maxPrice) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    public int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNameOfDayEaten(String nameOfDayEaten) {
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void setLunchWeightInGrams(int lunchWeightInGrams) {
        this.lunchWeightInGrams = lunchWeightInGrams;
    }

    public void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
