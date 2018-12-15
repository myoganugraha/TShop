package itk.myoganugraha.mrenaldi.t_shop.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();
    static ArrayList<String> cartListItemName = new ArrayList<>();
    static ArrayList<String> cartListItemPrice = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[] {
                "https://static.pexels.com/photos/1579063/pexels-photo-1579063.jpeg",
                "https://static.pexels.com/photos/920735/pexels-photo-920735.jpeg",
                "https://static.pexels.com/photos/701771/pexels-photo-701771.jpeg",
                "https://static.pexels.com/photos/1082529/pexels-photo-1082529.jpeg",
                "https://static.pexels.com/photos/533733/pexels-photo-533733.jpeg",
                "https://images.pexels.com/photos/601316/pexels-photo-601316.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
        };
        return urls;
    }

    public static String[] getFashionsUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1579063/pexels-photo-1579063.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://static.pexels.com/photos/920735/pexels-photo-920735.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://static.pexels.com/photos/701771/pexels-photo-701771.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://static.pexels.com/photos/1082529/pexels-photo-1082529.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://static.pexels.com/photos/533733/pexels-photo-533733.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/601316/pexels-photo-601316.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
        };
        return urls;
    }

    public static String[] getFashionItemsName(){
        String[]items_name = new String[]{
                "Kemeja Kotak Kotak Putih",
                "Kaos Putih Kekinian",
                "Kaos Putih Superhero",
                "Celana Jeans Unisex",
                "Celana Jeans Sobek Mahal",
                "Rok Hitam Motif Flower"
        };
        return items_name;
    }

    public static String[] getFashionItemPrice(){
        String[] items_price = new String[]{
                "549.000",
                "325.000",
                "250.000",
                "500.000",
                "679.000",
                "289.000"
        };
        return items_price;
    }

    public static String[] getSportWearUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/35781/sport-football-football-boots-ball.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/274385/pexels-photo-274385.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/786003/pexels-photo-786003.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/47730/the-ball-stadion-football-the-pitch-47730.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
        };
        return urls;
    }

    public static String[] getSportWearItemsName(){
        String[]items_name = new String[]{
                "Football Shoes - Nike Mercurial Vapor",
                "Football Shoes - Nike CTR360 Maestri II",
                "Running Shoes - Nike Air Zoom Flyknit Racer",
                "Ball - Adidas Brazuca",
        };
        return items_name;
    }

    public static String[] getSportWearItemPrice(){
        String[] items_price = new String[]{
                "1.500.000",
                "800.000",
                "3.500.000",
                "1.000.000"
        };
        return items_price;
    }

    public static String[] getSmartPhoneUrls() {
        String[] urls = new String[]{
                "https://images.pexels.com/photos/699122/pexels-photo-699122.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.androidpolice.com/wp-content/themes/ap2/ap_resize/ap_resize.php?src=https%3A%2F%2Fwww.androidpolice.com%2Fwp-content%2Fuploads%2F2018%2F03%2Fnexus2cee_DSC09637.jpg&w=728",
                "https://images.pexels.com/photos/50614/pexels-photo-50614.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/40011/iphone-smartphone-apps-apple-inc-40011.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://boygeniusreport.files.wordpress.com/2018/05/pixel-3-render-1.jpg?quality=98&strip=all&w=782"
        };
        return urls;
    }

    public static String[] getSmartphoneItemsName(){
        String[]items_name = new String[]{
                "Apple Iphone X",
                "Samsung S9",
                "Samsung S6 Edge",
                "Apple Iphone 5S",
                "Google Pixel 3"
        };
        return items_name;
    }

    public static String[] getSmartphoneItemPrice(){
        String[] items_price = new String[]{
                "18.000.000",
                "12.000.000",
                "2.500.000",
                "1.500.000",
                "15.000.000",
        };
        return items_price;
    }

    public static String[] getElectronicUrls() {
        String[] urls = new String[]{
                "https://i.ytimg.com/vi/gUXi9ir9HdA/maxresdefault.jpg",
                "https://images.pexels.com/photos/973406/pexels-photo-973406.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/42220/air-blade-blowing-chrome-42220.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://images.pexels.com/photos/1287150/pexels-photo-1287150.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
        };
        return urls;
    }

    public static String[] getelectronicItemsName(){
        String[]items_name = new String[]{
                "Sony BRAVIA TRILUMINOS TV",
                "Hair Dryer",
                "Electric Fan",
                "Microwave"
        };
        return items_name;
    }

    public static String[] getElectronicItemPrice(){
        String[] items_price = new String[]{
                "24.000.000",
                "575.000",
                "850.000",
                "1.500.000",
        };
        return items_price;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0,wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri(){ return this.wishlistImageUri; }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri, String itemName, String itemPrice) {
        this.cartListImageUri.add(0,wishlistImageUri);
        this.cartListItemName.add(0,itemName);
        this.cartListItemPrice.add(0, itemPrice);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri(){ return this.cartListImageUri; }

    public ArrayList<String> getCartListItemName(){ return this.cartListItemName; }

    public ArrayList<String> getCartListItemPrice() {
        return this.cartListItemPrice;
    }
}
