package com.dilaykarakas.resimlebil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class OyunActivity extends AppCompatActivity {

    private ImageView s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24;
    private Button    c1, c2, c3;
    private TextView puan;
    private int      dogruSayisi=0;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun);

        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);

        s1 = (ImageView) findViewById(R.id.s1);
        s2 = (ImageView) findViewById(R.id.s2);
        s3 = (ImageView) findViewById(R.id.s3);
        s4 = (ImageView) findViewById(R.id.s4);
        s5 = (ImageView) findViewById(R.id.s1);
        s6 = (ImageView) findViewById(R.id.s2);
        s7 = (ImageView) findViewById(R.id.s3);
        s8 = (ImageView) findViewById(R.id.s4);
        s9 = (ImageView) findViewById(R.id.s1);
        s10 = (ImageView) findViewById(R.id.s2);
        s11 = (ImageView) findViewById(R.id.s3);
        s12 = (ImageView) findViewById(R.id.s4);
        s13 = (ImageView) findViewById(R.id.s1);
        s14 = (ImageView) findViewById(R.id.s2);
        s15 = (ImageView) findViewById(R.id.s3);
        s16 = (ImageView) findViewById(R.id.s4);
        s17 = (ImageView) findViewById(R.id.s1);
        s18 = (ImageView) findViewById(R.id.s2);
        s19 = (ImageView) findViewById(R.id.s3);
        s20 = (ImageView) findViewById(R.id.s4);
        s21 = (ImageView) findViewById(R.id.s1);
        s22 = (ImageView) findViewById(R.id.s2);
        s23 = (ImageView) findViewById(R.id.s3);
        s24 = (ImageView) findViewById(R.id.s4);

        puan = (TextView) findViewById(R.id.puan);


        // soru 1

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OyunActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });


        s1.setImageResource(R.drawable.s1);
        s2.setImageResource(R.drawable.s2);
        s3.setImageResource(R.drawable.s3);
        s4.setImageResource(R.drawable.s4);

        c1.setText("kitap");
        c2.setText("yazı");
        c3.setText("harf");




                c1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OyunActivity.this, "DOĞRU", Toast.LENGTH_SHORT).show();


                        dogruSayisi += 1;
                        puan.setText("Puanınız: " + 5 * dogruSayisi);

                        // soru 2
                        s5.setImageResource(R.drawable.s5);
                        s6.setImageResource(R.drawable.s6);
                        s7.setImageResource(R.drawable.s7);
                        s8.setImageResource(R.drawable.s8);

                        c1.setText("oyuncu");
                        c2.setText("bilgi");
                        c3.setText("materyal");

                        c1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                            }
                        });
                        c2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(OyunActivity.this, "DOĞRU", Toast.LENGTH_SHORT).show();

                                dogruSayisi += 1;
                                puan.setText("Puanınız: " + 5 * dogruSayisi);


                                // soru 3
                                s9.setImageResource(R.drawable.s9);
                                s10.setImageResource(R.drawable.s10);
                                s11.setImageResource(R.drawable.s11);
                                s12.setImageResource(R.drawable.s12);

                                c1.setText("dosya");
                                c2.setText("arşiv");
                                c3.setText("belge");

                                c1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                                    }
                                });
                                c2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                                    }
                                });
                                c3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(OyunActivity.this, "DOĞRU", Toast.LENGTH_SHORT).show();

                                        dogruSayisi += 1;
                                        puan.setText("Puanınız: " + 5 * dogruSayisi);


                                        // soru 4

                                        s13.setImageResource(R.drawable.s13);
                                        s14.setImageResource(R.drawable.s14);
                                        s15.setImageResource(R.drawable.s15);
                                        s16.setImageResource(R.drawable.s16);

                                        c1.setText("aile");
                                        c2.setText("kahvaltı");
                                        c3.setText("sabah");

                                        c1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                        c2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                        c3.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Toast.makeText(OyunActivity.this, "DOĞRU", Toast.LENGTH_SHORT).show();

                                                dogruSayisi += 1;
                                                puan.setText("Puanınız: " + 5 * dogruSayisi);


                                                //soru 5

                                                s17.setImageResource(R.drawable.s17);
                                                s18.setImageResource(R.drawable.s18);
                                                s19.setImageResource(R.drawable.s19);
                                                s20.setImageResource(R.drawable.s20);

                                                c1.setText("eğri");
                                                c2.setText("kule");
                                                c3.setText("yol");

                                                c1.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Toast.makeText(OyunActivity.this, "DOĞRU", Toast.LENGTH_SHORT).show();
                                                        Toast.makeText(OyunActivity.this, "OYUN BİTTİ!", Toast.LENGTH_SHORT).show();
                                                        dogruSayisi += 1;
                                                        puan.setText("Puanınız: " + 5 * dogruSayisi);


                                                            }
                                                });
                                                c2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                                                    }
                                                });
                                                c3.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();


                                                    }
                                                });

                                            }
                                        });

                                    }
                                });
                            }

                        });
                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();

                    }
                });
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();
                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OyunActivity.this, "YANLIŞ", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        }
