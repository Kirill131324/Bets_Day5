package com.example.bets_day3;

public class ShoeStore {

    // Змінні для зберігання інформації про магазин
    protected String name;
    protected String address;
    protected int numberOfShoes;
    protected double pricePerShoe;

    // Конструктори для створення нового магазину взуття
    public ShoeStore(String name, String address, int numberOfShoes, double pricePerShoe) {
        this.name = name;
        this.address = address;
        this.numberOfShoes = numberOfShoes;
        this.pricePerShoe = pricePerShoe;
    }

    public ShoeStore(String name, String address, int numberOfShoes) {
        this.name = name;
        this.address = address;
        this.numberOfShoes = numberOfShoes;
    }

    public ShoeStore(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ShoeStore(String name) {
        this.name = name;
    }

    public ShoeStore(int numberOfShoes) {
        this.numberOfShoes = numberOfShoes;
    }

    public ShoeStore(double pricePerShoe) {
        this.pricePerShoe = pricePerShoe;
    }

    public ShoeStore(String address, int numberOfShoes, double pricePerShoe) {
        this.address = address;
        this.numberOfShoes = numberOfShoes;
        this.pricePerShoe = pricePerShoe;
    }

    public ShoeStore(String address, int numberOfShoes) {
        this.address = address;
        this.numberOfShoes = numberOfShoes;
    }

    public ShoeStore(int numberOfShoes, double pricePerShoe) {
        this.numberOfShoes = numberOfShoes;
        this.pricePerShoe = pricePerShoe;
    }

    public ShoeStore(String name, String address, double pricePerShoe) {
        this.name = name;
        this.address = address;
        this.pricePerShoe = pricePerShoe;
    }

    public ShoeStore(String name, double pricePerShoe) {
        this.name = name;
        this.pricePerShoe = pricePerShoe;
    }


    // Функціональні методи

    // Отримати загальну вартість взуття в магазині
    public double getTotalShoePrice() {
        return numberOfShoes * pricePerShoe;
    }

    // Продати певну кількість взуття
    public void sellShoes(int quantity) {
        if (quantity <= numberOfShoes) {
            numberOfShoes -= quantity;
            System.out.println("Sold " + quantity + " pairs of shoes. What's left is " + numberOfShoes + " pairs.");
        } else {
            System.out.println("Not enough shoes in the warehouse. The only thing left is  " + numberOfShoes + " pairs.");
        }
    }

    // Додати нову партію взуття
    public void addShoes(int quantity) {
        numberOfShoes += quantity;
        System.out.println("Added " + quantity + " pairs of shoes. Now in stock " + numberOfShoes + " pairs.");
    }

    // Змінити ціну взуття
    public void changeShoePrice(double newPrice) {
        if (newPrice > 0) {
            pricePerShoe = newPrice;
            System.out.println("The price of shoes has been changed to " + pricePerShoe + " UAH for a pair.");
        } else {
            System.out.println("It is impossible to set a negative price.");
        }
    }

    // Власнi функціональні методи

    // Отримати інформацію про магазин
    public String getStoreInfo() {
        return "Store name: " + name + "\nAddress: " + address + "\nThe number of shoes: " + numberOfShoes + "\nPrice per pair: " + pricePerShoe + " UAH.";
    }

    // Перевірити, чи є взуття певного розміру
    public boolean hasShoesInSize(int size) {
        // Створити масив для зберігання наявності взуття в кожному розмірі
        int[] shoeAvailability = new int[50]; // Припустимо, що розміри взуття від 1 до 50

        // Заповнити масив числами від 1 до 50
        for (int i = 0; i < shoeAvailability.length; i++) {
            shoeAvailability[i] = i + 1;
        }

        // Перевірити, чи є взуття заданого розміру
        if (size >= 1 && size <= 50) {
            return shoeAvailability[size - 1] > 0;
        } else {
            return false;
        }
    }

}
