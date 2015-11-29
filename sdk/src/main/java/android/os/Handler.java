package android.os;

/**
 * Stub class for funky android api
 */
public class Handler {

    private final Looper looper;

    public Handler(Looper looper) {
        this.looper = looper;
    }

    public void post(Runnable runnable) {
        throw new UnsupportedOperationException("not implemented");
    }

    public void postDelayed(Runnable runnable, Long delay) {
        throw new UnsupportedOperationException("not implemented");
    }

}
