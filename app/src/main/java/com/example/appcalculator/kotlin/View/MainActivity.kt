package com.example.appcalculator.kotlin.View

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.appcalculator.R
import com.example.appcalculator.kotlin.View.fragment.BasicMathFragment
import com.example.appcalculator.kotlin.calculateNotify
import com.example.appcalculator.kotlin.presenter.calculateBasic
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_advance_calculate.*
import kotlinx.android.synthetic.main.dialog_advance_calculate.view.*
import kotlinx.android.synthetic.main.fragment_basic_math.*
import org.mariuszgromada.math.mxparser.Expression
import kotlin.math.nextDown
import kotlin.math.nextUp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val basicMath=BasicMathFragment()
        setFrameLayout(basicMath)



    }

     private fun setFrameLayout(fragment:Fragment) {
        val begintransaction= supportFragmentManager.beginTransaction()
        begintransaction.replace(R.id.layoutRoot,fragment).commit()
    }




}