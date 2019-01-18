package lk.ijse.dep.fx.util;

import lk.ijse.dep.fx.model.Item;

import java.util.ArrayList;

public class ManageItems {

    // Database
    private static ArrayList<Item> itemsDB = new ArrayList<>();

    public static ArrayList<Item> getItemsDB(){
        return itemsDB;
    }

    public static void setItemsDB(ArrayList<Item> items){
        itemsDB = items;
    }

    // Dummy Data
    static{
        itemsDB.add(new Item("I001","Mouse",250,50));
        itemsDB.add(new Item("I002","Keyboard",350,50));
        itemsDB.add(new Item("I003","Monitors",5500,50));
        itemsDB.add(new Item("I004","Subwoofers",3500,50));
    }

    public static void createItem(Item item){
        itemsDB.add(item);
    }

    public static void updateItem(int index, Item item){
        itemsDB.get(index).setDescription(item.getDescription());
        itemsDB.get(index).setUnitPrice(item.getUnitPrice());
        itemsDB.get(index).setQtyOnHand(item.getQtyOnHand());
    }

    public static void deleteItem(int index){
        itemsDB.remove(index);
    }

    public static Item findItem(String itemCode) {
        for (Item item : itemsDB) {
            if (item.getCode().equals(itemCode)){
                return item;
            }
        }
        return null;
    }
}
