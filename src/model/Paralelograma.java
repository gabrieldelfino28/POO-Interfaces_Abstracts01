package model;

public class Paralelograma extends Quadrilatero {

    public Paralelograma() {
        super();
    }

    @Override
    public float calPerimetro() {
        return 2 * (getBase() + getAltura());
    }

    @Override
    public float calcArea() {
        return getBase() * getAltura();
    }
}
