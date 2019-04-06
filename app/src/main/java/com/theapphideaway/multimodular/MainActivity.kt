package com.theapphideaway.multimodular

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.theapphideaway.feature_one.MainActivityFeatureOne
import dagger.Component
import kotlinx.android.synthetic.main.activity_main.feature_one_button
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var featureOneActivity: MainActivityFeatureOne

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainActivity_CoreInterface.create().pokeCore(this)
        buttonPressed()
    }

    fun buttonPressed(){
        feature_one_button.setOnClickListener {
            var intent = Intent(this, featureOneActivity::class.java)

            startActivity(intent)
        }
    }

    @Component
    interface CoreInterface{
        fun pokeCore(app: MainActivity)
    }
}
