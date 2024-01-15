package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Product product1 = new Product("Długopis", "Superpiszący długopis", 10, "Artykuły biurowe");
        Product product2 = new Product("Piłka", "Piłka do siatkówki", 10, "Sport i rekreacja");
        Product product3 = new Product("Czekolada", "Pyszna czekolada", 10, "Słodycze");
        PriceConverting counter = new PriceConverting();
        counter.toCount(product1);
        counter.toCount(product2);
        counter.toCount(product3);
        System.out.println(counter.toCount(product1));
        System.out.println(counter.toCount(product2));
        System.out.println(counter.toCount(product3));
    }
}
