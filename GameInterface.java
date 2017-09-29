package game;

import com.sun.org.apache.regexp.internal.RE;
import player.Player;

import java.rmi.Remote;
import java.rmi.RemoteException;
import player.PlayerList;

/**
 * Created by chuanyu on 17/9/17.
 */
public interface GameInterface extends Remote {

    // Server methods

    public GameState joinGameServer(Player player) throws RemoteException;

    public GameState makeMove(String uid, char command) throws RemoteException;

    public GameState getGameState() throws RemoteException;

    public void setGameState(GameState gameState) throws RemoteException;
    
    public void setPlayerList(PlayerList playerList) throws RemoteException;

    public String getPrimary() throws RemoteException;

    public String getSecondary() throws RemoteException;

    public void setSecondary(String secondaryID) throws RemoteException;
    
    public void setIsPrimary(boolean isPrimary) throws RemoteException;
    
    public void setIsSecondary(boolean isSecondary) throws RemoteException;
    
    public void setNewSecondary(String secondaryID) throws RemoteException;
    
    public boolean exitGameServer (Player player, String ip, int portNo) throws RemoteException;

}