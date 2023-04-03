package com.example.appcalculator.kotlin.View.fragment

import android.app.Dialog
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.view.View.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.appcalculator.R
import com.example.appcalculator.kotlin.Ipolyomial2
import com.example.appcalculator.kotlin.calculateNotify
import com.example.appcalculator.kotlin.presenter.polyomial2Presenter
import kotlinx.android.synthetic.main.dialog_advance_calculate.*
import kotlinx.android.synthetic.main.fragment_basic_math.*
import kotlinx.android.synthetic.main.fragment_basic_math.view.*
import kotlinx.android.synthetic.main.fragment_polynomial2.*
import kotlinx.android.synthetic.main.fragment_polynomial2.btn0
import kotlinx.android.synthetic.main.fragment_polynomial2.btn1
import kotlinx.android.synthetic.main.fragment_polynomial2.btn2
import kotlinx.android.synthetic.main.fragment_polynomial2.btn3
import kotlinx.android.synthetic.main.fragment_polynomial2.btn4
import kotlinx.android.synthetic.main.fragment_polynomial2.btn5
import kotlinx.android.synthetic.main.fragment_polynomial2.btn6
import kotlinx.android.synthetic.main.fragment_polynomial2.btn7
import kotlinx.android.synthetic.main.fragment_polynomial2.btn8
import kotlinx.android.synthetic.main.fragment_polynomial2.btn9
import kotlinx.android.synthetic.main.fragment_polynomial2.btnAdd
import kotlinx.android.synthetic.main.fragment_polynomial2.btnBackSpace
import kotlinx.android.synthetic.main.fragment_polynomial2.btnC
import kotlinx.android.synthetic.main.fragment_polynomial2.btnDive
import kotlinx.android.synthetic.main.fragment_polynomial2.btnDot
import kotlinx.android.synthetic.main.fragment_polynomial2.btnEqual
import kotlinx.android.synthetic.main.fragment_polynomial2.btnMinus
import kotlinx.android.synthetic.main.fragment_polynomial2.btnMode
import kotlinx.android.synthetic.main.fragment_polynomial2.btnX
import kotlinx.android.synthetic.main.fragment_polynomial2.view.*
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn0
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn1
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn2
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn3
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn4
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn5
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn6
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn7
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn8
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btn9
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnAdd
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnBackSpace
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnC
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnDive
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnDot
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnEqual
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnMinus
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnMode
import kotlinx.android.synthetic.main.fragment_polynomial2.view.btnX

class polynomial2 : Fragment() ,OnClickListener,calculateNotify,OnLongClickListener, Ipolyomial2 {

    private var ax2:Boolean = false
    private var bx:Boolean = false
    private var constant:Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_polynomial2, container, false)
        registerEvents(view)
        return view
    }

    fun selectTextView(view: View){

        ax2=false
        bx=false
        constant=false

        tvAx2.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke)
        tvBx.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke)
        tvConstanst2.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke)

        if (view.id==tvAx2.id) {
            ax2=true
            tvAx2.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke_checked)
            return
        }
        if (view.id==tvBx.id) {
            bx=true
            tvBx.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke_checked)
            return
        }
        if (view.id==tvConstanst2.id) {
            constant=true
            tvConstanst2.background=ContextCompat.getDrawable(context as Context,R.drawable.stroke_checked)
            return
        }
    }

    fun UpdateTextView(){

    }


    private fun registerEvents(view:View) {

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
        view.tvAx2.setOnClickListener(this)
        view.tvBx.setOnClickListener(this)
        view.tvConstanst2.setOnClickListener(this)
        view.btnMode.setOnClickListener(this)

        view.btnC.setOnLongClickListener(this)

    }

    private fun setFrameLayout(fragment:Fragment) {
        val begintransaction= activity?.supportFragmentManager?.beginTransaction()
        begintransaction?.replace(R.id.layoutRoot,fragment)?.commit()
    }

    private fun addExpression(view: View,textView: TextView) {
        var currentTv= textView.text.toString()
        currentTv+=view.tag.toString()
        textView.text=currentTv
    }

    private fun clearTextViewIsFocus(){
        var textViewFocus:TextView?= isCheckedTextView()
        textViewFocus?.text=""
    }


    private fun clear3TextView(){

            tvAx2.text=""
            tvBx.text=""
            tvConstanst2.text=""
    }

    private fun backSpace(textView: TextView) {
        val currentTv= textView.text.toString()
        textView.text=currentTv.dropLast(1)
    }

    private fun equal() {
        val ax2=tvAx2.text.toString()
        val bx=tvBx.text.toString()
        val constans=tvConstanst2.text.toString()

        val polyomial2:polyomial2Presenter= polyomial2Presenter(this)

        val result:Map<String,Double>? =polyomial2.calculatePolynomialDegree2(ax2,bx,constans)

        if (result!=null){
            val root1= result.get("Root 1")
            val root2= result.get("Root 2")

            tvRoot1.text="Root 1 exist $root1"
            tvRoot1.visibility= VISIBLE

            if (root2!=null){
                tvRoot2.visibility= VISIBLE
                tvRoot2.text="Root 2 exist $root2"
            }
        }



    }

    private fun random(){
        val valueRandom=Math.random()*100
        tvExpressionBasicMath.text=valueRandom.toInt().toString()
    }

    override fun error() {
        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
    }

    private fun showDialog() {

        val dialog= Dialog(context as Context)
        dialog.requestWindowFeature(Window.FEATURE_ACTION_BAR)
        dialog.setContentView(R.layout.dialog_advance_calculate)
        val window=dialog.window
        if (window == null) {
            return
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)


        val basicMath=dialog.Math1
        basicMath.setOnClickListener {
            setFrameLayout(BasicMathFragment())
            dialog.dismiss()
        }

        val polynomial2=dialog.polynomialdegree2
        polynomial2.setOnClickListener {
            setFrameLayout(polynomial2())
            dialog.dismiss()
        }

        dialog.show()

    }

    fun isCheckedTextView(): TextView? {
        var textView:TextView?=null

        if (ax2==true){
            textView=tvAx2 as TextView
        }

        if (bx==true){
            textView=tvBx as TextView
        }
        if (constant==true){
            textView=tvConstanst2 as TextView
        }
        return textView
    }

    override fun onClick(v: View?) {

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            when (v?.id){

                btnFactorial.id, btnSqrt2.id, btn2Powx.id, btnBrackets1.id, btnBrackets2.id,btnDive.id,
                btnRemainder.id, btnDive.id, btnXPow2.id, btnXPow3.id, btnXPowY.id,
                btnEPowx.id, btn10Powx.id, btn7.id, btn8.id, btn9.id, btnX.id, btnSqrt3.id, btn4SqrtX.id,
                btn1diveX.id, btnLogXy.id, btnLOG.id, btn4.id, btn5.id, btn6.id, btnMinus.id, btnSin.id,
                btnCos.id, btnTan.id, btnE.id, btnLn.id, btn1.id, btn2.id, btn3.id, btnAdd.id,
                btnCsc.id, btnSec.id, btnCot.id, btnPi.id, btnComma.id, btn0.id, btnDot.id-> {
                    //addExpression(v)
                }

                btnEqual.id->{
                    equal()
                }

                btnC.id->{
                    clear3TextView()
                }
                btnBackSpace.id->{
                    //backSpace()
                }
                btnRand.id->{
                    random()
                }
            }

            return
        }

        when (v?.id){

            tvAx2.id,tvBx.id,tvConstanst2.id->{
                selectTextView(v)
            }

            btnDive.id,  btn7.id, btn8.id, btn9.id, btnX.id, btn4.id, btn5.id, btn6.id, btnMinus.id,btnDive.id,
            btn1.id, btn2.id, btn3.id, btnAdd.id, btn0.id, btnDot.id-> {
                var textViewFocus:TextView?= isCheckedTextView()

                if (textViewFocus != null) {
                    addExpression(v,textViewFocus)
                }

            }

            btnEqual.id->{
                equal()
            }

            btnC.id->{
                clearTextViewIsFocus()
            }
            btnBackSpace.id->{
                var textViewFocus:TextView?= isCheckedTextView()

                if (textViewFocus != null) {
                    backSpace(textViewFocus)
                }

            }
            btnMode.id->{
                showDialog()
            }



        }
    }

    override fun onLongClick(v: View?): Boolean {
        when(v?.id){
            btnC.id->{
                clear3TextView()
            }
        }

        return true
    }

    override fun errorAx2() {
        Toast.makeText(context, "Coefficient 'A' must different 0", Toast.LENGTH_SHORT).show()
    }

    override fun ExpressionNotExistsRoot() {
        Toast.makeText(context, "Expression not exist root", Toast.LENGTH_SHORT).show()
    }


}