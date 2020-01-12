package com.bw.miaoheng20200112.api;

import com.bw.miaoheng20200112.entity.OrderListEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * 时间 :2020/1/12  8:43
 * 作者 :苗恒
 * 功能 :
 */
public interface OrderListApiService {
    @GET(Api.ORDERLIST_URL)
    Observable<OrderListEntity> getOrder(@Header("userId") String userId, @Header("sessionId") String sessionId, @Query("status") int status, @Query("count") int count, @Query("page") int page );
}
