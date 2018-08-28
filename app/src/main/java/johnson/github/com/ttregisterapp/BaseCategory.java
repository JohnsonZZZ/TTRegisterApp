package johnson.github.com.ttregisterapp;

import android.util.Log;

import com.billy.app_lib_interface.IH5Delegate;


/**
 * @author billy.qi
 * @since 17/9/22 13:31
 */
public abstract class BaseCategory implements IH5Delegate {

    public void doSth() {
        Log.i("baseCategory", "do something else");
    }
}
