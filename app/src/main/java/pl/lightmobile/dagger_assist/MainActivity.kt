package pl.lightmobile.dagger_assist

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.squareup.inject.inflation.InflationInjectFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.textView
import pl.lightmobile.dagger_assist.dagger.AssistedViewModelFactory
import pl.lightmobile.dagger_assist.with_assist.ClassWithDI2AssistedFactory
import pl.lightmobile.dagger_assist.with_assist.UserVmAssisted
import pl.lightmobile.dagger_assist.without_assist.ClassWithDI2NotAssistedFactoryProviders
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var notAssisted: ClassWithDI2NotAssistedFactoryProviders.Factory
    @Inject lateinit var basicFactory: ClassWithDI2AssistedFactory.Factory
    @Inject lateinit var vmFactory: UserVmAssisted.Factory
    @Inject lateinit var viewFactory: InflationInjectFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userId = intent.getStringExtra(Intent.EXTRA_TITLE) ?: "default"

        val assistedItem = basicFactory.create(userId)
        val item = notAssisted.create(userId)

        val factory = AssistedViewModelFactory { vmFactory.create(userId) }
        val viewModel = ViewModelProviders.of(this, factory)[UserVmAssisted::class.java]

        textView.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
