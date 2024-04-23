package com.example.bets_day3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;



public class ReportGen {
    public static void generateReport(String serializedShoeStores) {
        try (JsonWriter writer = new JsonWriter(new FileWriter("report.json"))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.beginArray();

            JsonElement jsonElement = gson.fromJson(serializedShoeStores, JsonElement.class);

            gson.toJson(jsonElement, writer);

            writer.endArray();
        } catch (IOException e) {
            System.out.println("Error generating report: " + e.getMessage());
        }
    }
}