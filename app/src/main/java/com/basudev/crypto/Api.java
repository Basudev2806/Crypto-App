package com.basudev.crypto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Api {

    @GET("v1/cryptocurrency/listings/latest")
    Call<ResponseModel> getCrypto(
            @Header("X-CMC_PRO_API_KEY") String token
    );

}
