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

public class MumbaiFragment extends Fragment {

    public MumbaiFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.mumbai_place_1), getResources().getString(R.string.mumbai_detail_1),R.drawable.drive));
        arrayList.add(new Data(getResources().getString(R.string.mumbai_place_2), getResources().getString(R.string.mumbai_detail_2),R.drawable.fort));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
