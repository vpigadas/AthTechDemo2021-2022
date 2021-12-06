package com.vpigadas.athtechdemoapp.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.vpigadas.athtechdemoapp.MainActivity;
import com.vpigadas.athtechdemoapp.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


        RecyclerView recyclerView = findViewById(R.id.recycler_view_list);

//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getDataList(), this, new RecyclerViewAdapter.Listener() {
//            @Override
//            public void onItemClick(View view, String data) {
//                if (!isClicked) {
//                    isClicked = true;
//                    Snackbar.make(view, getResources().getString(R.string.app_name) + " - " + data, Snackbar.LENGTH_SHORT).addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() {
//                        @Override
//                        public void onDismissed(Snackbar transientBottomBar, int event) {
//                            super.onDismissed(transientBottomBar, event);
//                            isClicked = false;
//                        }
//                    }).show();
//                }
//
//            }
//        });

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getDataList(),  new RecyclerViewAdapter.Listener() {
            @Override
            public void onItemClick(View view, String data) {
                if (!isClicked) {
                    isClicked = true;

                    Intent intent = new Intent(RecyclerViewActivity.this, MainActivity.class);
                    startActivity(intent);

                    Snackbar.make(view, getResources().getString(R.string.app_name) + " - " + data, Snackbar.LENGTH_SHORT).addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() {
                        @Override
                        public void onDismissed(Snackbar transientBottomBar, int event) {
                            super.onDismissed(transientBottomBar, event);
                            isClicked = false;
                        }
                    }).show();
                }

            }
        });

        recyclerView.setAdapter(adapter);
    }

    private List<String> getDataList() {
        List<String> arrayNames = new ArrayList<>();
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("2222222222222222222222222222222");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("4444444444444444444444444444");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("eeeeeeeeeeeeeeeeeeeeeeeeeee");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("3333333333333333333333333333333");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("----------------------------------");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("--------------------------------------");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");
        arrayNames.add("Vassilis");
        arrayNames.add("Nikos");
        arrayNames.add("Markos");

        return arrayNames;
    }
}