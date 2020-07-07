package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {

    public DataAdapter(Context context, ArrayList<Data> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.data_list, parent, false);
        }

        Data data = getItem(position);

        TextView textView_name = listView.findViewById(R.id.textView1);
        textView_name.setText(data.getPlaceName());

        TextView textView_detail = listView.findViewById(R.id.textView2);
        textView_detail.setText(data.getPlacedetails());

        ImageView imageView = listView.findViewById(R.id.imageId);
        if (data.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(data.getPlaceImageId());
        } else {
            imageView.setVisibility(View.GONE);

        }

        return listView;
    }
}
