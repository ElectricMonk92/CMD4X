/**
 * Created by mark on 05/03/16.
 */
public class Ship implements Describable{
    private String name;
    private String shipClass;
    private double attack;
    private double armour;
    private double shield;
    private double speed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArmour() {
        return armour;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAttack() {

        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public String getShipClass() {

        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    @Override
    public String describe() {
        return null;
    }
}
