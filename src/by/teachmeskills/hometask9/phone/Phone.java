package by.teachmeskills.hometask9.phone;

import java.util.Arrays;

public class Phone {
    /* Задание 1.
    1. Создайте класс Phone, который содержит переменные number, model и weight.
    2. Добавить конструктор в класс Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight.
    3. Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model.
    4. Добавить конструктор без параметров
*/
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
    /* Добавить в класс Phone методы:
    receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
    */

    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

    public String getNumber() {
        if (this.number == null) {
            System.out.println("Номер не задан.\n");
        }else{
            System.out.println("Заданный номер: " + this.number);
        }
        return number;
    }

    /*Добавьте перегруженный метод receiveCall, который принимает два параметра - имя и номер звонящего.
    Вызвать этот метод.*/
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number+"\n");
    }

    /* Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213). Данный метод принимает
    на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.*/

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение будет выслано на следующие номера: " + Arrays.toString(phoneNumbers) + "\n");
    }

    public void phoneInfo(){
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель телефона: " + model);
        System.out.println("Вес телефона: " + weight+"\n");
    }
}
