package net.chi6rag.android.fragmenttest;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by chiragaggarwal on 01/07/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    Resources resources;
    String[] resTitles;
    ListView fragmentAList;
    Communicator comm;
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
        fragmentAList = (ListView) getActivity().findViewById(R.id.fragmentAList);
        ArrayAdapter titlesAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.titles, android.R.layout.simple_list_item_1);
        fragmentAList.setAdapter(titlesAdapter);
        fragmentAList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        comm.respond(position);
    }
}
