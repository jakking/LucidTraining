package com.example.jake.lucidtraining

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class LucidTrainingOptions : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucid_training_options)

        // Enables Always-on
        setAmbientEnabled()
    }
}
