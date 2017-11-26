package com.landtanin.oxfordhackkkkk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by landtanin on 15/09/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    private ArrayList<ItemDTO> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<ItemDTO> arrayList) {

        this.arrayList = arrayList;

    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {

//        holder.ID.setText(Integer.toString(arrayList.get(position).getId()));
//        holder.NUMBER.setText(arrayList.get(position).getNumber());

        holder.filename.setText(arrayList.get(position).getFileName());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder {

        TextView filename;

        public MyViewholder(View itemView) {
            super(itemView);

            filename = itemView.findViewById(R.id.txtId);

        }

    }


}
