package com.example.a1001docus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    ImageView nat;
    ImageView nat_eng;
    ImageView wild;
    ImageView ppl;
    ImageView docub;
    ImageView his;
    ImageView cgtn;
    ImageView arte;
    ImageView artede;

    Vibrator vib;
    Button git;
    Button insta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nat = findViewById(R.id.nat);
        nat_eng = findViewById(R.id.nat_eng);
        wild = findViewById(R.id.wild);
        ppl = findViewById(R.id.ppl);
        docub = findViewById(R.id.docub);
        his = findViewById(R.id.his);
        cgtn = findViewById(R.id.cgtn);
        arte = findViewById(R.id.arte);
        artede = findViewById(R.id.artede);
        insta = findViewById(R.id.insta);
        git = findViewById(R.id.git);
        vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent github = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://sami-gr.github.io/"));
                startActivity(github);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri profile = Uri.parse("https://www.instagram.com/samii_gr/");
                Intent follow = new Intent(Intent.ACTION_VIEW, profile);

                follow.setPackage("com.instagram.android");

                try {
                    startActivity(follow);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/samii_gr/")));
                }
            }
        });

        //Nat Geo Abu Dhabi
        nat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, nat);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh2.tvanywhere.ae/hls/nat_geo_auh/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://livecdnh2.tvanywhere.ae/hls/nat_geo_auh/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh2.tvanywhere.ae/hls/nat_geo_auh/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh2.tvanywhere.ae/hls/nat_geo_auh/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh2.tvanywhere.ae/hls/nat_geo_auh/05.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Nat Geo Eng

        nat_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, nat_eng);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo/05.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Nat Geo Wild

        wild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, wild);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_wild/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_wild/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_wild/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_wild/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_wild/05.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Nat Geo People

        ppl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, ppl);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_people/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_people/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_people/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_people/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/nat_geo_people/05.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Docubox

        docub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, docub);
                mymenu.getMenuInflater().inflate(R.menu.remenudocubox, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ld2:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh3.tvanywhere.ae/hls/docubox/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.mdd:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh3.tvanywhere.ae/hls/docubox/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sdd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh3.tvanywhere.ae/hls/docubox/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hdd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh3.tvanywhere.ae/hls/docubox/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });

        //History2

        his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, his);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/h2/01.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/h2/02.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/h2/03.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/h2/04.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://livecdnh1.tvanywhere.ae/hls/h2/05.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //CGTN Documentary

        cgtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, cgtn);
                mymenu.getMenuInflater().inflate(R.menu.resmenucgtn, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.hd2:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://livedoc.cgtn.com/1000d/prog_index.m3u8"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;

                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Arte FR

        arte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, arte);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_fr@344805/index_5_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_fr@344805/index_4_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_fr@344805/index_3_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_fr@344805/index_2_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_fr@344805/index_1_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });


        //Arte DE

        artede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mymenu = new PopupMenu(MainActivity.this, artede);
                mymenu.getMenuInflater().inflate(R.menu.resmenu, mymenu.getMenu());
                mymenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.ldd:
                                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                                intent1.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_de@393591/index_5_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent1, "Complete action using"));
                                break;
                            case R.id.ld:
                                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                                intent2.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_de@393591/index_4_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent2, "Complete action using"));
                                break;
                            case R.id.md:
                                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                                intent3.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_de@393591/index_3_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent3, "Complete action using"));
                                break;
                            case R.id.sd:
                                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                                intent4.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_de@393591/index_2_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent4, "Complete action using"));
                                break;
                            case R.id.hd:
                                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                                intent5.setDataAndType(Uri.parse("http://artelive-lh.akamaihd.net/i/artelive_de@393591/index_1_av-p.m3u8?sd=10&rebase=on"), "video/*");

                                startActivity(Intent.createChooser(intent5, "Complete action using"));
                                break;
                        }
                        return true;
                    }
                });
                vib.vibrate(120);
                mymenu.show();
            }
        });
    }
}
