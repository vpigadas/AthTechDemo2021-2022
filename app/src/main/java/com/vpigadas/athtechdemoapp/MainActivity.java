package com.vpigadas.athtechdemoapp;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AbstractActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_main_2;
    }

    @Override
    public void uiSetup() {

        ImageView imageView = findViewById(R.id.main_img_back);
        imageView.setImageResource(R.drawable.googlelogo_color_160x56dp);

        Button btnLogin = findViewById(R.id.main_btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //Snackbar.make(v,"Button Clicked", Snackbar.LENGTH_SHORT).show();
//                Toast.makeText(v.getContext(),"Button CLicked",Toast.LENGTH_SHORT).show();

                EditText editText = findViewById(R.id.main_edit_username);
                String inputFromUsername = editText.getText().toString();
                if(inputFromUsername.length() > 1){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("name",inputFromUsername);
                    startActivityForResult(intent,2000);
                }else {
                    Snackbar.make(v,"Please insert your email", Snackbar.LENGTH_SHORT).show();
                }


            }
        });
        btnLogin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String message = getString(R.string.snackbar_message);
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
    public void startOperations() {

    }

    @Override
    public void stopOperations() {

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