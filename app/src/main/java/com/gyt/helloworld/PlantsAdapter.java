package com.gyt.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PlantsAdapter extends BaseAdapter {

    public PlantsAdapter(ArrayList<Plants> plantsArrayList, Context context) {
        this.plantsArrayList = plantsArrayList;
        this.layoutInflater = layoutInflater.from(context);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public int getCount() {
        return plantsArrayList == null ? 0 : plantsArrayList.size();
    }

    @Nullable
    @Override
    public Plants getItem(int position) {
        return plantsArrayList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 创建视图
        View view = layoutInflater.inflate(R.layout.plant_list, null);
        Plants plants = (Plants) getItem(position);

        //在view 视图中查找 组件
        TextView name = (TextView) view.findViewById(R.id.plant_name);
        TextView intro = (TextView) view.findViewById(R.id.plant_intro);
        ImageView src = (ImageView) view.findViewById(R.id.plant_src);

        //为Item 里面的组件设置相应的数据
        name.setText(plants.getName());
        intro.setText(plants.getIntroduce());
        src.setImageResource(plants.getSrc());

        //返回含有数据的view
        return view;

    }

    private ArrayList<Plants> plantsArrayList;
    private LayoutInflater layoutInflater;
}
