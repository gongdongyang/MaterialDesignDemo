package com.xpp.news.materialdesigndemo.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.xpp.news.materialdesigndemo.R;
import com.xpp.news.materialdesigndemo.entity.AliAddrsBean;
import com.xpp.news.materialdesigndemo.service.APIService;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity {
    /**
     * Retrofit文章
     */
    //http://www.jianshu.com/p/91ac13ed076d

    @BindView(R.id.retrofit_btn)
    public Button retrofitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int setContentLayoutId() {
        return R.layout.activity_main;
    }


    public void initView(){

    }

    @OnClick(R.id.retrofit_btn)
    public void btnClick(){
        try
        {
            Toast.makeText(this,"====",Toast.LENGTH_LONG).show();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://gc.ditu.aliyun.com/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            APIService service = retrofit.create(APIService.class);

            //Call<AliAddrsBean> addrsBeanCall = service.getIndexContent();
            //Response<AliAddrsBean> repo = addrsBeanCall.execute();
            Call<AliAddrsBean> addrsBeanCall = service.getIndexContentTow("北京市","北京市","北京市");
            addrsBeanCall.enqueue(new Callback<AliAddrsBean>() {
                @Override
                public void onResponse(Call<AliAddrsBean> call, Response<AliAddrsBean> response) {
                    Log.d("ChannelIndex",response.body().lat+"");
                }

                @Override
                public void onFailure(Call<AliAddrsBean> call, Throwable t) {

                }
            });

            //OKHttpClient



        }catch (Exception e) {
            Log.d("ChannelIndex", "error===" + e.toString());
        }
    }
}
