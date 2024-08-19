package mainpackage.example.cc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mainpackage.example.cc.R;

public class ElimActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elim);

        Button mainBtn = (Button) findViewById(R.id.mainbtn);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button elimpageBtn = (Button) findViewById(R.id.button3);
        elimpageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elimdorm.nsu.ac.kr/?m1=home%25"));
                startActivity(intent);
            }
        });
    }
}
