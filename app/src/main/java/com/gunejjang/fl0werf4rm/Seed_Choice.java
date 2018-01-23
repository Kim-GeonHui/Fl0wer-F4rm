package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import static com.gunejjang.fl0werf4rm.Start.before_pot;
import static com.gunejjang.fl0werf4rm.Start.f_r_1;
import static com.gunejjang.fl0werf4rm.Start.f_r_2;
import static com.gunejjang.fl0werf4rm.Start.f_r_3;
import static com.gunejjang.fl0werf4rm.Start.f_r_4;
import static com.gunejjang.fl0werf4rm.Start.f_r_5;
import static com.gunejjang.fl0werf4rm.Start.f_r_6;
import static com.gunejjang.fl0werf4rm.Start.p1;
import static com.gunejjang.fl0werf4rm.Start.s_6000;
import static com.gunejjang.fl0werf4rm.Start.s_6001;
import static com.gunejjang.fl0werf4rm.Start.s_6002;
import static com.gunejjang.fl0werf4rm.Start.s_6003;
import static com.gunejjang.fl0werf4rm.Start.s_6004;
import static com.gunejjang.fl0werf4rm.Start.s_6005;
import static com.gunejjang.fl0werf4rm.Start.s_6006;
import static com.gunejjang.fl0werf4rm.Start.s_6007;
import static com.gunejjang.fl0werf4rm.Start.s_6900;
import static com.gunejjang.fl0werf4rm.Start.s_6901;
import static com.gunejjang.fl0werf4rm.Start.s_6902;
import static com.gunejjang.fl0werf4rm.Start.s_6903;

public class Seed_Choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed_choice);

        ImageView iv0 = (ImageView)findViewById(R.id.image_s_6000);
        iv0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6000>0) {
                    p1.s_6000-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6000;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6000;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6000;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6000;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6000;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6000;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6000.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6000 터치 이벤트

        ImageView iv1 = (ImageView)findViewById(R.id.image_s_6001);
        iv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6001>0) {
                    p1.s_6001-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6001;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6001;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6001;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6001;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6001;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6001;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6001.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6001 터치 이벤트

        ImageView iv2 = (ImageView)findViewById(R.id.image_s_6002);
        iv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6002>0) {
                    p1.s_6002-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6002;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6002;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6002;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6002;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6002;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6002;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6002.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6002 터치 이벤트

        ImageView iv3 = (ImageView)findViewById(R.id.image_s_6003);
        iv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6003>0) {
                    p1.s_6003-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6003;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6003;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6003;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6003;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6003;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6003;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6003.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6003 터치 이벤트

        ImageView iv4 = (ImageView)findViewById(R.id.image_s_6004);
        iv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6004>0) {
                    p1.s_6004-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6004;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6004;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6004;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6004;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6004;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6004;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6004.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6004 터치 이벤트

        ImageView iv5 = (ImageView)findViewById(R.id.image_s_6005);
        iv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6005>0) {
                    p1.s_6005-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6005;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6005;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6005;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6005;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6005;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6005;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6005.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6005 터치 이벤트

        ImageView iv6 = (ImageView)findViewById(R.id.image_s_6006);
        iv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6006>0) {
                    p1.s_6006-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6006;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6006;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6006;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6006;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6006;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6006;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6006.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6006 터치 이벤트

        ImageView iv7 = (ImageView)findViewById(R.id.image_s_6007);
        iv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6007>0) {
                    p1.s_6007-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6007;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6007;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6007;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6007;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6007;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6007;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6007.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6007 터치 이벤트

        ImageView iv900 = (ImageView)findViewById(R.id.image_s_6900);
        iv900.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6900>0) {
                    p1.s_6900-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6900;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6900;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6900;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6900;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6900;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6900;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6900.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6900 터치 이벤트

        ImageView iv901 = (ImageView)findViewById(R.id.image_s_6901);
        iv901.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6901>0) {
                    p1.s_6901-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6901;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6901;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6901;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6901;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6901;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6901;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6901.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6901 터치 이벤트

        ImageView iv902 = (ImageView)findViewById(R.id.image_s_6902);
        iv902.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6902>0) {
                    p1.s_6902-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6902;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6902;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6902;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6902;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6902;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6902;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6902.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6902 터치 이벤트

        ImageView iv903 = (ImageView)findViewById(R.id.image_s_6903);
        iv903.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1.s_6903>0) {
                    p1.s_6903-=1;

                    if (before_pot==1) {
                        f_r_1.level = 2;
                        f_r_1.category = 6903;
                        f_r_1.day+=1;
                    }
                    else if (before_pot==2) {
                        f_r_2.level = 2;
                        f_r_2.category = 6903;
                        f_r_2.day+=1;
                    }
                    else if (before_pot==3) {
                        f_r_3.level = 2;
                        f_r_3.category = 6903;
                        f_r_3.day+=1;
                    }
                    else if (before_pot==4) {
                        f_r_4.level = 2;
                        f_r_4.category = 6903;
                        f_r_4.day+=1;
                    }
                    else if (before_pot==5) {
                        f_r_5.level = 2;
                        f_r_5.category = 6903;
                        f_r_5.day+=1;
                    }
                    else if (before_pot==6) {
                        f_r_6.level = 2;
                        f_r_6.category = 6903;
                        f_r_6.day+=1;
                    }

                    Intent i = new Intent(Seed_Choice.this, Raise.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                    finish();

                    before_pot=0;
                }
                else {
                    Toast.makeText(getApplicationContext(),s_6903.name+"이 하나도 없습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
        // 6903 터치 이벤트

    }

    @Override
    public void onBackPressed() {
    }
    // 뒤로가기

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    // 폰트 변경

}
