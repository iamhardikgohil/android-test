package com.example.quotes;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiService {
    @GET("spiritual/quotes/hinduism")
    Call<List<Quote>> getQuotes();

}
