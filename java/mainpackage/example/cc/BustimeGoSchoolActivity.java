package mainpackage.example.cc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import mainpackage.example.cc.R;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BustimeGoSchoolActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bustimegoschool);

        Button mainBtn = (Button) findViewById(R.id.mainBtn3);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button wholetime = (Button) findViewById(R.id.wholetime);
        wholetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nsu.ac.kr/?m1=page%25&menu_id=58%25"));
                startActivity(intent);
            }
        });

        Button goschoolBtn = (Button) findViewById(R.id.goschool);
        goschoolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BustimeActivity.class);
                startActivity(intent);
            }
        });





        // TextView 참조
        TextView textView1 = findViewById(R.id.time1);
        TextView textView2 = findViewById(R.id.time2);
        TextView textView3 = findViewById(R.id.time3);
        TextView textView4 = findViewById(R.id.time4);
        TextView textView5 = findViewById(R.id.time5);

        // 현재 시각
        LocalTime now = LocalTime.now();

        // 버스 운행 시작 및 종료 시간
        LocalTime startTime = LocalTime.of(8, 0);
        LocalTime endTime = LocalTime.of(19, 0);

        // 버스 시간표
        List<LocalTime> busTimes = new ArrayList<>();
        busTimes.add(LocalTime.of(8,0));
        busTimes.add(LocalTime.of(8,3));
        busTimes.add(LocalTime.of(8,6));
        busTimes.add(LocalTime.of(8,9));
        busTimes.add(LocalTime.of(8,12));
        busTimes.add(LocalTime.of(8,15));
        busTimes.add(LocalTime.of(8,18));
        busTimes.add(LocalTime.of(8,21));
        busTimes.add(LocalTime.of(8,24));
        busTimes.add(LocalTime.of(8,27));
        busTimes.add(LocalTime.of(8,30));
        busTimes.add(LocalTime.of(8,33));
        busTimes.add(LocalTime.of(8,36));
        busTimes.add(LocalTime.of(8,39));
        busTimes.add(LocalTime.of(8,42));
        busTimes.add(LocalTime.of(8,45));
        busTimes.add(LocalTime.of(8,48));
        busTimes.add(LocalTime.of(8,51));
        busTimes.add(LocalTime.of(8,54));
        busTimes.add(LocalTime.of(9,0));
        busTimes.add(LocalTime.of(9,3));
        busTimes.add(LocalTime.of(9,6));
        busTimes.add(LocalTime.of(9,9));
        busTimes.add(LocalTime.of(9,12));
        busTimes.add(LocalTime.of(9,15));
        busTimes.add(LocalTime.of(9,18));
        busTimes.add(LocalTime.of(9,21));
        busTimes.add(LocalTime.of(9,24));
        busTimes.add(LocalTime.of(9,30));
        busTimes.add(LocalTime.of(9,33));
        busTimes.add(LocalTime.of(9,36));
        busTimes.add(LocalTime.of(9,39));
        busTimes.add(LocalTime.of(9,42));
        busTimes.add(LocalTime.of(9,45));
        busTimes.add(LocalTime.of(9,48));
        busTimes.add(LocalTime.of(9,51));
        busTimes.add(LocalTime.of(9,54));
        busTimes.add(LocalTime.of(9,57));
        busTimes.add(LocalTime.of(10,0));
        busTimes.add(LocalTime.of(10,5));
        busTimes.add(LocalTime.of(10,10));
        busTimes.add(LocalTime.of(10,15));
        busTimes.add(LocalTime.of(10,20));
        busTimes.add(LocalTime.of(10,25));
        busTimes.add(LocalTime.of(10,30));
        busTimes.add(LocalTime.of(10,35));
        busTimes.add(LocalTime.of(10,40));
        busTimes.add(LocalTime.of(10,45));
        busTimes.add(LocalTime.of(10,50));
        busTimes.add(LocalTime.of(10,55));
        busTimes.add(LocalTime.of(11,0));
        busTimes.add(LocalTime.of(11,5));
        busTimes.add(LocalTime.of(11,10));
        busTimes.add(LocalTime.of(11,15));
        busTimes.add(LocalTime.of(11,20));
        busTimes.add(LocalTime.of(11,25));
        busTimes.add(LocalTime.of(11,30));
        busTimes.add(LocalTime.of(11,35));
        busTimes.add(LocalTime.of(11,40));
        busTimes.add(LocalTime.of(11,45));
        busTimes.add(LocalTime.of(11,50));
        busTimes.add(LocalTime.of(11,55));
        busTimes.add(LocalTime.of(12,0));
        busTimes.add(LocalTime.of(12,5));
        busTimes.add(LocalTime.of(12,10));
        busTimes.add(LocalTime.of(12,15));
        busTimes.add(LocalTime.of(12,20));
        busTimes.add(LocalTime.of(12,25));
        busTimes.add(LocalTime.of(12,30));
        busTimes.add(LocalTime.of(12,35));
        busTimes.add(LocalTime.of(12,40));
        busTimes.add(LocalTime.of(12,45));
        busTimes.add(LocalTime.of(12,50));
        busTimes.add(LocalTime.of(12,55));
        busTimes.add(LocalTime.of(13,0));
        busTimes.add(LocalTime.of(13,5));
        busTimes.add(LocalTime.of(13,10));
        busTimes.add(LocalTime.of(13,15));
        busTimes.add(LocalTime.of(13,20));
        busTimes.add(LocalTime.of(13,25));
        busTimes.add(LocalTime.of(13,30));
        busTimes.add(LocalTime.of(13,35));
        busTimes.add(LocalTime.of(13,40));
        busTimes.add(LocalTime.of(13,45));
        busTimes.add(LocalTime.of(13,50));
        busTimes.add(LocalTime.of(13,55));
        busTimes.add(LocalTime.of(14,0));
        busTimes.add(LocalTime.of(14,5));
        busTimes.add(LocalTime.of(14,10));
        busTimes.add(LocalTime.of(14,15));
        busTimes.add(LocalTime.of(14,20));
        busTimes.add(LocalTime.of(14,25));
        busTimes.add(LocalTime.of(14,30));
        busTimes.add(LocalTime.of(14,35));
        busTimes.add(LocalTime.of(14,40));
        busTimes.add(LocalTime.of(14,45));
        busTimes.add(LocalTime.of(14,50));
        busTimes.add(LocalTime.of(14,55));
        busTimes.add(LocalTime.of(15,0));
        busTimes.add(LocalTime.of(15,5));
        busTimes.add(LocalTime.of(15,10));
        busTimes.add(LocalTime.of(15,15));
        busTimes.add(LocalTime.of(15,20));
        busTimes.add(LocalTime.of(15,25));
        busTimes.add(LocalTime.of(15,30));
        busTimes.add(LocalTime.of(15,35));
        busTimes.add(LocalTime.of(15,40));
        busTimes.add(LocalTime.of(15,45));
        busTimes.add(LocalTime.of(15,50));
        busTimes.add(LocalTime.of(15,55));
        busTimes.add(LocalTime.of(15,58));
        busTimes.add(LocalTime.of(16,0));
        busTimes.add(LocalTime.of(16,3));
        busTimes.add(LocalTime.of(16,5));
        busTimes.add(LocalTime.of(16,8));
        busTimes.add(LocalTime.of(16,10));
        busTimes.add(LocalTime.of(16,12));
        busTimes.add(LocalTime.of(16,15));
        busTimes.add(LocalTime.of(16,18));
        busTimes.add(LocalTime.of(16,20));
        busTimes.add(LocalTime.of(16,22));
        busTimes.add(LocalTime.of(16,25));
        busTimes.add(LocalTime.of(16,27));
        busTimes.add(LocalTime.of(16,30));
        busTimes.add(LocalTime.of(16,32));
        busTimes.add(LocalTime.of(16,35));
        busTimes.add(LocalTime.of(16,37));
        busTimes.add(LocalTime.of(16,40));
        busTimes.add(LocalTime.of(16,42));
        busTimes.add(LocalTime.of(16,45));
        busTimes.add(LocalTime.of(16,47));
        busTimes.add(LocalTime.of(16,50));
        busTimes.add(LocalTime.of(16,53));
        busTimes.add(LocalTime.of(16,55));
        busTimes.add(LocalTime.of(17,0));
        busTimes.add(LocalTime.of(17,3));
        busTimes.add(LocalTime.of(17,5));
        busTimes.add(LocalTime.of(17,8));
        busTimes.add(LocalTime.of(17,10));
        busTimes.add(LocalTime.of(17,13));
        busTimes.add(LocalTime.of(17,15));
        busTimes.add(LocalTime.of(17,17));
        busTimes.add(LocalTime.of(17,20));
        busTimes.add(LocalTime.of(17,22));
        busTimes.add(LocalTime.of(17,25));
        busTimes.add(LocalTime.of(17,27));
        busTimes.add(LocalTime.of(17,30));
        busTimes.add(LocalTime.of(17,32));
        busTimes.add(LocalTime.of(17,35));
        busTimes.add(LocalTime.of(17,37));
        busTimes.add(LocalTime.of(17,40));
        busTimes.add(LocalTime.of(17,42));
        busTimes.add(LocalTime.of(17,45));
        busTimes.add(LocalTime.of(17,47));
        busTimes.add(LocalTime.of(17,50));
        busTimes.add(LocalTime.of(17,52));
        busTimes.add(LocalTime.of(17,55));
        busTimes.add(LocalTime.of(17,57));
        busTimes.add(LocalTime.of(18,0));
        busTimes.add(LocalTime.of(18,2));
        busTimes.add(LocalTime.of(18,5));
        busTimes.add(LocalTime.of(18,7));
        busTimes.add(LocalTime.of(18,10));
        busTimes.add(LocalTime.of(18,12));
        busTimes.add(LocalTime.of(18,15));
        busTimes.add(LocalTime.of(18,17));
        busTimes.add(LocalTime.of(18,20));
        busTimes.add(LocalTime.of(18,22));
        busTimes.add(LocalTime.of(18,25));
        busTimes.add(LocalTime.of(18,30));
        busTimes.add(LocalTime.of(18,35));
        busTimes.add(LocalTime.of(18,40));
        busTimes.add(LocalTime.of(18,45));
        busTimes.add(LocalTime.of(18,50));

        if (now.isBefore(startTime) || now.isAfter(endTime)) {
            textView1.setText("현재 버스가 없습니다.");
            textView2.setText("");
            textView3.setText("");
            textView4.setText("");
            textView5.setText("");
        } else {
            // 다음 다섯 대 버스를 저장할 리스트
            List<LocalTime> nextBuses = new ArrayList<>();

            // 현재 시각 이후의 버스
            for (LocalTime busTime : busTimes) {
                if (busTime.isAfter(now)) {
                    nextBuses.add(busTime);
                    if (nextBuses.size() == 5) {
                        break;
                    }
                }
            }

            // 남은 시간 계산 및 TextView에 설정
            if (nextBuses.isEmpty()) {
                textView1.setText("현재 버스가 없습니다.");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                textView5.setText("");
            } else {
                for (int i = 0; i < nextBuses.size(); i++) {
                    LocalTime busTime = nextBuses.get(i);
                    Duration duration = Duration.between(now, busTime);
                    long minutesLeft = duration.toMinutes();
                    String message = "버스 시간: " + busTime + " - " + minutesLeft + "분 남았습니다.";

                    switch (i) {
                        case 0:
                            textView1.setText(message);
                            break;
                        case 1:
                            textView2.setText(message);
                            break;
                        case 2:
                            textView3.setText(message);
                            break;
                        case 3:
                            textView4.setText(message);
                            break;
                        case 4:
                            textView5.setText(message);
                            break;
                    }
                }

                // 남은 TextView를 초기화
                if (nextBuses.size() < 5) {
                    if (nextBuses.size() < 4) {
                        textView5.setText("");
                    }
                    if (nextBuses.size() < 3) {
                        textView4.setText("");
                    }
                    if (nextBuses.size() < 2) {
                        textView3.setText("");
                    }
                    if (nextBuses.size() < 1) {
                        textView2.setText("");
                    }
                }
            }
        }


    }

}
