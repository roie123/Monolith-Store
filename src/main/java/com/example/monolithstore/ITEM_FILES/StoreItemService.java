package com.example.monolithstore.ITEM_FILES;

import com.example.monolithstore.ItemCategory;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StoreItemService {

    private final StoreItemRepository storeItemRepository;
    private final Random random;


    public List<StoreItem> getAllItems() {
        return storeItemRepository.findAll();
    }

    public List<StoreItem> getAllByCategory(ItemCategory category) {
        return storeItemRepository.getAllByCategory(category);
    }


    public Long addNewStoreItem(StoreItem storeItem) {


        return storeItemRepository.save(storeItem).getId();


    }

    @PostConstruct
    public void addStoreItems() {
        for (int i = 0; i < 100; i++) {

            this.addNewStoreItem(StoreItem.builder()
                            .itemName(UUID.randomUUID().toString().substring(6))
                            .category(ItemCategory.values()[random.nextInt(0,ItemCategory.values().length)])
                            .description(UUID.randomUUID().toString().substring(6))
                            .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Hamburger_%28black_bg%29.jpg/800px-Hamburger_%28black_bg%29.jpg")
                            .price(random.nextDouble(1,40))



                    .build());


        }


    }

}
