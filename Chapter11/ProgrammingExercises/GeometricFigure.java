package Chapter11.ProgrammingExercises;
// Create an abstract class called GeometricFigure.
// Each figure includes a height, a width, a figure type, and an area.
// Include an abstract method to determine the area of the figure.

public abstract class GeometricFigure {
    protected int height;
    protected int width;
    protected String figure;
    public GeometricFigure(int h, int w, String f)
    {
        height = h;
        width = w;
        figure = f;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
    public String getFigure()
    {
        return figure;
    }
    public abstract double figureArea(int h, int w);
}
