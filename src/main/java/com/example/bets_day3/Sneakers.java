package com.example.bets_day3;

public class Sneakers extends ShoeStore {

    // Унікальні поля
    private String brand;
    private boolean isRunningShoe;
    private boolean isWaterproof;
    private String color;

    // Гетери і Сетери
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRunningShoe() {
        return isRunningShoe;
    }

    public void setRunningShoe(boolean runningShoe) {
        isRunningShoe = runningShoe;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Конструктори
    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, String address, int numberOfShoes, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name, address, numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, String address, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name, address);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(int numberOfShoes, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String address, int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String address, int numberOfShoes, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(address, numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, String address, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name, address, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, double pricePerShoe, String brand, boolean isRunningShoe, boolean isWaterproof) {
        super(name, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
    }

    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, int numberOfShoes, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, address, numberOfShoes);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, address);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(int numberOfShoes, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(numberOfShoes);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String address, int numberOfShoes, double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(address, numberOfShoes, pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String address, int numberOfShoes, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(address, numberOfShoes);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(int numberOfShoes, double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(numberOfShoes, pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, address, pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, double pricePerShoe, boolean isRunningShoe, boolean isWaterproof, String color) {
        super(name, pricePerShoe);
        this.isRunningShoe = isRunningShoe;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, int numberOfShoes, String brand, boolean isWaterproof, String color) {
        super(name, address, numberOfShoes);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, String brand, boolean isWaterproof, String color) {
        super(name, address);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String brand, boolean isWaterproof, String color) {
        super(name);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(int numberOfShoes, String brand, boolean isWaterproof, String color) {
        super(numberOfShoes);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String address, int numberOfShoes, double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String address, int numberOfShoes, String brand, boolean isWaterproof, String color) {
        super(address, numberOfShoes);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(int numberOfShoes, double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(name, address, pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, double pricePerShoe, String brand, boolean isWaterproof, String color) {
        super(name, pricePerShoe);
        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.color = color;
    }

    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String name, String address, int numberOfShoes, String brand, boolean isRunningShoe) {
        super(name, address, numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String name, String address, String brand, boolean isRunningShoe) {
        super(name, address);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String name, String brand, boolean isRunningShoe) {
        super(name);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(int numberOfShoes, String brand, boolean isRunningShoe) {
        super(numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(double pricePerShoe, String brand, boolean isRunningShoe) {
        super(pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String address, int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe) {
        super(address, numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String address, int numberOfShoes, String brand, boolean isRunningShoe) {
        super(address, numberOfShoes);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(int numberOfShoes, double pricePerShoe, String brand, boolean isRunningShoe) {
        super(numberOfShoes, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String name, String address, double pricePerShoe, String brand, boolean isRunningShoe) {
        super(name, address, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    public Sneakers(String name, double pricePerShoe, String brand, boolean isRunningShoe) {
        super(name, pricePerShoe);
        this.brand = brand;
        this.isRunningShoe = isRunningShoe;
    }

    // Функціональні методи

    // Рекомендування розміру
    public int recommendSize(int footLengthCM) {
        int recommendedSize;
        if (footLengthCM <= 23) {
            recommendedSize = 36;
        } else if (footLengthCM <= 24) {
            recommendedSize = 37;
        } else if (footLengthCM <= 25) {
            recommendedSize = 38;
        } else {
            recommendedSize = 38;
        }
        return recommendedSize;
    }

    // Визначення для активності
    public boolean isSuitableForActivity(String activity) {
        if (activity.equalsIgnoreCase("running") && isRunningShoe) {
            return true;
        } else if (activity.equalsIgnoreCase("walking") || activity.equalsIgnoreCase("training")) {
            return true;
        } else {
            return false;
        }
    }

    // Чищення кросівок
    public void cleanShoes() {
        System.out.println("Cleaning " + this.brand + " sneakers...");
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
        return "Sneakers{" +
                "brand='" + brand + '\'' +
                ", isRunningShoe=" + isRunningShoe +
                ", isWaterproof=" + isWaterproof +
                ", color='" + color + '\'' +
                '}';
    }

    public Sneakers(String name, String address, int numberOfShoes, double pricePerShoe) {
        super(name, address, numberOfShoes, pricePerShoe);
    }
}
