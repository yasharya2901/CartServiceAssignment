package com.yasharya2901.github.cartserviceassignment.services;

import com.yasharya2901.github.cartserviceassignment.models.Cart;
import com.yasharya2901.github.cartserviceassignment.models.Product;
import org.springframework.stereotype.Service;

public interface CartService {
    public Cart[] getAllCarts();
    public Cart getCartById(long id);
    public Cart[] getCartsInDateRange(String startDate, String endDate); // TODO: startdate and enddate
    public Cart[] getUserCarts(long userId); //TODO: Define User
    public Cart addProductToCart(Product product); //TODO: Define Product
    public void updateProductInCart(long id, Product product); //TODO: should take Product and Cart
    public void deleteProduct(long id);
}
