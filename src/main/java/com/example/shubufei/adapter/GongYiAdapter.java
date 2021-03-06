package com.example.shubufei.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.icbc.R;
import com.example.icbc.databinding.ItemGongyiBinding;
import com.example.shubufei.DataBean;
import com.example.shubufei.bean.Data;

import java.util.List;

public class GongYiAdapter extends RecyclerView.Adapter<GongYiAdapter.VH>{
    private OnitemClick onitemClick;
    @NonNull
    @Override
    public GongYiAdapter.VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemGongyiBinding binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_gongyi,viewGroup,false);

        return new GongYiAdapter.VH(binding.getRoot());
    }

    private List<Data> mDatas;
    public GongYiAdapter(List<Data> data) {
        this.mDatas = data;
    }

    @Override
    public void onBindViewHolder(@NonNull GongYiAdapter.VH vh, final int i) {
        ItemGongyiBinding binding=DataBindingUtil.getBinding(vh.itemView);
        binding.llLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onitemClick.onItemClick(i);
            }
        });
        Data data=mDatas.get(i);
        binding.setData(data);
        binding.executePendingBindings();



    }
    public interface OnitemClick {
        void onItemClick(int position);
    }
    public void setOnitemClickLintener (OnitemClick onitemClick) {
        this.onitemClick = onitemClick;
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
