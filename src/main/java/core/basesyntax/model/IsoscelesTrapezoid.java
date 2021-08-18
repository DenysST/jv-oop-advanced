package core.basesyntax.model;

import core.basesyntax.ColorSupplier;
import core.basesyntax.FigureArea;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid() {
        this.sideA = Figure.getRandomNumber();
        this.sideB = Figure.getRandomNumber();
        this.height = Figure.getRandomNumber();
        super.setColour(ColorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * 2 / height;
    }


    @Override
    public void draw() {

    }
}
