package sol.neptune.Droid1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DroidView extends View{

	
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
		canvas.drawText("TEST", 0, 50, paint);
	}
}
