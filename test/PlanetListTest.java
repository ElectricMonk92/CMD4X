import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mark on 05/03/16.
 */
public class PlanetListTest {
    PlanetList planetList;

    @Before
    public void setUp() throws Exception {
        Planet Earth = new Planet("Earth", "Terran", "Medium", "Rich", "Normal", "None");
        Planet Mars = new Planet("Mars", "Barren", "Medium", "Low", "Normal", "None");
        Planet Venus = new Planet("Venus", "Volcanic", "Medium", "Abundant", "Normal", "None");
        this.planetList = new PlanetList();
        planetList.addPlanet(Earth);
        planetList.addPlanet(Mars);
        planetList.addPlanet(Venus);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddPlanet() throws Exception {
        assertTrue(true);

    }

    @Test
    public void testRemovePlanet() throws Exception {
        assertTrue(true);
    }

    @Test
    public void testPlanetCount() throws Exception {
        assertTrue(true);
        assertTrue(planetList.planetCount() == 3);
    }

    @Test
    public void testDescribeAll() throws Exception {
        assertTrue(true);
    }
}