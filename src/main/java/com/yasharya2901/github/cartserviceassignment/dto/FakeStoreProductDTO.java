package com.yasharya2901.github.cartserviceassignment.dto;

import com.yasharya2901.github.cartserviceassignment.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {
    private long productId;
    private long quantity;
    private long id;
    private long userId;
    private String date;
    private Product[] products;
}
