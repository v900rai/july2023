package july;

public class vishalrai 
{
	  int modelYear;
	  String modelName;
	  int age;

	  public vishalrai(int year, String name, int g) {
	    modelYear = year;
	    modelName = name;
	    age=g;
	  }

	  public static void main(String[] args) {
	    vishalrai myCar = new vishalrai(1969, "Mustang" ,25);
	    System.out.println(myCar.modelYear + " " + myCar.modelName+"  "+myCar.age);
	  }
}
