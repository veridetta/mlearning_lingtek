package com.inc.vr.corp.app.mobilelearning_lingkunganteknologi;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class KompetensiActivity extends AppCompatActivity {

    CardView home;
    TextView kognitif_judul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompetensi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        kognitif_judul = findViewById(R.id.kognitif_judul);
        home = findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KompetensiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        kognitif_judul.setText(Html.fromHtml(getString(R.string.kognitif)));
        try {
            InputStream is = getAssets().open("indikator_kognitif.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(is);
            Element element=doc.getDocumentElement();
            element.normalize();
            NodeList nList = doc.getElementsByTagName("isi");
            Log.d("Kompetensi", "onCreate: "+nList.item(0).getTextContent());
            Integer nomor = 1;
            for (int i=0; i<nList.getLength(); i++) {
                Node node = nList.item(i);
                //kognitif_judul.setText(kognitif_judul.getText()+"\n"+nomor+". " + node.getTextContent()+"\n");
                nomor++;
            }
        }catch (Exception e){e.printStackTrace();}
    }
    // private static String getValue(String tag) {
    //NodeList nodeList = element.getElementsByTagName(tag);
    //Node node = nodeList.item(0);
    //return node.getNodeValue();
    //}
}