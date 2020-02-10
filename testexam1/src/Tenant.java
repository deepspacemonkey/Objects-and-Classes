public class Tenant {
    private String name;
    private MyDate rentedFrom;

    public Tenant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MyDate getRentedFrom() {
        return rentedFrom;
    }

    public void setRentedFrom(MyDate rentedFrom) {
        this.rentedFrom = rentedFrom.copy();
    }
}
