package sg.edu.nus.iss.d12workshop;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    
    public List<Item> getShoppingItems() {
        List<Item> lstItems = new ArrayList<>();

        Item itm1 = new Item();
        itm1.setItemName("Prada Bag");
        itm1.setQuantity(1);
        lstItems.add(itm1);

        Item itm2 = new Item();
        itm2.setItemName("LV Tot Bag");
        itm2.setQuantity(3);
        lstItems.add(itm2);

        Item itm3 = new Item();
        itm3.setItemName("Chanel Wallet");
        itm3.setQuantity(5);
        lstItems.add(itm3);

        return lstItems;
    }
}
