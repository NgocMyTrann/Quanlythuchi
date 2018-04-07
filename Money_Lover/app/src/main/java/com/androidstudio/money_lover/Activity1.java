package com.androidstudio.money_lover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import com.androidstudio.money_lover.Adapter.CustomAdapter;
import com.androidstudio.money_lover.Model.Thuchilist;

public class Activity1 extends AppCompatActivity {
    ListView listView;
    CustomAdapter customAdapter;
    public static ArrayList<Thuchilist> Objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        init();
    }

    public void item_1()
    {
        Intent intent = new Intent(Activity1.this, infoActivity.class);
        startActivity(intent);
    }

    // nãy khộng phải method á, my chạy lại đi
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.them:
                item_1();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void init()
    {
        listView = (ListView) findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.item_list, Objects);
        listView.setAdapter(customAdapter);
    }
}

