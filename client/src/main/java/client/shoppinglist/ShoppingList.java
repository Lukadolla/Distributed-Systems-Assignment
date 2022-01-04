package client.shoppinglist;

import client.items.Item;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ShoppingList {

    public Map<String, Item> shoppingList;

    public ShoppingList(Map<String, Item> shoppingList){
        this.shoppingList = shoppingList;
    }

    public void updateListItem(double amount, String itemName) throws IllegalArgumentException{
        if (itemName == null){
            throw new IllegalArgumentException("Invalid Item name | name: " + null);
        }

        if (shoppingList.containsKey(itemName)){
            shoppingList.get(itemName).updateAmount(amount);
        }
        else{
            throw new IllegalArgumentException("Invalid Item name, item not in List| name: " + itemName);
        }
    }

    public Item removeListItem(String itemName) throws IllegalArgumentException{
        if (itemName == null){
            throw new IllegalArgumentException("Invalid Item name| name: " + null);
        }

        if (shoppingList.containsKey(itemName)){
            return shoppingList.remove(itemName);
        }
        else{
            throw new IllegalArgumentException("Invalid Item name, item not in List| name: " + itemName);
        }
    }

    public boolean listComplete(){
        return shoppingList == null || shoppingList.size() == 0;
    }

    public void removeCompletedItems(){
        for (Item item: shoppingList.values()){
            if (item == null || item.getAmount() == 0){
                shoppingList.remove(item.getName());
            }
        }
    }

    public Collection<Item> getDesiredItems(){
        return shoppingList.values();
    }
}
