package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.bean.Bean;

import java.util.List;

public class AdAp extends RecyclerView.Adapter<AdAp.ViewH> {
    List<Bean.DataBean.DatasBean> datas;

    public AdAp(List<Bean.DataBean.DatasBean> datas) {
        this.datas = datas;
    }

    @NonNull
    @Override
    public ViewH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_op, null);
        ViewH viewH = new ViewH(inflate);
        return viewH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewH viewH, int i) {
        viewH.tv.setText(datas.get(i).getTitle());
        viewH.tv1.setText(datas.get(i).getNiceDate());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class ViewH extends RecyclerView.ViewHolder {
        TextView tv;
        TextView tv1;
        public ViewH(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            tv1=itemView.findViewById(R.id.tv1);
        }
    }
}
