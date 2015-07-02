package net.chi6rag.android.fragmenttest;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;


public class MainActivity extends Activity implements Communicator {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void respond(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragmentB);
        fragmentB.changeText(i);
    }

}