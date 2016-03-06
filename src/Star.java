import java.util.ArrayList;

/**
 * Created by mark on 28/02/16.
 */

public class Star implements Describable {

    private String name;
    private PlanetList planets = new PlanetList();
    private JumpPointList jumpPoints = new JumpPointList();

    Star(String name){
        this.name = name;
    }

    @Override
    public String describe() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Star " + name + " has " + planets.planetCount() + " planets:\n");
        stringBuilder.append(planets.describeAll());
        stringBuilder.append("From there you can jump to:\n");
        stringBuilder.append(jumpPoints.describeAll());

        return stringBuilder.toString();
    }

    public void addPlanet(Planet planet) {
        planets.addPlanet(planet);
    }

    public boolean removePlanet(Planet planet){
        return planets.removePlanet(planet);
    }

    public void addJumpPoint(JumpPoint jumpPoint) {
        jumpPoints.addJumpPoint(jumpPoint);
    }

    public boolean removeJumpPoint(JumpPoint jumpPoint){
        return jumpPoints.removeJumpPoint(jumpPoint);
    }

    public String getName() {
        return name;
    }

    public PlanetList getPlanets() {
        return planets;
    }
}
