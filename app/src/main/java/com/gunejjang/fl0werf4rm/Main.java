package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.p1;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView)findViewById(R.id.text_back_pocket);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Claw.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 씨앗 뽑기 이동 터치 이벤트

        TextView tv2 = (TextView)findViewById(R.id.text_back_book);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Book.class);
                startActivity(i);
                overridePendingTransition(0, 0);

                mp.stop();
                mp = MediaPlayer.create(Main.this, R.raw.music_book);
                mp.setLooping(true);
                mp.start();
                // 배경 음악

                finish();
            }
        });
        // 식물 도감 이동 터치 이벤트

        String s_money = String.valueOf(p1.money);
        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
        // 텍스트 뷰 돈 출력

        TextView tv3 = (TextView)findViewById(R.id.text_back_shop);
        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Shop.class);
                startActivity(i);
                overridePendingTransition(0, 0);

                mp.stop();
                mp = MediaPlayer.create(Main.this, R.raw.music_shop);
                mp.setLooping(true);
                mp.start();
                // 배경 음악

                finish();
            }
        });
        // 상점 이동 터치 이벤트

        TextView tv4 = (TextView)findViewById(R.id.text_back_raise);
        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Raise.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 꽃키우기 터치 이벤트

        TextView tv5 = (TextView)findViewById(R.id.text_back_synthesis);
        tv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Synthesis.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 합성하기 터치 이벤트

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Main.this);
        builder.setTitle("게임을 종료하시겠습니까?");
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                mp.stop();
                finish();
                Toast.makeText(getApplicationContext(),"너무해! 너무해!", Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    // 뒤로가기

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    // 폰트 변경

}
