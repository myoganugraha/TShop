package itk.myoganugraha.mrenaldi.t_shop.utility;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemModel implements Parcelable {
    String item_img_url;
    String item_name;
    String description;
    String price;

    public ItemModel(String item_img_url, String item_name, String description, String price) {
        this.item_img_url = item_img_url;
        this.item_name = item_name;
        this.description = description;
        this.price = price;
    }

    public String getItem_img_url() {
        return item_img_url;
    }

    public void setItem_img_url(String item_img_url) {
        this.item_img_url = item_img_url;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.item_img_url);
        dest.writeString(this.item_name);
        dest.writeString(this.description);
        dest.writeString(this.price);
    }

    protected ItemModel(Parcel in) {
        this.item_img_url = in.readString();
        this.item_name = in.readString();
        this.description = in.readString();
        this.price = in.readString();
    }

    public static final Parcelable.Creator<ItemModel> CREATOR = new Parcelable.Creator<ItemModel>() {
        @Override
        public ItemModel createFromParcel(Parcel source) {
            return new ItemModel(source);
        }

        @Override
        public ItemModel[] newArray(int size) {
            return new ItemModel[size];
        }
    };
}
