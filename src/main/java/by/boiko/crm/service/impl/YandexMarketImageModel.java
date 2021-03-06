package by.boiko.crm.service.impl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Erizo on 23.06.2018.
 */
public class YandexMarketImageModel {

    @SerializedName("sku")
    private String sku;
    @SerializedName("url")
    private List<String> url;

    public YandexMarketImageModel() {
    }

    public YandexMarketImageModel(String sku, List<String> url) {
        this.sku = sku;
        this.url = url;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }
}
