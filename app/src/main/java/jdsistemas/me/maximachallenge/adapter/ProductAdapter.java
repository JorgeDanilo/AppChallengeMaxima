package jdsistemas.me.maximachallenge.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import jdsistemas.me.maximachallenge.R;
import jdsistemas.me.maximachallenge.model.Product;
import jdsistemas.me.maximachallenge.utils.ImageUtil;

/**
 * Created on data 01/08/18.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    /**
     * Atribute List products.
     *
     */
    private List<Product> products;


    /**
     * Atribute context.
     *
     */
    private Context context;


    /**
     * Constructor responsable to new instance this adapter.
     *
     * @param products
     * @param context
     */
    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }


    /**
     * On create view Holder.
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_product, parent, false);
        ProductViewHolder holder = new ProductViewHolder(inflate);
        return holder;
    }


    /**
     * On bind view holder.
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product productSelected = products.get(position);

        if ( productSelected != null ) {
            if (productSelected.getAvatar() != null ) ImageUtil.createImage(context, holder.avatar, productSelected.getAvatar());
            holder.title.setText(productSelected.getCode() + " -  " + productSelected.getDescription());
            holder.description.setText(productSelected.getDescription());
        }
    }


    /**
     * Get count on list products.
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return products.size();
    }


    /**
     *
     * Product view holder.
     *
     * @author Jorge Danilo Gomes.
     *
     */
    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView avatar;
        TextView title;
        TextView description;

        public ProductViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            title = itemView.findViewById(R.id.txtTitle);
            description = itemView.findViewById(R.id.txtDescription);
        }

    }
}
