package by.teachmeskills.hometask12;

import java.util.List;
import java.util.Set;

public class BoxDemo {
    public static void main(String[] args) {
        Container container = new Container();
        Set<Sphere> spheres = Set.of(new Sphere(1), new Sphere(5), new Sphere(10));
        Sphere sphere = new Sphere(40);

        container.printSpheres();
        container.addSpheres(spheres);
        container.printSpheres();
        container.printSphereSize();
        container.getSumOfSpheresSizes();
        container.getSpheresNumber();
        container.printExistSphere(sphere);
        container.removeSphere(sphere);
        container.printSpheres();
        container.cleanUpContainer();
        System.out.println(spheres);

        Sphere sphereWithRandomSize = new Sphere();
        container.addSphere(sphereWithRandomSize);

        Set<Sphere> spheres1 = Set.of(new Sphere(22), new Sphere(54), new Sphere(99), new Sphere(33)
                , new Sphere(11), new Sphere(12), new Sphere(45), new Sphere(66), new Sphere(83));
        Box box = new Box(10);
        box.printSpheres();
        box.addSpheres(spheres1);
        box.printSpheres();
        List<Sphere> sortedSpheres = box.getSortedSpheres();
        System.out.println(sortedSpheres);
        box.printBalls();
    }
}
