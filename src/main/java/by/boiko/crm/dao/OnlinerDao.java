package by.boiko.crm.dao;

import by.boiko.crm.model.pojo.PendingGoods;
import by.boiko.crm.model.pojo.SkuModel;
import by.boiko.crm.model.pojo.UnattachedGoods;

import java.util.List;

/**
 * Created by Erizo on 26.11.2017.
 */

public interface OnlinerDao {

    void save(SkuModel skuModel);

    List loadAllGoods(int page);

    void delete(String sku);

    UnattachedGoods findBySky(String sku);

    void moveGoods(String id, String url);

    List<SkuModel> loadGoods();

    void saveGoods(String sku, String name, String description);

    int getAllCount();

    List<UnattachedGoods> loadAllUnattachedGoods();

    List<PendingGoods> getCheckGoods();

    List<UnattachedGoods> getUnattachedGoods();

    void deleteGoods(int id);
}
