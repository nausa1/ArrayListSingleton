package one;

import org.testng.Assert;
import org.testng.annotations.*;

public class GetTest {
    private static ArrayListSingleton X;

    @BeforeClass
    public void init() {
        X = ArrayListSingleton.getInstance();
        X.populate();
    }

    @Test
    public void getTest() {
        Assert.assertTrue(X.get().contains("ass"));
    }
}
