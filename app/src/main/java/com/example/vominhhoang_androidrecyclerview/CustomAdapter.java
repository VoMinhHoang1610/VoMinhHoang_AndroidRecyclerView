package com.example.vominhhoang_androidrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private List<MyModel> myModelList;
    private SelectListener selectListener;

    public CustomAdapter(Context context, List<MyModel> myModelList) {
        this.context = context;
        this.myModelList = myModelList;
    }

    public void setSelectListener(SelectListener selectListener) {
        this.selectListener = selectListener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_items, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        MyModel myModel = myModelList.get(position);
        holder.txName.setText(myModel.getName());
        holder.txAge.setText(myModel.getAge());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectListener != null) {
                    selectListener.onItemClicked(myModel);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return myModelList == null ? 0 : myModelList.size();
    }
}
