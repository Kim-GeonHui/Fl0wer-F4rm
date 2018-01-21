package item;

/**
 * Created by tahm_ on 2018-01-15.
 */

public class Flower {
    protected  int code;
    protected String name;
    protected  int price;

    public Flower (int g_code, String g_name, int g_price) {
        code = g_code;
        name = g_name;
        price = g_price;
    }
}

    Flower f_5000 = new Flower (5000, "라벤더", 2000);
    Flower f_5001 = new Flower (5001, "레몬밤", 2000);
    Flower f_5002 = new Flower (5002, "만다린", 3000);
    Flower f_5003 = new Flower (5003, "마조람", 2000);

    Flower f_5900 = new Flower (5900, "설원 장미", 5000);