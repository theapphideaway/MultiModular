package com.theapphideaway.feature_one

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivityFeatureOne @Inject constructor() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_feature_one)
    }
}
