package com.example.jeremy.sudokuv01;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FenetreList extends AppCompatActivity {

    ListView mListView;

    AppCompatActivity lecontext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre_list);
        lecontext2 = this;
        mListView = (ListView) findViewById(R.id.listView);
        String[][] liste = new String[][]{
                {"TOTO", "niveau 1"},
                {"TITI", "niveau 2"}};


        List<HashMap<String, String>> testliste = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> element;
        for (int i = 0; i < liste.length; i++) {
            element = new HashMap<String, String>();
            element.put("text1", liste[i][0]);
            element.put("text2", liste[i][1]);
            testliste.add(element);
        }

        ListAdapter adapter = new SimpleAdapter(this, testliste, android.R.layout.simple_list_item_2, new String[]{"text1", "text2"}, new int[]{android.R.id.text1, android.R.id.text2});

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(lecontext2, GrilleSudoku.class);
                lecontext2.startActivity(intent2);
            }
        });

    }



}
