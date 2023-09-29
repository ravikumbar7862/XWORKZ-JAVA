class Array{

public static void main(String... args){
//array declaration and array ceration in one line
String[] name=new String[3];
name[0]="ravi"; name[1]="venki"; name[2]="soma";
//array declaration and array ceration in two line
//array declaration
int age[]; 
//array ceration 
age= new int[3];
/*array initilization*/
age[0]=10; age[1]=50; age[2]=100;
//array initilization directly
char []sex={'m','m','m'};
System.out.println("name length="+name.length);
System.out.println("name="+name[0]);
System.out.println("age="+age[0]);
System.out.println("sex="+sex[0]);
System.out.println("------------------------");
System.out.println("name="+name[1]);
System.out.println("age="+age[1]);
System.out.println("sex="+sex[1]);
System.out.println("------------------------");
System.out.println("name="+name[2]);
System.out.println("age="+age[2]);
System.out.println("sex="+sex[2]);
}
}