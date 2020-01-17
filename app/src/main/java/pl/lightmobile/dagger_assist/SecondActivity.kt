package pl.lightmobile.dagger_assist

import android.os.Bundle
import android.util.Log
import androidx.core.view.LayoutInflaterCompat
import com.squareup.inject.inflation.InflationInjectFactory
import dagger.android.DaggerActivity
import javax.inject.Inject

class SecondActivity : DaggerActivity() {

    @Inject lateinit var viewFactory: InflationInjectFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LayoutInflaterCompat.setFactory2(this.layoutInflater, viewFactory)
        setContentView(R.layout.activity_second)

        val model1 = Model("Ted", 10)
        val test = Model::class.java.declaredMethods
            .first { it.name == "combine" }
            .apply { this.isAccessible = true }
            .invoke(model1)
        Log.d("test", "test $test")
    }
}
