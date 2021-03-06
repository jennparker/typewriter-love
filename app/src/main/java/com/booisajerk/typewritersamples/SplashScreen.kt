package com.booisajerk.typewritersamples

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import kotlinx.android.synthetic.main.splash_screen.*

class SplashScreen : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val typewriterButtonFont = Typeface.createFromAsset(assets, "fonts/type_keys.ttf")
        splashText.typeface = typewriterButtonFont

        val typewriterFont = Typeface.createFromAsset(assets, "fonts/lc_smith_5_typewriter.ttf")
        splashHint.typeface = typewriterFont

        splashText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
