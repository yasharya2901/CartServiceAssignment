package com.yasharya2901.github.cartserviceassignment.controllers;


import com.yasharya2901.github.cartserviceassignment.models.Cart;
import com.yasharya2901.github.cartserviceassignment.models.Product;
import com.yasharya2901.github.cartserviceassignment.services.FakeStoreCartService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController{
    FakeStoreCartService fakeStoreCartService;
    public CartController(FakeStoreCartService fscs){
        this.fakeStoreCartService = fscs;
    }

    @GetMapping("/carts")
    public Cart[] getAllCarts(){
        return fakeStoreCartService.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable long id){
        return fakeStoreCartService.getCartById(id);
    }

    @GetMapping("/carts?startdate={startDate}&enddate={endDate}")
    public Cart[] getCarsInDateRange(@RequestParam String startDate, @RequestParam String endDate){
        return fakeStoreCartService.getCartsInDateRange(startDate, endDate);
    }

    @GetMapping("/carts/user/{userId}")
    public Cart[] getUserCart(@PathVariable long userId){
        return fakeStoreCartService.getUserCarts(userId);
    }

    @PostMapping("/carts")
    public Cart addProductToCart(@RequestBody Product product){
        return fakeStoreCartService.addProductToCart(product);
    }

    @PutMapping("/carts/{id}")
    public String updateProductInCart(@PathVariable long id, @RequestBody Product product){
        fakeStoreCartService.updateProductInCart(id, product);
        return "Product Updated";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable long id){
        fakeStoreCartService.deleteProduct(id);
        return "Product Deleted";
    }

}
