package com.github.coderbuck.covid19;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.coderbuck.covid19.bean.Area;
import com.github.coderbuck.covid19.databinding.ItemRvBinding;

import java.util.ArrayList;
import java.util.List;


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.Holder> {

    List<Area> datas = new ArrayList<>();

    public void setDatas(List<Area> datas) {
        this.datas.clear();
        this.datas.addAll(datas);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvBinding binding = ItemRvBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Area bean = datas.get(position);
        String name = bean.getCountryName();
        int count = bean.getConfirmedCount();
        holder.mTv.setText(name + "  " + count);
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        TextView mTv;

        public Holder(@NonNull ItemRvBinding v) {
            super(v.getRoot());
            mTv = v.tv;
        }
    }
}
