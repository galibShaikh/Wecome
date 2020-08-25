public class Shape {
	String name;
	
void Showarea(){
	System.out.println("This method Show area of shape");
}

	public static void main(String[] args){
		
       Shape sh =new Shape ();
       Sphere sw=new Sphere("Sphere", 3);
       Rectangle Rg=new Rectangle("Rectangle",10,5);
       Cylinder sc= new Cylinder ("Cylinder", 4,6);
       circle scr= new circle ("circle",6);
                     
       sh.Showarea ();
       sw.Showarea();
       Rg.Showarea();
       sc.Showarea();
       scr.Showarea();
	}
}


public class Cylinder extends Shape {
	float radius;
	float hight;
	
Cylinder(String n, float r, float h){
	name=n; radius=r; hight=h;
}

void Showarea(){
	System.out.println(2*3.1416*hight*radius+2*3.1416*radius*radius);
}

	public static void main(String[] args) {
		

	}

}

public class circle extends Shape {
	float radius;
	
circle(String n,float r){
		name=n; radius=r;
	}
	
void Showarea(){
		System.out.println(3.1416*radius*radius);
	}


	public static void main(String[] args) {
		

	}

}

public class Rectangle extends Shape {
	float lenght;
	float width;
	
Rectangle(String n,float l, float w){
		name=n; lenght=l; width=w;
	}

void Showarea(){
		System.out.println(lenght*width);
	}

	public static void main(String[] args) {
		

	}

}

public class Sphere extends Shape {
	float radius;
	
Sphere(String n,float r){
	name=n; radius=r;
}
void Showarea(){
	System.out.println(4*3.1416*radius*radius);
}

	public static void main(String[] args) {
		

	}

}