package com.billy.app_lib_interface;

import java.util.HashMap;
import java.util.Set;

/**
 * @author billy.qi
 * @since 17/9/20 16:56
 */
public class H5RegisterManager {
    private static HashMap<String, IH5Delegate> pageMap = new HashMap<>();

    static void register(IH5Delegate category) {
        if (category != null) {
            pageMap.put(category.getFilter(), category);
        }
    }

    public static Set<String> getCategoryNames() {
        return pageMap.keySet();
    }
}
