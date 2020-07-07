package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DelhiFragment extends Fragment {

    public DelhiFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.delhi_place_1), getResources().getString(R.string.delhi_detail_1),R.drawable.india_gate));
        arrayList.add(new Data(getResources().getString(R.string.delhi_place_2), getResources().getString(R.string.delhi_detail_2)));
        arrayList.add(new Data(getResources().getString(R.string.delhi_place_3), getResources().getString(R.string.delhi_detail_3),R.drawable.qutub_minar));
        arrayList.add(new Data(getResources().getString(R.string.delhi_place_4), getResources().getString(R.string.delhi_detail_4)));


        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
