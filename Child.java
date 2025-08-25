class Parent{
public Parent(){
System.out.println("Constructor of Parent class!");
}
void display(){
System.out.println("In to the Parent class!");
}
}
class Child extends Parent{
public Child(){
super();
System.out.println("Constructor of Child class!");
}

void display(){
super.display();
System.out.println("Into the Child class!!");
}
public static void main(String args[]){
Child c=new Child();
c.display();
}
}