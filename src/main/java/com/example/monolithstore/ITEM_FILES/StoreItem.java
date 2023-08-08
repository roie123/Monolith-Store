package com.example.monolithstore.ITEM_FILES;

import com.example.monolithstore.ItemCategory;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
@Builder
public class StoreItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String description;
    private double price;
    private String image;

    @Enumerated(EnumType.STRING)
    private ItemCategory category;



}
