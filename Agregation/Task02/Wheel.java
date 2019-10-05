package by.htp.Aggregation.Task02;

public class Wheel {
    private double size;

    public Wheel(double size) {
	this.size = size;
    }

    public double getSize() {
	return size;
    }

    public void setSize(double size) {
	this.size = size;
    }

    @Override
    public String toString() {
	return "Wheel [size=" + size + "]";
    }
}
