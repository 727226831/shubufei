package com.example.icbc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout item1;
    private LinearLayout item2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1=findViewById(R.id.ll_item1);
        item2=findViewById(R.id.ll_item2);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(MainActivity.this,Item1Activity.class);
                intent.putExtra("type",0);
                startActivity(intent);

            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(MainActivity.this,Item1Activity.class);
                intent.putExtra("type",1);
                startActivity(intent);
            }
        });
    }
}
