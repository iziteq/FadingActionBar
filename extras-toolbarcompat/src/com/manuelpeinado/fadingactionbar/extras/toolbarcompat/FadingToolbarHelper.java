package com.manuelpeinado.fadingactionbar.extras.toolbarcompat;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelperBase;

/**
 * FadingActionBar helper working with the {@link android.support.v7.widget.Toolbar}.
 * Call the {@link #initToolbar(android.app.Activity, android.support.v7.widget.Toolbar)} to initialize.
 *
 */
public class FadingToolbarHelper extends FadingActionBarHelperBase {
    /**
     * The toolbar
     */
    private Toolbar mToolbar;

    /**
     * Initialize the toolbar.
     *
     * @param activity Enclosing activity
     * @param toolbar Toolbar
     */
    public void initToolbar(Activity activity, Toolbar toolbar) {
        mToolbar = toolbar;
        super.initActionBar(activity);
    }

    /**
     * (non-Javadoc)
     * @see FadingActionBarHelperBase#getActionBarHeight()
     */
    @Override
    protected int getActionBarHeight() {
        return mToolbar.getHeight();
    }

    /**
     * (non-Javadoc)
     * @see FadingActionBarHelperBase#isActionBarNull()
     */
    @Override
    protected boolean isActionBarNull() {
        return mToolbar == null;
    }

    /**
     * (non-Javadoc)
     * @see FadingActionBarHelperBase#setActionBarBackgroundDrawable(android.graphics.drawable.Drawable)
     */
    @Override
    protected void setActionBarBackgroundDrawable(Drawable drawable) {
        mToolbar.setBackground(drawable);
    }

    /**
     * (non-Javadoc)
     * @see FadingActionBarHelperBase#destroyView()
     */
    @Override
    public void destroyView() {
        super.destroyView();
        mToolbar = null;
    }
}
