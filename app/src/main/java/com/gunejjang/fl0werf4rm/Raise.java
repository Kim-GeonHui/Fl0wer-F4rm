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

public class Raise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise);

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


        if (f_r_1.level>=2) {
            Drawable i1 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot1 =(ImageView)findViewById(R.id.image_pot1);
            iv_pot1.setImageDrawable(i1);
        }
        else if (f_r_2.level>=2) {
            Drawable i2 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot2 =(ImageView)findViewById(R.id.image_pot2);
            iv_pot2.setImageDrawable(i2);
        }
        else if (f_r_3.level>=2) {
            Drawable i3 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot3 =(ImageView)findViewById(R.id.image_pot3);
            iv_pot3.setImageDrawable(i3);
        }
        else if (f_r_4.level>=2) {
            Drawable i4 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot4 =(ImageView)findViewById(R.id.image_pot4);
            iv_pot4.setImageDrawable(i4);
        }
        else if (f_r_5.level>=2) {
            Drawable i5 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot5 =(ImageView)findViewById(R.id.image_pot5);
            iv_pot5.setImageDrawable(i5);
        }
        else if (f_r_6.level>=2) {
            Drawable i6 = getResources().getDrawable(R.drawable.pot1);
            ImageView iv_pot6 =(ImageView)findViewById(R.id.image_pot6);
            iv_pot6.setImageDrawable(i6);
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
            }
        });
        // pot1 터치 이벤트

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
            }
        });
        // pot3 터치 이벤트

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

                Intent i = new Intent(Raise.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 날짜변경 터치 이벤트
    }

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
