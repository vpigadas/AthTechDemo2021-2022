package com.vpigadas.athtechdemoapp.fragments;

import android.widget.FrameLayout;

import androidx.fragment.app.FragmentTransaction;

import com.vpigadas.athtechdemoapp.AbstractActivity;
import com.vpigadas.athtechdemoapp.R;

public class FragmentsActivity extends AbstractActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_fragments;
    }

    @Override
    public void uiSetup() {
        FrameLayout layout = findViewById(R.id.frameLayout);

        FirstFragment fragment = new FirstFragment();

        FirstFragment staticFragment = FirstFragment.getInstance("Vassilis",100);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment, "FirstFragment");
        transaction.commit();
    }

    @Override
    public void startOperations() {

    }

    @Override
    public void stopOperations() {

    }
}