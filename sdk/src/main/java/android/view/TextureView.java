package android.view;

import android.graphics.SurfaceTexture;

/**
 * Stub class for funky android api
 */
public interface TextureView {

    SurfaceTexture getSurfaceTexture();
    boolean isAvailable();

    void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener);

    interface SurfaceTextureListener {
        void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height);
        boolean onSurfaceTextureDestroyed(SurfaceTexture surface);
        void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height);
        public void onSurfaceTextureUpdated(SurfaceTexture surface);

    }

}
