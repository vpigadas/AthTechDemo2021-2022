package com.vpigadas.athtechdemoapp.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vpigadas.athtechdemoapp.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseRecyclerView> {

    interface Listener {
        public void onItemClick(View view, String data);
    }

    @NonNull
    private List<String> arrayData;
    //    private Context context;
    private Listener callback;

    public RecyclerViewAdapter(List<String> arrayData, Listener callback) {
        this.arrayData = arrayData;
//        this.context = context;
        this.callback = callback;
    }

    @NonNull
    @Override
    public BaseRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);

        if (viewType == 0) {
            return new RecyclerViewHolder(view, callback);
        } else {
            return new RecyclerViewHolder2(view, callback);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseRecyclerView holder, int position) {
        String data = arrayData.get(position);
        holder.bindData(data);
    }

    @Override
    public int getItemCount() {
        return arrayData.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return R.layout.holder_user_name_item;
        } else {
            return R.layout.holder_user_name_item_2;
        }
    }
}
