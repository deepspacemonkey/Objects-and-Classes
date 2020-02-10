import java.util.ArrayList;

public class AparmentComplex {
    private String address;
    private ArrayList<Residence> residences;

    public AparmentComplex(String address) {
        this.address = address;
        residences = new ArrayList<Residence>();
    }

    public int getNumberOfResidences() {
        return residences.size();
    }

    public void add(Residence residence) {
        residences.add(residence);
    }

    public Residence getResidence(int index) {
        return residences.get(index);
    }

    public Residence getResidenceByNUmber(int number) {
        for (Residence residence : residences) {
            if (residence.getNumber() == number)
                return residence;
        }
        return null;
    }

    public Room getFirstAvailableRoom() {
        for(Residence residence : residences)
            if((residence.getType().equals("Room")))
                return (Room) residence;
            return null;
    }

    public Aparment getFirstAvailableApartment(int minNoOfRooms) {
        for(Residence residence : residences)
            if((residence.getType().equals("Apartment") && residence.getNumberOfRooms() >= minNoOfRooms))
                return (Aparment) residence;
        return null;
    }

}
