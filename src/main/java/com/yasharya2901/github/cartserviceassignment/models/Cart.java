package com.yasharya2901.github.cartserviceassignment.models;


import com.yasharya2901.github.cartserviceassignment.dto.FakeStoreProductDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private long id;
    private long userId;
    private String date;
    private Product[] products;

}
