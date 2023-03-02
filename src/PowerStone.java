/*
Author: Jonathan Baires
Date: March 1, 2023
Description:
 */
public class PowerStone implements Istone{
    private final Double powerMultiplier = 1.5;

    private static PowerStone powerStone = null;

    private PowerStone(){};

    public static PowerStone getInstance(){
        if(powerStone == null){
            powerStone = new PowerStone();
        }
        return powerStone;
    }

    @Override
    public void special(Person person) {
        Double temp = person.getPower();
        System.out.println(person.getName() + "'s power is " + temp);
        person.setPower(temp*powerMultiplier);
        System.out.println(person.getName() + "'s power is now " + person.getPower());
    }
}
