import java.rmi.*;
public interface Sum extends Remote{
public int sum(int x,int y) throws RemoteException;
}
