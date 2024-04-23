package com.example.bets_day3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Sterelizate {

    private static final Gson gson = new GsonBuilder().create();

    public static String serialize(List<ShoeStore> userList, String fileName) throws IOException {
        String jsonString;
        try (FileWriter fileWriter = new FileWriter(fileName, StandardCharsets.UTF_8)) {
            jsonString = gson.toJson(userList);
            fileWriter.write(jsonString);
        }
        return jsonString;
    }

    public static ArrayList<ShoeStore> deserialize(String fileName) throws IOException {
        ArrayList<ShoeStore> deserializedUserList;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            String jsonLine = bufferedReader.readLine();
            Type type = new TypeToken<ArrayList<ShoeStore>>() {}.getType();
            deserializedUserList = gson.fromJson(jsonLine, type);
        }
        return deserializedUserList;
    }
}
