package com.example.bloodo_.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.bloodo_.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {

    private View view;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomInfoWindow(Context context) {
        this.context = context;

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //view = layoutInflater.inflate(R.layout.custom_info_window);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        TextView title = (TextView) view.findViewById(R.id.winTitle);
        title.setText(marker.getTitle());

        TextView bloodGroup = (TextView) view.findViewById(R.id.bloodGroup);
        bloodGroup.setText(marker.getSnippet());
        return view;
    }
}
