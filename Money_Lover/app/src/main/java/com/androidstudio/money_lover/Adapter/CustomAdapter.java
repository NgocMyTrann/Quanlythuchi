package com.androidstudio.money_lover.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidstudio.money_lover.Model.Thuchilist;
import com.androidstudio.money_lover.R;

import java.util.ArrayList;

/**
 * Created by VS9 X64Bit on 06/04/2018.
 */

public class CustomAdapter extends ArrayAdapter<Thuchilist> {
    private Context context;
    private int resource;
    private ArrayList<Thuchilist> objects;

    public CustomAdapter(Context context, int resource, ArrayList<Thuchilist> objects)
    {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    public int getCount()
    {
        return objects.size();
    }

    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(resource, null);

        TextView tvNoidung = (TextView) view.findViewById(R.id.tv_noidung2);
        tvNoidung.setText(objects.get(i).getNoidung());
        TextView tvSotien = (TextView) view.findViewById(R.id.tv_sotien2);
        tvSotien.setText(objects.get(i).getSotien());
        ImageView imgs = (ImageView) view.findViewById(R.id.icon);
        TextView hinhThuc = view.findViewById(R.id.tv_hinhthuc2);

        if (objects.get(i).getHinhthuc()){
            imgs.setImageResource(R.drawable.icon_thu);
            hinhThuc.setText("Thu");
        }
        else{
            imgs.setImageResource(R.drawable.icon_chi);
            hinhThuc.setText("Chi");
        }

        tvNoidung.setText(objects.get(i).getNoidung());
        tvSotien.setText(objects.get(i).getSotien());
        return view;
    }
}

