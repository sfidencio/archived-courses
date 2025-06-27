package rectangle.entities;

/**
 * Entidade Retangulo.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class Rectangle {
	private double width;
	private double height;

	public double calculeArea() {
		return width * height;
	}

	public double calculePerimeter() {
		return (2 * width) + (2 * height);
	}

	public double calculeDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	
}
