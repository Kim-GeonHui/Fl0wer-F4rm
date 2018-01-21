package item;

/**
 * Created by tahm_ on 2018-01-19.
 */

public class Pocket {
    protected int code;
    protected String name;
    protected int price;

    public Pocket (int g_code, String g_name, int g_price) {
        code = g_code;
        name = g_name;
        price = g_price;
    }
}

    Pocket n_p_1000 = new Pocket(1000, "일반 씨앗 주머니", 1000);
    Pocket h_p_1001 = new Pocket(1001, "희귀한 씨앗 주머니", 3000);