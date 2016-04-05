package tw.com.model.model;

public class Vehicle {
    private int id;
    private String name;
    private int price;
    private int number;
    private int rentDay;
    private int busload;

    public Vehicle(int id, String name, int price, int busload) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.busload = busload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRentDay() {
        return rentDay;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public int getBusload() {
        return busload;
    }

    public void setBusload(int busload) {
        this.busload = busload;
    }
}
