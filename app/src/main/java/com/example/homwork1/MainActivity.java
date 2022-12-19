package com.example.homwork1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_naw);
        fragmentContainerView = findViewById(R.id.fragment_container);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment())
                                .commit();
                        break;
                    case R.id.menu_gallery:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GalleryFragment())
                                .commit();
                        break;
                    case R.id.menu_like:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LikeFragment())
                                .commit();
                        break;
                    case R.id.menu_profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment())
                                .commit();
                        break;
                    case R.id.menu_search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SearchFragment())
                                .commit();
                        break;
                }
                return true;
            }
        });


    }
}