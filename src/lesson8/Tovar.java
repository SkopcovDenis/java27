package lesson8;

import java.util.ArrayList;

public class Tovar {
    private int id;
    private String name;
    private int price;
    private  Proizvoditel proizvoditel;
    private ArrayList<Otziv> otzivi = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(int id, String name, int price, Proizvoditel proizvoditel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.proizvoditel = proizvoditel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Proizvoditel getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(Proizvoditel proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public ArrayList<Otziv> getOtzivi() {
        return otzivi;
    }

    public void setOtzivi(ArrayList<Otziv> otzivi) {
        this.otzivi = otzivi;
    }
    public void addOtziv(Otziv otziv){
        otzivi.add(otziv);

    }
}
