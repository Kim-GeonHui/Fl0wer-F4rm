package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

public class Start extends AppCompatActivity {

    protected static MediaPlayer mp;

    protected static Player p1 = new Player(1000000,10, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

    protected static Pocket n_p_1000 = new Pocket(1000, "일반 씨앗 주머니", 1000);

    protected static Flower f_5000 = new Flower(5000, "마조람", 5000);
    protected static Flower f_5001 = new Flower(5001, "로즈마리", 7500);
    protected static Flower f_5002 = new Flower(5002, "레몬밤", 5000);
    protected static Flower f_5003 = new Flower(5003, "쟈스민", 7500);
    protected static Flower f_5004 = new Flower(5004, "장미", 15000);
    protected static Flower f_5005 = new Flower(5005, "쥬나퍼베리", 10000);
    protected static Flower f_5006 = new Flower(5006, "카모마일", 10000);
    protected static Flower f_5007 = new Flower(5007, "페츌리", 10000);
    protected static Flower f_5008 = new Flower(5008, "페퍼민트", 10000);

    protected static Flower f_5900 = new Flower(5900, "라벤더", 50000);
    protected static Flower f_5901 = new Flower(5901, "만다린", 50000);
    protected static Flower f_5902 = new Flower(5902, "설원 장미", 150000);
    protected static Flower f_5903 = new Flower(5903, "타트리", 100000);

    protected static Seed s_6000 = new Seed(6000, "마조람 씨앗");
    protected static Seed s_6001 = new Seed(6001, "로즈마리 씨앗");
    protected static Seed s_6002 = new Seed(6002, "레몬밤 씨앗");
    protected static Seed s_6003 = new Seed(6003, "쟈스민 씨앗");
    protected static Seed s_6004 = new Seed(6004, "장미 씨앗");
    protected static Seed s_6005 = new Seed(6005, "쥬나퍼베리 씨앗");
    protected static Seed s_6006 = new Seed(6006, "카모마일 씨앗");
    protected static Seed s_6007 = new Seed(6007, "페츌리 씨앗");

    protected static Seed s_6900 = new Seed(6900, "라벤더 씨앗");
    protected static Seed s_6901 = new Seed(6901, "만다린 씨앗");
    protected static Seed s_6902 = new Seed(6902, "설원 장미 씨앗");
    protected static Seed s_6903 = new Seed(6903, "타트리 씨앗");

    protected static Soil s_3000 = new Soil(3000, "흙", 0, 1500);
    protected static Soil s_3001 = new Soil(3001, "비옥한 흙", 1, 2500);

    protected static Water w_2000 = new Water(2000, "물", 500);

    protected static Flower_Raise f_r_1 = new Flower_Raise(0,0,0,0,0,0);
    protected static Flower_Raise f_r_2 = new Flower_Raise(0,0,0,0,0,0);
    protected static Flower_Raise f_r_3 = new Flower_Raise(0,0,0,0,0,1);
    protected static Flower_Raise f_r_4 = new Flower_Raise(0,0,0,0,0,1);
    protected static Flower_Raise f_r_5 = new Flower_Raise(0,0,0,0,0,1);
    protected static Flower_Raise f_r_6 = new Flower_Raise(0,0,0,0,0,1);

    protected static int before_pot = 0;

    protected static Book_Save b_s = new Book_Save(0,0,0,0,0,0,0,0,0,0,0,0);

    protected static int weather_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mp = MediaPlayer.create(this, R.raw.music_main);
        mp.setLooping(true);
        mp.start();
        // 배경 음악

        ImageView iv = (ImageView)findViewById(R.id.image_background);
        iv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Start.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 화면 터치 이벤트
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Start.this);
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

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    // 폰트 변경

}
