package TestingBehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;

    private List<NotificationObserver> notificationObservers = new ArrayList<>();


    public BankAccount(List<NotificationObserver> notificationObservers) {
        this.notificationObservers = notificationObservers;
    }

    public void addNotificationObserver(NotificationObserver o){
        notificationObservers.add(o);
    }
    public void removeNotificationObserver(NotificationObserver o){
        notificationObservers.remove(o);
    }
    public void notifyAll(String message) {
        for (NotificationObserver o : notificationObservers) {
            o.update(message);
        }
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        notifyAll("Account balance changed. New balance: " + balance);

    }
}
