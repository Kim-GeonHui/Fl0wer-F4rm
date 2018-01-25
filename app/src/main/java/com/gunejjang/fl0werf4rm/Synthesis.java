package com.gunejjang.fl0werf4rm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import static com.gunejjang.fl0werf4rm.Start.mp;
import static com.gunejjang.fl0werf4rm.Start.p1;

public class Synthesis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesis);

        String s_money = String.valueOf(p1.money);
        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
        // 텍스트 뷰 돈 출력

        TextView tv0 = (TextView)findViewById(R.id.text_back_back);
        tv0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Synthesis.this, Main.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                finish();
            }
        });
        // 돌아가기 터치 이벤트

        TextView tv1 = (TextView)findViewById(R.id.text_back_cane1);
        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Synthesis.this);
                builder.setTitle("마조람 씨앗과 로즈마리 씨앗을 합성하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.s_6000>=1&&p1.s_6001>=1) {
                            p1.s_6000-=1;
                            p1.s_6001-=1;

                            p1.s_6900+=1;

                            Intent i = new Intent(Synthesis.this, Synthesis.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(),"라벤더 씨앗을 획득하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder1 = new AlertDialog.Builder(Synthesis.this);
                            builder1.setTitle("씨앗이 모자랍니다.");
                            builder1.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                            AlertDialog dialog1 = builder1.create();
                            dialog1.show();
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
        // cane1 터치 이벤트

        TextView tv2 = (TextView)findViewById(R.id.text_back_cane2);
        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Synthesis.this);
                builder.setTitle("레몬밤 씨앗과 쟈스민 씨앗을 합성하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.s_6002>=1&&p1.s_6003>=1) {
                            p1.s_6002-=1;
                            p1.s_6003-=1;

                            p1.s_6901+=1;

                            Intent i = new Intent(Synthesis.this, Synthesis.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(),"만다린 씨앗을 획득하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder1 = new AlertDialog.Builder(Synthesis.this);
                            builder1.setTitle("씨앗이 모자랍니다.");
                            builder1.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                            AlertDialog dialog1 = builder1.create();
                            dialog1.show();
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
        // cane2 터치 이벤트

        TextView tv3 = (TextView)findViewById(R.id.text_back_cane3);
        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Synthesis.this);
                builder.setTitle("장미 씨앗과 눈덩이를 합성하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.s_6004>=1&&p1.s_7000>=1) {
                            p1.s_6004-=1;
                            p1.s_7000-=1;

                            p1.s_6902+=1;

                            Intent i = new Intent(Synthesis.this, Synthesis.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(),"설원 장미 씨앗을 획득하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder1 = new AlertDialog.Builder(Synthesis.this);
                            builder1.setTitle("재료가 모자랍니다.");
                            builder1.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                            AlertDialog dialog1 = builder1.create();
                            dialog1.show();
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
        // cane3 터치 이벤트

        TextView tv4 = (TextView)findViewById(R.id.text_back_cane4);
        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Synthesis.this);
                builder.setTitle("카모마일 씨앗과 페츌리 씨앗을 합성하시겠습니까?");
                builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (p1.s_6006>=1&&p1.s_6007>=1) {
                            p1.s_6006-=1;
                            p1.s_6007-=1;

                            p1.s_6903+=1;

                            Intent i = new Intent(Synthesis.this, Synthesis.class);
                            startActivity(i);
                            overridePendingTransition(0, 0);
                            finish();

                            Toast.makeText(getApplicationContext(),"타트리 씨앗을 획득하였습니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder1 = new AlertDialog.Builder(Synthesis.this);
                            builder1.setTitle("씨앗이 모자랍니다.");
                            builder1.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                            AlertDialog dialog1 = builder1.create();
                            dialog1.show();
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
        // cane3 터치 이벤트

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Synthesis.this);
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
