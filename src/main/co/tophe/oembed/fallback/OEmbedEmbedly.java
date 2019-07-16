package co.tophe.oembed.fallback;

import android.net.Uri;
import androidx.annotation.NonNull;

import co.tophe.oembed.internal.BaseOEmbedSource;

/**
 * @author Created by robUx4 on 30/09/2014.
 */
public class OEmbedEmbedly extends BaseOEmbedSource {
    public OEmbedEmbedly(@NonNull Uri fromUri) {
        super("http://api.embed.ly/1/oembed", fromUri);
    }

    public OEmbedEmbedly(@NonNull String url) {
        this(Uri.parse(url));
    }
}
