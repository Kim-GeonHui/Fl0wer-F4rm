package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import java.util.Random;

import static com.gunejjang.fl0werf4rm.Start.b_s;
import static com.gunejjang.fl0werf4rm.Start.before_pot;
import static com.gunejjang.fl0werf4rm.Start.f_5000;
import static com.gunejjang.fl0werf4rm.Start.f_5001;
import static com.gunejjang.fl0werf4rm.Start.f_5002;
import static com.gunejjang.fl0werf4rm.Start.f_5003;
import static com.gunejjang.fl0werf4rm.Start.f_5004;
import static com.gunejjang.fl0werf4rm.Start.f_5005;
import static com.gunejjang.fl0werf4rm.Start.f_5006;
import static com.gunejjang.fl0werf4rm.Start.f_5007;
import static com.gunejjang.fl0werf4rm.Start.f_5900;
import static com.gunejjang.fl0werf4rm.Start.f_5901;
import static com.gunejjang.fl0werf4rm.Start.f_5902;
import static com.gunejjang.fl0werf4rm.Start.f_5903;
import static com.gunejjang.fl0werf4rm.Start.f_r_1;
import static com.gunejjang.fl0werf4rm.Start.f_r_2;
import static com.gunejjang.fl0werf4rm.Start.f_r_3;
import static com.gunejjang.fl0werf4rm.Start.f_r_4;
import static com.gunejjang.fl0werf4rm.Start.f_r_5;
import static com.gunejjang.fl0werf4rm.Start.f_r_6;
import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.p1;
import static com.gunejjang.fl0werf4rm.Start.weather_num;

public class Raise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise);

        weather(f_r_1,f_r_2,f_r_3,f_r_4,f_r_5,f_r_6);
        // 날씨

        TextView tv1 = (TextView)findViewById(R.id.text_back_back);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Raise.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 돌아가기 터치 이벤트

        String s_money = String.valueOf(p1.money);
        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
        // 텍스트 뷰 돈 출력

        if (f_r_1.water<=-1) {
            f_r_1.level=4;
        }
        if (f_r_2.water<=-1) {
            f_r_2.level=4;
        }
        if (f_r_3.water<=-1) {
            f_r_3.level=4;
        }
        if (f_r_4.water<=-1) {
            f_r_4.level=4;
        }
        if (f_r_5.water<=-1) {
            f_r_5.level=4;
        }
        if (f_r_6.water<=-1) {
            f_r_6.level=4;
        }
        // 꽃 메마름

        if (f_r_1.day>=6&& f_r_1.water>=0) {
            f_r_1.level=3;
        }
        if (f_r_2.day>=6&& f_r_2.water>=0) {
            f_r_2.level=3;
        }
        if (f_r_3.day>=6&& f_r_3.water>=0) {
            f_r_3.level=3;
        }
        if (f_r_4.day>=6&& f_r_4.water>=0) {
            f_r_4.level=3;
        }
        if (f_r_5.day>=6&& f_r_5.water>=0) {
            f_r_5.level=3;
        }
        if (f_r_6.day>=6&& f_r_6.water>=0) {
            f_r_6.level=3;
        }


        if (f_r_1.level>=2&& f_r_1.level!=3) {
            Drawable i1 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot1 =(ImageView)findViewById(R.id.image_pot1);
            iv_pot1.setImageDrawable(i1);
        }
        if (f_r_2.level>=2&& f_r_2.level!=3) {
            Drawable i2 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot2 =(ImageView)findViewById(R.id.image_pot2);
            iv_pot2.setImageDrawable(i2);
        }
        if (f_r_3.level>=2&& f_r_3.level!=3) {
            Drawable i3 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot3 =(ImageView)findViewById(R.id.image_pot3);
            iv_pot3.setImageDrawable(i3);
        }
        if (f_r_4.level>=2&& f_r_3.level!=3) {
            Drawable i4 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot4 =(ImageView)findViewById(R.id.image_pot4);
            iv_pot4.setImageDrawable(i4);
        }
        if (f_r_5.level>=2&& f_r_3.level!=3) {
            Drawable i5 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot5 =(ImageView)findViewById(R.id.image_pot5);
            iv_pot5.setImageDrawable(i5);
        }
        if (f_r_6.level==2&& f_r_3.level!=3) {
            Drawable i6 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot6 =(ImageView)findViewById(R.id.image_pot6);
            iv_pot6.setImageDrawable(i6);
        }

        if (f_r_1.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot1);
            if (f_r_1.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_1.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }

        if (f_r_2.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot2);
            if (f_r_2.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_2.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }

        if (f_r_3.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot3);
            if (f_r_3.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_3.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }

        if (f_r_4.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot4);
            if (f_r_4.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_4.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }

        if (f_r_5.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot5);
            if (f_r_5.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_5.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }

        if (f_r_6.level==3) {
            ImageView iv_pot1 = (ImageView)findViewById(R.id.image_pot6);
            if (f_r_6.category==6000) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5000);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6001) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5001);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6002) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5002);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6003) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5003);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6004) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5004);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6005) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5005);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6006) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5006);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6007) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5007);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6900) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5900);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6901) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5901);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6902) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5902);
                iv_pot1.setImageDrawable(i1);
            }
            else if (f_r_6.category==6903) {
                Drawable i1 = getResources().getDrawable(R.drawable.flower_5903);
                iv_pot1.setImageDrawable(i1);
            }
        }
        // level에 따른 단지 이미지 변경

        if (f_r_3.lock==0) {
            ImageView iv_l3 = (ImageView)findViewById(R.id.image_locker3);
            iv_l3.setVisibility(View.GONE);
        }
        if (f_r_4.lock==0) {
            ImageView iv_l4 = (ImageView)findViewById(R.id.image_locker4);
            iv_l4.setVisibility(View.GONE);
        }
        if (f_r_5.lock==0) {
            ImageView iv_l5 = (ImageView)findViewById(R.id.image_locker5);
            iv_l5.setVisibility(View.GONE);
        }
        if (f_r_6.lock==0) {
            ImageView iv_l6 = (ImageView)findViewById(R.id.image_locker6);
            iv_l6.setVisibility(View.GONE);
        }
        // 자물쇠 이미지 숨기기

        ImageView iv_p1 = (ImageView)findViewById(R.id.image_pot1);
        iv_p1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (f_r_1.level==0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                    builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                    builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.s_3000>0) {
                                p1.s_3000-=1;
                                f_r_1.level=1;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                            }
                            else {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                builder2.setTitle("흙이 없습니다.");
                                builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog2 = builder2.create();
                                dialog2.show();
                            }
                        }
                    });
                    builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.s_3001>0) {
                                p1.s_3001-=1;
                                f_r_1.level=1;
                                f_r_1.day+=1;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                            }
                            else {
                                AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                builder4.setTitle("비옥한 흙이 없습니다.");
                                builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog4 = builder4.create();
                                dialog4.show();
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                // level0 흙

                else if (f_r_1.level==1) {
                    if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("씨앗이 하나도 없습니다.");
                        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                    else {
                        before_pot = 1;

                        Intent i = new Intent(Raise.this, Seed_Choice.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        finish();
                    }
                }
                // level1 씨앗

                else if (f_r_1.level==2) {
                    if (f_r_1.water==1) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("충분히 축축합니다.");
                        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                    else if (f_r_1.water<=0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if (p1.w_2000>=1) {
                                    p1.w_2000-=1;
                                    f_r_1.water+=1;

                                    Intent i = new Intent(Raise.this, Raise.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();

                                    Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                }
                                else {
                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("물이 없습니다.");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
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
                }
                //level2 raise

                else if (f_r_1.level==3) {
                    if (f_r_1.category==6000) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5000+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6001) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5001+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6002) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5002+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6003) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5003+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6004) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5004+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6005) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5005+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6006) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5006+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6007) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5007+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6900) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5900+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6901) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5901+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6902) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5902+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_1.category==6903) {
                        book_save(b_s, f_r_1.category);

                        p1.f_5903+=1;

                        f_r_1.level=0;
                        f_r_1.category=0;
                        f_r_1.day=0;
                        f_r_1.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                }
                // level3 다 자람

                else if (f_r_1.level==4) {
                    f_r_1.level=0;
                    f_r_1.category=0;
                    f_r_1.day=0;
                    f_r_1.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level4 마름

                else if (f_r_1.level==5) {
                    f_r_1.level=0;
                    f_r_1.category=0;
                    f_r_1.day=0;
                    f_r_1.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level5 얼어붙음

                else if (f_r_1.level==6) {
                    f_r_1.level=0;
                    f_r_1.category=0;
                    f_r_1.day=0;
                    f_r_1.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level6 가뭄

            }
        });
        // pot1 터치 이벤트

        ImageView iv_p2 = (ImageView)findViewById(R.id.image_pot2);
        iv_p2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (f_r_2.level==0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                    builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                    builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.s_3000>0) {
                                p1.s_3000-=1;
                                f_r_2.level=1;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                            }
                            else {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                builder2.setTitle("흙이 없습니다.");
                                builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog2 = builder2.create();
                                dialog2.show();
                            }
                        }
                    });
                    builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.s_3001>0) {
                                p1.s_3001-=1;
                                f_r_2.level=1;
                                f_r_2.day+=1;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                            }
                            else {
                                AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                builder4.setTitle("비옥한 흙이 없습니다.");
                                builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog4 = builder4.create();
                                dialog4.show();
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                // level0 흙

                else if (f_r_2.level==1) {
                    if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("씨앗이 하나도 없습니다.");
                        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                    else {
                        before_pot = 2;

                        Intent i = new Intent(Raise.this, Seed_Choice.class);
                        startActivity(i);
                        overridePendingTransition(0, 0);
                        finish();
                    }
                }
                // level1 씨앗

                else if (f_r_2.level==2) {
                    if (f_r_2.water==1) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("충분히 축축합니다.");
                        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                    else if (f_r_2.water<=0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                        builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if (p1.w_2000>=1) {
                                    p1.w_2000-=1;
                                    f_r_2.water+=1;

                                    Intent i = new Intent(Raise.this, Raise.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();

                                    Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                }
                                else {
                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("물이 없습니다.");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
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
                }
                //level2 raise

                else if (f_r_2.level==3) {
                    if (f_r_2.category==6000) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5000+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6001) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5001+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6002) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5002+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6003) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5003+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6004) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5004+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6005) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5005+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6006) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5006+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6007) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5007+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6900) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5900+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6901) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5901+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6902) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5902+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                    else if (f_r_2.category==6903) {
                        book_save(b_s, f_r_2.category);

                        p1.f_5903+=1;

                        f_r_2.level=0;
                        f_r_2.category=0;
                        f_r_2.day=0;
                        f_r_2.water=0;

                        AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                        builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                        builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        });
                        AlertDialog dialog3 = builder3.create();
                        dialog3.show();
                    }
                }
                // level3 다 자람

                else if (f_r_2.level==4) {
                    f_r_2.level=0;
                    f_r_2.category=0;
                    f_r_2.day=0;
                    f_r_2.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level4 마름

                else if (f_r_2.level==5) {
                    f_r_2.level=0;
                    f_r_2.category=0;
                    f_r_2.day=0;
                    f_r_2.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level5 얼어붙음

                else if (f_r_2.level==6) {
                    f_r_2.level=0;
                    f_r_2.category=0;
                    f_r_2.day=0;
                    f_r_2.water=0;

                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                    builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();
                        }
                    });
                    AlertDialog dialog3 = builder3.create();
                    dialog3.show();
                }
                // level6 가뭄

            }
        });
        // pot2 터치 이벤트

        ImageView iv_p3 = (ImageView) findViewById(R.id.image_pot3);
        iv_p3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            if (f_r_3.lock==1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("잠금을 30000원에 해제하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.money>=30000) {
                            p1.money-=30000;
                            f_r_3.lock=0;

                            Intent i = new Intent(Raise.this, Raise.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(),  "잠금을 해제하였습니다.", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "돈이 부족합니다.", Toast.LENGTH_LONG).show();
                        }
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
            else if (f_r_3.lock==0) {
                ImageView iv_p3 = (ImageView)findViewById(R.id.image_pot3);
                iv_p3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        if (f_r_3.level==0) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                            builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                            builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    if (p1.s_3000>0) {
                                        p1.s_3000-=1;
                                        f_r_3.level=1;

                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();

                                        Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                    }
                                    else {
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                        builder2.setTitle("흙이 없습니다.");
                                        builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.dismiss();
                                            }
                                        });
                                        AlertDialog dialog2 = builder2.create();
                                        dialog2.show();
                                    }
                                }
                            });
                            builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    if (p1.s_3001>0) {
                                        p1.s_3001-=1;
                                        f_r_3.level=1;
                                        f_r_3.day+=1;

                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();

                                        Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                    }
                                    else {
                                        AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                        builder4.setTitle("비옥한 흙이 없습니다.");
                                        builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.dismiss();
                                            }
                                        });
                                        AlertDialog dialog4 = builder4.create();
                                        dialog4.show();
                                    }
                                }
                            });
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        // level0 흙

                        else if (f_r_3.level==1) {
                            if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("씨앗이 하나도 없습니다.");
                                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                            else {
                                before_pot = 3;

                                Intent i = new Intent(Raise.this, Seed_Choice.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();
                            }
                        }
                        // level1 씨앗

                        else if (f_r_3.level==2) {
                            if (f_r_3.water==1) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("충분히 축축합니다.");
                                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                            else if (f_r_3.water<=0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.w_2000>=1) {
                                            p1.w_2000-=1;
                                            f_r_3.water+=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                            builder3.setTitle("물이 없습니다.");
                                            builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog3 = builder3.create();
                                            dialog3.show();
                                        }
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
                        }
                        //level2 raise

                        else if (f_r_3.level==3) {
                            if (f_r_3.category==6000) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5000+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6001) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5001+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6002) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5002+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6003) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5003+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6004) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5004+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6005) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5005+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6006) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5006+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6007) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5007+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6900) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5900+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6901) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5901+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6902) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5902+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            else if (f_r_3.category==6903) {
                                book_save(b_s, f_r_3.category);

                                p1.f_5903+=1;

                                f_r_3.level=0;
                                f_r_3.category=0;
                                f_r_3.day=0;
                                f_r_3.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                        }
                        // level3 다 자람

                        else if (f_r_3.level==4) {
                            f_r_3.level=0;
                            f_r_3.category=0;
                            f_r_3.day=0;
                            f_r_3.water=0;

                            AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                            builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                            builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent i = new Intent(Raise.this, Raise.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            });
                            AlertDialog dialog3 = builder3.create();
                            dialog3.show();
                        }
                        // level4 마름

                        else if (f_r_3.level==5) {
                            f_r_3.level=0;
                            f_r_3.category=0;
                            f_r_3.day=0;
                            f_r_3.water=0;

                            AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                            builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                            builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent i = new Intent(Raise.this, Raise.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            });
                            AlertDialog dialog3 = builder3.create();
                            dialog3.show();
                        }
                        // level5 얼어붙음

                        else if (f_r_3.level==6) {
                            f_r_3.level=0;
                            f_r_3.category=0;
                            f_r_3.day=0;
                            f_r_3.water=0;

                            AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                            builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                            builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent i = new Intent(Raise.this, Raise.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            });
                            AlertDialog dialog3 = builder3.create();
                            dialog3.show();
                        }
                        // level6 가뭄
                    }
                });
            }
            }
        });
        // pot3 터치 이벤트

        ImageView iv_p4 = (ImageView) findViewById(R.id.image_pot4);
        iv_p4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (f_r_4.lock==1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                    builder.setTitle("잠금을 30000원에 해제하시겠습니까?");
                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.money>=30000) {
                                p1.money-=30000;
                                f_r_4.lock=0;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "잠금을 해제하였습니다.", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(getApplicationContext(), "돈이 부족합니다.", Toast.LENGTH_LONG).show();
                            }
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
                else if (f_r_4.lock==0) {
                    ImageView iv_p4 = (ImageView)findViewById(R.id.image_pot4);
                    iv_p4.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            if (f_r_4.level==0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                                builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3000>0) {
                                            p1.s_3000-=1;
                                            f_r_4.level=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                            builder2.setTitle("흙이 없습니다.");
                                            builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog2 = builder2.create();
                                            dialog2.show();
                                        }
                                    }
                                });
                                builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3001>0) {
                                            p1.s_3001-=1;
                                            f_r_4.level=1;
                                            f_r_4.day+=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                            builder4.setTitle("비옥한 흙이 없습니다.");
                                            builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog4 = builder4.create();
                                            dialog4.show();
                                        }
                                    }
                                });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                            // level0 흙

                            else if (f_r_4.level==1) {
                                if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("씨앗이 하나도 없습니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else {
                                    before_pot = 4;

                                    Intent i = new Intent(Raise.this, Seed_Choice.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            }
                            // level1 씨앗

                            else if (f_r_4.level==2) {
                                if (f_r_4.water==1) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("충분히 축축합니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else if (f_r_4.water<=0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (p1.w_2000>=1) {
                                                p1.w_2000-=1;
                                                f_r_4.water+=1;

                                                Intent i = new Intent(Raise.this, Raise.class);
                                                startActivity(i);
                                                overridePendingTransition(0, 0);
                                                finish();

                                                Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                            }
                                            else {
                                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                                builder3.setTitle("물이 없습니다.");
                                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog, int which) {
                                                        dialog.dismiss();
                                                    }
                                                });
                                                AlertDialog dialog3 = builder3.create();
                                                dialog3.show();
                                            }
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
                            }
                            //level2 raise

                            else if (f_r_4.level==3) {
                                if (f_r_4.category==6000) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5000+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6001) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5001+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6002) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5002+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6003) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5003+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6004) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5004+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6005) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5005+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6006) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5006+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6007) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5007+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6900) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5900+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6901) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5901+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6902) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5902+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_4.category==6903) {
                                    book_save(b_s, f_r_4.category);

                                    p1.f_5903+=1;

                                    f_r_4.level=0;
                                    f_r_4.category=0;
                                    f_r_4.day=0;
                                    f_r_4.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                            }
                            // level3 다 자람

                            else if (f_r_4.level==4) {
                                f_r_4.level=0;
                                f_r_4.category=0;
                                f_r_4.day=0;
                                f_r_4.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level4 마름

                            else if (f_r_4.level==5) {
                                f_r_4.level=0;
                                f_r_4.category=0;
                                f_r_4.day=0;
                                f_r_4.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level5 얼어붙음

                            else if (f_r_4.level==6) {
                                f_r_4.level=0;
                                f_r_4.category=0;
                                f_r_4.day=0;
                                f_r_4.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level6 가뭄
                        }
                    });
                }
            }
        });
        // pot4 터치 이벤트

        ImageView iv_p5 = (ImageView) findViewById(R.id.image_pot5);
        iv_p5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (f_r_5.lock==1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                    builder.setTitle("잠금을 50000원에 해제하시겠습니까?");
                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.money>=50000) {
                                p1.money-=50000;
                                f_r_5.lock=0;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "잠금을 해제하였습니다.", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(getApplicationContext(), "돈이 부족합니다.", Toast.LENGTH_LONG).show();
                            }
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
                else if (f_r_5.lock==0) {
                    ImageView iv_p5 = (ImageView)findViewById(R.id.image_pot5);
                    iv_p5.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            if (f_r_5.level==0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                                builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3000>0) {
                                            p1.s_3000-=1;
                                            f_r_5.level=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                            builder2.setTitle("흙이 없습니다.");
                                            builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog2 = builder2.create();
                                            dialog2.show();
                                        }
                                    }
                                });
                                builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3001>0) {
                                            p1.s_3001-=1;
                                            f_r_5.level=1;
                                            f_r_5.day+=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                            builder4.setTitle("비옥한 흙이 없습니다.");
                                            builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog4 = builder4.create();
                                            dialog4.show();
                                        }
                                    }
                                });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                            // level0 흙

                            else if (f_r_5.level==1) {
                                if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("씨앗이 하나도 없습니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else {
                                    before_pot = 5;

                                    Intent i = new Intent(Raise.this, Seed_Choice.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            }
                            // level1 씨앗

                            else if (f_r_5.level==2) {
                                if (f_r_5.water==1) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("충분히 축축합니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else if (f_r_5.water<=0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (p1.w_2000>=1) {
                                                p1.w_2000-=1;
                                                f_r_5.water+=1;

                                                Intent i = new Intent(Raise.this, Raise.class);
                                                startActivity(i);
                                                overridePendingTransition(0, 0);
                                                finish();

                                                Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                            }
                                            else {
                                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                                builder3.setTitle("물이 없습니다.");
                                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog, int which) {
                                                        dialog.dismiss();
                                                    }
                                                });
                                                AlertDialog dialog3 = builder3.create();
                                                dialog3.show();
                                            }
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
                            }
                            //level2 raise

                            else if (f_r_5.level==3) {
                                if (f_r_5.category==6000) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5000+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6001) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5001+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6002) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5002+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6003) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5003+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6004) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5004+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6005) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5005+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6006) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5006+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6007) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5007+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6900) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5900+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6901) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5901+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6902) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5902+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_5.category==6903) {
                                    book_save(b_s, f_r_5.category);

                                    p1.f_5903+=1;

                                    f_r_5.level=0;
                                    f_r_5.category=0;
                                    f_r_5.day=0;
                                    f_r_5.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                            }
                            // level3 다 자람

                            else if (f_r_5.level==4) {
                                f_r_5.level=0;
                                f_r_5.category=0;
                                f_r_5.day=0;
                                f_r_5.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level4 마름

                            else if (f_r_5.level==5) {
                                f_r_5.level=0;
                                f_r_5.category=0;
                                f_r_5.day=0;
                                f_r_5.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level5 얼어붙음

                            else if (f_r_5.level==6) {
                                f_r_5.level=0;
                                f_r_5.category=0;
                                f_r_5.day=0;
                                f_r_5.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level6 가뭄
                        }
                    });
                }
            }
        });
        // pot5 터치 이벤트

        ImageView iv_p6 = (ImageView) findViewById(R.id.image_pot6);
        iv_p6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (f_r_6.lock==1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                    builder.setTitle("잠금을 50000원에 해제하시겠습니까?");
                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if (p1.money>=50000) {
                                p1.money-=50000;
                                f_r_6.lock=0;

                                Intent i = new Intent(Raise.this, Raise.class);
                                startActivity(i);
                                overridePendingTransition(0, 0);
                                finish();

                                Toast.makeText(getApplicationContext(),  "잠금을 해제하였습니다.", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(getApplicationContext(), "돈이 부족합니다.", Toast.LENGTH_LONG).show();
                            }
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
                else if (f_r_6.lock==0) {
                    ImageView iv_p6 = (ImageView)findViewById(R.id.image_pot6);
                    iv_p6.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            if (f_r_6.level==0) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                builder.setTitle("화분 속이 비어있습니다.\n어떤 흙을 채우시겠습니까?");
                                builder.setNegativeButton("흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3000>0) {
                                            p1.s_3000-=1;
                                            f_r_6.level=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(Raise.this);
                                            builder2.setTitle("흙이 없습니다.");
                                            builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog2 = builder2.create();
                                            dialog2.show();
                                        }
                                    }
                                });
                                builder.setPositiveButton("비옥한 흙", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (p1.s_3001>0) {
                                            p1.s_3001-=1;
                                            f_r_6.level=1;
                                            f_r_6.day+=1;

                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();

                                            Toast.makeText(getApplicationContext(),  "비옥한 흙으로 화분을 채웠습니다.", Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(Raise.this);
                                            builder4.setTitle("비옥한 흙이 없습니다.");
                                            builder4.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                            AlertDialog dialog4 = builder4.create();
                                            dialog4.show();
                                        }
                                    }
                                });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                            // level0 흙

                            else if (f_r_6.level==1) {
                                if (p1.s_6000==0&&p1.s_6001==0&&p1.s_6002==0&&p1.s_6003==0&&p1.s_6004==0&&p1.s_6005==0&&p1.s_6006==0&&p1.s_6007==0&&p1.s_6900==0&&p1.s_6901==0&&p1.s_6902==0&&p1.s_6903==0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("씨앗이 하나도 없습니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else {
                                    before_pot = 6;

                                    Intent i = new Intent(Raise.this, Seed_Choice.class);
                                    startActivity(i);
                                    overridePendingTransition(0, 0);
                                    finish();
                                }
                            }
                            // level1 씨앗

                            else if (f_r_6.level==2) {
                                if (f_r_6.water==1) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("충분히 축축합니다.");
                                    builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    });
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                }
                                else if (f_r_6.water<=0) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                                    builder.setTitle("물기가 없어 보입니다.\n물을 주시겠습니까?");
                                    builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (p1.w_2000>=1) {
                                                p1.w_2000-=1;
                                                f_r_6.water+=1;

                                                Intent i = new Intent(Raise.this, Raise.class);
                                                startActivity(i);
                                                overridePendingTransition(0, 0);
                                                finish();

                                                Toast.makeText(getApplicationContext(),  "화분에 물을 주었습니다.", Toast.LENGTH_LONG).show();
                                            }
                                            else {
                                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                                builder3.setTitle("물이 없습니다.");
                                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog, int which) {
                                                        dialog.dismiss();
                                                    }
                                                });
                                                AlertDialog dialog3 = builder3.create();
                                                dialog3.show();
                                            }
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
                            }
                            //level2 raise

                            else if (f_r_6.level==3) {
                                if (f_r_6.category==6000) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5000+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5000.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6001) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5001+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5001.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6002) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5002+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5002.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6003) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5003+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5003.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6004) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5004+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5004.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6005) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5005+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5005.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6006) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5006+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5006.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6007) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5007+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5007.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6900) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5900+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5900.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6901) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5901+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5901.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6902) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5902+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5902.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                                else if (f_r_6.category==6903) {
                                    book_save(b_s, f_r_6.category);

                                    p1.f_5903+=1;

                                    f_r_6.level=0;
                                    f_r_6.category=0;
                                    f_r_6.day=0;
                                    f_r_6.water=0;

                                    AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                    builder3.setTitle("씨앗이 다 자라서 "+ f_5903.name+"이 피었습니다!");
                                    builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent i = new Intent(Raise.this, Raise.class);
                                            startActivity(i);
                                            overridePendingTransition(0, 0);
                                            finish();
                                        }
                                    });
                                    AlertDialog dialog3 = builder3.create();
                                    dialog3.show();
                                }
                            }
                            // level3 다 자람

                            else if (f_r_6.level==4) {
                                f_r_6.level=0;
                                f_r_6.category=0;
                                f_r_6.day=0;
                                f_r_6.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("물을 제때 주지 않아 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level4 마름

                            else if (f_r_6.level==5) {
                                f_r_6.level=0;
                                f_r_6.category=0;
                                f_r_6.day=0;
                                f_r_6.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("눈이 내림으로 인해 꽃이 얼어붙었습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level5 얼어붙음

                            else if (f_r_6.level==6) {
                                f_r_6.level=0;
                                f_r_6.category=0;
                                f_r_6.day=0;
                                f_r_6.water=0;

                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Raise.this);
                                builder3.setTitle("가뭄으로 인하여 꽃이 말라비틀어졌습니다.");
                                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(Raise.this, Raise.class);
                                        startActivity(i);
                                        overridePendingTransition(0, 0);
                                        finish();
                                    }
                                });
                                AlertDialog dialog3 = builder3.create();
                                dialog3.show();
                            }
                            // level6 가뭄
                        }
                    });
                }
            }
        });
        // pot6 터치 이벤트

        TextView tv2 = (TextView)findViewById(R.id.text_back_timer);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (f_r_1.day>=1) {
                    if (f_r_1.level==2) {
                        f_r_1.day += 1;
                        f_r_1.water -= 1;
                    }
                }
                else if (f_r_2.day>=1) {
                    if (f_r_2.level==2) {
                        f_r_2.day += 1;
                        f_r_2.water -= 1;
                    }
                }
                else if (f_r_3.day>=1) {
                    if (f_r_3.level==3) {
                        f_r_3.day += 1;
                        f_r_3.water -= 1;
                    }
                }
                else if (f_r_4.day>=1) {
                    if (f_r_4.level==2) {
                        f_r_4.day += 1;
                        f_r_4.water -= 1;
                    }
                }
                else if (f_r_5.day>=1) {
                    if (f_r_5.level==2) {
                        f_r_5.day += 1;
                        f_r_5.water -= 1;
                    }
                }
                else if (f_r_6.day>=1) {
                    if (f_r_6.level==2) {
                        f_r_6.day += 1;
                        f_r_6.water -= 1;
                    }
                }

                weather_num=0;

                Intent i = new Intent(Raise.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 날짜변경 터치 이벤트
    }

    protected void book_save(Book_Save b_s, int code) {
        if (b_s.num1==0) {
            b_s.num1=code;
        }
        else if (b_s.num2==0) {
            b_s.num2=code;
        }
        else if (b_s.num3==0) {
            b_s.num3=code;
        }
        else if (b_s.num4==0) {
            b_s.num4=code;
        }
        else if (b_s.num5==0) {
            b_s.num5=code;
        }
        else if (b_s.num6==0) {
            b_s.num6=code;
        }
        else if (b_s.num7==0) {
            b_s.num7=code;
        }
        else if (b_s.num8==0) {
            b_s.num8=code;
        }
        else if (b_s.num9==0) {
            b_s.num9=code;
        }
        else if (b_s.num10==0) {
            b_s.num10=code;
        }
        else if (b_s.num11==0) {
            b_s.num11=code;
        }
        else if (b_s.num12==0) {
            b_s.num12=code;
        }
    }
    // 도감

    protected void weather(Flower_Raise f_r1,Flower_Raise f_r2, Flower_Raise f_r3, Flower_Raise f_r4, Flower_Raise f_r5, Flower_Raise f_r6) {
        Random rand = new Random();
        int num = rand.nextInt(100);

        Random rand2 = new Random();
        int num2 = rand2.nextInt(100);

        final Random rand3 = new Random();
        final int num3 = rand3.nextInt(100);

        if (weather_num==0) {
            weather_num=1;

            if (0 <= num && num <= 29) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("오늘은 날씨가 화창합니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else if (30 <= num && num <= 54) {
                if (f_r1.level == 2) {
                    f_r1.water += 1;
                }
                if (f_r2.level == 2) {
                    f_r2.water += 1;
                }
                if (f_r3.level == 2) {
                    f_r3.water += 1;
                }
                if (f_r4.level == 2) {
                    f_r4.water += 1;
                }
                if (f_r5.level == 2) {
                    f_r5.water += 1;
                }
                if (f_r6.level == 2) {
                    f_r6.water += 1;
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("오늘은 비가 내립니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            } else if (55 <= num && num <= 79) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("오늘은 날씨가 흐립니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else if (80 <= num && num <= 89) {
                if (f_r1.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r1.level = 5;
                    }
                }
                if (f_r2.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r2.level = 5;
                    }
                }
                if (f_r3.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r3.level = 5;
                    }
                }
                if (f_r4.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r4.level = 5;
                    }
                }
                if (f_r5.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r5.level = 5;
                    }
                }
                if (f_r6.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r6.level = 5;
                    }
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("오늘은 눈이 옵니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (0<=num3&&num3<=25) {
                            p1.s_7000+=1;

                            Toast.makeText(getApplicationContext(),"눈덩이를 획득하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else if (50<=num3&&num3<=99) {
                            dialog.dismiss();
                        }
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }

            else if (90 <= num && num <= 99) {
                if (f_r1.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r1.level = 6;
                    }
                }
                if (f_r2.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r2.level = 6;
                    }
                }
                if (f_r3.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r3.level = 6;
                    }
                }
                if (f_r4.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r4.level = 6;
                    }
                }
                if (f_r5.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r5.level = 6;
                    }
                }
                if (f_r6.level == 2) {
                    if (0 <= num2 && num2 <= 49) {
                        f_r6.level = 6;
                    }
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
                builder.setTitle("오늘은 가뭄이 들었습니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        }
    }
    // 날씨

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Raise.this);
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
