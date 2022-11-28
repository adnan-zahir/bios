package com.hafizh.bios;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SiswaAdapter extends ArrayAdapter<Siswa> {
    private Context mContext;
    private int mResourse;

    public SiswaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Siswa> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResourse = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView =layoutInflater.inflate(mResourse,parent,false);

        TextView txtnama = convertView.findViewById(R.id.namasiswa);
        txtnama.setText(getItem(position).getNama());

        return convertView;
    }
}
