
   class Circle{
    double radius;
    String color;
    public double Radius(){
        return this.radius;
    }
    public void Radius(double radius){
        this.radius = radius;
    }
    public String Color(){
        return this.color;
    }
    public void Color(String color){
        this.color = color;
    }
    public double Area(){
        double area = this.radius*this.radius*3.14;
        return area;
    }
    public String toString(){
        return "("+ this.radius + "," + this.color +")"; 
    }
}
class Cylinder extends Circle{
    double height;
    public double Height(){
        return this.height;
    }
    public void Height(double height){
        this.height = height;
    }
    public double Volume(){
        double volume = Area()*this.height;
        return volume;
    }
}
class Main{
    public static void main(String[]args){
        Cylinder result = new Cylinder();
        result.Radius(9.0);
        System.out.println("Ban kinh: " + result.Radius());
        result.Color("Red");
        System.out.println("Mau sac: " + result.Color());
        result.Height(9.0);
        System.out.println("Chieu cao: " + result.Height());
        System.out.println("Dien tich: " + result.Area());
        System.out.println("Circle" + result.toString());
        System.out.println("Dien tich hinh tru: " + result.Volume());
    }
}
