package view;

import model.Paralelograma;
import model.Trapezio;

public class Main {

    public static void main(String[] args) {
        Paralelograma p = new Paralelograma();
        Trapezio t = new Trapezio();
        p.setBase(8);
        p.setAltura(4);
        System.out.println("Area paralelograma: " + p.calcArea() +
                "\nPerimetro paralelograma: " + p.calPerimetro());

        t.setBase(13);
        t.setBaseMenor(10);
        t.setAltura(4);

        System.out.println("Area trapezio: " + t.calcArea() +
                "\nPerimetro trapezio: " + t.calPerimetro());
    }
}
