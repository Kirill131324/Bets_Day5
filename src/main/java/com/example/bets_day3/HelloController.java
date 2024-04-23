package com.example.bets_day3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Bit1;

    @FXML
    private TextField Edi1;

    @FXML
    private TextField Edi2;

    @FXML
    private TextField Edi3;

    @FXML
    private TextField Edi4;

    @FXML
    private TextField Edi5;

    @FXML
    private TextField Edi6;

    @FXML
    private TextField Edi7;

    @FXML
    private TextField Edi8;

    @FXML
    private ListView<String> Li;

    @FXML
    private Label Лаб1;

    @FXML
    private Label Лаб2;

    @FXML
    private Label Лаб3;

    @FXML
    private Label Лаб4;

    @FXML
    private Label Лаб5;

    @FXML
    private Label Лаб6;

    @FXML
    private Label Лаб7;

    @FXML
    private Label Лаб8;

    @FXML
    private Label Лаб9;

    @FXML
    private Label Лаб10;

    @FXML
    private Label Лаб19;

    @FXML
    private Label Лаб15;

    @FXML
    private Label Лаб13;

    @FXML
    private Label Лаб18;

    @FXML
    private Label Лаб20;

    @FXML
    private Label Лаб16;

    @FXML
    private Label Лаб17;

    @FXML
    private Label Лаб14;

    @FXML
    private Label Лаб12;

    @FXML
    private Label Лаб11;

    @FXML
    private TextField Edi20;

    @FXML
    private TextField Edi19;

    @FXML
    private TextField Edi18;

    @FXML
    private TextField Edi17;

    @FXML
    private TextField Edi16;

    @FXML
    private TextField Edi15;

    @FXML
    private TextField Edi14;

    @FXML
    private TextField Edi13;

    @FXML
    private TextField Edi12;

    @FXML
    private TextField Edi11;

    @FXML
    private TextField Edi10;

    @FXML
    private TextField Edi9;

    @FXML
    private Button Bit2;


    @FXML
    void initialize() {
        Bit1.setOnAction(event -> {
            try {
                // Витягнути дані з текстових полів
                String name = Edi1.getText();
                String address = Edi2.getText().isEmpty() ? null : Edi2.getText();
                int numberOfShoes = Edi3.getText().isEmpty() ? 0 : Integer.parseInt(Edi3.getText());
                double pricePerShoe = Edi4.getText().isEmpty() ? 0.0 : Double.parseDouble(Edi4.getText());
                String brand = Edi5.getText();
                boolean isRunningShoe = Boolean.parseBoolean(Edi6.getText());
                boolean isWaterproof = Boolean.parseBoolean(Edi7.getText());
                String color = Edi8.getText().isEmpty() ? null : Edi8.getText();
                String material = Edi9.getText();
                boolean isHeel = Boolean.parseBoolean(Edi10.getText());
                int heelHeight = Edi11.getText().isEmpty() ? 0 : Integer.parseInt(Edi11.getText());
                String occasion = Edi12.getText().isEmpty() ? null : Edi12.getText();
                boolean WaterResistance = Boolean.parseBoolean(Edi13.getText());
                String lacingType = Edi14.getText().isEmpty() ? null : Edi14.getText();
                int shaftHeight = Edi15.getText().isEmpty() ? 0 : Integer.parseInt(Edi15.getText());
                String Activities = Edi16.getText().isEmpty() ? null : Edi16.getText();
                String strapStyle = Edi17.getText().isEmpty() ? null : Edi17.getText();
                int soleThickness = Edi18.getText().isEmpty() ? 0 : Integer.parseInt(Edi18.getText());
                String footbedMaterial= Edi19.getText().isEmpty() ? null : Edi19.getText();
                String Event = Edi20.getText().isEmpty() ? null : Edi20.getText();

                // Build the data string
                StringBuilder dataString = new StringBuilder();
                dataString.append("Name: ").append(name).append("\n");
                if (address != null) {
                    dataString.append("Address: ").append(address).append("\n");
                }
                dataString.append("Number of Shoes: ").append(numberOfShoes).append("\n");
                dataString.append("Price per Shoe: ").append(pricePerShoe).append("\n");
                dataString.append("Brand: ").append(brand).append("\n");
                dataString.append("Is Running Shoe: ").append(isRunningShoe).append("\n");
                dataString.append("Is Waterproof: ").append(isWaterproof).append("\n");
                if (color != null) {
                    dataString.append("Color: ").append(color).append("\n");
                }
                dataString.append("Material: ").append(material).append("\n");
                dataString.append("Is Heel: ").append(isHeel).append("\n");
                if (isHeel) {
                    dataString.append("Heel Height: ").append(heelHeight).append("\n");
                }
                if (occasion != null) {
                    dataString.append("Occasion: ").append(occasion).append("\n");
                }

                // Додавання нових точок даних
                dataString.append("Water Resistance: ").append(WaterResistance).append("\n");
                dataString.append("Lacing Type: ").append(lacingType).append("\n");
                dataString.append("Shaft Height: ").append(shaftHeight).append("\n");
                dataString.append("Activities: ").append(Activities).append("\n");
                dataString.append("Strap Style: ").append(strapStyle).append("\n");
                dataString.append("Sole Thickness: ").append(soleThickness).append("\n");
                dataString.append("Footbed Material: ").append(footbedMaterial).append("\n");
                dataString.append("Event: ").append(Event).append("\n");


                Li.getItems().add(dataString.toString());

            } catch (NumberFormatException e) {
                System.err.println("Invalid input for number fields. Please enter valid numbers.");
            }
        });
        Bit2.setOnAction(event -> {
            clearListAndTextFields();
        });
    }

    private void clearListAndTextFields() {
        Edi1.clear();
        Edi2.clear();
        Edi3.clear();
        Edi4.clear();
        Edi5.clear();
        Edi6.clear();
        Edi7.clear();
        Edi8.clear();
        Edi9.clear();
        Edi10.clear();
        Edi11.clear();
        Edi12.clear();
        Edi13.clear();
        Edi14.clear();
        Edi15.clear();
        Edi16.clear();
        Edi17.clear();
        Edi18.clear();
        Edi19.clear();
        Edi20.clear();
        Li.getItems().clear();
    }
}
