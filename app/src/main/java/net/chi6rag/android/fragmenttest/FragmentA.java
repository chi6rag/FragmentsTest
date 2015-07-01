package net.chi6rag.android.fragmenttest;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chiragaggarwal on 01/07/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentA extends Fragment implements View.OnClickListener{

    Communicator comm;
    Button counterButton;
    int counter = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        comm = (Communicator) activity;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        counterButton = (Button) getActivity().findViewById(R.id.counterButton);
        counterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        counter += 1;
        comm.respond(counter);
    }
}
