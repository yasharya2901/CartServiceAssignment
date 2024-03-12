package com.yasharya2901.github.cartserviceassignment.services;

import com.yasharya2901.github.cartserviceassignment.dto.FakeStoreProductDTO;
import com.yasharya2901.github.cartserviceassignment.models.Cart;
import com.yasharya2901.github.cartserviceassignment.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FakeStoreCartService implements CartService{
    final String url = "https://fakestoreapi.com";
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public Cart[] getAllCarts() {
        var response = restTemplate.getForObject(url + "/carts", Cart[].class);
        return response;
    }

    @Override
    public Cart getCartById(long id) {
        var response = restTemplate.getForObject(url+"/carts/" + id, Cart.class);
        return response;
    }

    @Override
    public Cart[] getCartsInDateRange(String startDate, String endDate) {
        var response = restTemplate.getForObject(url+"/carts?=startdate=" + startDate + "&enddate=" +endDate, Cart[].class);
        return response;
    }

    @Override
    public Cart[] getUserCarts(long userId) {
        String requestURL = url+"/carts/user/"+userId;
        var response = restTemplate.getForObject(requestURL, Cart[].class);
        return response;
    }

    @Override
    public Cart addProductToCart(Product product) {
        var response = restTemplate.postForObject(url+"/carts", product, Cart.class);
        return response;
    }

    @Override
    public void updateProductInCart(long id, Product product) {
        restTemplate.put(url+"/carts/"+id, product);
    }

    @Override
    public void deleteProduct(long id) {
        restTemplate.delete(url+"/products/"+id);
    }
}
