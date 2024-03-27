package phase;

public abstract class Quadrilateral {
	public Quadrilateral() {
		super();
		this.base = 0;
		this.height =0;
	}
	 public  abstract double area() ;
	public Quadrilateral(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public int base;
	public int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
    }
    
    @Override
    public double area() {
        return base * base;
    }
}
 
class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    
    @Override
    public double area() {
        return base * height;
    }
}
 
class Parallelogram extends Quadrilateral {
    public Parallelogram(int base, int height) {
        super(base, height);
    }
    
    @Override
    public double area() {
        return base * height;
    }
}
