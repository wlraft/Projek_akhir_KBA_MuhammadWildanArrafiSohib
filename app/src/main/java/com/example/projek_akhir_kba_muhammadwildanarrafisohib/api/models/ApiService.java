package com.example.projek_akhir_kba_muhammadwildanarrafisohib.api.models;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("getMakanan")
    Call<ResponseDataMakanan> getDataMakanan();

    @FormUrlEncoded
    @POST("Login")
    Call<ResponseLogin> requestLogin(@Field("email") String email,
                                     @Field("password") String password);

    @FormUrlEncoded
    @POST("register")
    Call<ResponseRegister> requestRegister(@Field("username") String username,
                                           @Field("email") String email,
                                           @Field("password") String password);
}
