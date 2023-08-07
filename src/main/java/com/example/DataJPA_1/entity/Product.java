package com.example.DataJPA_1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TBL")

public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    private Integer ProductId;

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double productPrice) {
        ProductPrice = productPrice;
    }
    @Column(name = "PRODUCT_NAME")

    private String ProductName;

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName + '\'' +
                ", ProductPrice=" + ProductPrice +
                '}';
    }
    @Column(name = "PRODUCT_PRICE")
    private Double ProductPrice;
}
