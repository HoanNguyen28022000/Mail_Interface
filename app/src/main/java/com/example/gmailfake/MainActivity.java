package com.example.gmailfake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel> data;
    ListView list_mail;
    private GmailAdapter gmailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= (ListView)findViewById(R.id.list_mail);

        data = new ArrayList<DataModel>();

        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Nam", "Xin Di Lam","De them thu nhap", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));
        data.add(new DataModel("Hoan", "Xin Nghi Hoc","Do gia dinh co viec", "11/3/2020"));

        gmailAdapter = new GmailAdapter(data , this);

        listView.setAdapter(gmailAdapter);

    }
}