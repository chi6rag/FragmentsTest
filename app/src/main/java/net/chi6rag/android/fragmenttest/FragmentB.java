package net.chi6rag.android.fragmenttest;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by chiragaggarwal on 01/07/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentB extends Fragment {

    TextView t;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t = (TextView) getActivity().findViewById(R.id.resultText);
    }

    public void changeText(int counter){
        t.setText("The button was clicked " + counter + " times");
    }

}
