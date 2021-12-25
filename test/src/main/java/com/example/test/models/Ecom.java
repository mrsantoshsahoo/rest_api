package com.example.test.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "ecom")
public class Ecom {
    @Id
  private UUID ecomId;
//    private List<> dataList;

}
