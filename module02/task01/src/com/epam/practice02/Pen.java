package com.epam.practice02;

/**
 * Created by vrama on 09.03.2016.
 */
public class Pen {
        private String penColor;
        private String inkColor;
        private String brand;

    public Pen(String penColor, String inkColor, String brand) {
        this.penColor = penColor;
        this.inkColor = inkColor;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (penColor != null ? !penColor.equals(pen.penColor) : pen.penColor != null) return false;
        if (inkColor != null ? !inkColor.equals(pen.inkColor) : pen.inkColor != null) return false;
        return brand != null ? brand.equals(pen.brand) : pen.brand == null;

    }

    @Override
    public int hashCode() {
        int result = penColor != null ? penColor.hashCode() : 0;
        result = 31 * result + (inkColor != null ? inkColor.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penColor='" + penColor + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
