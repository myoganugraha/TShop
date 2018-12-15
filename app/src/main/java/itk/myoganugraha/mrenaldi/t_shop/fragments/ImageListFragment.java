/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package itk.myoganugraha.mrenaldi.t_shop.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;

import org.w3c.dom.Text;

import itk.myoganugraha.mrenaldi.t_shop.R;
import itk.myoganugraha.mrenaldi.t_shop.product.ItemDetailsActivity;
import itk.myoganugraha.mrenaldi.t_shop.startup.MainActivity;
import itk.myoganugraha.mrenaldi.t_shop.utility.ImageUrlUtils;


public class ImageListFragment extends Fragment {

    public static final String STRING_IMAGE_URI = "ImageUri";
    public static final String STRING_IMAGE_POSITION = "ImagePosition";
    private static MainActivity mActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(R.layout.layout_recylerview_list, container, false);
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
      /*  if (ImageListFragment.this.getArguments().getInt("type") == 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        } else if (ImageListFragment.this.getArguments().getInt("type") == 2) {
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        } else {
            GridLayoutManager layoutManager = new GridLayoutManager(recyclerView.getContext(), 3);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        }*/
        String[] items;
        String[] items_name;
        String[] item_price;

        if (ImageListFragment.this.getArguments().getInt("type") == 1){
            items = ImageUrlUtils.getFashionsUrls();
            items_name = ImageUrlUtils.getFashionItemsName();
            item_price = ImageUrlUtils.getFashionItemPrice();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 2){
            items =ImageUrlUtils.getSportWearUrls();
            items_name = ImageUrlUtils.getSportWearItemsName();
            item_price = ImageUrlUtils.getSportWearItemPrice();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 3){
            items =ImageUrlUtils.getSmartPhoneUrls();
            items_name = ImageUrlUtils.getSmartphoneItemsName();
            item_price = ImageUrlUtils.getSmartphoneItemPrice();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 4){
            items =ImageUrlUtils.getElectronicUrls();
            items_name = ImageUrlUtils.getelectronicItemsName();
            item_price = ImageUrlUtils.getElectronicItemPrice();

        }else {
            items = ImageUrlUtils.getImageUrls();
            items_name = ImageUrlUtils.getFashionItemsName();
            item_price = ImageUrlUtils.getFashionItemPrice();

        }
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(getActivity(), recyclerView, items, items_name, item_price));
    }

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private String[] mValues;
        private String[] mItemName;
        private String[] mItemPrice;
        private RecyclerView mRecyclerView;

        private Context context;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final LinearLayout mLayoutItem;
            public final ImageView mImageViewWishlist;
            public final ImageView mImageViewItem;
            public final TextView mItemName;
            public final TextView mItemPrice;


            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageViewItem = view.findViewById(R.id.iv_list_item);
                mLayoutItem = (LinearLayout) view.findViewById(R.id.layout_item);
                mImageViewWishlist = (ImageView) view.findViewById(R.id.ic_wishlist);
                mItemName = (TextView) view.findViewById(R.id.item_name);
                mItemPrice = view.findViewById(R.id.item_price);
            }
        }

        public SimpleStringRecyclerViewAdapter(Context context, RecyclerView recyclerView, String[] items, String[] items_name, String[] items_price) {
            mValues = items;
            mRecyclerView = recyclerView;
            mItemName = items_name;
            mItemPrice = items_price;
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(view);
        }

//        @Override
//        public void onViewRecycled(ViewHolder holder) {
//            if (holder.mImageViewItem.getController() != null) {
//                holder.mImageView.getController().onDetach();
//            }
//            if (holder.mImageView.getTopLevelDrawable() != null) {
//                holder.mImageView.getTopLevelDrawable().setCallback(null);
////                ((BitmapDrawable) holder.mImageView.getTopLevelDrawable()).getBitmap().recycle();
//            }
//        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
           /* FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) holder.mImageView.getLayoutParams();
            if (mRecyclerView.getLayoutManager() instanceof GridLayoutManager) {
                layoutParams.height = 200;
            } else if (mRecyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                layoutParams.height = 600;
            } else {
                layoutParams.height = 800;
            }*/
            final Uri uri = Uri.parse(mValues[position]);
            final String itemName = mItemName[position];
            final String itemPrice = mItemPrice[position];

            Glide.with(context)
                    .load(uri)
                    .apply(new RequestOptions()
                    .placeholder(R.color.stay_color))
                    .into(holder.mImageViewItem);

            holder.mLayoutItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mActivity, ItemDetailsActivity.class);
                    intent.putExtra(STRING_IMAGE_URI, mValues[position]);
                    intent.putExtra(STRING_IMAGE_POSITION, position);
                    intent.putExtra("itemPrice", itemPrice);
                    intent.putExtra("itemName", itemName);
                    mActivity.startActivity(intent);

                }
            });

            holder.mItemName.setText(itemName);
            holder.mItemPrice.setText("Rp. " + itemPrice);

            //Set click action for wishlist
            holder.mImageViewWishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                    imageUrlUtils.addWishlistImageUri(mValues[position]);
                    holder.mImageViewWishlist.setImageResource(R.drawable.ic_favorite_black_18dp);
                    notifyDataSetChanged();
                    Toast.makeText(mActivity,"Item added to wishlist.",Toast.LENGTH_SHORT).show();

                }
            });

        }

        @Override
        public int getItemCount() {
            return mValues.length;
        }
    }
}
