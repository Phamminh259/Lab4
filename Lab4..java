class Circle{
    double radius;
    String color;
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        double area = this.radius*this.radius*3.14;
        return area;
    }
    public String toString(){
        return "("+ this.radius + "," + this.color +")"; 
    }
}
class Cylinder extends Circle{
    double height;
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        double volume = getArea()*this.height;
        return volume;
    }
}
class Main{
    public static void main(String[]args){
        Cylinder result = new Cylinder();
        result.setRadius(9.0);
        System.out.println("Ban kinh: " + result.getRadius());
        result.setColor("Red");
        System.out.println("Mau sac: " + result.getColor());
        result.setHeight(9.0);
        System.out.println("Chieu cao: " + result.getHeight());
        System.out.println("Dien tich: " + result.getArea());
        System.out.println("Circle" + result.toString());
        System.out.println("Dien tich hinh tru: " + result.getVolume());
    }
}