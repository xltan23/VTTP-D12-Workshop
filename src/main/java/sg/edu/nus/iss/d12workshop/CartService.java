package sg.edu.nus.iss.d12workshop;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    
    public List<Item> getShoppingItems() {
        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(1);
        lstItems.add(itm);

        itm.setItemName("LV Tot Bag");
        itm.setQuantity(3);
        lstItems.add(itm);

        itm.setItemName("Chanel Wallet");
        itm.setQuantity(5);
        lstItems.add(itm);

        return lstItems;
    }
}
