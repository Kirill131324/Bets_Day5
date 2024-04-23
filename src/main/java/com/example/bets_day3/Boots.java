package com.example.bets_day3;


public class Boots extends ShoeStore{

    // Уникальные поля
    private String waterResistance;
    private String lacingType;
    private int shaftHeight;
    private String Activities;

    // Гетери і Сетери
    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getLacingType() {
        return lacingType;
    }

    public void setLacingType(String lacingType) {
        this.lacingType = lacingType;
    }

    public int getShaftHeight() {
        return shaftHeight;
    }

    public void setShaftHeight(int shaftHeight) {
        this.shaftHeight = shaftHeight;
    }

    public String getActivities() {
        return Activities;
    }

    public void setActivities(String activities) {
        Activities = activities;
    }

    // Конструктори
    public Boots(String name, String address, int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight, String activities) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String address, int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, String address, int numberOfShoes, String waterResistance, String lacingType, int shaftHeight) {
        super(name, address, numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, String address, String waterResistance, String lacingType, int shaftHeight) {
        super(name, address);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, String waterResistance, String lacingType, int shaftHeight) {
        super(name);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(int numberOfShoes, String waterResistance, String lacingType, int shaftHeight) {
        super(numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String address, int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(address, numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String address, int numberOfShoes, String waterResistance, String lacingType, int shaftHeight) {
        super(address, numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, String address, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(name, address, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, double pricePerShoe, String waterResistance, String lacingType, int shaftHeight) {
        super(name, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
    }

    public Boots(String name, String address, int numberOfShoes, double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String address, int numberOfShoes, String lacingType, int shaftHeight, String activities) {
        super(name, address, numberOfShoes);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String address, String lacingType, int shaftHeight, String activities) {
        super(name, address);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String lacingType, int shaftHeight, String activities) {
        super(name);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(int numberOfShoes, String lacingType, int shaftHeight, String activities) {
        super(numberOfShoes);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String address, int numberOfShoes, double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(address, numberOfShoes, pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String address, int numberOfShoes, String lacingType, int shaftHeight, String activities) {
        super(address, numberOfShoes);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(int numberOfShoes, double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(numberOfShoes, pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String address, double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(name, address, pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, double pricePerShoe, String lacingType, int shaftHeight, String activities) {
        super(name, pricePerShoe);
        this.lacingType = lacingType;
        this.shaftHeight = shaftHeight;
        Activities = activities;
    }

    public Boots(String name, String address, int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String name, String address, int numberOfShoes, String waterResistance, String lacingType) {
        super(name, address, numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String name, String address, String waterResistance, String lacingType) {
        super(name, address);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String name, String waterResistance, String lacingType) {
        super(name);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(int numberOfShoes, String waterResistance, String lacingType) {
        super(numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(double pricePerShoe, String waterResistance, String lacingType) {
        super(pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String address, int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType) {
        super(address, numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String address, int numberOfShoes, String waterResistance, String lacingType) {
        super(address, numberOfShoes);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(int numberOfShoes, double pricePerShoe, String waterResistance, String lacingType) {
        super(numberOfShoes, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String name, String address, double pricePerShoe, String waterResistance, String lacingType) {
        super(name, address, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    public Boots(String name, double pricePerShoe, String waterResistance, String lacingType) {
        super(name, pricePerShoe);
        this.waterResistance = waterResistance;
        this.lacingType = lacingType;
    }

    // Функціональні методи

    // Калькулятор, скільки "проживе" взуття
    public int calculateEstimatedBootLife(int wearFrequency) {
        int baseLife = 12;
        double adjustmentFactor = 1.0;

        if (wearFrequency > 5) {
            adjustmentFactor = 0.8;
        } else if (waterResistance.equalsIgnoreCase("Waterproof")) {
            adjustmentFactor = 1.2;
        }

        return (int) Math.round(baseLife * adjustmentFactor);
    }

    // Перевірка, чи підходять черевики для зими
    public boolean isWinterBootSuitable(double temperature) {
        return (waterResistance.equalsIgnoreCase("Waterproof") && shaftHeight >= 6) && (temperature <= 32);
    }

    // Рекомендація щодо взуття по одягу
    public String getStyleRecommendation(String outfitDescription) {
        if (outfitDescription.toLowerCase().contains("jeans") || outfitDescription.toLowerCase().contains("casual")) {
            if (lacingType.equalsIgnoreCase("Workboot")) {
                return "For a more casual look, pair your work boots with jeans or chinos and a simple T-shirt.";
            } else {
                return "With jeans or casual attire, consider our ankle boots with " + lacingType + " lacing for a stylish touch.";
            }
        } else if (outfitDescription.toLowerCase().contains("dress") || outfitDescription.toLowerCase().contains("formal")) {
            if (shaftHeight >= 8) {
                return "For a formal occasion, our knee-high boots with " + lacingType + " lacing will elevate your dress.";
            } else {
                return "Elevate your formal attire with our ankle boots or booties featuring " + lacingType + " lacing.";
            }
        } else {
            return "Based on your outfit description, we recommend visiting our store to explore our wide range of boots and get personalized styling advice.";
        }
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
        return "Boots{" +
                "waterResistance='" + waterResistance + '\'' +
                ", lacingType='" + lacingType + '\'' +
                ", shaftHeight=" + shaftHeight +
                ", Activities='" + Activities + '\'' +
                '}';
    }

    public Boots(String name, String address, int numberOfShoes, double pricePerShoe) {
        super(name, address, numberOfShoes, pricePerShoe);
    }
}
