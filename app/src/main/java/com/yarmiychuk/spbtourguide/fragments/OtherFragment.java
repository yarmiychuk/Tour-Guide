package com.yarmiychuk.spbtourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yarmiychuk.spbtourguide.MainActivity;
import com.yarmiychuk.spbtourguide.R;
import com.yarmiychuk.spbtourguide.RecyclerAdapter;
import com.yarmiychuk.spbtourguide.Sight;

import java.util.ArrayList;

/**
 * Created by DmitryYarmiychuk on 13.06.2018.
 * Создал DmitryYarmiychuk 13.06.2018
 */

public class OtherFragment extends Fragment {

    // Required default constructor
    public OtherFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);
        rootView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_sports));

        // ArrayList of sights in the category Other
        ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight(getString(R.string.oceanarium_name), R.drawable.oceanarium,
                getString(R.string.oceanarium_description), getString(R.string.oceanarium_link)));
        sights.add(new Sight(getString(R.string.botanical_name), R.drawable.botanical,
                getString(R.string.botanical_description), getString(R.string.botanical_link)));
        sights.add(new Sight(getString(R.string.zoo_name), R.drawable.zoo,
                getString(R.string.zoo_description), getString(R.string.zoo_link)));
        sights.add(new Sight(getString(R.string.attractions_name), R.drawable.attractions,
                getString(R.string.attractions_description), getString(R.string.attractions__link)));
        sights.add(new Sight(getString(R.string.bridges_name), R.drawable.bridges,
                getString(R.string.bridges_description), getString(R.string.bridges_link)));

        // RecyclerView, Adapter, Manager
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), sights, MainActivity.CATEGORY_OTHER);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView rvItemsList = rootView.findViewById(R.id.rv_items);
        rvItemsList.setLayoutManager(layoutManager);
        rvItemsList.setAdapter(adapter);

        return rootView;
    }

}
