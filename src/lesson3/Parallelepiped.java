package lesson3;

public class Parallelepiped {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 7;
        int sideThree = 10;

        int totalLength = sideOne + sideTwo + sideThree;
        int volume = sideOne * sideTwo * sideThree;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Cумарна довжина всіх сторін = "+totalLength);


    }
}
