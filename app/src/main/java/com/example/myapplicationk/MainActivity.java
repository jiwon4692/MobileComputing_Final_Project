package com.example.myapplicationk;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplicationk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        LayoutInflater inflater = getLayoutInflater();
        View v1 = inflater.inflate(R.layout.fragment_notifications, null);

        Button button1 = (Button) findViewById(R.id.buttonreset) ;
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkBox3);

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {//라디오박스 이벤트 구현
                //클릭시 실행할부분
                Toast.makeText(MainActivity.this, "초기화되었습니다.", Toast.LENGTH_SHORT).show();

                checkbox.setChecked(false);
                checkbox2.setChecked(false);
                checkbox3.setChecked(false);

            }
        });

        //text = findViewById(R.id.textView4);

        //초기화버튼


/*
        //정보글 텍스트변수
        TextView textView_btn = (TextView) v1.findViewById(R.id.infoscript1);
        textView_btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                //클릭시 실행부분
                finish();

            }
        });
*/


       /* Button button3 = v1.findViewById(R.id.buttontest);
        //Button button4 = findViewById(R.id.buttontest);
        button3.setOnClickListener(new Button.OnClickListener(){
           @Override
          public void onClick(View view) {
              //클릭시 실행부분
            finish();
           }
        });*/

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_setting)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }




    /*protected void onCreate2(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(R.layout.fragment_notifications);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_setting)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
*/




}