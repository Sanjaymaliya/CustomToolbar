package com.maliyabrother.customtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarLeftImage.setLeftIconListener(listener = View.OnClickListener {
           Log.e("Tag :","Back icon click")
        })

        toolbarRightImage.setRightIconListener(listener = View.OnClickListener {
            Log.e("Tag :","Cross icon click")
        })

        toolbarRightTextView.setRightTextListener(listener = View.OnClickListener {
            Log.e("Tag :","Add Button click")
        })

        toolbarLeftTextView.setLeftTextListener(listener = View.OnClickListener {
            Log.e("Tag :","Back Button click")
        })
    }
}
