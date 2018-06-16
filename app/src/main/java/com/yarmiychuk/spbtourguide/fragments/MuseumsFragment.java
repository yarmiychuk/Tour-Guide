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

public class MuseumsFragment extends Fragment {

    // Required default constructor
    public MuseumsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);
        rootView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_museums));

        // ArrayList of sights in the category Museums
        ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight(getString(R.string.hermitage_name), R.drawable.hermitage,
                getString(R.string.hermitage_description), getString(R.string.hermitage_link)));
        sights.add(new Sight(getString(R.string.russian_name), R.drawable.rusmuseum,
                getString(R.string.russian_description), getString(R.string.russian_link)));
        sights.add(new Sight(getString(R.string.erarta_name), R.drawable.erarta,
                getString(R.string.erarta_description), getString(R.string.erarta_link)));
        sights.add(new Sight(getString(R.string.isaak_name), R.drawable.isaak,
                getString(R.string.isaak_description), getString(R.string.isaak_link)));
        sights.add(new Sight(getString(R.string.fortress_name), R.drawable.fortress,
                getString(R.string.fortress_description), getString(R.string.fortress_link)));

        // RecyclerView, Adapter, Manager
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), sights, MainActivity.CATEGORY_MUSEUMS);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView rvItemsList = rootView.findViewById(R.id.rv_items);
        rvItemsList.setLayoutManager(layoutManager);
        rvItemsList.setAdapter(adapter);

        return rootView;
    }
}
