package com.game.tobin.floatmenu;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;

public class DeleteView extends ImageView {
	private boolean isDelete;

	public DeleteView(Context context) {
		super(context);
		setScaleType(ScaleType.CENTER_INSIDE);
		// int padding = FloatUtils.dip2px(context, 9);
		// setPadding(padding, padding, padding, padding);
		updateDeleteStatus(false);
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void updateDeleteStatus(boolean isReadyToDelete) {
		if (isReadyToDelete) {
			 setBackgroundColor(Color.argb(88, 255, 0, 0));
//			setBackgroundResource(ResourceUtil.getDrawableId("tobin_menu_delete_ready_bg"));
//			setBackgroundResource(R.drawable.tobin_menu_delete_ready_bg);
		} else {
			 setBackgroundColor(Color.argb(88, 100, 100, 100));
//			setBackgroundResource(R.drawable.tobin_menu_delete_normal_bg);
		}
		isDelete = isReadyToDelete;
	}
}
