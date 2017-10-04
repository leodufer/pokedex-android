package py.edu.facitec.pokedex;

import java.util.List;

/**
 * Created by virux on 27/09/17.
 */

public class Pokemon {

    private int id;
    private String name;
    private String species;
    private List<String> type;
    private List<String>abilities;
    private String height;
    private String weight;
    private List<String> evolution;
    private Stat stats;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<String> getEvolution() {
        return evolution;
    }

    public void setEvolution(List<String> evolution) {
        this.evolution = evolution;
    }

    public Stat getStats() {
        return stats;
    }

    public void setStats(Stat stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", abilities=" + abilities +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", evolution=" + evolution +
                ", stats=" + stats +
                '}';
    }
}
