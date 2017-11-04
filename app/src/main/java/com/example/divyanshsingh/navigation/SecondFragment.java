package com.example.divyanshsingh.navigation;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Divyansh Singh on 04-11-2017.
 */

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.second_fragment,container,false);

        TextView textView = (TextView) rootView.findViewById(R.id.fragmentName);
        textView.setText("Second Fragment");

        return rootView;

    }
}
