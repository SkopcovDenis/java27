package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Proizvoditel dell = new Proizvoditel();
        dell.setName("DELL");
        dell.setPathToImage("https://www.mvideo.ru/products/noutbuk-hp-pavilion-15-eh1027ur-491k8ea-30056999");

        User user = new User();
        user.setName("Ден");
        user.setRate(160);
        user.setPaathToAvatar("https://javarush.ru/me");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRate(5);
        otziv.setText("Супе, круто?  Круто!!");


        Tovar tovar = new Tovar();
        tovar.setId(123);
        tovar.setPrice(52000);
        tovar.setName("Ноутбук");
        tovar.addOtziv(otziv);
        tovar.setProizvoditel(dell);
    }
}
