package solutions.interface_codeing_excercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(getName());
        list.add(Integer.toString(getHitPoints()));
        list.add(Integer.toString(getStrength()));
        list.add(getWeapon());

        return list;
    }

    @Override
    public void read(List<String> List) {
        if(List != null && !List.isEmpty()){
            this.name = List.get(0);
            this.hitPoints = Integer.parseInt(List.get(1));
            this.strength = Integer.parseInt(List.get(2));
            this.weapon = List.get(3);

        }
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        return className+"{name='"+this.getName()
                +"', hitPoints="+this.getHitPoints()
                +", strength="+this.getStrength()
                +", weapon='"+this.getWeapon()
                +"'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
