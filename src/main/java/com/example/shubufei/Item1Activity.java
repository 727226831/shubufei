package com.example.shubufei;

import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.icbc.R;
import com.example.icbc.databinding.ActivityItem1Binding;
import com.example.shubufei.bean.Data;
import com.example.shubufei.untils.Request;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Item1Activity extends AppCompatActivity {

     Data dataBean=new Data();
     ActivityItem1Binding binding;
     ImageButton imageButtonReturn;
    String productcode="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_item1);



       imageButtonReturn=binding.getRoot().findViewById(R.id.iv_return);
        SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy年MM月dd日");
        Date curDate =  new Date(System.currentTimeMillis());
        binding.tvKey9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v7.app.AlertDialog.Builder builder2=new android.support.v7.app.AlertDialog.Builder(Item1Activity.this);
                builder2.setTitle("是否下线：");
                final String[] dish =new String[]{"是","否"};
                builder2.setSingleChoiceItems(dish, 1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                binding.tvKey9.setText("是否下线：是");
                                iswg="1";
                                break;
                            case 1:
                                binding.tvKey9.setText("是否下线：否");
                                iswg="0";
                                break;
                        }

                        dialog.dismiss();
                    }
                });
                builder2.setCancelable(false);
                builder2.show();

            }
        });
        binding.tvType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v7.app.AlertDialog.Builder builder2=new android.support.v7.app.AlertDialog.Builder(Item1Activity.this);
                builder2.setTitle("填报类型：");
                final String[] dish =new String[]{"开裁填报","完工填报","包装填报"};
                builder2.setSingleChoiceItems(dish, 1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                ctype="裁剪填报";
                               binding.tvType.setText("填报类型：开裁填报");
                                break;
                            case 1:

                                ctype="生产填报";
                                binding.tvType.setText("填报类型：完工填报");
                                break;
                            case 2:

                                ctype="包装填报";
                                binding.tvType.setText("填报类型：包装填报");
                                break;
                        }
                        binding.tvKey3.setText("款号：");
                        binding.tvItem13.setText("剩余数量：");
                        binding.tvKey5.setText("上线日期：");
                        binding.tvKey6.setText("下线日期：");
                        binding.tvCount.setText("订单数量：");
                        binding.tvKey10.setText("今日累计产量：");
                        binding.etIqty.setText("");
                        binding.etRemarks.setText("");
                        dialog.dismiss();
                    }
                });
                builder2.setCancelable(false);
                builder2.show();
            }
        });
        binding.tvKey11.setText("填报日期："+ formatter.format(curDate));

        binding.tvKey2.setOnClickListener(onClickListener);
        binding.tvKey3.setOnClickListener(onClickListener);
        imageButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(productcode.equals("")){
                    Toast.makeText(Item1Activity.this, "产线不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cinvcode.equals("")){
                    Toast.makeText(Item1Activity.this, "款号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(ctype.equals("")){
                    Toast.makeText(Item1Activity.this, "填报类型不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(ctype.equals("裁剪填报")){
                    if(Integer.parseInt(binding.etIqty.getText().toString())>Integer.parseInt(dataBean.getIquantity())){
                        Toast.makeText(Item1Activity.this, "数量超出", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }else if(ctype.equals("生产填报")){
                    if(Integer.parseInt(binding.etIqty.getText().toString())>Integer.parseInt(dataBean.getIcjqty())){
                        Toast.makeText(Item1Activity.this, "数量超出", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }else if(ctype.equals("包装填报")){
                    if(Integer.parseInt(binding.etIqty.getText().toString())>Integer.parseInt(dataBean.getIscqty())){
                        Toast.makeText(Item1Activity.this, "数量超出", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                pushData();
            }
        });
        binding.etIqty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(dataBean.getIdayqty()!=null){
                    if(editable.toString().isEmpty()){
                        total=Integer.parseInt(dataBean.getIdayqty());
                    }else {
                        total = Integer.parseInt(editable.toString()) + Integer.parseInt(dataBean.getIdayqty());
                    }
                    Log.i("total",total+"");
                    handler.sendEmptyMessage(0);

                }


            }
        });

    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    binding.tvKey10.setText("今日累计产量："+total);
                    int surplus = Integer.parseInt(dataBean.getIquantity()) - total;
                    binding.tvItem13.setText("剩余产量："+surplus);


                    break;
            }

        }
    };
    int total=0;
    private String cinvcode="",cinvname="",iquantity="";
    private String ctype="";
    private String iswg="";
    private void pushData() {
        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("methodname","CreateWG");
            jsonObject.put("iswg",iswg);
            jsonObject.put("cinvcode",cinvcode);
            jsonObject.put("cinvname",cinvname);
            jsonObject.put("iqty",binding.etIqty.getText().toString());
            jsonObject.put("cmemo",binding.etRemarks.getText().toString());
            jsonObject.put("cuser",getIntent().getStringExtra("cuser"));
            jsonObject.put("ctype",ctype);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String obj=jsonObject.toString();
        Log.i("json object",obj);

        Call<ResponseBody> data = Request.getRequestbody(obj);
        data.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                try {
                    Log.i("code-->",response.code()+"");

                    if(response.body()!=null) {
                        DataBean dataBean=new Gson().fromJson(response.body().string(),DataBean.class);
                        Toast.makeText(Item1Activity.this, dataBean.getResultMessage(), Toast.LENGTH_SHORT).show();
                        binding.tvKey2.setText("产线：");
                            binding.tvKey3.setText("款号：");
                            binding.tvItem13.setText("剩余数量：");
                            binding.tvKey5.setText("上线日期：");
                            binding.tvKey6.setText("下线日期：");
                            binding.tvCount.setText("开单数量：");
                            binding.tvKey10.setText("今日累计产量：");
                            binding.etIqty.setText("");
                            binding.etRemarks.setText("");
                    }else {
                        Toast.makeText(Item1Activity.this, "提交报错", Toast.LENGTH_SHORT).show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            } });
    }

    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(ctype.isEmpty()){
                Toast.makeText(Item1Activity.this, "请先选择填报类型", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent=new Intent(Item1Activity.this,ListActivity.class);
            switch (view.getId()){

                case R.id.tv_key2:
                    intent.putExtra("ctype","cMakeLine");
                    break;
                case R.id.tv_key3:
                    intent.putExtra("ctype","Inventory");
                    break;

            }
            intent.putExtra("type",ctype);
            intent.putExtra("cvalue",productcode);
            intent.putExtra("cuser",getIntent().getStringExtra("cuser"));
            startActivityForResult(intent,100);

        }
    };


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        switch (resultCode){


            case 200:
                dataBean=data.getParcelableExtra("data");
                productcode=dataBean.getCcode();
              binding.tvKey2.setText("产线："+dataBean.getCcode()+"/"+dataBean.getCname()+"/"+
                      dataBean.getCcompanyname()+"/"+dataBean.getCgroupname());
                break;
            case 300:
                dataBean=data.getParcelableExtra("data");
              binding.tvKey3.setText("款号："+dataBean.getCinvcode());
              cinvcode=dataBean.getCinvcode();
              cinvname=dataBean.getCinvname();
              iquantity=dataBean.getIquantity();
                binding.tvKey5.setText("上线日期："+dataBean.getDstartdate());
                binding.tvKey6.setText("下线日期："+dataBean.getDenddate());
                binding.tvCount.setText("开单数量："+dataBean.getIquantity());
                binding.tvKey10.setText("今日累计产量："+dataBean.getIdayqty());
                binding.tvIcjqty.setText("裁剪数量："+dataBean.getIcjqty());
                binding.tvIscqty.setText("生产数量："+dataBean.getIscqty());
                binding.tvIsoqty.setText("订单数量："+dataBean.getIsoqty());
                binding.tvCmemo.setText("开单备注："+dataBean.getCmemo());



                break;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
