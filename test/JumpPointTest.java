import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by mark on 05/03/16.
 */
public class JumpPointTest {
    protected JumpPoint jumpPoint1;

    @Before
    public void setUp(){
        Star star1 = new Star("Star1");
        Star star2 = new Star("Star2");
        jumpPoint1 = new JumpPoint(star1, star2);


    }

    @org.junit.Test
    public void testDescribe() throws Exception {
        String describeResult = jumpPoint1.describe();
        System.out.println(describeResult);
        assertEquals("Check Jump Point Description.", describeResult, "Allows jumps from Star2 to Star1.");

    }

    @org.junit.Test
    public void testGetName() throws Exception {

    }

    @org.junit.Test
    public void testSetHomeStar() throws Exception {

    }
}