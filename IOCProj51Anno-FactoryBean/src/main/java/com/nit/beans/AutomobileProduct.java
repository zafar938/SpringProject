package com.nit.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutomobileProduct extends Product {
    private String model;
    private int engineCC;
}
