package com.productservice.ProductService.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SortParam {
    private String sortParamName;
    private String sortType; //ASC or DESC
}