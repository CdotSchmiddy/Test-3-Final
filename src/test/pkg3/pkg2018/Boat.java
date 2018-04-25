package test.pkg3.pkg2018;
//Calum Schmidtke - 200366773

import java.time.Year;

/**
 *
 * @author Calum
 */
public abstract class Boat implements Transport{
    private String make, model;
    private int year, maxSpeed, length;

    public Boat(int length, int maxSpeed, int year, String make, String model) {
        setLength(length);
        setModelYear(year);
        setMake(make);
        setModel(model);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (!make.isEmpty())
            this.make = make;
        else
            throw new IllegalArgumentException("Make cannot be empty");
    }
    
    public String getModel() {
        return model;
    }   

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
    }
    
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void setMaxSpeed(int maxSpeed);
   
    @Override
    public int getModelYear(){
        return year;
    }
    
    public void setModelYear(int year) {
        if (year >= 1400 && year <= Year.now().getValue() + 1)
            this.year = year;
        else
            throw new IllegalArgumentException("Year must be between 1400-Current Date + 1 year");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 6 && length <= 1550)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be in a range of 6-1550 feet");
    }
    
    
    @Override
    public String poweredBy() {
        return "gas or diesel engine";
    }
}
