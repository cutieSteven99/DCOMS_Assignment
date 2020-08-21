package main.java.com.dcoms.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import main.java.com.dcoms.domain.Account;

import java.util.List;

public interface IAccountDao extends Remote{

    List<Account> findAllAccount();

    Account findAccountById(String id);

    Account findAccountByUsername(String username);

    Account findAccountByName(String firstName, String lastName);

    void addAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Account account);

}
