package com.ice.flexlayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayoutManager;

/**
 * Created by Administrator on 2017/3/30.
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {
    private String[] names;
    public DemoAdapter(String[] names){
        this.names=names;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ViewGroup.LayoutParams lp=holder.tv.getLayoutParams();
        if(lp instanceof FlexboxLayoutManager.LayoutParams){
            FlexboxLayoutManager.LayoutParams flexboxLp= (FlexboxLayoutManager.LayoutParams) holder.tv.getLayoutParams();
            flexboxLp.setFlexGrow(1.0f);
        }
        holder.tv.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
