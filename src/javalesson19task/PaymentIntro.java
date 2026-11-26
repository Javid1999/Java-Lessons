package javalesson19task;

import java.math.BigDecimal;
import java.util.Objects;

public class PaymentIntro {
    private int id;
    private String senderAccount;
    private String receiverAccount;
    BigDecimal amount;
    String currency;

    public PaymentIntro() {}
    public PaymentIntro(int id, String senderAccount, String receiverAccount, BigDecimal amount, String currency) {
        this.id = id;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaymentIntro that = (PaymentIntro) o;
        return getId() == that.getId() && Objects.equals(getSenderAccount(), that.getSenderAccount()) && Objects.equals(getReceiverAccount(), that.getReceiverAccount()) && Objects.equals(getAmount(), that.getAmount()) && Objects.equals(getCurrency(), that.getCurrency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSenderAccount(), getReceiverAccount(), getAmount(), getCurrency());
    }

    @Override
    public String toString() {
        return "PaymentIntro{" +
                "id=" + id +
                ", senderAccount='" + senderAccount + '\'' +
                ", receiverAccount='" + receiverAccount + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
