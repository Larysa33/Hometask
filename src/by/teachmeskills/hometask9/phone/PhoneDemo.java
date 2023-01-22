package by.teachmeskills.hometask9.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        /*
        Вызвать из конструктора с тремя параметрами конструктор с двумя. - Это как?!
        */

        Phone phone1 = new Phone();
        phone1.getNumber();
        phone1.phoneInfo();
        phone1.receiveCall("Стас", "+375291111111");

        Phone phone2 = new Phone("+375292222222", "Huawei");
        phone2.getNumber();
        phone2.phoneInfo();
        phone2.receiveCall("Женя", "+375291111111");

        Phone phone3 = new Phone("+375999999999", "iPhone 7", 500);
        String[] numbers = {"+375293333333", "+375294444444", "+375295555555"};
        phone3.sendMessage(numbers);
        phone3.phoneInfo();
    }
}
