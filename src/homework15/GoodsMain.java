package homework15;


public class GoodsMain {
    public static void main(String[] args) {
        GoodsMap mapOperations = new GoodsMap();
        mapOperations.convertEnumToMap();
        System.out.println("Price list: ");
        mapOperations.printGoods(mapOperations.convertEnumToMap());
        System.out.println();
        System.out.println("Price list with discount: ");
        mapOperations.printGoods(mapOperations.applyDiscountToGoods(mapOperations.convertEnumToMap()));

    }
}
