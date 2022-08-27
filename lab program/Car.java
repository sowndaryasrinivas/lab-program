public class Car
{

 public String model  ;
 public String color  ;
 
 public Car(String model,String color)
{
 this.model= model;
 this.color= color;
}

public void setCarModel(String model)
 {
	this.model = model;
	
 }
 
public String getCarModel()
{
	return model;
	}
public void setCarColor(String color)
 { 
 this.color = color;
 
 }

public String getCarColor()
{
	return color;
	}
	



public static void main(String[]args)
{
	Car car1 = new Car("Toyato", "black");
	Car car2 = new Car("maruti", "grey");
	
	car1.setCarModel("Altima");
	System.out.println(car1);
	System.out.println(car1.getCarColor());
	
	car2.setCarColor("grey");
	System.out.println(car2);
	System.out.println(car2.getCarModel());
}
}