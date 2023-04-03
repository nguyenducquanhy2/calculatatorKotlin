package com.example.appcalculator.kotlin.View.fragment

import android.app.Dialog
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.view.View.OnClickListener
import androidx.fragment.app.Fragment
import com.example.appcalculator.R
import com.example.appcalculator.kotlin.presenter.calculateBasic
import kotlinx.android.synthetic.main.dialog_advance_calculate.*
import kotlinx.android.synthetic.main.fragment_basic_math.*
import kotlinx.android.synthetic.main.fragment_basic_math.view.*

class BasicMathFragment : Fragment(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //registerEvents()
        val view: View = inflater.inflate(R.layout.fragment_basic_math, container, false)

        registerEvents(view)
        return view

    }

    private fun registerEvents(view: View) {

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            view.btnFactorial.setOnClickListener(this)
            view.btnSqrt2.setOnClickListener(this)
            view.btn2Powx.setOnClickListener(this)
            view.btnBrackets1.setOnClickListener(this)
            view.btnBrackets2.setOnClickListener(this)
            view.btnRemainder.setOnClickListener(this)
            view.btnDive.setOnClickListener(this)
            view.btnXPow2.setOnClickListener(this)
            view.btnXPow3.setOnClickListener(this)
            view.btnXPowY.setOnClickListener(this)
            view.btnEPowx.setOnClickListener(this)
            view.btn10Powx.setOnClickListener(this)
            view.btnSqrt3.setOnClickListener(this)
            view.btn4SqrtX.setOnClickListener(this)
            view.btn1diveX.setOnClickListener(this)
            view.btnLogXy.setOnClickListener(this)
            view.btnLOG.setOnClickListener(this)
            view.btnSin.setOnClickListener(this)
            view.btnCos.setOnClickListener(this)
            view.btnTan.setOnClickListener(this)
            view.btnE.setOnClickListener(this)
            view.btnLn.setOnClickListener(this)
            view.btnCsc.setOnClickListener(this)
            view.btnSec.setOnClickListener(this)
            view.btnCot.setOnClickListener(this)
            view.btnPi.setOnClickListener(this)
            view.btnComma.setOnClickListener(this)
            view.btnRand.setOnClickListener(this)
            view.btnDive.setOnClickListener(this)
            view.btn7.setOnClickListener(this)
            view.btn8.setOnClickListener(this)
            view.btn9.setOnClickListener(this)
            view.btnX.setOnClickListener(this)
            view.btn4.setOnClickListener(this)
            view.btn5.setOnClickListener(this)
            view.btn6.setOnClickListener(this)
            view.btnMinus.setOnClickListener(this)
            view.btn1.setOnClickListener(this)
            view.btn2.setOnClickListener(this)
            view.btn3.setOnClickListener(this)
            view.btnAdd.setOnClickListener(this)
            view.btn0.setOnClickListener(this)
            view.btnDot.setOnClickListener(this)
            view.btnEqual.setOnClickListener(this)
            view.btnC.setOnClickListener(this)
            view.btnBackSpace.setOnClickListener(this)
            return
        }

        view.btnDive.setOnClickListener(this)
        view.btn7.setOnClickListener(this)
        view.btn8.setOnClickListener(this)
        view.btn9.setOnClickListener(this)
        view.btnX.setOnClickListener(this)
        view.btn4.setOnClickListener(this)
        view.btn5.setOnClickListener(this)
        view.btn6.setOnClickListener(this)
        view.btnMinus.setOnClickListener(this)
        view.btn1.setOnClickListener(this)
        view.btn2.setOnClickListener(this)
        view.btn3.setOnClickListener(this)
        view.btnAdd.setOnClickListener(this)
        view.btn0.setOnClickListener(this)
        view.btnDot.setOnClickListener(this)
        view.btnEqual.setOnClickListener(this)
        view.btnC.setOnClickListener(this)
        view.btnBackSpace.setOnClickListener(this)
        view.btnMode.setOnClickListener(this)
    }

    private fun setFrameLayout(fragment: Fragment) {
        val begintransaction = activity?.supportFragmentManager?.beginTransaction()
        begintransaction?.replace(R.id.layoutRoot, fragment)?.commit()
    }

    private fun addExpression(view: View) {
        calculateBasic.addExpression(view, tvExpressionBasicMath, tvResultBasicMath)
    }

    private fun clearTextView() {
        tvExpressionBasicMath.text = ""
        tvResultBasicMath?.text = ""
        tvResultBasicMath?.hint = "="
    }

    private fun backSpace() {
        val currentTv = tvExpressionBasicMath.text.toString()
        tvExpressionBasicMath.text = currentTv.dropLast(1)
    }

    private fun equal() {
        calculateBasic.calculate(tvExpressionBasicMath, tvResultBasicMath)
    }

    private fun random() {
        calculateBasic.randomNumber(tvExpressionBasicMath)
    }

    private fun showDialog() {
        val dialog = Dialog(context as Context)
        dialog.requestWindowFeature(Window.FEATURE_ACTION_BAR)
        dialog.setContentView(R.layout.dialog_advance_calculate)
        val window = dialog.window
        if (window == null) {
            return
        }
        window.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

        val basicMath = dialog.Math1
        basicMath.setOnClickListener {
            setFrameLayout(BasicMathFragment())
            dialog.dismiss()
        }

        val polynomial2 = dialog.polynomialdegree2
        polynomial2.setOnClickListener {
            setFrameLayout(polynomial2())
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onClick(v: View?) {

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            when (v?.id) {

                btnFactorial.id, btnSqrt2.id, btn2Powx.id, btnBrackets1.id, btnBrackets2.id, btnDive.id,
                btnRemainder.id, btnDive.id, btnXPow2.id, btnXPow3.id, btnXPowY.id,
                btnEPowx.id, btn10Powx.id, btn7.id, btn8.id, btn9.id, btnX.id, btnSqrt3.id, btn4SqrtX.id,
                btn1diveX.id, btnLogXy.id, btnLOG.id, btn4.id, btn5.id, btn6.id, btnMinus.id, btnSin.id,
                btnCos.id, btnTan.id, btnE.id, btnLn.id, btn1.id, btn2.id, btn3.id, btnAdd.id,
                btnCsc.id, btnSec.id, btnCot.id, btnPi.id, btnComma.id, btn0.id, btnDot.id -> {
                    addExpression(v)
                }

                btnEqual.id -> {
                    equal()
                }

                btnC.id -> {
                    clearTextView()
                }
                btnBackSpace.id -> {
                    backSpace()
                }
                btnRand.id -> {
                    random()
                }
            }

            return
        }

        when (v?.id) {
            btnDive.id, btn7.id, btn8.id, btn9.id, btnX.id, btn4.id, btn5.id, btn6.id, btnMinus.id, btnDive.id,
            btn1.id, btn2.id, btn3.id, btnAdd.id, btn0.id, btnDot.id -> {
                addExpression(v)
            }

            btnEqual.id -> {
                equal()
            }

            btnC.id -> {
                clearTextView()
            }
            btnBackSpace.id -> {
                backSpace()
            }
            btnMode.id -> {
                showDialog()
            }

        }
    }
}