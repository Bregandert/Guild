public class Vendor implements Seller {

    int priceHPpoi = 5;
    private int healpoints = 10;
    //Метод для продажи
    @Override
    public String sell(Goods goods, Hero hero) {
        String result = "";
        if ((goods == Goods.HPPOTION)&&(hero.getGold()>=priceHPpoi)) {
            hero.setGold(hero.getGold()-priceHPpoi);
            result = "HP potion";
        }
//        return result;
        else {
            result = "";
        }
        return result;
    }

    public int healPoints() {
        return healpoints;
    }
    //Энам для товаров
    public enum Goods {
        HPPOTION,
        MPPOTION

    }
}