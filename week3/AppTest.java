import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.jupiter.api.*;

public class AppTest {
    @Test
    public void testStoreAdd2(){

        Store store = new Store();

        store.addItem(null);
        assertEquals(null, store.getItemByIndex(0));
    }
    @Test
    public void testStoreAdd3(){

        Store store = new Store();
        assertEquals(null, store.getItemByIndex(0));
    }

    /* None
    @Test 
    public void testCartGetContents(){
        Cart cart = new Cart();
        ArrayList<CartItem> items = new ArrayList<>();
        Item item = new Item("Item", 1, 10);
        Item item2 = new Item("item2", 1, 1);
        CartItem cartItem = new CartItem(item, 10);
        CartItem cartItem2 = new CartItem(item2, 1);
        items.add(cartItem);
        items.add(cartItem2);
        cart.addItemToCart(items.get(0));
        cart.addItemToCart(items.get(1));
        assertEquals(items, cart.getContents());
    } */


    @Test
    public void testCartAddToString(){
        Cart cart = new Cart();
        ArrayList<CartItem> items = new ArrayList<>();
        Item item = new Item("Item", 1, 10);
        Item item2 = new Item("item2", 1, 1);
        CartItem cartItem = new CartItem(item, 10);
        CartItem cartItem2 = new CartItem(item2, 1);
        items.add(cartItem);
        items.add(cartItem2);
        cart.addItemToCart(items.get(0));
        cart.addItemToCart(items.get(1));
        String expected = "";

        for (CartItem cartItems : items) {
            expected += cartItems.getItem().getName() + ", In cart: " + cartItems.getQuantity() + "\n";
        }
        
        assertEquals(expected, cart.toString());
    }

    @Test
    public void testCartAddToString2(){
        Cart cart = new Cart();
        ArrayList<CartItem> items = new ArrayList<>();
        Item item = new Item("Item", 1, 100);
        CartItem cartItem = new CartItem(item, 100);
        items.add(cartItem);
        cart.reduceItemByAmount(cartItem, 50);
        cart.addItemToCart(items.get(0));
        String expected = "";

        expected = cartItem.getItem().getName() + ", In cart: " + 50 + "\n";

        
        assertEquals(expected, cart.toString());
    }
    /* Dublicate
    @Test
    public void testCartAddToString3(){
        Cart cart = new Cart();
        ArrayList<CartItem> items = new ArrayList<>();
        Item item = new Item("Item", 1, 100);
        CartItem cartItem = new CartItem(item, 10);
        items.add(cartItem);
        cart.addItemToCart(items.get(0));
        cart.addItemToCart(items.get(0));
        String expected = "";

        expected = cartItem.getItem().getName() + ", In cart: " + 20 + "\n";

        
        assertEquals(expected, cart.toString());
    } */

    @Test 
    public void testCartItems1(){
        Item item = new Item("item", 1, 1);
        String expected = "Not enough stock to add to cart.";
        assertThrows(IllegalArgumentException.class, () -> new CartItem(item, 2));
    }

    @Test 
    public void testCartItems2(){
        Item item = new Item("item", 1, 0);
        int expected = 1;
        CartItem cartItem = new CartItem(item, -1);  
        assertEquals(expected, cartItem.getQuantity());
    }

    
    /* @Test  //None 
    public void testCartItems3(){
        Item item = new Item("item", 1, 0);
        int expected = -1;
        CartItem cartItem = new CartItem(item, -1);  
        cartItem.setQuantity(expected);
        
        assertEquals(expected, cartItem.getQuantity());
    } */
    /*
    @Test 
    public void testItem(){ //none
        Item item = new Item();
        assertEquals("Undefined", item.getName());
    } */

    @Test 
    public void testItem2(){
        Item item = new Item();
        String expected = "name: " + item.getName() + ", price: " + item.getPrice() + ", stock: " + item.getStock();
        assertEquals(expected, item.toString());
    }
    /*
    @Test 
    public void testItem3(){ //none
        Item item = new Item();
        int expected = 1;
        item.increaseStock(1);
        assertEquals(expected, item.getStock());
        expected = 0;
        item.reduceStock(1);
        assertEquals(expected, item.getStock());
    } */
    /*
    @Test 
    public void testUser1(){ //none
        String name = "matti";
        String address = "here";
        User user = new User(name, address);
        assertEquals(name, user.getName());
        assertEquals(address, user.getAddress());
    }

    @Test 
    public void testUser2(){ //none
        String name = "";
        String address = "";
        User user = new User(name, address);
        UUID id = user.getId();
        user.setId(id);
        assertEquals(id, user.getId());
    }

    @Test 
    public void testUser3(){ //none
        String name = "";
        String address = "";
        User user = new User(name, address);
        Cart cart = user.getCart();
        assertEquals(cart, user.getCart());
        ArrayList<CartItem> items = new ArrayList<>();
        Item item = new Item("Item", 1, 100);
        CartItem cartItem = new CartItem(item, 100);
        items.add(cartItem);
        cart.addItemToCart(items.get(0));
        assertEquals(cart, user.getCart());

    } 
    */  
    @Test 
    public void testUser4(){ 
        String name = "";
        String address = "";
        User user = new User(name, address);
        User user2 = new User(name, address);
        assertNotEquals(user.getId(), user2.getId());

    } 
}