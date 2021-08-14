package Chapter11.ProgrammingExercises;
// Create two subclasses called Square and Triangle.
// Each figure includes a height, a width, a figure type, and an area.
// Save the files as GeometricFigure.java, Square.java, Triangle.java, and UseGeometric.java.

public class Square extends GeometricFigure{
    private double area;
    public Square(int w, int h, String f)
    {
        super(w, h, f);
    }

    public double figureArea(int w, int h)
    {
        area = (double)(w * h);
        return area;
    }
}
