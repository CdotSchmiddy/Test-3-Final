package test.pkg3.pkg2018;

/**
 *
 * @author Calum
 */
public class PowerBoat extends Boat {

    private int horsePower, maxSpeed;
    
    public PowerBoat(int horsePower, int length, int maxSpeed, int year, String make, String model) {
        super(length, maxSpeed, year, make, model);
        setHorsePower(horsePower);
        setMaxSpeed(maxSpeed);
    }

    public int getHorsePower() {
        return horsePower;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower >= 2 && horsePower <= 2000)
            this.horsePower = horsePower;
        else
            throw new IllegalArgumentException("Horse power must be in a range of 2-2000");
    }
    
    @Override
    public String poweredBy() {
        return "gas or diesel engine";
    }
    
    @Override
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 1 && maxSpeed <= 200)
            this.maxSpeed = maxSpeed;
        else
            throw new IllegalArgumentException("Max Speed must be in a range of 1-200");
    }
    
}
