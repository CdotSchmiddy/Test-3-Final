package test.pkg3.pkg2018;
//Calum Schmidtke - 200366773

import java.time.Year;

/**
 *
 * @author Calum
 */
public class Car implements Transport{

    private String make, model;
    private int year;
    private int maxSpeed;

    public Car(String make, String model, int year, int maxSpeed) {
        setMake(make);
        setModel(model);
        setModelYear(year);
        setMaxSpeed(maxSpeed);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
      String[] validMakes = {"Audi","Toyota","Ford"};

        for (String validMake : validMakes)
        {
            if (validMake.equalsIgnoreCase(make))
            {
                this.make = validMake;
                return;
            }
        }
        throw new IllegalArgumentException("Valid makes are: Audi, etc...");
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

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0 && maxSpeed <= 600)
            this.maxSpeed = maxSpeed;
        else
            throw new IllegalArgumentException("Max Speed must be in a range of 1-600");
    }
   
    @Override
    public int getModelYear(){
        return year;
    }
    
    public void setModelYear(int year) {
        if (year >= 1900 && year <= Year.now().getValue() + 1)
            this.year = year;
        else
            throw new IllegalArgumentException("Year must be between 1900-Current Date + 1 year");
    }
    
    @Override
    public String poweredBy() {
        return "gas or diesel engine";
    }
}