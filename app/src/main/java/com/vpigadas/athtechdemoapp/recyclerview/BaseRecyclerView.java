package com.vpigadas.athtechdemoapp.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseRecyclerView extends RecyclerView.ViewHolder {

    public BaseRecyclerView(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindData(String data);
}
