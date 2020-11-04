package com.example.gmailfake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class GmailAdapter extends ArrayAdapter<DataModel> {
    public ArrayList<DataModel> data;
    public Context context;

    private static class ViewHolder {
        TextView txt_sender;
        TextView txt_title;
        TextView txt_content;
        TextView txt_time_recieve;
    }


    public GmailAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.mail_layout2, data);
        this.data=data;
        this.context=context;
    }
    @Override
    public View getView(int position, @NonNull View convertView,@NonNull ViewGroup parent) {
        DataModel dataModel= getItem(position);
        View view = super.getView(position, convertView, parent);
            ViewHolder viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.mail_layout2, parent, false);
            viewHolder.txt_sender =  convertView.findViewById(R.id.txt_sender);
            viewHolder.txt_title =  convertView.findViewById(R.id.txt_title);
            viewHolder.txt_content =  convertView.findViewById(R.id.txt_content);
            viewHolder.txt_time_recieve =  convertView.findViewById(R.id.txt_time_recieve);

            viewHolder.txt_sender.setText(dataModel.getSender());
            viewHolder.txt_sender.setText(dataModel.getSender());
            viewHolder.txt_sender.setText(dataModel.getSender());
            viewHolder.txt_sender.setText(dataModel.getSender());

            view.setTag(viewHolder);
            return view;
    }

}
