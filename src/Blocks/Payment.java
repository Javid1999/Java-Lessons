package Blocks;

import java.time.LocalDateTime;

public class Payment {
    private String status;

    private LocalDateTime createdAt;

    {
        status = "Created";
        createdAt = LocalDateTime.now();
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println(payment.getStatus());
        System.out.println(payment.getCreatedAt());;
    }
}
