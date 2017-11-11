import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Random;

public class ChangeTest {
    private static ArrayListSingleton X;

    @BeforeClass
    public void init() {
        X = ArrayListSingleton.getInstance();
        X.populate();
    }

    @Test
    @Parameters({"change_param"})
    public void changeTest(@Optional("test") String str) {
        Random randomGenerator = new Random();
        int i = randomGenerator.nextInt(100);
        X.change(i,str);
        Assert.assertTrue(X.check(i,str));
    }
}
