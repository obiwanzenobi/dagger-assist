package pl.lightmobile.dagger_assist.with_assist

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Style.FILL
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.inflation.InflationInject
import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import kotlin.math.min

@SuppressLint("ViewConstructor")
class CustomViewAssistedInflate @InflationInject constructor(
    @Assisted context: Context,
    @Assisted attrs: AttributeSet,
    val dataProvider: DataProvider
) : View(context, attrs) {

    init {
        Log.d("Test", "Test")
    }

    private val paint = Paint().apply {
        color = Color.RED
        style = FILL
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawCircle(width / 2f, height / 2f, min(width, height).toFloat().div(2), paint)
    }
}
