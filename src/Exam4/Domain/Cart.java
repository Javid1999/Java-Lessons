package Exam4.Domain;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> cartItems;

    public Cart(){
        cartItems = new ArrayList<>();
    }

    public void addItem(CartItem cartItem){
        cartItems.add(cartItem);
    }
    public void removeItem(CartItem cartItem){
        cartItems.remove(cartItem);
    }
    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }
    public double getTotal(){
        double total = 0;
        for (CartItem cartItem : cartItems) {
         total += cartItem.getTotalPrice();
        }
        return total;
    }
}
