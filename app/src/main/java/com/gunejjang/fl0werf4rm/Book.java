package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import static com.gunejjang.fl0werf4rm.Start.b_s;
import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.p1;

public class Book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        TextView tv1 = (TextView)findViewById(R.id.text_back_back);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Book.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);

                mp.stop();
                mp = MediaPlayer.create(Book.this, R.raw.music_main);
                mp.setLooping(true);
                mp.start();
                // 배경 음악

                finish();
            }
        });
        // 돌아가기 터치 이벤트


        if (b_s.num1!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower1);
            if (b_s.num1==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num1==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num2!=0) {
            ImageView iv = (ImageView) findViewById(R.id.image_flower2);
            if (b_s.num2 == 6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            } else if (b_s.num2 == 6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num3!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower3);
            if (b_s.num3==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num3==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num4!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower4);
            if (b_s.num4==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num4==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num5!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower5);
            if (b_s.num5==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num5==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num6!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower6);
            if (b_s.num6==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num6==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num7!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower7);
            if (b_s.num7==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num7==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num8!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower8);
            if (b_s.num8==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num8==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num9!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower9);
            if (b_s.num9==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num9==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num10!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower10);
            if (b_s.num10==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num10==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num11!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower11);
            if (b_s.num11==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num11==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }

        if (b_s.num12!=0) {
            ImageView iv = (ImageView)findViewById(R.id.image_flower12);
            if (b_s.num12==6000) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5000);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6001) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5001);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6002) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5002);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6003) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5003);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6004) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5004);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6005) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5005);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6006) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5006);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6007) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5007);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6900) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5900);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6901) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5901);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6902) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5902);
                iv.setImageDrawable(drawable);
            }
            else if (b_s.num12==6903) {
                Drawable drawable = getResources().getDrawable(R.drawable.flower_5903);
                iv.setImageDrawable(drawable);
            }
        }
        // 꽃에 따른 이미지 변경

        String s_money = String.valueOf(p1.money);
        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
        // 텍스트 뷰 돈 출력
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Book.this);
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
