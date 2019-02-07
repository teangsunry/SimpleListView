package com.cam.calendar.listview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.cam.calendar.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onSetUpListView();
    }

    private void onSetUpListView() {
        ListView myListView = (ListView) findViewById(R.id.lvCountry);
        String[] country = new String[]{
                "Cambodia",
                "Thailand",
                "Vietnam",
                "China",
                "South-Korea",
                "North-Korea",
                "USA",
                "Turkey"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, country);
        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String title = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),""+title,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
