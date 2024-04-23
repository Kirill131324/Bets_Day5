package com.example.bets_day3;

public class Sandals extends ShoeStore {

    // Унікальні поля
    private String strapStyle;
    private double soleThickness;
    private String footbedMaterial;
    private String event;

    // Гетери і Сетери
    public String getStrapStyle() {
        return strapStyle;
    }

    public void setStrapStyle(String strapStyle) {
        this.strapStyle = strapStyle;
    }

    public double getSoleThickness() {
        return soleThickness;
    }

    public void setSoleThickness(double soleThickness) {
        this.soleThickness = soleThickness;
    }

    public String getFootbedMaterial() {
        return footbedMaterial;
    }

    public void setFootbedMaterial(String footbedMaterial) {
        this.footbedMaterial = footbedMaterial;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    // Конструктори
    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial, String event) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, String address, int numberOfShoes, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name, address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, String address, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name, address);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(int numberOfShoes, String strapStyle, double soleThickness, String footbedMaterial) {
        super(numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String address, int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String address, int numberOfShoes, String strapStyle, double soleThickness, String footbedMaterial) {
        super(address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, String address, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name, address, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, double pricePerShoe, String strapStyle, double soleThickness, String footbedMaterial) {
        super(name, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
    }

    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, int numberOfShoes, double soleThickness, String footbedMaterial, String event) {
        super(name, address, numberOfShoes);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, double soleThickness, String footbedMaterial, String event) {
        super(name, address);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, double soleThickness, String footbedMaterial, String event) {
        super(name);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(int numberOfShoes, double soleThickness, String footbedMaterial, String event) {
        super(numberOfShoes);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String address, int numberOfShoes, double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(address, numberOfShoes, pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String address, int numberOfShoes, double soleThickness, String footbedMaterial, String event) {
        super(address, numberOfShoes);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(int numberOfShoes, double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(numberOfShoes, pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(name, address, pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, double pricePerShoe, double soleThickness, String footbedMaterial, String event) {
        super(name, pricePerShoe);
        this.soleThickness = soleThickness;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, int numberOfShoes, String strapStyle, String footbedMaterial, String event) {
        super(name, address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, String strapStyle, String footbedMaterial, String event) {
        super(name, address);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String strapStyle, String footbedMaterial, String event) {
        super(name);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(int numberOfShoes, String strapStyle, String footbedMaterial, String event) {
        super(numberOfShoes);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String address, int numberOfShoes, double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String address, int numberOfShoes, String strapStyle, String footbedMaterial, String event) {
        super(address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(int numberOfShoes, double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(name, address, pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, double pricePerShoe, String strapStyle, String footbedMaterial, String event) {
        super(name, pricePerShoe);
        this.strapStyle = strapStyle;
        this.footbedMaterial = footbedMaterial;
        this.event = event;
    }

    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness) {
        super(name, address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String name, String address, int numberOfShoes, String strapStyle, double soleThickness) {
        super(name, address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String name, String address, String strapStyle, double soleThickness) {
        super(name, address);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String name, String strapStyle, double soleThickness) {
        super(name);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(int numberOfShoes, String strapStyle, double soleThickness) {
        super(numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(double pricePerShoe, String strapStyle, double soleThickness) {
        super(pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String address, int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness) {
        super(address, numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String address, int numberOfShoes, String strapStyle, double soleThickness) {
        super(address, numberOfShoes);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(int numberOfShoes, double pricePerShoe, String strapStyle, double soleThickness) {
        super(numberOfShoes, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String name, String address, double pricePerShoe, String strapStyle, double soleThickness) {
        super(name, address, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    public Sandals(String name, double pricePerShoe, String strapStyle, double soleThickness) {
        super(name, pricePerShoe);
        this.strapStyle = strapStyle;
        this.soleThickness = soleThickness;
    }

    // Функціональні методи

    // Визначає товщину підошви відповідно до виду діяльності
    public double recommendSoleThickness(String activity) {
        if (activity.equalsIgnoreCase("beachwear") || activity.equalsIgnoreCase("poolside")) {
            return 0.5;
        } else if (activity.equalsIgnoreCase("walking") || activity.equalsIgnoreCase("hiking")) {
            return 1.0;
        } else if (activity.equalsIgnoreCase("water sports")) {
            return 1.5;
        } else {
            return 0.0;
        }
    }

    // Визначає чи підходить матеріал взуття для певного заходу
    public boolean isMaterialSuitableForEvent(String event) {
        String footbedMaterial = getFootbedMaterial();
        if (footbedMaterial.equalsIgnoreCase("leather") && (event.equalsIgnoreCase("wedding") || event.equalsIgnoreCase("dressy occasions"))) {
            return true;
        } else if (footbedMaterial.equalsIgnoreCase("synthetic") && (event.equalsIgnoreCase("beachwear") || event.equalsIgnoreCase("poolside"))) {
            return true;
        } else {
            return false;
        }
    }

    // Визначає тип ремінця під певний одяг
    public String suggestPairings(String outfitDescription) {
        String strapStyle = getStrapStyle();
        if (outfitDescription.toLowerCase().contains("dress") || outfitDescription.toLowerCase().contains("skirt")) {
            if (strapStyle.equalsIgnoreCase("ankle strap")) {
                return "Our elegant ankle strap sandals would complement your dress or skirt perfectly.";
            } else {
                return "Consider our gladiator sandals for a more statement-making look with your dress or skirt.";
            }
        } else if (outfitDescription.toLowerCase().contains("jeans") || outfitDescription.toLowerCase().contains("casual")) {
            return "For a casual look, our T-strap sandals or slide sandals would be a great choice.";
        } else {
            return "We recommend visiting our store to explore a wider selection of sandals and find the perfect pair for your outfit.";
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
        return "Sandals{" +
                "strapStyle='" + strapStyle + '\'' +
                ", soleThickness=" + soleThickness +
                ", footbedMaterial='" + footbedMaterial + '\'' +
                ", event='" + event + '\'' +
                '}';
    }

    public Sandals(String name, String address, int numberOfShoes, double pricePerShoe) {
        super(name, address, numberOfShoes, pricePerShoe);
    }
}
