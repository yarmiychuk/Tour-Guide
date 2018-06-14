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

public class ParksFragment extends Fragment {

    // Required default constructor
    public ParksFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);
        rootView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.color_parks));

        ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight(getString(R.string.summer_name), R.drawable.summer,
                getString(R.string.summer_description), getString(R.string.summer_link)));
        sights.add(new Sight(getString(R.string.peterhof_name), R.drawable.peterhof,
                getString(R.string.peterhof_description), getString(R.string.peterhof_link)));
        sights.add(new Sight(getString(R.string.tzar_name), R.drawable.selo,
                getString(R.string.tzar_description), getString(R.string.tzar_link)));
        sights.add(new Sight(getString(R.string.pavlovsk_name), R.drawable.pavlovsk,
                getString(R.string.pavlovsk_description), getString(R.string.pavlovsk_link)));
        sights.add(new Sight(getString(R.string.gatchina_name), R.drawable.gatchina,
                getString(R.string.gatchina_description), getString(R.string.gatchina_link)));

        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), sights, MainActivity.CATEGORY_PARKS);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView rvItemsList = rootView.findViewById(R.id.rv_items);
        rvItemsList.setLayoutManager(layoutManager);
        rvItemsList.setAdapter(adapter);

        return rootView;
    }

}
