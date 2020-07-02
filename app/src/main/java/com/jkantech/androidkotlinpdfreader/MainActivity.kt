package com.jkantech.androidkotlinpdfreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karumi.dexter.Dexter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dexter.withActivity(this)

        loadPDF()
    }


    private fun loadPDF() {
        pdfView.fromAsset("slides.pdf")
            .enableSwipe(true) 
            .swipeHorizontal(false)
            .enableDoubletap(true)
            .enableAnnotationRendering(true)

            .load()
    }

}