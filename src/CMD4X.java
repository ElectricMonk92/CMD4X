/**
 * Created by mark on 28/02/16.
 */

import java.util.ArrayList;

public class CMD4X {
    public static void main (String[] args) {
        Planet Earth = new Planet("Earth", "Terran", "Medium", "Rich", "Normal", "None");
        Planet Mars = new Planet("Mars", "Barren", "Medium", "Low", "Normal", "None");
        Planet Venus = new Planet("Venus", "Volcanic", "Medium", "Abundant", "Normal", "None");

        Star sol = new Star("Sol");
        Star alphaCentari = new Star("Alpha Centari");
        Star sirius = new Star("Sirius");
        Star epsilonEridani = new Star("Epsilon Eridani");

        JumpPoint toA = new JumpPoint(alphaCentari, sol);
        JumpPoint toS = new JumpPoint(sirius, sol);
        JumpPoint toE = new JumpPoint(epsilonEridani, sol);

        sol.addJumpPoint(toA);
        sol.addJumpPoint(toS);
        sol.addJumpPoint(toE);

        sol.addPlanet(Earth);
        sol.addPlanet(Mars);
        sol.addPlanet(Venus);

        System.out.print(sol.describe());


    }
}
