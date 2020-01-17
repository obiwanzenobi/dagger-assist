package pl.lightmobile.dagger_assist.with_assist

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Style.FILL
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class CustomViewAssisted @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted attrs: AttributeSet,
    val dataProvider: DataProvider
) : View(context, attrs) {

    init {
        Log.d("test", "test")
    }

    private val paint = Paint().apply {
        color = Color.RED
        style = FILL
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawCircle(0f, 0f, 20f, paint)
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(context: Context, attrs: AttributeSet): CustomViewAssisted
    }
}
