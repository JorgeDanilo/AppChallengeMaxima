package jdsistemas.me.maximachallenge.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.target.Target;

/**
 * Created on data 02/08/18.
 */
public class ImageUtil {

    public static Target<GlideDrawable> createImage(Context context, ImageView view, String url) {
        return Glide.with(context).load(url).into(view);
    }
}
