package com.basudev.crypto;


import java.util.ArrayList;

public class Data {
    private int id;
    private String name;
    private String symbol;
    private String slug;
    private float num_market_pairs;
    private String date_added;
    ArrayList< Object > tags = new ArrayList < Object > ();
    private float max_supply;
    private float circulating_supply;
    private float total_supply;
//    private String platform = null;
    private float cmc_rank;
    private String self_reported_circulating_supply = null;
    private String self_reported_market_cap = null;
    private String last_updated;
    Quote quote;


    // Getter Methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSlug() {
        return slug;
    }

    public float getNum_market_pairs() {
        return num_market_pairs;
    }

    public String getDate_added() {
        return date_added;
    }

    public float getMax_supply() {
        return max_supply;
    }

    public float getCirculating_supply() {
        return circulating_supply;
    }

    public float getTotal_supply() {
        return total_supply;
    }

//    public String getPlatform() {
//        return platform;
//    }

    public float getCmc_rank() {
        return cmc_rank;
    }

    public String getSelf_reported_circulating_supply() {
        return self_reported_circulating_supply;
    }

    public String getSelf_reported_market_cap() {
        return self_reported_market_cap;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public Quote getQuote() {
        return quote;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setNum_market_pairs(float num_market_pairs) {
        this.num_market_pairs = num_market_pairs;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public void setMax_supply(float max_supply) {
        this.max_supply = max_supply;
    }

    public void setCirculating_supply(float circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public void setTotal_supply(float total_supply) {
        this.total_supply = total_supply;
    }

//    public void setPlatform(String platform) {
//        this.platform = platform;
//    }

    public void setCmc_rank(float cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public void setSelf_reported_circulating_supply(String self_reported_circulating_supply) {
        this.self_reported_circulating_supply = self_reported_circulating_supply;
    }

    public void setSelf_reported_market_cap(String self_reported_market_cap) {
        this.self_reported_market_cap = self_reported_market_cap;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
class Quote {
    USDs USD;


    // Getter Methods

    public USDs getUSD() {
        return USD;
    }

    // Setter Methods

    public void setUSD(USDs USD) {
        this.USD = USD;
    }
}
class USDs {
    private float price;
    private String  volume_24h;
    private float volume_change_24h;
    private float percent_change_1h;
    private float percent_change_24h;
    private float percent_change_7d;
    private float percent_change_30d;
    private float percent_change_60d;
    private float percent_change_90d;
    private String  market_cap;
    private float market_cap_dominance;
    private float fully_diluted_market_cap;
    private String last_updated;


    // Getter Methods

    public float getPrice() {
        return price;
    }

    public String  getVolume_24h() {
        return volume_24h;
    }

    public float getVolume_change_24h() {
        return volume_change_24h;
    }

    public float getPercent_change_1h() {
        return percent_change_1h;
    }

    public float getPercent_change_24h() {
        return percent_change_24h;
    }

    public float getPercent_change_7d() {
        return percent_change_7d;
    }

    public float getPercent_change_30d() {
        return percent_change_30d;
    }

    public float getPercent_change_60d() {
        return percent_change_60d;
    }

    public float getPercent_change_90d() {
        return percent_change_90d;
    }

    public String  getMarket_cap() {
        return market_cap;
    }

    public float getMarket_cap_dominance() {
        return market_cap_dominance;
    }

    public float getFully_diluted_market_cap() {
        return fully_diluted_market_cap;
    }

    public String getLast_updated() {
        return last_updated;
    }

    // Setter Methods

    public void setPrice(float price) {
        this.price = price;
    }

    public void setVolume_24h(String  volume_24h) {
        this.volume_24h = volume_24h;
    }

    public void setVolume_change_24h(float volume_change_24h) {
        this.volume_change_24h = volume_change_24h;
    }

    public void setPercent_change_1h(float percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public void setPercent_change_24h(float percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public void setPercent_change_7d(float percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public void setPercent_change_30d(float percent_change_30d) {
        this.percent_change_30d = percent_change_30d;
    }

    public void setPercent_change_60d(float percent_change_60d) {
        this.percent_change_60d = percent_change_60d;
    }

    public void setPercent_change_90d(float percent_change_90d) {
        this.percent_change_90d = percent_change_90d;
    }

    public void setMarket_cap(String  market_cap) {
        this.market_cap = market_cap;
    }

    public void setMarket_cap_dominance(float market_cap_dominance) {
        this.market_cap_dominance = market_cap_dominance;
    }

    public void setFully_diluted_market_cap(float fully_diluted_market_cap) {
        this.fully_diluted_market_cap = fully_diluted_market_cap;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
}