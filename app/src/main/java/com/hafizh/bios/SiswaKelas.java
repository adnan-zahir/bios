package com.hafizh.bios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SiswaKelas extends AppCompatActivity {
//    ListView listView;
//    ArrayList <String> list = new ArrayList<String>();
    ImageButton bakri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_kelas);

//        listView = (ListView) findViewById(R.id.listview);
//
//        ArrayList <Siswa> arrayList = new ArrayList<>();
//
//        arrayList.add(new Siswa("AKBAR FADHL RAMADHAN"));
//        arrayList.add(new Siswa("ALDO LINTANG SAPUTRA"));
//        arrayList.add(new Siswa("ALYA PUTRI AZZAHRA"));
//        arrayList.add(new Siswa("AURA PUTRI KIREINA"));
//        arrayList.add(new Siswa("BINTANG KURNIAWAN"));
//        arrayList.add(new Siswa("DAVIN SEPTIAN MINDRA"));
//        arrayList.add(new Siswa("DIAZ ARDIANSYAH"));
//        arrayList.add(new Siswa("FAKHRI SYAKIR FADHILAH"));
//        arrayList.add(new Siswa("HABIB BUDIN"));
//        arrayList.add(new Siswa("HAFIZH ATHALLAH YOVANKA"));
//        arrayList.add(new Siswa("HARMONI NATANAEL SIMATUPANG"));
//        arrayList.add(new Siswa("IKHSAN NURUL HAQ"));
//        arrayList.add(new Siswa("ISNAINI DARA NURFADHILA"));
//        arrayList.add(new Siswa("JANUARI MAULANI PUTRI"));
//        arrayList.add(new Siswa("KEMAL MUHAMMAD ZAKI"));
//        arrayList.add(new Siswa("LUQMAN AMIRULLAH"));
//        arrayList.add(new Siswa("MOCHAMAD SUTAN MICO FEBRIAN"));
//        arrayList.add(new Siswa("MUHAMMAD ARSYI BUDI"));
//        arrayList.add(new Siswa("MUHAMMAD DAFFA FATHUROHMAN"));
//        arrayList.add(new Siswa("MUHAMMAD FAREL FACHREZI ANDRIE"));
//        arrayList.add(new Siswa("MUHAMMAD NAWWAF YAZID IKROMI"));
//        arrayList.add(new Siswa("NABIL MUDZAKI AL MUHARAM"));
//        arrayList.add(new Siswa("NADIF DZAIKRA HARTAMAN"));
//        arrayList.add(new Siswa("NAJWAN ARIBENA PRATAMA"));
//        arrayList.add(new Siswa("PUTRI PUSPITA KARTINI RAHMAN"));
//        arrayList.add(new Siswa("RAIDA AULIA ZAHRA"));
//        arrayList.add(new Siswa("RAIHANA AISHA AZ-ZAHRA"));
//        arrayList.add(new Siswa("RAZAN MUHAMMAD FAUZAN SYA`BANI"));
//        arrayList.add(new Siswa("REFI HIKMAN GIFARI"));
//        arrayList.add(new Siswa("RIVALDI FEBRIANSYAH"));
//        arrayList.add(new Siswa("SALMA RAMIZA ALYA DARMAWAN"));
//        arrayList.add(new Siswa("SYAHRIL HERMAWAN"));
//        arrayList.add(new Siswa("TEZAR MEILANDRI HERDIANSYAH"));
//        arrayList.add(new Siswa("YUDDHA WASTU PRAMUKHA"));
//        arrayList.add(new Siswa("ZAHRAN FAIZ SALMAN"));
//
//        SiswaAdapter siswaAdapter = new SiswaAdapter(this,R.layout.list_namasiswa,arrayList);
//        listView.setAdapter(siswaAdapter);

        bakri = (ImageButton) findViewById(R.id.imageButton107);
        bakri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SiswaKelas.this, ProfileInclass.class);
                startActivity(intent);
            }
        });
    }
}