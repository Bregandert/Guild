public class Vendor implements Seller {
    //Метод для продажи
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.HPPOTION) {
            result = "HP potion";
        }
        return result;
    }
    //Энам для товаров
    public enum Goods {
        HPPOTION,
        MPPOTION

    }
}