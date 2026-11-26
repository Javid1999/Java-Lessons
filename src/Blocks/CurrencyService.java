package Blocks;

import java.util.HashMap;
import java.util.Map;

public class CurrencyService {

    private  static  final Map<String, Integer> currencies = new HashMap<>();
    static {
        currencies.put("USD",840);
        currencies.put("EUR",978);
        currencies.put("AZN",944);
    }
    public static Integer getCurrencyCode(String currency){
        return currencies.get(currency);
    }



    public static void main(String[] args) {
        System.out.println(getCurrencyCode("USD"));
        System.out.println(getCurrencyCode("EUR"));
        System.out.println(getCurrencyCode("AZN"));
    }
}
