package com.demo.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.recyclerviewdemo.R;
import com.demo.recyclerviewdemo.VO.AndroidVO;

import java.util.List;

/**
 * Created by Jrtou on 2017/5/18.
 */

public class RecyclerViewDemoAdapter extends RecyclerView.Adapter<RecyclerViewDemoAdapter.ViewHolder> {
    int[] image = new int[]{R.drawable.beta, R.drawable.one, R.drawable.cupcake, R.drawable.donut,
            R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.ice_cream_sandwich, R.drawable.jelly_bean, R.drawable.kitkat, R.drawable.lollipop,
            R.drawable.marshmallow, R.drawable.nougat, R.drawable.o};

    private List<AndroidVO> mAndroidVOList;

    public RecyclerViewDemoAdapter(List<AndroidVO> androidVOList) {
        mAndroidVOList = androidVOList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_demo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvVersion.setText(mAndroidVOList.get(position).getVersion());
        holder.ivLogo.setImageResource(image[position]);
        holder.etMemo.setText(mAndroidVOList.get(position).getMemo());
    }

    @Override
    public int getItemCount() {
        return mAndroidVOList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivLogo;
        TextView tvVersion;
        EditText etMemo;

        public ViewHolder(View itemView) {
            super(itemView);
            ivLogo = (ImageView) itemView.findViewById(R.id.iv_AndroidLogo);
            tvVersion = (TextView) itemView.findViewById(R.id.tv_AndroidVersion);
            etMemo = (EditText) itemView.findViewById(R.id.et_AndroidMemo);
        }
    }
}
