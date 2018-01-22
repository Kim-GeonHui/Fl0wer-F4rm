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
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

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
import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.n_p_1000;
import static com.gunejjang.fl0werf4rm.Start.p1;
import static com.gunejjang.fl0werf4rm.Start.s_3000;
import static com.gunejjang.fl0werf4rm.Start.s_3001;
import static com.gunejjang.fl0werf4rm.Start.w_2000;

public class Shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        TextView tv1 = (TextView)findViewById(R.id.text_back_back);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Shop.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);

                mp.stop();
                mp = MediaPlayer.create(Shop.this, R.raw.music_main);
                mp.setLooping(true);
                mp.start();
                // 배경 음악

                finish();
            }
        });
        // 돌아가기 터치 이벤트

        String s_money = String.valueOf(p1.money);
        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
        // 텍스트 뷰 돈 출력

        ImageView iv1 = (ImageView) findViewById(R.id.image_pocket);
        iv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(n_p_1000.name+"를 "+n_p_1000.price+"에 구매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.money>=n_p_1000.price) {
                            p1.pocket+=1;
                            p1.money -= n_p_1000.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), n_p_1000.name + " 구매에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
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
        });
        // 씨앗 주머니 터치 이벤트

        ImageView iv2 = (ImageView) findViewById(R.id.image_soil);
        iv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(s_3000.name+"를 "+s_3000.price+"에 구매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.money>=s_3000.price) {
                            p1.s_3000+=1;
                            p1.money -= s_3000.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), s_3000.name + " 구매에 성공하였습니다.", Toast.LENGTH_LONG).show();

                        }
                        else {
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
        });
        // 흙 터치 이벤트

        ImageView iv3 = (ImageView) findViewById(R.id.image_fertile_soil);
        iv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(s_3001.name+"를 "+s_3001.price+"에 구매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.money>=s_3001.price) {
                            p1.s_3001+=1;
                            p1.money -= s_3001.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), s_3001.name + " 구매에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
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
        });
        // 비옥한 흙 터치 이벤트

        ImageView iv4 = (ImageView) findViewById(R.id.image_water);
        iv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(w_2000.name+"를 "+w_2000.price+"에 구매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.money>=w_2000.price) {
                            p1.w_2000+=1;
                            p1.money -= w_2000.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), w_2000.name + " 구매에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
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
        });
        // 물 터치 이벤트

        ImageView iv5 = (ImageView) findViewById(R.id.image_f_5000);
        iv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5000.name+"를 "+f_5000.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5000==0) {
                            Toast.makeText(getApplicationContext(), f_5000.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5000-=1;
                            p1.money += f_5000.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5000.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 마조람 터치 이벤트

        ImageView iv6 = (ImageView) findViewById(R.id.image_f_5001);
        iv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5001.name+"를 "+f_5001.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5001==0) {
                            Toast.makeText(getApplicationContext(), f_5001.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5001-=1;
                            p1.money += f_5001.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5001.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 로즈마리 터치 이벤트

        ImageView iv7 = (ImageView) findViewById(R.id.image_f_5002);
        iv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5002.name+"를 "+f_5002.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5002==0) {
                            Toast.makeText(getApplicationContext(), f_5002.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5002-=1;
                            p1.money += f_5002.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5002.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 레몬밤 터치 이벤트

        ImageView iv8 = (ImageView) findViewById(R.id.image_f_5003);
        iv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5003.name+"를 "+f_5003.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5003==0) {
                            Toast.makeText(getApplicationContext(), f_5003.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5003-=1;
                            p1.money += f_5003.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5003.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 쟈스민 터치 이벤트

        ImageView iv9 = (ImageView) findViewById(R.id.image_f_5004);
        iv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5004.name+"를 "+f_5004.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5004==0) {
                            Toast.makeText(getApplicationContext(), f_5004.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5004-=1;
                            p1.money += f_5004.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5004.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 장미 터치 이벤트


        ImageView iv10 = (ImageView) findViewById(R.id.image_f_5005);
        iv10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5005.name+"를 "+f_5005.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5005==0) {
                            Toast.makeText(getApplicationContext(), f_5005.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5005-=1;
                            p1.money += f_5005.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5005.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 쥬나퍼베리 터치 이벤트

        ImageView iv11 = (ImageView) findViewById(R.id.image_f_5006);
        iv11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5006.name+"를 "+f_5006.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5006==0) {
                            Toast.makeText(getApplicationContext(), f_5006.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5006-=1;
                            p1.money += f_5006.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5006.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 카모마일 터치 이벤트


        ImageView iv12 = (ImageView) findViewById(R.id.image_f_5007);
        iv12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5007.name+"를 "+f_5007.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5007==0) {
                            Toast.makeText(getApplicationContext(), f_5007.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5007-=1;
                            p1.money += f_5007.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5007.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 페츌리 터치 이벤트


        ImageView iv13 = (ImageView) findViewById(R.id.image_f_5900);
        iv13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5900.name+"를 "+f_5900.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5900==0) {
                            Toast.makeText(getApplicationContext(), f_5900.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5900-=1;
                            p1.money += f_5900.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5900.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 라벤더 터치 이벤트

        ImageView iv14 = (ImageView) findViewById(R.id.image_f_5901);
        iv14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5901.name+"를 "+f_5901.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5901==0) {
                            Toast.makeText(getApplicationContext(), f_5901.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5901-=1;
                            p1.money += f_5901.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5901.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 만다린 터치 이벤트


        ImageView iv15 = (ImageView) findViewById(R.id.image_f_5902);
        iv15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5902.name+"를 "+f_5902.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5902==0) {
                            Toast.makeText(getApplicationContext(), f_5902.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5902-=1;
                            p1.money += f_5902.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5902.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 설원 장미 터치 이벤트

        ImageView iv16 = (ImageView) findViewById(R.id.image_f_5903);
        iv16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
                builder.setTitle(f_5903.name+"를 "+f_5903.price+"에 판매하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.f_5903==0) {
                            Toast.makeText(getApplicationContext(), f_5903.name+"이 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            p1.f_5903-=1;
                            p1.money += f_5903.price;

                            Intent i = new Intent(Shop.this, Shop.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(), f_5903.name + " 판매에 성공하였습니다.", Toast.LENGTH_LONG).show();
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
        });
        // 페퍼민트 터치 이벤트

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
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
