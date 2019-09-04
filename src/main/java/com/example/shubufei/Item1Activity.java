package com.example.shubufei;

import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.icbc.R;
import com.example.icbc.databinding.ActivityItem1Binding;
import com.example.shubufei.untils.Request;

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

     DataBean dataBean;
     ActivityItem1Binding binding;
     ImageButton imageButtonReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_item1);
        switch (getIntent().getIntExtra("type",-1)){
            case 0:
                binding.llItem4.setVisibility(View.GONE);
                binding.llItem5.setVisibility(View.GONE);
                binding.tvCount.setVisibility(View.GONE);
                break;
            case 1:
                binding.tvKey4.setVisibility(View.GONE);
                break;
        }


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
                                break;
                            case 1:
                                binding.tvKey9.setText("是否下线：否");
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
                final String[] dish =new String[]{"开裁填报","完工填报","委外填报"};
                builder2.setSingleChoiceItems(dish, 1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                               binding.tvType.setText("开裁填报");
                                break;
                            case 1:
                                binding.tvType.setText("完工填报");
                                break;
                            case 2:
                                binding.tvType.setText("委外填报");
                                break;
                        }

                        dialog.dismiss();
                    }
                });
                builder2.setCancelable(false);
                builder2.show();
            }
        });
        binding.tvKey11.setText("填报日期："+ formatter.format(curDate));
      binding.tvKey1.setOnClickListener(onClickListener);
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
                pushData();
            }
        });

    }
    private String cinvcode,cinvname,iquantity;
    private void pushData() {
        JSONObject jsonObject=new JSONObject();
        try {
            switch (getIntent().getIntExtra("type",-1)){
                case 0:
                    jsonObject.put("methodname","CreateWG");
                    jsonObject.put("iswg","1");
                    break;
                case 2:
                    jsonObject.put("methodname","CreateKC");
                    jsonObject.put("iskc","1");
                    break;
            }
            jsonObject.put("cinvcode",cinvcode);
            jsonObject.put("cinvname",cinvname);
            jsonObject.put("iqty",iquantity);
            jsonObject.put("cmemo","test");
            jsonObject.put("cuser","demo");
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
                        Toast.makeText(Item1Activity.this, response.body().string(), Toast.LENGTH_SHORT).show();
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
            Log.i("onclick","is run");
            Intent intent=new Intent(Item1Activity.this,ListActivity.class);
            switch (view.getId()){
                case R.id.tv_key1:
                    intent.putExtra("ctype","GongYi");
                    break;
                case R.id.tv_key2:
                    intent.putExtra("ctype","cMakeLine");
                    break;
                case R.id.tv_key3:
                    intent.putExtra("ctype","Inventory");
                    break;
            }
            startActivityForResult(intent,100);

        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        switch (resultCode){

            case 100:
                dataBean=data.getParcelableExtra("data");
            binding.tvKey1.setText("委外工序："+dataBean.getCcode());
                break;
            case 200:
                dataBean=data.getParcelableExtra("data");
              binding.tvKey2.setText("产线："+dataBean.getCcode());
                break;
            case 300:
                dataBean=data.getParcelableExtra("data");
              binding.tvKey3.setText("款号："+dataBean.getCinvcode());
              cinvcode=dataBean.getCinvcode();
              cinvname=dataBean.getCinvname();
              iquantity=dataBean.getIquantity();
                binding.tvItem13.setText("款号名称："+dataBean.getCinvname());
                binding.tvKey5.setText("上线日期："+dataBean.getDstartdate());
                binding.tvKey6.setText("下线日期："+dataBean.getDenddate());
                binding.tvCount.setText("订单数量："+dataBean.getIquantity());
                binding.tvKey7.setText("上线累积量："+dataBean.getItotalqty());
                binding.tvKey10.setText("今日累计产量："+dataBean.getIdayqty());



                break;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
