package us.mike.com.flexui2;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by John on 7/9/2016.
 */

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        FragmentB f2 =(FragmentB) getFragmentManager().findFragmentById((R.id.fragment2));
        if(f2 != null)
        f2.changeData(index);


    }
}
