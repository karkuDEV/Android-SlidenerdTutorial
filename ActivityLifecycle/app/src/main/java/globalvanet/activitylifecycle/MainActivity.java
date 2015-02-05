package globalvanet.activitylifecycle;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Log.d("ActivityLOG", "OnCreate was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLOG", "OnResume was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLOG", "OnStart was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLOG", "OnPause was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLOG", "OnDestroy was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLOG", "OnRestart was called");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE) {
            Log.d("ActivityLOG", "landscape");
        }
        else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT) {
            Log.d("ActivityLOG", "portrait");
        }

    }

    public void doSomething(View v) {

    }

    @Override
    public void onClick(View v) {
        Log.d("ActivityLOG", "First button was clicked");
    }
}
