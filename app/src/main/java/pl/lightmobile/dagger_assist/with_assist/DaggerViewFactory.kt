package pl.lightmobile.dagger_assist.with_assist

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View

class DaggerViewFactory(
    private val viewFactory: CustomViewAssisted.Factory
) : LayoutInflater.Factory {

    override fun onCreateView(
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {
        return when(name) {
            CustomViewAssisted::class.java.name -> viewFactory.create(context, attrs)
            else -> null
        }
    }
}
