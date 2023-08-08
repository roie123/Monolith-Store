package com.example.monolithstore.ITEM_FILES;

import com.example.monolithstore.ItemCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/item")
@RequiredArgsConstructor
public class StoreItemController {
    private final StoreItemService storeItemService;


    @GetMapping
    public List<StoreItem> getAll(){
        return storeItemService.getAllItems();
    }

    @GetMapping("/byCategory/{category}")
    public List<StoreItem> getAllByCategory(@PathVariable ItemCategory category){
        return storeItemService.getAllByCategory(category);
    }
}
