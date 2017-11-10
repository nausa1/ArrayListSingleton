import java.util.ArrayList;
import java.util.Random;

public final class ArrayListSingleton {
    private static volatile ArrayListSingleton instance;
    private volatile ArrayList<String> strs;
    private final String[] str_value = {"Fail", "Pass"};

    private ArrayListSingleton() {
    }

    public static ArrayListSingleton getInstance() {
        if(instance==null) {
            synchronized (ArrayListSingleton.class) {
                if(instance==null) {
                    instance = new ArrayListSingleton();
                }
            }
        }
        return instance;
    }

    public void populate () {
        if(strs==null) {
            synchronized (this) {
                if(strs==null) {
                    strs = new ArrayList<String>();
                    Random randomGenerator = new Random();
                    for(int i = 0; i < 100; i++) {
                        strs.add(str_value[randomGenerator.nextInt(2)]);
                    }
                }
            }
        }
    }

    

}
