package ru.geekbrains.oop.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson extends Order{

    public void saveToJson(){

    String fileName = "order.json";

        try (FileWriter writer = new FileWriter(fileName, false)) {
        writer.write("{\n");
        writer.write("\"clientName\":\""+super.getClientName()+"\",\n");
        writer.write("\"product\":\""+super.getProduct()+"\",\n");
        writer.write("\"qnt\":"+super.getQnt()+",\n");
        writer.write("\"price\":"+super.getPrice()+"\n");
        writer.write("}\n");
        writer.flush();
    } catch (
    IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
