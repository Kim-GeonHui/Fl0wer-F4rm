package item;

/**
 * Created by tahm_ on 2018-01-15.
 */

public class Seed {
    protected  int code;
    protected String name;
    protected  int price;

    public Seed(int g_code, String g_name, int g_price) {
        code = g_code;
        name = g_name;
        price = g_price;
    }
}

    Seed s_6000 = new Seed(6000, "라벤더 씨앗", 1000);
    Seed s_6001 = new Seed(6001, "레몬밤 씨앗", 1000);
    Seed s_6002 = new Seed(6002, "만다린 씨앗", 1500);
    Seed s_6003 = new Seed(6003, "마조람 씨앗", 1000);

    Seed s_6900 = new Seed (6900, "설원 장미 씨앗", 2000);