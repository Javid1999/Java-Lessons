package Exam4.Service;

import Exam4.Domain.Cart;
import Exam4.Domain.CartItem;

public class InventoryService {

    public boolean validateStock (Cart cart){

        for (CartItem cartItem : cart.getCartItems()){
            if (cartItem.getProduct().getStockQuantity()< cartItem.getQuantity()){
                return false;
            }
        }
        return true;

    }

    public void reduceStock (Cart cart){
        for (CartItem cartItem : cart.getCartItems()){

            int newStockQuantity = cartItem.getProduct().getStockQuantity() - cartItem.getQuantity();

            cartItem.getProduct().setStockQuantity(newStockQuantity);
        }
    }

}
