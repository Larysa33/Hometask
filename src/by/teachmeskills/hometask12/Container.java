package by.teachmeskills.hometask12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*Создайте класс «Контейнер». В контейнер должны помещаться шары.
В контейнере не должно быть одинаковых шаров
(т.е. необходимо осуществлять проверку при добавлении шара на наличие его в контейнере).
Контейнер должен включать следующие методы:
a. Добавление шара
b. Удаление шара
c. Подсчет количества шаров в контейнере
d. Подсчет суммарного размера шаров в контейнере
e. Очистка контейнера
f. Поиск шара в контейнере (проверка наличия)
g. Вывод размеров всех шаров в контейнере
*/

public class Container {
    protected Set<Sphere> spheres;

    public Container() {
        this.spheres = new HashSet<>();
    }

    //Метод для добавления шара
    public void addSphere(Sphere sphere){
       if (spheres.contains(sphere)){
           System.out.println(sphere+" уже определён в наборе. Пожалуйста, добавьте шар с дургим размером.");
       }else{
           spheres.add(sphere);
       }
    }

    //Метод для удаления шара
    public void removeSphere(Sphere sphere){
        boolean isRemoved=spheres.remove(sphere);
        if(isRemoved){
            System.out.println(sphere + " был удалён из коллекции");
        }else{
            System.out.println("В коллекции нет шара " + sphere);
        }
    }

    //Метод для добавления нескольких шаров в коллекию
    public void addSpheres(Set<Sphere> spheres){
        this.spheres.addAll(spheres);
    }

    //Метод подсчета количества шаров в контейнере
    public void getSpheresNumber(){
        System.out.println("В контейнере находится " + this.spheres.size() + " шаров");
    }

    //Метод очистки контейнера
    public void cleanUpContainer(){
        this.spheres.clear();
    }

    //Метод поиска шара в контейнере (проверка наличия)
    public void printExistSphere(Sphere sphere){
        boolean matches=this.spheres.stream()
                .anyMatch(s->spheres.contains(sphere));
        if(matches){
            System.out.println(sphere.toString());
        }else{
            System.out.println(spheres +" не содержит " +sphere.toString());
        }
    }

    //Вывод размера всех шаров
    public void printSphereSize(){
        System.out.println("Размеры шаров:");
        this.spheres.forEach(s-> System.out.println(s.getSize()));
    }

    //Вывод суммы размера всех шаров
    public int getSumOfSpheresSizes() {
        int sum = this.spheres.stream()
                .mapToInt(Sphere::getSize)
                .sum();
        System.out.println("Сумма размеров шаров = " + sum);
        return sum;
    }

    //Вывод информации обо всех шарах
    public void printSpheres() {
        if (this.spheres.size() == 0) {
            System.out.println("Контейнер пустой!");
        } else {
            System.out.println(this.spheres);
        }
    }

    @Override
    public String toString() {
        return "Container{" +
                "spheres=" + spheres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return Objects.equals(spheres, container.spheres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spheres);
    }
}
