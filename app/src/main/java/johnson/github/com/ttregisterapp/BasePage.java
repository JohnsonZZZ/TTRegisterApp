package johnson.github.com.ttregisterapp;

import android.util.Log;

import com.toutiao.router.register.baselib.IH5Delegate;

public abstract class BasePage implements IH5Delegate {

    public void doSth() {
        Log.i("baseCategory", "do something else");
    }
}
