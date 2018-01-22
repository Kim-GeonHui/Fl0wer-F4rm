package com.gunejjang.fl0werf4rm;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import java.util.Random;

import static com.gunejjang.fl0werf4rm.R.drawable.seed_6000;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6001;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6002;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6003;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6004;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6005;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6006;
import static com.gunejjang.fl0werf4rm.R.drawable.seed_6007;
import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.p1;
import static com.gunejjang.fl0werf4rm.Start.s_6000;
import static com.gunejjang.fl0werf4rm.Start.s_6001;
import static com.gunejjang.fl0werf4rm.Start.s_6002;
import static com.gunejjang.fl0werf4rm.Start.s_6003;
import static com.gunejjang.fl0werf4rm.Start.s_6004;
import static com.gunejjang.fl0werf4rm.Start.s_6005;
import static com.gunejjang.fl0werf4rm.Start.s_6006;
import static com.gunejjang.fl0werf4rm.Start.s_6007;

public class Claw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claw);

        String s_money = String.valueOf(p1.money);
        TextView tv1 = (TextView)findViewById(R.id.text_money);
        tv1.setText(s_money);
        // 텍스트 뷰 돈 출력

        TextView tv2 = (TextView)findViewById(R.id.text_back_pocket);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                claw_pocket();
            }
        });
        // 씨앗 뽑기
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Claw.this);
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
    // 뒤로 가기

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    // 폰트 변경

    protected void claw_pocket() {

        Random rand = new Random();
        int num = rand.nextInt(1000);

        if (p1.pocket==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Claw.this);
            builder.setTitle("씨앗 주머니가 하나도 없습니다.");
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (p1.pocket>0) {
            p1.pocket-=1;

            Dialog dialog = new Dialog(this);
            dialog.setTitle("결과");
            dialog.setContentView(R.layout.activity_alert0);

            TextView tv1 = (TextView)dialog.findViewById(R.id.text_alert);
            ImageView iv1 = (ImageView)dialog.findViewById(R.id.image_alert);

            if (0<=num && num <=124) {
                p1.s_6000+=1;
                tv1.setText(s_6000.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6000);
            }
            else if (125<=num && num<=249) {
                p1.s_6001+=1;
                tv1.setText(s_6001.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6001);
            }
            else if (250<=num && num<=374) {
                p1.s_6002+=1;
                tv1.setText(s_6002.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6002);
            }
            else if (375<=num && num<=499) {
                p1.s_6003+=1;
                tv1.setText(s_6003.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6003);
            }
            else if (500<=num && num<=624) {
                p1.s_6004+=1;
                tv1.setText(s_6004.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6004);
            }
            else if (625<=num && num<=749) {
                p1.s_6005+=1;
                tv1.setText(s_6005.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6005);
            }
            else if (750<=num && num<=874) {
                p1.s_6006+=1;
                tv1.setText(s_6006.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6006);
            }
            else if (875<=num && num<=999) {
                p1.s_6007+=1;
                tv1.setText(s_6007.name+"이 나왔습니다!");
                iv1.setImageResource(seed_6007);
            }
            dialog.show();
        }
    }
    // 뽑기
}