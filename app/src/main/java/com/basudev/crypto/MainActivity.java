package com.basudev.crypto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        data();
    }

    private void data() {
        Call<ResponseModel> call = RetrofitClient.getInstance().getApi().getCrypto("c0fe71c3-91d2-4f7d-8257-bfb56e6d1911");
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel responseModel = response.body();
                if (response.isSuccessful()){
                    System.out.println("hi");
                    adapter = new Adapter(responseModel.data);
                    recyclerView.setAdapter(adapter);
                    LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                    layoutManager.setOrientation(RecyclerView.VERTICAL);
                    recyclerView.setLayoutManager(layoutManager);

                    adapter.OnRecyclerViewClickListener(new Adapter.OnRecyclerViewClickListener() {
                        @Override
                        public void OnItemClick(int position) {
                            Intent intent= new Intent(MainActivity.this, DetailedActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("key1", responseModel.data.toString());
                            bundle.putString("id", String.valueOf(responseModel.data.get(position).getId()));
                            bundle.putString("name",responseModel.data.get(position).getName());
                            bundle.putString("symbol",responseModel.data.get(position).getSymbol());
                            bundle.putString("price",String.valueOf(responseModel.data.get(position).getQuote().getUSD().getPrice()));
                            bundle.putString("volume24",String.valueOf(responseModel.data.get(position).getQuote().getUSD().getVolume_24h()));
                            bundle.putString("marketcap",String.valueOf(responseModel.data.get(position).getQuote().getUSD().getMarket_cap()));
                            System.out.println("responseModel1 "+String.valueOf(responseModel.data.get(position).getId()));
                            System.out.println("responseModel0 "+position);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }else {
                    System.out.println("responseModel "+response.code());
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }
}