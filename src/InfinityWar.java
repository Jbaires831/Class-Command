import java.util.HashMap;
public class InfinityWar {
    public static void main(String[] args){
        Titan thanos = new Titan();
        HashMap<String, Istone> stones = new HashMap<>();
        PowerStone powerStone = PowerStone.getInstance();
        powerStone.special(thanos);
        SpaceStone spaceStone = SpaceStone.getInstance();
        SpaceStone spaceStone2 = SpaceStone.getInstance();

        spaceStone.setLocation("Knowwhere");
        System.out.println(spaceStone2.getLocation());

        stones.put("Space", spaceStone);
        stones.put("Power",powerStone );
        thanos.addStone(spaceStone);
        thanos.addStone(powerStone);

        thanos.snap();
    }
}