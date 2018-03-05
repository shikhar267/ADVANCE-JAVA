import java.rmi.*;
public class MyClient{
public static void main(String args[]){
try{
Sum stub=(Sum)Naming.lookup("rmi://localhost:1099/rmi");
System.out.println(stub.sum(34,4));
}
catch(Exception e){
e.printStackTrace();}
}
}
