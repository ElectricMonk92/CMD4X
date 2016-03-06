import java.util.ArrayList;

/**
 * Created by mark on 05/03/16.
 */
public class JumpPointList implements DescribableList{
    private ArrayList<JumpPoint> jumpPoints = new ArrayList<JumpPoint>();

    @Override
    public String describeAll() {
        StringBuilder strBuilder = new StringBuilder();

        for(JumpPoint jumpPoint : jumpPoints) {
            strBuilder.append(jumpPoint.describe() + "\n");
        }

        return strBuilder.toString();
    }

    public void addJumpPoint(JumpPoint jumpPoint){
        jumpPoints.add(jumpPoint);
    }

    public boolean removeJumpPoint(JumpPoint jumpPoint){
        return jumpPoints.remove(jumpPoint);
    }

    int jumpPointCount(){
        return jumpPoints.size();
    }
}
