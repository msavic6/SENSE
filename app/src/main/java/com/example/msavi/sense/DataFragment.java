package com.example.msavi.sense;

/**
 * Created by msavi on 8/4/2018.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DataFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        getActivity().setTitle(R.string.title_data);
        return inflater.inflate(R.layout.fragment_data, null);
    }
}