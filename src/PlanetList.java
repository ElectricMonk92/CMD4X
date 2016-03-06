import java.util.ArrayList;

/**
 * Created by mark on 01/03/16.
 */
public class PlanetList implements DescribableList {
    ArrayList<Planet> list = new ArrayList<Planet>();

    void addPlanet(Planet planet){
        list.add(planet);
    }

    boolean removePlanet(Planet planet){
        return list.remove(planet);
    }

    int planetCount(){
        return list.size();
    }

    @Override
    public String describeAll(){
        StringBuilder strBuilder = new StringBuilder();

        for(Planet planet : list) {
            strBuilder.append(planet.describe() + "\n");
        }

        return strBuilder.toString();
    }


}
