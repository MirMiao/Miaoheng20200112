package com.bw.miaoheng20200112;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bw.miaoheng20200112.api.Api;
import com.bw.miaoheng20200112.api.OrderListApiService;
import com.bw.miaoheng20200112.entity.OrderListEntity;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(OrderListApiService.class)
                .getOrder("13387","157870372510213387",0,5,1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OrderListEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    /**
                     * 成功
                     * @param orderListEntity
                     */
                    @Override
                    public void onNext(OrderListEntity orderListEntity) {
                        Toast.makeText(MainActivity.this, ""+orderListEntity.getMessage(), Toast.LENGTH_SHORT).show();
                        List<OrderListEntity.OrderListBean> orderList = orderListEntity.getOrderList();
                        OrderListAdapter orderListAdapter = new OrderListAdapter(MainActivity.this, orderList);
                        recyclerView.setAdapter(orderListAdapter);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
      }
}
