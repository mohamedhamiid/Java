# Geometric Shapes
## Description
### 1) Point
- class to define point (x,y) which all shapes will use
#### Attributes
- private double x_point --> x coordinate of the point
- private double y_point --> y coordinate of the point
#### Constructors
- Point(){} --> No-arg constructor which init x , y with zeros
- Point(double x , double y) --> Initialize x , y with passed values
#### Getters
- public double getX()
- public double getY()
#### Setters
- public void setX(double x)
- public void setY(double y)
#### Methods
- public String toString() --> Make the x , y as string in form (x,y)
### 2) Shape
- abstract class which has the start point of all shapes and all shapes must inherit it
#### Attributes
- protected Point start = new Point() --> The start point
#### Constructor
- Shape(Point start) --> Constructor to set start point of shape
#### Getters
- Point getStart() --> Get start point
