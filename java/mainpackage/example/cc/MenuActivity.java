package mainpackage.example.cc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mainpackage.example.cc.R;

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // 메인메뉴 버튼 설정
        Button mainbtn1 = (Button) findViewById(R.id.button2);
        mainbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // 멀베리 버튼 설정
        Button dorm = (Button) findViewById(R.id.dorm);
        dorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DormActivity.class);
                startActivity(intent);
            }
        });

        // 학생식당1층 버튼 설정
        Button food1 = (Button) findViewById(R.id.foodmall1);
        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food1Activity.class);
                startActivity(intent);
            }
        });

        // 학생식당2층 버튼 설정
        Button food2 = (Button) findViewById(R.id.foodmall2);
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food2Activity.class);
                startActivity(intent);
            }
        });

        // 학생식당3층 버튼 설정
        Button food3 = (Button) findViewById(R.id.foodmall3);
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Food3Activity.class);
                startActivity(intent);
            }
        });
    }


}
