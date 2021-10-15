package homework15;

import java.util.HashMap;
import java.util.Map;

public class GoodsMap {
    double seasonalDiscount = 0.2;

    public Map<String, Double> convertEnumToMap (){
        Map<String, Double> convertEnumToMap = new HashMap<>();
        for (GoodsENUM goodENUM : GoodsENUM.values()) {
            convertEnumToMap.put(goodENUM.getName(), goodENUM.getPrice());
        } return convertEnumToMap;
    }

    /*public Map<String, Double> goodsMap (Map<String, Double> fullPrice) {
        for (Map.Entry<String, Double> entry : fullPrice.entrySet()) {
            entry.setValue(entry.getValue());
        } return fullPrice;
    }*/

    public Map<String, Double> applyDiscountToGoods (Map<String, Double> fullPriceGoods) {
        for (Map.Entry<String, Double> entry : fullPriceGoods.entrySet()) {
            entry.setValue(entry.getValue() * (1 - seasonalDiscount));
        } return fullPriceGoods;
    }

    public void printGoods (Map<String, Double> full){
        full.forEach((key, value) -> System.out.println("Price of item " + key + " is " + value + "UAH"));
    }
}
