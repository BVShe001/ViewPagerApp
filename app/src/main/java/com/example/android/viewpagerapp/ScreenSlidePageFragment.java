package com.example.android.viewpagerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScreenSlidePageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = (ViewGroup)layoutInflater.inflate(R.layout.fragment_screen_slide_page,container,false);
        return rootView;
    }
}
