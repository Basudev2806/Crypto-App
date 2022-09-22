package com.basudev.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;

public class DetailedActivity extends AppCompatActivity {
    TextView name,symbol,pricee,volume24,marketcap;
    ImageView graph,icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        name = findViewById(R.id.name);
        symbol = findViewById(R.id.symbol);
        pricee = findViewById(R.id.price);
        volume24 = findViewById(R.id.volume_24);
        marketcap = findViewById(R.id.marketcap);
        graph = findViewById(R.id.graph);
        icon = findViewById(R.id.imageicon);
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("key1", "Default");
        try {
            JSONArray jsonArray = new JSONArray(title);
            System.out.println("data1 "+jsonArray.get(0));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String ID = bundle.getString("id");
        String NAME = bundle.getString("name");
        String SYMBOL = bundle.getString("symbol");
        String PRICE = bundle.getString("price");
        String VOLUME_24 = bundle.getString("volume24");
        String MARKET_CAP = bundle.getString("marketcap");

        name.setText(NAME);
        symbol.setText(SYMBOL);
        pricee.setText("$ "+PRICE);
        volume24.setText(VOLUME_24);
        marketcap.setText("$ "+MARKET_CAP);

        Glide.with(this)
                .load("https://s3.coinmarketcap.com/generated/sparklines/web/7d/usd/"+ID+".png")
                .centerCrop()
                .into(graph);

        Glide.with(this)
                .load("https://s2.coinmarketcap.com/static/img/coins/64x64/"+ID+".png")
                .centerCrop()
                .into(icon);

    }
}