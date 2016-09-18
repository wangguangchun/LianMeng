package com.example.johe.lianmengdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author：Administrator on 2016/9/18 12:16
 */
public class MyAdapter_me_listView extends BaseAdapter {
    Context context;
    ArrayList<HashMap<String, Object>> mData;

    public MyAdapter_me_listView(ArrayList<HashMap<String, Object>> pData, Context context) {
        this.mData = pData;
        this.context = context;
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder _holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.me_list_item, null);
            _holder = new ViewHolder(view);
            view.setTag(_holder);
        } else {
            _holder = (ViewHolder) view.getTag();
        }

        return view;
    }

    static class ViewHolder {
        @Bind(R.id.img_JSXX_me_list_itme_me_list_itme)
        ImageView imgJSXXMeListItmeMeListItme;
        @Bind(R.id.img_A_me_list_item)
        ImageView imgAMeListItem;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
