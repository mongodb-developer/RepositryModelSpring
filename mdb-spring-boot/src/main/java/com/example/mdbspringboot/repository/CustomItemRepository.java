package com.example.mdbspringboot.repository;

public interface CustomItemRepository {
	
	void updateItemQuantity(String itemName, float newQuantity);

	void bulkUpdateItemCategories(String category, String newCategory);

}
