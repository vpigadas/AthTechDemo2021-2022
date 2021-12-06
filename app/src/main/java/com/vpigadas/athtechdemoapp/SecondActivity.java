package com.vpigadas.athtechdemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        String name = getIntent().getExtras().getString("name");

        TextView textView = findViewById(R.id.second_txt_title);

        textView.setText(name);

        FrameLayout frameLayout = findViewById(R.id.frameContainer);

        HomeFragment homeFragment = HomeFragment.newInstance(name, 100);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer,homeFragment,"HomeFragment_test");
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("name", "Markos");
        setResult(5,intent);
        super.onBackPressed();
    }
}