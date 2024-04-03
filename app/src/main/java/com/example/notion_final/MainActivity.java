package com.example.notion_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button aboutBtn, aboutManitBtn, scheduleBtn, venueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBtn = findViewById(R.id.about);
        aboutManitBtn = findViewById(R.id.manit);
        scheduleBtn = findViewById(R.id.schedule);
        venueBtn = findViewById(R.id.venue);

        // Default frag open
        loadFrag(new AboutFragment(), 0);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new AboutFragment(), 1);
            }
        });

        aboutManitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new AboutManitFragment(), 1);
            }
        });

        scheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new ScheduleFragment(), 1);
            }
        });

        venueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new Venue(), 1);
            }
        });
    }

public void loadFrag(Fragment fragment, int flag) {
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft =fm.beginTransaction();

    if(flag == 0)
        ft.add(R.id.notion, fragment);

    else
        ft.replace(R.id.notion, fragment);

    ft.commit();
}
}