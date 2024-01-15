package pl.javastart.task;

public class PriceConverting {
    double toCount(Product product) {
        double bruttoPrice = 0;
        switch (product.getCategory()) {
            case "Artykuły biurowe":
                bruttoPrice = product.getNettoPrice() * 1.25;
                break;
            case "Sport i rekreacja":
                bruttoPrice = product.getNettoPrice() * 1.23;
                break;
            default:
                bruttoPrice = product.getNettoPrice() * 1.20;
        } return bruttoPrice;
    }
}
