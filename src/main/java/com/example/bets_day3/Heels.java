package com.example.bets_day3;

public class Heels extends ShoeStore {

    // Унікальні поля
    private String material;
    private boolean isHeel;
    private int heelHeight;
    private String occasion;

    // Гетери і Сетери
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHeel() {
        return isHeel;
    }

    public void setHeel(boolean heel) {
        isHeel = heel;
    }

    public int getHeelHeight() {
        return heelHeight;
    }

    public void setHeelHeight(int heelHeight) {
        this.heelHeight = heelHeight;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    // Конструктори
    public Heels(String name, String address, int numberOfShoes, double pricePerShoe, String material, boolean isHeel, int heelHeight, String occasion) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, int numberOfShoes, double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, String address, int numberOfShoes, String material, boolean isHeel, int heelHeight) {
        super(name, address, numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, String address, String material, boolean isHeel, int heelHeight) {
        super(name, address);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, String material, boolean isHeel, int heelHeight) {
        super(name);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(int numberOfShoes, String material, boolean isHeel, int heelHeight) {
        super(numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String address, int numberOfShoes, double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String address, int numberOfShoes, String material, boolean isHeel, int heelHeight) {
        super(address, numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(int numberOfShoes, double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, String address, double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(name, address, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, double pricePerShoe, String material, boolean isHeel, int heelHeight) {
        super(name, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
    }

    public Heels(String name, String address, int numberOfShoes, double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, int numberOfShoes, boolean isHeel, int heelHeight, String occasion) {
        super(name, address, numberOfShoes);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, boolean isHeel, int heelHeight, String occasion) {
        super(name, address);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, boolean isHeel, int heelHeight, String occasion) {
        super(name);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(int numberOfShoes, boolean isHeel, int heelHeight, String occasion) {
        super(numberOfShoes);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String address, int numberOfShoes, double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(address, numberOfShoes, pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String address, int numberOfShoes, boolean isHeel, int heelHeight, String occasion) {
        super(address, numberOfShoes);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(int numberOfShoes, double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(numberOfShoes, pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(name, address, pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, double pricePerShoe, boolean isHeel, int heelHeight, String occasion) {
        super(name, pricePerShoe);
        this.isHeel = isHeel;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, int numberOfShoes, double pricePerShoe, String material, int heelHeight, String occasion) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, int numberOfShoes, String material, int heelHeight, String occasion) {
        super(name, address, numberOfShoes);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, String material, int heelHeight, String occasion) {
        super(name, address);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String material, int heelHeight, String occasion) {
        super(name);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(int numberOfShoes, String material, int heelHeight, String occasion) {
        super(numberOfShoes);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(double pricePerShoe, String material, int heelHeight, String occasion) {
        super(pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String address, int numberOfShoes, double pricePerShoe, String material, int heelHeight, String occasion) {
        super(address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String address, int numberOfShoes, String material, int heelHeight, String occasion) {
        super(address, numberOfShoes);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(int numberOfShoes, double pricePerShoe, String material, int heelHeight, String occasion) {
        super(numberOfShoes, pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, double pricePerShoe, String material, int heelHeight, String occasion) {
        super(name, address, pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, double pricePerShoe, String material, int heelHeight, String occasion) {
        super(name, pricePerShoe);
        this.material = material;
        this.heelHeight = heelHeight;
        this.occasion = occasion;
    }

    public Heels(String name, String address, int numberOfShoes, double pricePerShoe, String material, boolean isHeel) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String name, String address, int numberOfShoes, String material, boolean isHeel) {
        super(name, address, numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String name, String address, String material, boolean isHeel) {
        super(name, address);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String name, String material, boolean isHeel) {
        super(name);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(int numberOfShoes, String material, boolean isHeel) {
        super(numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(double pricePerShoe, String material, boolean isHeel) {
        super(pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String address, int numberOfShoes, double pricePerShoe, String material, boolean isHeel) {
        super(address, numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String address, int numberOfShoes, String material, boolean isHeel) {
        super(address, numberOfShoes);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(int numberOfShoes, double pricePerShoe, String material, boolean isHeel) {
        super(numberOfShoes, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String name, String address, double pricePerShoe, String material, boolean isHeel) {
        super(name, address, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    public Heels(String name, double pricePerShoe, String material, boolean isHeel) {
        super(name, pricePerShoe);
        this.material = material;
        this.isHeel = isHeel;
    }

    // Функціональні методи

    // Рекомендувати певні туфлі до вбрання
    public String suggestPairings(String outfit) {
        String suggestions;
        if (outfit.equalsIgnoreCase("dress") || outfit.equalsIgnoreCase("skirt")) {
            suggestions = "Stilettos, pumps, wedges";
        } else if (outfit.equalsIgnoreCase("pants")) {
            suggestions = "Pumps, kitten heels";
        } else {
            suggestions = "No specific suggestions";
        }
        return suggestions;
    }

    // Визначити комфортність
    public boolean isComfortableForWalking(int heelHeight) {
        return heelHeight <= 5;
    }

    // Рекуомендація висоти каблука до пеного заходу
    public int recommendHeelHeight(String occasion) {
        int recommendedHeight;
        if (occasion.equalsIgnoreCase("wedding") || occasion.equalsIgnoreCase("formal")) {
            recommendedHeight = 7;
        } else if (occasion.equalsIgnoreCase("party") || occasion.equalsIgnoreCase("night out")) {
            recommendedHeight = 5;
        } else if (occasion.equalsIgnoreCase("work") || occasion.equalsIgnoreCase("office")) {
            recommendedHeight = 3;
        } else {
            recommendedHeight = 0;
        }
        return recommendedHeight;
    }


    // Перегрузка методів
    @Override
    public double getTotalShoePrice() {
        return super.getTotalShoePrice();
    }

    @Override
    public void sellShoes(int quantity) {
        super.sellShoes(quantity);
    }

    @Override
    public void addShoes(int quantity) {
        super.addShoes(quantity);
    }

    @Override
    public void changeShoePrice(double newPrice) {
        super.changeShoePrice(newPrice);
    }

    @Override
    public String getStoreInfo() {
        return super.getStoreInfo();
    }

    @Override
    public boolean hasShoesInSize(int size) {
        return super.hasShoesInSize(size);
    }

    @Override
    public String toString() {
        return "Heels{" +
                "material='" + material + '\'' +
                ", isHeel=" + isHeel +
                ", heelHeight=" + heelHeight +
                ", occasion='" + occasion + '\'' +
                '}';
    }

    public Heels(String name, String address, int numberOfShoes, double pricePerShoe) {
        super(name, address, numberOfShoes, pricePerShoe);
    }
}
