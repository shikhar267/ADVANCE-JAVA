import java.rmi.*;
import java.rmi.server.*;
public class SumRemote extends UnicastRemoteObject implements Sum{
SumRemote()throws RemoteException{}
public int sum(int x,int y){
return (x+y);
}
}