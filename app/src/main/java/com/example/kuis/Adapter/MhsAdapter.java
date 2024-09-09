package com.example.kuis.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kuis.R;
import com.example.kuis.model.Produk;

import java.util.List;

public class MhsAdapter extends BaseAdapter {

    private Context context;
    private List<Produk> produkList;

    public MhsAdapter(Context context, List<Produk> produkList) {
        this.context = context;
        this.produkList = produkList;
    }

    @Override
    public int getCount() {
        return produkList.size();
    }

    @Override
    public Object getItem(int position) {
        return produkList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }

        TextView tvNama = convertView.findViewById(R.id.tv_nama);
        TextView tvNomor = convertView.findViewById(R.id.tv_Nomor);
        TextView tvProgram = convertView.findViewById(R.id.tv_program);

        Produk produk = produkList.get(position);

        tvNama.setText(produk.getNama());
        tvNomor.setText(produk.getNomor());
        tvProgram.setText(produk.getProgram());

        return convertView;
    }
}