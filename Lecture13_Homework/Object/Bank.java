package Lecture13_Homework.Object;

import java.util.*;

public class Bank {
    final Map <Client, List<Account>> clientListAccountMap = new HashMap<>();
    final Map <Account, Client> accountClientMap = new HashMap<>();
    public void addClientAndAccount (Client client,Account account){
        List <Account> accounts = new ArrayList<>();
        accounts.add(account);
        this.clientListAccountMap.put(client, accounts);
        this.accountClientMap.put(account, client);
    }
    public void addAccount (Account account, Client client){
        List <Account> accounts = this.clientListAccountMap.get(client);
        accounts.add(account);
        this.clientListAccountMap.put(client, accounts);
        this.accountClientMap.put(account, client);
    }

    public void findClient(Account account) {
        Client client = this.accountClientMap.get(account);
        System.out.println("Имя найденного клиента: " + client.userName() + ". Его ДР: " + client.birthday());
    }

    public void getAccount(Client client){
        List <Account> accounts = this.clientListAccountMap.get(client);
        System.out.println("Найден счет/счета: ");
        for (Account account : accounts){
            System.out.println(account.getDataStr());
        }
    }
}
