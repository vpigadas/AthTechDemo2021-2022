package com.vpigadas.athtechdemoapp.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vpigadas.athtechdemoapp.R;

public class RecyclerViewHolder2 extends BaseRecyclerView{

    private RecyclerViewAdapter.Listener callback;

    public RecyclerViewHolder2(@NonNull View itemView, RecyclerViewAdapter.Listener callback) {
        super(itemView);
        this.callback = callback;
    }


    @Override
    public void bindData(String data) {
        TextView textView = itemView.findViewById(R.id.item_txt);
        textView.setText(data);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onItemClick(v,data);
                //Snackbar.make(v, itemView.getResources().getString(R.string.app_name) + " - " + data, Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
