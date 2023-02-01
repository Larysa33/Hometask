package by.teachmeskills.hometask12;
/*Создайте класс «Шар». Класс должен иметь свойство «Размер»
и конструктор для установки размера при создании.
Изменять размер шара после создания нельзя.*/

import java.util.Objects;
import java.util.Random;

public class Sphere implements Comparable<Sphere> {

    private final int size;

    public Sphere(int size) {
        this.size = size;
    }

    public Sphere() {
        Random random = new Random();
        this.size = random.nextInt(6) + 5;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return getSize() == sphere.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public int compareTo(Sphere sphere) {
        return Integer.compare(size, sphere.size);
    }
}
