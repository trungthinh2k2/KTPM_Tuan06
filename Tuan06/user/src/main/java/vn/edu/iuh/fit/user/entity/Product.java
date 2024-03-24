package vn.edu.iuh.fit.user.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private int id;
    private String productName;
    private double price;
}
