package com.vpigadas.athtechdemoapp;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AbstractActivity {

    @Override
    int getLayout() {
        return R.layout.activity_main_2;
    }

    @Override
    void uiSetup() {
        Button btnLogin = findViewById(R.id.main_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //Snackbar.make(v,"Button Clicked", Snackbar.LENGTH_SHORT).show();
//                Toast.makeText(v.getContext(),"Button CLicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name","Vassilis");
                startActivityForResult(intent,2000);
            }
        });
        btnLogin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Snackbar.make(v,"Button Long Clicked", Snackbar.LENGTH_SHORT).show();
                return true;
            }
        });

        ImageView imgBack = findViewById(R.id.main_img_back);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });
    }

    @Override
    void startOperations() {

    }

    @Override
    void stopOperations() {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 2000){
            if (resultCode == Activity.RESULT_OK){
                Log.d("MSG",String.valueOf(resultCode));
            }else if (resultCode == Activity.RESULT_CANCELED){
                Log.d("MSG",String.valueOf(resultCode));
            }else if (resultCode == 5){
                String name = data.getExtras().getString("name");
                Log.d("MSG",name);
            }else {
                Log.d("MSG",String.valueOf(resultCode));
            }
        }
    }
}