package mainpackage.example.cc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import mainpackage.example.cc.R;

import java.util.List;

public class RoomtimeActivity extends AppCompatActivity {

    private List<String> pdfFiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roomtime);

        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);
        Spinner spinner6 = findViewById(R.id.spinner6);
        Spinner spinner7 = findViewById(R.id.spinner7);
        Spinner spinner8 = findViewById(R.id.spinner8);
        Spinner spinner9 = findViewById(R.id.spinner9);
        Spinner spinner10 = findViewById(R.id.spinner10);
        Spinner spinner11 = findViewById(R.id.spinner11);
        Spinner spinner12 = findViewById(R.id.spinner12);

        // Spinner1 아이템 설정
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names1,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names2,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names3,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names4,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names5,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names6,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names7,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);

        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names8,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);

        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names9,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter9);

        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names10,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adapter10);

        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names11,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adapter11);

        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(
                this,
                R.array.pdf_names12,  // res/values/arrays.xml에서 정의한 PDF 파일 이름 배열
                android.R.layout.simple_spinner_item
        );
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12.setAdapter(adapter12);

        spinner1.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if(position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/17dum9zekeC70t86b6rMWca3hj7vw6VwF/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1jGGLqok_RfYOeh9ABBv6pErmUImFoCSO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/19uifXdG06EH0g5yTyC3xSqK4aht5A3gz/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15ouAnyMU-Xcp1lc6UA1bgma8U7hGQFbB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/13uwDB-m4KyDyKmSF7H6GlU8_DkfYVVCq/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Y45Z8vllXtY3pIC8I-znZ54-Z3JSI42K/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16clw5WZ3Dn3zj9VkdxylIoN8fmHuUZaq/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nu146uchCocI_KsNwJZyH8YSZj7EjbHk/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1l96xl5yJQojsD3TpzznW4dfQZTzRVUCi/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10aLNjEfvy1T8xWhCZfLHMnDorf0suFwf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1hE_Sh4AcGNkp4wjyqZB8Aj3SKwhuXeZp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Ia0v5gLG1bDfRvslQV0Y-EIJb1xb7_lL/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1xNJ9cD8gtMPcGhESyaxPX1WMBHat40Wm/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1HmeQTNUTJCIDl9QFKh1FHHk15Ij7b9lg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1qw11o3oM-V9vQ24NFqyQ-6lovg1jQlbL/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1UyAwNdhNZt46DkmHGhmGhVkrQcVI-kQw/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1skQxs580w_u3ouO2S3ZEr_b29vtR_H2n/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10FItBOMaCkRDJSlT4U6_fjicTRkSaUqj/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1VwtTahlaVKDwdZZMgfunVOp6Bf4oxuHV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1RJ4rV-7PHEGmt-MgTxFTTLUw9JhbBhoW/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });


        spinner2.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if(position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Qr96U5hujGbH8eEqrD_TIZu2_4nhdul-/view?usp=sharing"));
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16XZIAW-qn2VV-yFvECLAKpm1pt9W4fFs/view?usp=drive_link"));
                    startActivity(intent);
                }if(position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wdmEdh5WGgGdvcfWagDcc4lC05SaBK3L/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1iY6AYShH0YmDLMuENID2gvb4KMBm4YSV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1E9ix5SL1EnvuJI64TqTv318oiUW0mBjS/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11eWUcff_0rDvUsQJXU44038ySqdWCRnr/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_aHwXPrmG5tRAZLgfM6Jkv5cS5ygNjOg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1AYzlxSq6qdLcN5nENyNH8ld9O9QQIIOF/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1n5bUxOepTd7R_Z8RqNx070RIVgdDa9_x/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1OXPN4_xuFqhY8BJk-oGuUETKiCH_t89S/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Yyy_KBUw7wcaYfHYLZDzzDS_WTMWSWPQ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16Pt5_oBcGCek1v0TvUs3ezVXQAlJy1Jp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1xLA8QusLsiw4Z1YKfeuXlXKSHfqK4i_8/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1HTWpv9ZfNF1uw2G-rUAo_eguMhYzVRmn/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1DTY-ynHSq3vLRJSlGuj93j8hEbkrRZRl/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1G9y3ee3_szK19M4n5fice6271WtmPHCM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1swtmRCeOt7abm-4pyczXug6lvRApv4dM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_vsBizEYPMMzXDhZNyZMtKDtqsmLwrZM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1S6OjPmcm2ijERrj1wFMkY9sYVWHFukMl/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10n5eYNk75cW5Ihvnh1PnjgfNwy--joJ6/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15OKVAOTDMX11uhPOOMmkdZCKxGAxoRW0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Yx_rT9sBIBLgBEoelVQ1MZ3FsGp2d-K1/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1eEiP3_ggBMjJTg5nKWn0V-jb-XYVwhfU/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/12oCqcOTj_5CBegxTrzJhYvMU7AX0mNPR/view?usp=drive_link"));
                    startActivity(intent);
                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner3.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if(position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Wshv4r0Ne80NVPDagnsP1Ih5Lch9B_4e/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1vJD8dU5JIklyNI0PeIIYelm1xPLcKEdJ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1X7ci1rJy2oBSNHyWMjwVbdEgXT9NIGF-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/148I9dEymNkgP4q-NA4Ldu8JGGDhej6dU/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1B7gh4fZG6whOk2D7v4z-RgI8j2mbeD2T/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14TZHBlAfTHM8IIeLixkU49LfIlyZGsVH/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14LircBGx3GrQAe0y7ubXCvpVSFKex4DM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1HEZt09NQx01A2uQhq5EhWo98SZ5iGkGV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15k-3v0c-6nCC24qL9svjvZ6Zy1DYuJTF/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1YNLICdmTaBEwQ3AnkYOIiEjvdOraIms3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1uRPuJwUP3MPFi_Z0hL3KvzJvpUoriAtW/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1FFDb_4CfvpEIIYcbj-4auzE5yqXtI2Iv/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1NVmi1wTMjj5QfBy_2STKJFSo58ShlcvP/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1FDrPxiznes7iue_dIGkv4j0xRny_XhRx/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1mhoU-d52bey-Otp49Tx0H_52DBffDcnO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1mhoU-d52bey-Otp49Tx0H_52DBffDcnO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nDHCCrbgE7Vsm7_hhCzRurPQNinZMKnV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1NthYNPOUS-oB3En-nUjLn0CiD6dvSCap/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1zTHsik7sFKDziKUPZXQboID24nP1m_f3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1OKLosRS62ODGK4o6dtTRyKVb4rdVveDd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11kWTEn9iebLnkJByrDO6GIdvz7vS38xY/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1FuqcqaQw8Yfrw95atTdwS3aqg-a4sQlV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1y6LU5FmpMPPmkVfzGmzI78bWlC_nPylm/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1HQeYda_9Qr4l_4ANqfmAhgC4NAcWup6I/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wsQuFP038mUtbNUlsSiO_DBCZguUeQ7P/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 26) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1LB13T6j8ZL2Rqnj8OUNd1DTktDIgIEWO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 27) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/137XER0iFXS6cZIVMSx-leRn4OT66FDwL/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 28) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nXdoWIJZ1XUS-4TnOOsODTPYGdXTBbIK/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 29) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1NGlEe2NlDEe4L6ws_1-jSj0TJCHVB24r/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 30) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11N4Hq7Plp2xw374XbTDVO4RoeiG1K7Ak/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 31) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1q53V5rM-1VeS-Dj-Z3N0_UK5_Uf66aB4/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 32) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1TvVOHAWGW87yiKy4K2QIaujhHt6QwjiH/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 33) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1h0lmT-xrlkY7S2-f8_9zIxTgrV4Zdc2y/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 34) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1EE8VV_s2Yn4klucqjigjkSDwjfBB0HS2/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 35) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1iGcj7RhyjKMcbd8c_i2qbJXJZz_a7xYD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 36) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1cceF9qkKEa499HTzZ1f7aV5KCeXEYBEd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 37) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1hnxCx37VVlnQ0PnVepGtWVnZANroGvxp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 38) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1yvprNGTJF-_b7t9ur7ERWsfBKAqj0ERF/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 39) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1bBO44RcDe3c8zYpZzuiSyPbJheDiFyB4/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 40) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15m00Le1KgNs8Q1Cywk8h4R4MBP2Vnur8/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 41) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1QGukZgqvoNvB_rD34dkEOqEuZhf5bxaS/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 42) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1exvq5nsTzYXeuh-ehqLhAnLNFkyGKWXZ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 43) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1OAh8g8tIGgaMRhP0jQ27jl96h2Sbwa1i/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 44) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1udLFUGprzx7BEto_nm2EerbBt6oC93SI/view?usp=drive_link"));
                    startActivity(intent);
                }
                if(position == 45) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10yblvUhNNVm9junnakktpAoEuJk3ZZTT/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner4.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ERqJ51wKzGLpTL21pVP8N2wIEXZcAwne/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1I5Y5fLxJM3vbKFxYjSSYjc4-he0GnRsg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wWIwShzJenikeSIeZUeMGtFydVI4f4DW/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1M8UW06o0vV0BOl2KdZog-2LlLnzOmum-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Wzy0buUNRW0KDOZKdUlfBQ-k1Q6Gi8_k/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1tPmGdpU0kGYaxmi0udt_odp3r3P1bWr7/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nPdDNY8GBc3toX2GWyZOmfD19bOzkvr_/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1TZh6J4sXiXZPmkZTeB-HJ5LvzPOn61iO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14gLQDw5-KLl4am9MXK34z41oQinzyCjh/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1KA4VSKne0IVs0ohXByhzfaNdO98GtYwb/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14lQNGqGxsAT3ELiAaZBzTW2P2G357WRc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1b5UjZ7x9G16mOckl836rr8W_XkgM6vQ_/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1R1J7ojHYfXREYyXidfCCtCy0FzXJC54h/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/177sW_YLGVHpwXTHKLnGGKtY2JUgQc1mJ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14SyL2T_erdGXAHWxxeakl1LEJvuxCbvC/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1dhcYwZFLQMGr9ROixOn3d9QzZfpGZsWk/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Hi2g4RxPyKPNNHj3m4X_RG-rPG9M1bzf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1dCQ_DcKdW9YwK4HhUO1nwdvf92qFYO4r/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wXbeb9TT8xPUryZZQLyDxAKYivwBGQeK/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1EIrCg_HL-T4iakL44NYVzM70PyUXi7hC/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1XbrHc7az-bBDSza1quU22rBBTLueD9er/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/17SRiSTcT5ViQFJ1Z45ISk_hY0_W1Cj2x/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1R8dzbSkWucegQHDm5PP-Av78LPlGM5vo/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1eDpI3CWWcuCKk30IRwV4ni3MO3tGhmMl/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kOk9ByXpWvSOsdIkVgJgGzFRG8MQqwQe/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Uo6g8gRUi0wZ81Q36ZZJAPh_PwRQll-L/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kFipIC2sdEji4MW3EZYA6ZYbuNL83jX8/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1yHBw8Ml2e4ePkgocDhrqr6Y63inUL5dD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1LECDPF9XBxGR_EBxrDJ3E-EnWmImjGkG/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1LECDPF9XBxGR_EBxrDJ3E-EnWmImjGkG/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1aOf8j9p6DBzMwYeKoI_oZKXMvMFKvldM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1oGwYeJ2BpSR6K1nqmeYD6KsvmN7nubNB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14WZn_n-d2OwHB1dyZm0TjsYVYCOx_Qgs/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1yDXFvjPkNPQTF8a0ICpTVoodeJka2hTF/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16BvzjpOjxFKZUxNQsPcUQsgMe25-7a_o/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1b7g9Y0hDRro-ssPk671kA2mTrdI4wrPm/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1PYj3qNwZqs3QXs2Bl0yxpY0msULz00QE/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1S7F9ubgYYwmzElmCYBLAMsUvGmCthx_e/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1xzpAl0lK-lUy8EK24F6Fe7bO5OfqjC2V/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kq6HAjyaOVqaoqZYo6ascW5nJCW0addx/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1YvfKY11ukd19BTFoZF-MB2oyduRlKy0b/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ZtqvI6wpbMrCUfIxvmZ-yjYo0XITDJOD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 43) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15IiNYMe7QdN8hoOLYgaDzi--Ec7m8V0c/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner5.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1PLCSP0P0y0WGId00GK-2uEMzpujztFWf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1KusJYIoUcFfJEjdHi7qUIO1FFi2oaG41/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1u7LfTKz6cJSgXzWMyl_J48ju753yemdo/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15KZcrasDU-fG5aamhfsvd7pRjA3QR2Lc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wTHqdBBOawCtEeSL2gbdeO8RjqP0kjw2/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1x9qvcxMRnjcQRZKEX36IKFbbOrvGorsa/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1G4Agr60yFWsOHMCTIkNrlsChYnwi84Kj/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1moiN20hg56zw91mKOFaeirIftFZh1-GM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1tUSJrXiW60WtTtGTRWKX5M3m-QZx7JOh/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/12gnFfPxdarNs33xlzsl6PiXvYCjTCRzP/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wpXGVOWq3B_1FhxFqqSPEXQvefyEjL_0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1os2eJLD4G3VJmxaffaiFvmJOQ0YG6xf6/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1tUSJrXiW60WtTtGTRWKX5M3m-QZx7JOh/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1sTzDfUQSO4mXMJMbW8Pd1k2ASy7TpIp8/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14B52JeXJn9BHOqDJb8fvjKpUZILLcN9L/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Ft_JspSDcc6ei_QAJyyZuDQ-oW97S_rc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1mbsY4dt246Kpcikyf5rJcYe9HAJ9YCf8/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1PWmkcBfenkeh92BYNeqi1G-CnpXaPKD3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1eUkho8rX99l7qfOD6tjOhTS5NN1Ia8cG/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1BncchfnpUmZsX7DXPylYNbZJ2emVd9M-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1v_aa1IDXvSWUzT_PB2E_9CB6zpOSKhOv/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1g1v2fYg7TEB0mxvKhB718IL-NCLrR9k2/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/13XQMFcqK1LfNhS5rFv__h0AeKus-_fqd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1dih_TxovYk1Nn6VGMebJJs0GhpMVCvUn/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1K2wSADMTqdBuRFcV7xREPlwhnaptcCbr/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ftgSOZD9KjtpaI0ww3aaqGIzYOhLaooN/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1r8o5WDZGlb9RqLVPaJzwkY9mDbmyTnmO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Vvx9schaZXVsgy4mvDdRG1903g0LoGr0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1zl89njPUZCokDFobFkc1j5NjO8aIIIWR/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1rz0ZwTqI8AkguWUK_FWiMUKKsaYCgOR3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1-f7WoUDldxGB1yOImN_mby5iDOOiWpR7/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1JX_i-q7UypqfMR6qTlyeBqu_VJuC9a2L/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1mRuH3EXswCmcpGWnt9Erwu-11Zztd7vi/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1VgkIqQDCRJ-7DSHqVrdSipKhW65Q_y8a/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/17ONIf9CcitGd0Kfykt8z3oNxgLROXbrj/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1dkjt6TATpAiOYpRMXpGoz3rtjD9Awxd5/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1e0NdU9z27OmTZD_xaXqsQ--dF1TS93vI/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1bLtmqIG99Cm6DU2qLuh1S6pTBEUD0lzn/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1lbzCBOYCZoNn-bVa0fJlVAoVwJWh7ieP/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/12cYe4mzvpvYxJEs-d2zzs_7HCQvZg2fp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1petrgInnabVcj4VrS1heaoX5Bi_2dAQR/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner6.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1BkxbiEGWePO1WvC2Nd3CDHdmE3c6TuDZ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10fVOQ2FuvK-ZMiWj-gp7eVFUoL8NkF4o/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner7.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Q-ewsZKpR98B5PdCdK2JjKdgkAExzz3B/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15DUDczyqlex02A8VDHgNIFpvwlrpFnSn/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1k6VxDTiVmB8de4-7gw9xHEYoNsozIMar/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1IfuoiXSJU0tfuQ22UqXNuj5eRk9DX8cr/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1D1e-xpNMdglEIHN2PiULgFscZvUY6fNO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1DY1Ta3-tBgGtTxCDqj-jqbQeU31odbOT/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1RoIEVlO0WCIBrtuuK9aaA4eWWW4hzheu/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1YVpQ-lLjMM1TrblKBJ6LOtqR9G-q5epJ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/110aUWKUPOHyNhQsI1SalBXqjd_o0DN6i/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Z-YNR9fOSOh5Rp9qMx85D-kf756EqL5q/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1u7Tcvylt1ZB43uDhbz-_X5TIbOrg_SxD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1dl1Hmn35oAbKVmajFKLXIBYoLSz87CJa/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1-3ymXa6nKNhlM6ps3dsdXL5hV2s_gC4O/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1-FecFieXkb4mH7FBn2hV_DtE5qvNqNTj/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1sCC5xJV7qhWAMzvsoYI8dYkk-KrRG9pR/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1h2WdAgAd9UtBN9ZXz_yfPvnmR9LyV5Hl/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });


        spinner8.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1LrIfd6myUTjKe5Hnh7gsv9iBWQ6dViJf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_kAfoYFS0BDfFCBEN45qlYCf6dmfFCNg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1KCHG1K6SK0gqyGq80XqpR2uiKXZ8bcTi/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1wPdUuvHQExX5k_QXRbTt-JMoerPRQ_lB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1HpdCo2X7qjOfcRItjVUii6xytpGdwQxg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1MfyqzIcfO575VFB6sp1PX9sO8LzYPVMC/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1At5chZ4Gz31wjiRmkRnYhDKmWi1H-3xZ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/18wFxidJ_fu5JbjrQf3yuu2od-PxJcnf5/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kzBH1AM5SHEMm1_iG3wgavPPBYpru8mq/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1t9IENQyQ1WaeOiKfdtRmltrGcQ6pBgl3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/127P5u43PHPIj-ZbfI6os1sFQVx38Xx_Y/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1eTQeF1QSaHaA_PYqlXiH8I5afR2ZsMwp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1pgbHvlOCKyGqTDwxH4uwuyIvrLhLh3Vs/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Uzw8DSrl-CywptQ8jW1-BiRyOEwS6QPc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1CSw3yPZK7WTWNQggg_sivNBbzciz3__S/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_J-DKHbb8EEHBOktR_0jI1y3azEl7I7I/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1n4y-NPoKkDE1paPJK46eifnFx-N0NMWT/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1yGEUQJiH-IcBjyjaN3AxwovuaIrKr7MD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1pNi19cUtRXzPtSVQRv3SH1yA8Pb6OItN/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1W0ADbli_r-rUEqPn5dzaVvK-M_jhl62B/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1DCMbKg16iXU2MgSSzCAJvMqJJiQIHyAd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1B19QoM1xkcq1vy_qPRkJ7qics0WCToqV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14uDWbdjnCKY3YN02O7yTS1B2D1qsgI-y/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1pIKyT-XuZKxzx4TTAbo4BaE2kHmV7QOg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1PQNVooVnULAgXKhCTnvcSZvMsrEoXKYk/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1spS68-eO6bahIa8jdLZ6quNe7PWIn_fo/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Wc8qLp1elCepaEsCOqhdwXqdNJJSJSDK/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ijxBMIpZtyjYEXuB6IU8HhHFw7JBaaqU/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/19FaqsZAbKP47Kcnq1Om5T5P6HZx7Om2k/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1xca2yEYBKah4xzwDQ7_q3_THIq0PBo5U/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1F5HJ2hCB2f__YE9XWoA5qAi2qf3stB7F/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1jDsQYqDQItWoDuv3iwg3UJlrFeyXAJfL/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1AVJNlLfMPJ_q6uwc6pAVijuJ3_BneB_c/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1CU22q37osAJFM1479h80hdefOmctYMXg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1VK_2X07GZd7P2OrI6PUP0q8a_69EAxbg/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1gZWql1_NVddfR0_wEKYy3yoMFmOVv5C-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1pC-lU8UY9AStpgkC7xCc3OMNhGDPsEcr/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_UMslbzQNPYgYjFKGtLY6e0pprTXG9RG/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Ucdp_DRw7QWB0K4UJwN9B4umvNOCCVJW/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        spinner9.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1KbDM1EtSJcFGdNPr01An0qctJoptxtO3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1A9hLmAAf31hd9s0TfFke7-aCEaM3ZCDn/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1g0VI4FPvgBETgqlDVUwklD67gsCmxvWL/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ZjvjxSa5zgt8iL5ZtOR3WY5NsabFf6rE/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Jwaeb8fi_Lu3aDL32Hz4by3-Q3sz0lXa/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_fvfTdBcFs_QAB8jxk_K2Rv7y2kluyAi/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1InnVenRgZNUNDAfkvVPqKdNeI8lM9uKr/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1EjHIEXQGmFcjQ0e5we76ZwOfENq3RvVa/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1sM_ei6z9tTZbCBNJzYHzLZn49Xi2k03u/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1aXE40fXbuaxZNoGJNyzGLQATDgw3cUGt/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/19_qIDbDYTl52Leb4xjXr40kps0KwVj93/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10mCRMVAkjX1S5h8W-vOd6oyMXB_te-KR/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1iLFsfTOnQm-o1FOcJkpIssT4OTNIhokp/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1daXLhiS4mIZveQKfie2cDVZczeSyYc4L/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1siuixi12YllP8791A-hbQAgiscsCgBGw/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14lcnX7IsauxRad-lQWYLiA1JtatJ5Xep/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1n0a7xdmAzw9f7fVStIRDqoNlwpDwDMrv/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1NgiZEcf7kn0BXZFMIHxX7NBJX353YYt7/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1_heIF3QCgz1_bbwLCSVC0Zi2Xxi76_w0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/19QM-ZPBX98c-P0XuPjj0HrNld-nunKyV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1PS0nZIvsX_jzsuMx_OWB4yBwHrTolZvU/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1c_QGpBnZDpLf0DKIGbXdnbENMjn8ioWB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/13iMg1AfaTimXIORazo6mDZ5M5xyW1paO/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/14I9UxzhRPO0Sqi0e95d0kfzktNZEiBnH/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1sqzQagu0kQ0oJz8NHowTMh6Lk69yCS_t/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/15_lUCJ-gO-O5jzkx6x1U4VY5VBAzgMvN/view?usp=drive_link\n"));
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/17YTGznSHadxEfATy2tpXwBFRsBHeZaCI/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1D28HQpT0oxp4ZD_-LiFrMrvrkVYvAF2d/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1bvoseoxhaIQZ2kaYceSovdqeFO01p-rK/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1bdyy-bhBT5enYk-9FFb6nci2BAFi282c/view?usp=drive_link\n"));
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16c923_aSOxpGZ3zYFP_glSFag7T6tmsW/view?usp=drive_link\n"));
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1o3fAyagV89oxwkPaokynp-AG4J49ARkd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 33) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10hpkbNXbQu2b7hHoViMj8KNOH4fVPyqx/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1FPBps-YlgmOAzxCx3BdnC1LjkuJ30YBV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1P2OzNTsmhrSHmfG1sLXHwxtAC1kT3Io-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 36) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1zRdYrOr5psvvCTRrgh_GFLPgjW4_WvGH/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/10z266ABbe9bJmXa2ZVhBCNYVKmC8QWeG/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1tf6pyJkI4UckrDAqltOCs1axnWod2IvN/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1mhX7w1pV8BtOMFhEWywW3IweMwNRv4WK/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 40) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1iPWCONk3UBB0ECtlw9LSQdSXgTaiUJU1/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1WIY4lQCtCObXD1sPNZitX7vR3Lo7KL4z/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1C4Jbz0HYtu4cBA5VOuTHqxSFpcXO3O-X/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 43) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1qO0BgNHennJRoWucly9mRsuhFjS2wdRo/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });


        spinner10.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1qiPXAwLFOXOCHYuXMlWNCeuytckzqS2C/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1pQ8MecMWJCmqquaETvAgQsoxdNry-Nib/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/17o4G9D6Ff6D30ZJ86IaX6vqDM1yNdeJl/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1u4CerHxnx1jXYhq3lRxZ_chq-z7CqamM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1GU8FV39sX1hGzgLfJ2BZqKLcF0hc1jTh/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1vcOn9oKDHv8uLvH2URt0lDV7CGk2wUtM/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });


        spinner11.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1adOfR9cDELCiokYfwUOtqKTGLopBTpD7/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1xewbm6VnB-876NZC5T-Yae8ARjm_zz--/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1p8zTGjC-GyrzPLJzvCILGs-iGs3j40LC/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ojeD9kMJCA0Q-khYXen7absqECYha3PD/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1XJ3VSbsaaUK000dv_gbna2ExyDEPFLkv/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1W_s6Ll1T1aKtur_HxtJyrQyJCWTQtSjc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1jQDtBSs-Ma249Dw2iGiZlAX5MMj49ynx/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1IQiJd0GBBtzce8-__yTb9M38Iyzrkv7J/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/18dvpOezo9GY0aB54PsTYnYOEpB9gApWZ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1tYfPZKoF7zTMn6r3484rizgt1s5M0gJz/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1BEJNaxT9xq2pjKDM7G85CTnuRvlpAjvT/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1snU1VmeODiJcMUVv2d9OIDznpphrPYzU/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1EcBW93R9eTFVbK7Jf-GkAUGBMpFVh3U4/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/16I5OII6E_GTVr-L8E_0SIgmO7iyFzac0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1epoBxkrUIuVa3ufz0PmdkFodPKYINcbB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1CCHa8OVIhR3bJ74DFDTxWHD4lkDoEkRM/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1__rTsdA_4czOFYhuguBPrsunKgeTlfAf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1g_wdHP4QQfSB--gEauohYGOB-HFqtDkf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1o6w-MHvd-_t31Wr9cyG3GiLJ8MhzqQl3/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nXUYAZeUWI9XGrC9GoaGNlf5wPxm7-tT/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Sss9kOIMM-YMGIW-TtBuOsQpQTx5Xe9d/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1C1PZY8kCmC1VeK8297BtH0MBOKGdMsjf/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Gzz64465w7fxiJtns0DqBDxquWDHZA9d/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1C2LDuvnYuKuvs1_kwwWKkZlmPgdljFzk/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1rVqXy08OOKhelFs-eKgp__aw6as5wA73/view?usp=drive_link"));
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });


        spinner12.setSelection(0, false); // 첫번째 요소 블락처리
        // Spinner 아이템 선택 이벤트 처리
        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // 선택된 아이템의 위치(position)에 따라 PDF 파일 열기
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11IxWScT_mUO3_zr1irX1Cmo90RTdAgV9/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nZEpfNXJzhl6a6TxBACQdkVwQu4h8ak4/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1UyIUsn7kAJ-ZsMxXipQ4ox6MZB0mjkng/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1CJRIgidZH4U5-vO3ZKO7BqjKJ5UokCu-/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1Y5tRasbavzjIzFNkJObLo5tBlkX-57n0/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1ld7oRpuY_cKWo8opFao_zq4CsUtFr10n/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1weO83XRIWdERfglszilz9Xqat3NsNyjt/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1vjBoAbejh_EKp12I9yywbrnttXMPYMOJ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1AIJflKF0aVWmhXkhjnsU2HqAd96fvpf2/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11ikhg_wcALsDssqbMZZzv0xfpaDOWJBT/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kJGdjbGg_eJkdZoIwdh7EHRVz6lN0_KI/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1TRKKszvO1zu92qZQiZi1lixPVq7BROYc/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1eeEuKH0KjNYCVKsR7PtJPzAvWUtoyTtd/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/11DoopYukiK5iD6ynoGW9_oxRlWjg4DCV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1nDZoyDRMPb2NE5VAzRLwaExyLocgOcPB/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1uueOZVymUS5PI_505g3sPweJjb7xbf3z/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1g6t4511wwnum2JjYm08GVy1P1hGzZlWQ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1oxiqkSff1kZ1_0rSFVS6lAdevDHqvcsQ/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1GVv_kmI_sdtQaQqE0B8_dTlDys1P-HIV/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1sD88tQ1QoRspJTFPkdRnYSZfDnv5kVle/view?usp=drive_link"));
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://drive.google.com/file/d/1kypEyn7_BRa0M6B5WhzwbvLu7JgCfHgj/view?usp=drive_link"));
                    startActivity(intent);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // 아무 것도 선택되지 않았을 때의 처리
            }
        });

        Button mainBtn = (Button) findViewById(R.id.mainBtn);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
