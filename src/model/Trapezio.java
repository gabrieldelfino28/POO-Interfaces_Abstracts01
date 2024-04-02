package model;

public class Trapezio extends Quadrilatero {
    private int baseMenor;

    public Trapezio() {
        super();
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calPerimetro() {
        float baseTriangulo = getBase() - getBaseMenor();
        float hipotenusaTriangulo = (float) Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(getAltura(), 2));
        return (2 * hipotenusaTriangulo) + getBase() + getBaseMenor();
    }

    @Override
    public float calcArea() {
        return ((getBase() + getBaseMenor()) * getAltura()) / 2;
    }


}
