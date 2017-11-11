import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;

public class GetTest {
    private static ArrayListSingleton X;

    @BeforeClass
    public void init() {
        X = ArrayListSingleton.getInstance();
        X.populate();
    }

    @Test
    public void testGet() {
        Assert.assertTrue(X.get().contains("ass"));
    }
}
