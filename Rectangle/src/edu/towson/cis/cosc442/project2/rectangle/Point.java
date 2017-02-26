package edu.towson.cis.cosc442.project2.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	Point(Double x, Double y) {
		/**
		 * Constructor assignment of the x should be x but it was y (BUG IN THE CODE)
		this.x = y;
		this.y = y;
		*/
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(Double x){
		this.x = x;
	}

	public void setY(Double y){
		this.y = y;
	}
}
