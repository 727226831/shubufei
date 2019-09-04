package com.example.shubufei.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.icbc.R;
import com.example.icbc.databinding.ItemCmakelineBinding;
import com.example.shubufei.DataBean;

import java.util.List;

public class cMakeLineAdapter extends RecyclerView.Adapter<cMakeLineAdapter.VH>{
    private OnitemClick onitemClick;
    @NonNull
    @Override
    public cMakeLineAdapter.VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemCmakelineBinding binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_cmakeline,viewGroup,false);

        return new cMakeLineAdapter.VH(binding.getRoot());
    }

    private List<DataBean> mDatas;
    public cMakeLineAdapter(List<DataBean> data) {
        this.mDatas = data;
    }

    @Override
    public void onBindViewHolder(@NonNull cMakeLineAdapter.VH vh, final int i) {
        ItemCmakelineBinding binding=DataBindingUtil.getBinding(vh.itemView);
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
