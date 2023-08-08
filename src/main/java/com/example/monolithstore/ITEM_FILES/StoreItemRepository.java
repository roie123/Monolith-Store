package com.example.monolithstore.ITEM_FILES;

import com.example.monolithstore.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreItemRepository extends JpaRepository<StoreItem ,Long> {

    List<StoreItem> getAllByCategory(ItemCategory itemCategory);

}
