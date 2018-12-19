package com.monicha.basic_monicha.addapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.monicha.basic_monicha.R;
import com.monicha.basic_monicha.activity.BuahActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuahAdapter extends BaseAdapter {
    String namabuah[];
    int gambarbuah[];
    Activity act;
    int angka;

    //constructor-> untuk mengirim nilai


    public BuahAdapter(BuahActivity buahActivity, String[] namabuah, int[] gambarbuah, int i) {
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
        act = buahActivity;
        angka=i;
    }


    @Override
    public int getCount() {
        return gambarbuah.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //untuk tampilan yang akan kita sisipkan ke layout listview
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LAYANAN membuat sebuah tampilan dalam bentuk popup -> inflater
        LayoutInflater inflater = act.getLayoutInflater();
        if (angka==1) {
            convertView = inflater.inflate(R.layout.tampilanbuah, null);
        } else {
            convertView = inflater.inflate(R.layout.tampilangridbuah, null);
        }
        ViewHolder holder = new ViewHolder(convertView);
        //setdata
        holder.txtnamabuah.setText(namabuah[position]);
        holder.imgbuah.setImageResource(gambarbuah[position]);
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.imgbuah)
        ImageView imgbuah;
        @BindView(R.id.txtnamabuah)
        TextView txtnamabuah;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
