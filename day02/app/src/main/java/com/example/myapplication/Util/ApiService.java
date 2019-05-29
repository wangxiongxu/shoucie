package com.example.myapplication.Util;

import com.example.myapplication.bean.Bean;


import io.reactivex.Observable;
import retrofit2.http.GET;

//https://www.wanandroid.com/article/list/0/json
public interface ApiService {
    /*@GET("api/4/news/latest")
    Observable<OneBean> ribaolist();*/
     @GET("article/list/0/json")
    Observable<Bean> oplist();

}
