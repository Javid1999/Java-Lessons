package Cacheme;

public class Main {
    public static void main(String[] args) {
        Cache<String> sessionCache = new Cache<>();
        sessionCache.save("ACVEF4E1");
        System.out.println(sessionCache.get());
        sessionCache.remove();
        System.out.println(sessionCache.get());

        Cache<Integer> otpCache = new Cache<>();
        otpCache.save(458172);
        System.out.println(otpCache.get());
        otpCache.remove();
        System.out.println(otpCache.get());

        Cache<Double> balanceCache = new Cache<>();
        balanceCache.save(1250.75);
        System.out.println(balanceCache.get());
    }
}
