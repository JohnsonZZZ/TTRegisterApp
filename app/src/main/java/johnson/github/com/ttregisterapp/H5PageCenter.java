package johnson.github.com.ttregisterapp;

import java.util.HashMap;

public class H5PageCenter {
    private static HashMap<String, BasePage> pageMap = new HashMap<>();

    public static void register() {
//        pageMap.put(basePage.getPattern(), basePage);
    }

    public static void register(BasePage basePage) {
        pageMap.put(basePage.getPattern(), basePage);
    }
}
