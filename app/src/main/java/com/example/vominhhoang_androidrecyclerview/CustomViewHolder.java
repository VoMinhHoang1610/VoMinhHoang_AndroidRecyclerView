package com.example.vominhhoang_androidrecyclerview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView txName;
    public TextView txAge;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        txName = itemView.findViewById(R.id.txName);
        txAge  = itemView.findViewById(R.id.txAge);
    }
}
