package mainpackage.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mainpackage.example.cc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 메인메뉴 버튼 설정
        Button mainbtn1 = (Button) findViewById(R.id.mainBtn1);
        mainbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // 공학관 시간표 버튼 설정
        Button timeBtn = (Button) findViewById(R.id.roomtime);
        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RoomtimeActivity.class);
                startActivity(intent);
            }
        });

        // 셔틀버스 시간표 버튼 설정
        Button busBtn = (Button) findViewById(R.id.bustime);
        busBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BustimeActivity.class);
                startActivity(intent);
            }
        });

        // 학생식당 메뉴 버튼 설정
        Button foodBtn = (Button) findViewById(R.id.foodmenu);
        foodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

        // 지도 버튼 설정
        Button mapBtn = (Button) findViewById(R.id.introBuilding);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });
    }
}