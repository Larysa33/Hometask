package by.teachmeskills.hometask12;

/*Создайте класс «Ящик», являющийся наследником класса «Контейнер» и отличающийся от него ограниченным размером.
Размер ящика должен задаваться при его создании (в конструкторе). Изменять размер ящика после создания нельзя.
Если при добавлении шара будет происходить превышение размера ящика, добавления происходить не должно.
Класс должен содержать метод, возвращающий список шаров, отсортированный по размеру.*/

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;
public class Box extends Container {
    private int size;

    public Box(int size) {
        this.size = size;
        spheres = new HashSet<>();
    }

    public void addSpheres(Set<Sphere> spheres) {
        if (checkSpheresSize(spheres)) {
            this.spheres.addAll(spheres);
        }
    }

    private boolean checkSpheresSize(Set<Sphere> spheres) {
        if (spheres.size() <= this.size) {
            return true;
        } else {
            System.out.println("Шары не были добавлены, коробка вмещает максимум 10 шаров. Сейчас в коробке - "
                    + spheres.size() + " шаров.");
            return false;
        }
    }

    public List<Sphere> getSortedSpheres() {
        //new TreeSet
        return this.spheres.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public void printBalls() {
        if (this.spheres.size() == 0) {
            System.out.println("Коробка пустая!");
        } else {
            System.out.println(this.spheres);
        }
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "spheres=" + spheres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        if (!super.equals(o)) return false;
        Box box = (Box) o;
        return Objects.equals(spheres, box.spheres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spheres);
    }
}