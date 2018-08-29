package johnson.github.com.ttregisterapp;

import android.util.Log;

import johnson.github.com.baseinterface.IH5Delegate;

public abstract class BasePage implements IH5Delegate {

    public void doSth() {
        Log.i("baseCategory", "do something else");
    }
}
