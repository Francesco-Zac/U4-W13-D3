package entities;

public class Rettangolo {

    public double height;
    public double width;


    public void stampaRettangolo(double high, double width) {
        this.height = high;
        this.width = width;
        System.out.println("Il perimetro del rettangolo è " + (this.height * 2 + this.width * 2));
        System.out.println(" L'area del rettangolo è " + (this.height * this.width));
    }

    public void stampaDueRettangoli(double height, double width, double height2, double width2) {
        this.height = height;
        this.width = width;
        System.out.println("Il perimetro del 1 rettangolo è " + (this.height * 2 + this.width * 2));
        System.out.println(" L'area del 1 rettangolo è " + (this.height * this.width));
        this.height = height2;
        this.width = width2;
        System.out.println("Il perimetro del 2 rettangolo è " + (this.height * 2 + this.width * 2));
        System.out.println(" L'area del 2 rettangolo è " + (this.height * this.width));
    }
}
