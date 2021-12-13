package com.vpigadas.athtechdemoapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vpigadas.athtechdemoapp.R;

public class FirstFragment extends Fragment {
    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment getInstance() {
        FirstFragment fragment = new FirstFragment();

        Bundle parameters = new Bundle();
        parameters.putString("name", "Vassilis");
        parameters.putInt("age", 100);

        fragment.setArguments(parameters);
        return fragment;
    }

    public static FirstFragment getInstance(String name, int age) {
        FirstFragment fragment = new FirstFragment();

        Bundle parameters = new Bundle();
        parameters.putString("name", name);
        parameters.putInt("age", age);

        fragment.setArguments(parameters);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return layoutInflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.fragment_title);
        if (getArguments() != null) {
            String name = getArguments().getString("name");
            int age = getArguments().getInt("age");
        }

    }

    @Override
    public void onResume() {
        super.onResume();
        if (getView() != null) {
            getView().findViewById(R.id.fragment_title);
        }

        Bundle parameters = getArguments();
        if(parameters == null){
            return;
        }

        String name = parameters.getString("name");
        int age = parameters.getInt("age");
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}