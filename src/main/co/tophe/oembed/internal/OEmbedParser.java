package co.tophe.oembed.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

import co.tophe.oembed.OEmbedSource;

public interface OEmbedParser {
	OEmbedSource getSource(@NonNull Uri fromUri);
}
