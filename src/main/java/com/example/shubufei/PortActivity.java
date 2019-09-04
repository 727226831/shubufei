package com.example.shubufei;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.icbc.R;
import com.example.shubufei.untils.Request;
import com.example.shubufei.untils.Untils;


public class PortActivity extends BaseActivity{

    private Button buttonok;
    private EditText editText;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_port);

        buttonok=findViewById(R.id.b_ok);
        editText=findViewById(R.id.et_port);

        Untils.initTitle("设置",this);

         sharedPreferences= getSharedPreferences("sp", MODE_PRIVATE);

         editText.setText(sharedPreferences.getString("port",""));

        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();//获取编辑器
                if(editText.getText().toString().equals("")){
                    Toast.makeText(PortActivity.this,"地址已重置为默认地址",Toast.LENGTH_LONG).show();
                    editor.putString("port", Request.BASEURL);
                    return;
                }
                if(Patterns.WEB_URL.matcher(editText.getText().toString()).matches()){
                   // Request.URL=editText.getText().toString();
                    editor.putString("port",editText.getText().toString()).commit();
                    Toast.makeText(PortActivity.this,"地址已改变",Toast.LENGTH_LONG).show();
                    finish();
                }else {
                    Toast.makeText(PortActivity.this,"地址不正确",Toast.LENGTH_LONG).show();
                }


            }
        });
    }

}
