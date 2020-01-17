package pl.lightmobile.dagger_assist.without_assist

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Style.FILL
import android.util.AttributeSet
import android.view.View
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class CustomView(
    context: Context,
    attrs: AttributeSet
) : View(context, attrs) {

    private val paint = Paint().apply {
        color = Color.RED
        style = FILL
    }

    private lateinit var dataProvider: DataProvider

    fun setDataProvider(dataProvider: DataProvider) {
        this.dataProvider = dataProvider
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawCircle(0f, 0f, 20f, paint)
    }
}
