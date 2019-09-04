package com.example.icbc;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;



import com.example.icbc.databinding.ItemListBinding;

import java.util.List;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.VH>{

    private OnitemClick onitemClick;
    @NonNull
    @Override
    public FunctionAdapter.VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemListBinding binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),R.layout.item_list,viewGroup,false);

        return new FunctionAdapter.VH(binding.getRoot());
    }
    public interface OnitemClick {
        void onItemClick(int position);
    }
    public void setOnitemClickLintener (OnitemClick onitemClick) {
        this.onitemClick = onitemClick;
    }
    private List<DataBean> mDatas;

    public FunctionAdapter(List<DataBean> data) {
        this.mDatas = data;

    }

    @Override
    public void onBindViewHolder(@NonNull final FunctionAdapter.VH vh, final int i) {
        ItemListBinding binding=DataBindingUtil.getBinding(vh.itemView);
          binding.llLayout.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
               onitemClick.onItemClick(i);
              }
          });


        DataBean data=mDatas.get(i);
        binding.setData(data);
        binding.executePendingBindings();



    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
    class  VH extends RecyclerView.ViewHolder{
        LinearLayout linearLayout;
        public VH(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.ll_layout);


        }
    }

}
