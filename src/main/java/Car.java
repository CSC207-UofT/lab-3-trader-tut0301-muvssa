/* A sample class that implements the given interfaces.
 */
public class Car implements Drivable, Tradable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 10;
    }


    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getPrice() {
        return 1000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
