package Progres;

import java.util.Objects;

public class Transfer {
    private String sender;
    private String receiver;
    private double amount;

    public Transfer(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return Double.compare(getAmount(), transfer.getAmount()) == 0 && Objects.equals(getSender(), transfer.getSender()) && Objects.equals(getReceiver(), transfer.getReceiver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSender(), getReceiver(), getAmount());
    }
}
