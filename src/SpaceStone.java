/*
Author: Jonathan Baires
Date: March 1, 2023
Description: A concreate implemenation of Istone
 */
public class SpaceStone implements Istone{
    private String location= "Space";

    private static SpaceStone spaceStone = null;

    private SpaceStone(){
        System.out.println("instantiating a spacestone");
    };

    public static SpaceStone getInstance(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
        }
        return spaceStone;
    }

    @Override
    public void special(Person person) {
        System.out.println(person.getName() + "'s location is " + person.getLocation());
        System.out.println("BAMPH");
        person.setLocation(location);
        System.out.println(person.getName() + "'s now at " + person.getLocation());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static SpaceStone getSpaceStone() {
        return spaceStone;
    }

    public static void setSpaceStone(SpaceStone spaceStone) {
        SpaceStone.spaceStone = spaceStone;
    }
}
