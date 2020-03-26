package com.github.coderbuck.covid19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.Holder> {

    List<AreaData.ResultsBean> datas = new ArrayList<>();

    public void setDatas(List<AreaData.ResultsBean> datas) {
        this.datas.clear();
        this.datas.addAll(datas);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        AreaData.ResultsBean bean = datas.get(position);
        String name = bean.getCountryName();
        int count = bean.getConfirmedCount();
        holder.mTv.setText(name + "  " + count);
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv) TextView mTv;

        public Holder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
