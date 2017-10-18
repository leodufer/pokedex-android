package py.edu.facitec.pokedex;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by virux on 27/09/17.
 */

public class Stat implements Serializable {
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int total;
    @SerializedName("sp.atk")
    private int spAtk;
    @SerializedName("sp.def")
    private int spDef;

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", total=" + total +
                ", spAtk=" + spAtk +
                ", spDef=" + spDef +
                '}';
    }
}
