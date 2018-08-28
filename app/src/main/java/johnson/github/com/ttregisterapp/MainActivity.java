package johnson.github.com.ttregisterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.billy.app_lib_interface.H5RegisterManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder sb = new StringBuilder();
        for (String s : H5RegisterManager.getCategoryNames()) {
            sb.append(s);
            sb.append("\n");
        }
        Log.e("xxx",  sb.toString());
    }
}
