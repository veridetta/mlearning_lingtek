package com.inc.vr.corp.app.mobilelearning_lingkunganteknologi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.adapter.MateriAdapter;
import com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.model.MateriModel;

import java.util.ArrayList;
import java.util.List;

public class MateriListActivity extends AppCompatActivity {
    private List<MateriModel> materiDataList;
    private ArrayList<String> islamijudulList;
    private ArrayList<String> islamigambarList;
    private ArrayList<String> islamipenerbitList;
    private ArrayList<String> islamiwaktuList;
    private ArrayList<String> islamiurlList;
    private ArrayList<String> islamikategoriList;
    private ArrayList<String> islamiDesList;
    private ArrayList<Integer> islamifavList;
    RecyclerView rc_cari;
    MateriAdapter mDataAdapter;
    CardView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_list);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        rc_cari = findViewById(R.id.rc_matlis);
        home = findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(MateriListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        islamijudulList= new ArrayList<>();
        islamigambarList= new ArrayList<String>();
        islamipenerbitList = new ArrayList<>();
        islamiwaktuList = new ArrayList<>();
        islamiurlList = new ArrayList<>();
        islamikategoriList = new ArrayList<>();
        islamiDesList = new ArrayList<>();
        islamifavList = new ArrayList<Integer>();
        materiDataList= new ArrayList<MateriModel>();
        mDataAdapter = new MateriAdapter( MateriListActivity.this, islamijudulList,
                islamikategoriList,
                islamigambarList, islamiurlList,islamipenerbitList
                ,islamiwaktuList,islamiDesList, islamifavList);
        islamijudulList.add("Apa itu Bioteknologi ?");
        islamijudulList.add("Bioteknologi Konvensional Vs Bioteknologi Modern");
        islamijudulList.add("Bioteknologi Konvensional");
        islamijudulList.add("Bioteknologi Modern");
        islamijudulList.add("Dampak Bioteknologi ");
        islamijudulList.add("Teknologi Ramah Lingkungan");
        islamijudulList.add("Perilaku Hemat Energi ");
        islamijudulList.add("Teknologi Tidak Ramah Lingkungan ");
        islamijudulList.add("Dampak Teknologi Tidak Ramah Lingkungan");
        islamijudulList.add("Referensi");
        islamigambarList.add("bioteknologi");
        islamigambarList.add("konvenmodern");
        islamigambarList.add("konvensional");
        islamigambarList.add("modern");
        islamigambarList.add("dampak");
        islamigambarList.add("teknologi");
        islamigambarList.add("perilaku");
        islamigambarList.add("tekonologit");
        islamigambarList.add("dampakt");
        islamigambarList.add("daftar");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        islamiurlList.add("com.inc.vr.corp.app.mobilelearning_lingkunganteknologi.materi.MateriContent");
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        rc_cari.setLayoutManager(mLayoutManager);
        rc_cari.setAdapter(mDataAdapter);
    }
}