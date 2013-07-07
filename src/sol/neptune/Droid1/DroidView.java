package sol.neptune.Droid1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class DroidView extends View {
	private float bearing;

	public void setBearing(float _bearing) {
		bearing = _bearing;
		sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED);
	}

	public float getBearing() {
		return bearing;
	}

	private float pitch;

	public void setPitch(float _pitch) {
		pitch = _pitch;
		sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED);
	}

	public float getPitch() {
		return pitch;
	}

	private float roll;

	public void setRoll(float _roll) {
		roll = _roll;
		sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED);
	}

	public float getRoll() {
		return roll;
	}

	private Paint paint = new Paint();

	public DroidView(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint.setColor(Color.BLACK);
		paint.setTextSize(25);
	}

	public DroidView(Context context) {
		super(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawText("B:" + getBearing(), 0, 50, paint);
		canvas.drawText("P:" + getPitch(), 0, 75, paint);
		canvas.drawText("R:" + getRoll(), 0, 100, paint);
		
	}
}
