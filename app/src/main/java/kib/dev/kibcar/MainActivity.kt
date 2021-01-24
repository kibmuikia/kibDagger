package kib.dev.kibcar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

//    @Inject
//    lateinit var carOne: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var carComponent = DaggerCarComponent.create()
        var carComponent =
            DaggerCarComponent.builder().dieselEngineModule(DieselEngineModule(450)).build()
        carComponent.inject(this)

        car.start()

        //carOne.start()
    }
}