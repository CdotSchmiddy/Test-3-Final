package test.pkg3.pkg2018;
//Calum Schmidtke - 200366773

/**
 *
 * @author Calum
 */
public class SailBoat extends Boat {

    private int masts, maxSpeed;
    
    public SailBoat(int masts, int length, int maxSpeed, int year, String make, String model) {
        super(length, maxSpeed, year, make, model);
        setMaxSpeed(maxSpeed);
        setNumOfMasts(masts);
    }

    public int getNumOfMasts() {
        return masts;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setNumOfMasts(int masts) {
        if (masts >= 1 && masts <= 5)
            this.masts = masts;
        else
            throw new IllegalArgumentException("Number of masts must be in a range of 1-5");
    }

    
    @Override
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 1 && maxSpeed <= 75)
            this.maxSpeed = maxSpeed;
        else
            throw new IllegalArgumentException("Max Speed must be in a range of 1-75");
    }

    @Override
    public String poweredBy() {
        return "wind";
    }
    
}
