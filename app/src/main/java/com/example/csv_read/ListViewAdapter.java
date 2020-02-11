package com.example.csv_read;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<ListData> {
    private LayoutInflater layoutInflater;

    public ListViewAdapter(Context context, int resource, List<ListData> objects) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListData data = getItem(position);
        if (null == convertView) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }

        TextView idText;
        TextView cdateText;
        TextView int01Text;
        TextView int02Text;
        TextView int03Text;
        TextView int04Text;
        TextView int05Text;
        TextView int06Text;
        TextView int07Text;
        TextView int08Text;

        idText = (TextView)convertView.findViewById(R.id.id);
        cdateText = (TextView)convertView.findViewById(R.id.cdate);
        int01Text = (TextView)convertView.findViewById(R.id.int01);
        int02Text = (TextView)convertView.findViewById(R.id.int02);
        int03Text = (TextView)convertView.findViewById(R.id.int03);
        int04Text = (TextView)convertView.findViewById(R.id.int04);
        int05Text = (TextView)convertView.findViewById(R.id.int05);
        int06Text = (TextView)convertView.findViewById(R.id.int06);
        int07Text = (TextView)convertView.findViewById(R.id.int07);
        int08Text = (TextView)convertView.findViewById(R.id.int08);

        idText.setText(data.getId());
        cdateText.setText(data.getCdate());
        int01Text.setText(data.getInt01());
        int02Text.setText(data.getInt02());
        int03Text.setText(data.getInt03());
        int04Text.setText(data.getInt04());
        int05Text.setText(data.getInt05());
        int06Text.setText(data.getInt06());
        int07Text.setText(data.getInt07());
        int08Text.setText(data.getInt08());

        return convertView;
    }
}
