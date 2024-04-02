package ru.geekbrains.oop.lesson6.srp2;

import java.util.Scanner;

public class Order{

    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public void inputFromConsole(){
        clientName = prompt("Имя клиента ");
        product = prompt("Продукт: ");
        qnt = Integer.parseInt(prompt("Кол-во: "));
        price = Integer.parseInt(prompt("Цена: "));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    protected String getClientName() {
        return clientName;
    }

    protected String getProduct() {
        return product;
    }

    protected int getQnt() {
        return qnt;
    }

    protected int getPrice() {
        return price;
    }

}
