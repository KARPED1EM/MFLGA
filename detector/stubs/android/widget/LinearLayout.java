package android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class LinearLayout extends ViewGroup {
    public static final int VERTICAL = 1;
    public static final int HORIZONTAL = 0;
    public LinearLayout(Context context) { super(context); }
    public void setOrientation(int orientation) {}
    public void addView(View child) {}
    public void addView(View child, ViewGroup.LayoutParams params) {}

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;
        public float weight;
        public LayoutParams(int width, int height) { super(width, height); }
        public LayoutParams(int width, int height, float weight) { super(width, height); this.weight = weight; }
    }
}
