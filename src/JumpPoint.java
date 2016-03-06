/**
 * Created by mark on 29/02/16.
 */
public class JumpPoint implements Describable{
    private Star targetStar;
    private Star homeStar;
    private String name;

    JumpPoint(Star targetStar, Star homeStar) {
        this.targetStar = targetStar;
        this.homeStar = homeStar;
    }

    @Override
    public String describe() {
        return "Allows jumps from " + homeStar.getName() + " to " + targetStar.getName() + ".";
    }

    public String getName() {
        return name;
    }

    public void setHomeStar(Star homeStar) {
        this.homeStar = homeStar;
    }
}
