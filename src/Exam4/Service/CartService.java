package Exam4.Service;

import Exam4.Domain.Cart;
import Exam4.Domain.CartItem;
import Exam4.Domain.Product;

public class CartService {
    private ProductService productService;

    public CartService(ProductService productService) {
        this.productService = productService;
    }

    public void addToCart(Cart cart, int productId, int quantity) {
    Product product = productService.findById(productId);

        if (product == null){
            System.out.println("Product not found");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0");
            return;
        }


        for (CartItem cartItem : cart.getCartItems()) {
            if (cartItem.getProduct().getId() == product.getId()) {

                int newQuantity = cartItem.getQuantity() + quantity;

                if  (newQuantity > product.getStockQuantity()) {
                    System.out.println("Quantity exceeded");
                    return;
                }
                cartItem.setQuantity(newQuantity);
                return;
                }
            }
        if (product.getStockQuantity()<quantity){
            System.out.println("Quantity exceeded");
            return;
        }
       CartItem cartItem = new CartItem(product, quantity);
        cart.addItem(cartItem);

    }


    public void  viewCart(Cart cart){

      for(CartItem cartItem : cart.getCartItems()){

          System.out.println(cartItem.getProduct().getName() + " x " +
                  cartItem.getQuantity() + " = " +cartItem.getTotalPrice());
      }
        System.out.println("---------------------------------");
        System.out.println("Total: " +cart.getTotal());
    }


    public void removeFromCart(Cart cart, int productId) {

         for (CartItem cartItem : cart.getCartItems()) {

             if  (cartItem.getProduct().getId() == productId) {

                 cart.removeItem(cartItem);

                 System.out.println("Product removed from cart");
                 return;
             }
         }
        System.out.println("Product not found");
    }

    }
