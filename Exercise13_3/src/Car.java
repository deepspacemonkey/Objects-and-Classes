public class Car extends Vehicle
{
  private String regNo;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  public String toString()
  {
    return String.format("%s | Registration: %s", super.toString(), regNo);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))
      return false;
    Car other = (Car) obj;
    return super.equals(other) && regNo.equals(other.regNo);
  }
}
