package com.example.phillipdacosta.dictionary;


import android.support.v7.app.AppCompatActivity;


import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static android.R.attr.text;
import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button addBtn;
    EditText editText;
    TextView textView, textView6;

    Map<String, String> map = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.defineButton);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView2);
        textView6 = (TextView) findViewById(R.id.textView6);
        addBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String result = editText.getText().toString().toLowerCase();


        String a = "push oneself off a surface and into the air by foot.";
        String b = " perceive with the eyes; discern visually.";
        String c = "to rest by sleeping; be asleep.\n" +
                "\"she slept for half an hour\".";
        String d = "move about in a hurried and hectic way.";
        String e = "bite and work (food) in the mouth with the teeth, especially to make it easier to swallow.";
        String f = "take (a liquid) into the mouth and swallow.";
        String g = "No word found.";
        String h = "put (food) into the mouth and chew and swallow it.";
        String i = "to prepare (food, a dish, or a meal) by combining and heating the ingredients in various ways.";
        String j = "To propel the body through water by using the limbs.";


        map.put("jump", a);
        map.put("see", b);
        map.put("sleep", c);
        map.put("run", d);
        map.put("chew", e);
        map.put("drink", f);
        map.put("", g);
        map.put("eat", h);
        map.put("cook", i);
        map.put("swim", j);


        if (map.containsKey(result) && result.equals("jump")) {
            textView.setText(a);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("see")) {
            textView.setText(b);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("sleep")) {
            textView.setText(c);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("run")) {
            textView.setText(d);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("chew")) {
            textView.setText(e);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("drink")) {
            textView.setText(f);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("")) {
            textView.setText(g);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (!map.containsKey(result)) {
            textView.setText("No definition found");
            textView6.setText("");
        }
        if (map.containsKey(result) && result.equals("eat")) {
            textView.setText(h);
            textView6.setText(result + ":");
            editText.setText("");
        }
        if (map.containsKey(result) && result.equals("cook")) {
            textView.setText(i);
            textView6.setText(result + ":");
            editText.setText("");

        }
        if (map.containsKey(result) && result.equals("swim")) {
            textView.setText(j);
            textView6.setText(result + ":");
            editText.setText("");

        }

    }

}





























