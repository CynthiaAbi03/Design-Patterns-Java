package CreationalPatterns.PrototypePattern;

public interface Triangle extends Cloneable{
    Triangle clone() throws CloneNotSupportedException;
    void setBase(double base);
    void setHeight(double height);
    String getType();
    double calculateArea();
}
