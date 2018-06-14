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

public class TheatresFragment extends Fragment {

    // Required default constructor
    public TheatresFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);
        rootView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_theatres));

        ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight(getString(R.string.mikhailovsky_name), R.drawable.mikhailovsky,
                getString(R.string.mikhailovsky_description), getString(R.string.mikhailovsky_link)));
        sights.add(new Sight(getString(R.string.mariinsky_name), R.drawable.mariinsky,
                getString(R.string.mariinsky_description), getString(R.string.mariinsky_link)));
        sights.add(new Sight(getString(R.string.bdt_name), R.drawable.bdt,
                getString(R.string.bdt_description), getString(R.string.bdt_link)));
        sights.add(new Sight(getString(R.string.philharmonic_name), R.drawable.philharmonic,
                getString(R.string.philharmonic_description), getString(R.string.philharmonic_link)));
        sights.add(new Sight(getString(R.string.tyz_name), R.drawable.tyz,
                getString(R.string.tyz_description), getString(R.string.tyz_link)));

        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), sights, MainActivity.CATEGORY_THEATRES);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView rvItemsList = rootView.findViewById(R.id.rv_items);
        rvItemsList.setLayoutManager(layoutManager);
        rvItemsList.setAdapter(adapter);

        return rootView;
    }
}
