import java.util.ArrayList;

public class ServiceBook
{
  public ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }
  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    return services.toArray(new Service[services.size()]);
  }

  public int[] getAllServiceMileages()
  {
    int[] mileages = new int[services.size()];
    for(int i = 0; i < services.size(); i++)
      mileages[i] = services.get(i).getMileage();
    return mileages;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for(Service service : services)
      if (date.equals(service.getDate()))
        return true;
      return false;
  }

  public Date getDateOfLastService()
  {
    return services.get(services.size()-1).getDate();
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof ServiceBook))
      return false;
    ServiceBook other = (ServiceBook) obj;
    return services.equals(other.services);
  }

  public String toString()
  {
    String output = "";
    for(Service service : services)
      output += service + "\n";
    return output;
  }
}
