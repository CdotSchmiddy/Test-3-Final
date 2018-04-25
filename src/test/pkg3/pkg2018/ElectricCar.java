package test.pkg3.pkg2018;

/**
 *
 * @author Calum
 */
public class ElectricCar extends Car{
    
    private int kilowattHours;
    
    public ElectricCar(int kilowattHours, String make, String model, int year, int maxSpeed) {
        super(make, model, year, maxSpeed);
        setKilowattHours(kilowattHours);
    }

    public int getKilowattHours() {
        return kilowattHours;
    }

    public void setKilowattHours(int kilowattHours) {
        if (kilowattHours >= 10 && kilowattHours <= 400)
            this.kilowattHours = kilowattHours;
        else
            throw new IllegalArgumentException("Kilowatt Hours must be in a range of 10-400");
    }
    
    @Override
    public String poweredBy() {
        return "electric motor";
    }
    
}
