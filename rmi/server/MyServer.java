import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
public static void main(String args[]){
try{
Sum stub=new SumRemote();
Naming.rebind("rmi://localhost:1099/rmi",stub);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

