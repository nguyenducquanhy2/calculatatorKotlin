package com.example.appcalculator.kotlin.presenter

import android.view.View
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

object calculateBasic {

    fun calculate(tvExpressionBasicMath: TextView, tvResultBasicMath: TextView) {
        var texviewValue = tvExpressionBasicMath.text.toString()
        tvExpressionBasicMath.text = "= ${calculateExpression(texviewValue)}"
        tvResultBasicMath.text = ""
    }

    fun randomNumber(tvExpressionBasicMath:TextView) {
        val valueRandom = Math.random() * 100
        tvExpressionBasicMath.text = valueRandom.toInt().toString()
    }


    fun addExpression(view: View, tvExpressionBasicMath: TextView, tvResultBasicMath: TextView) {
        var currentTv = tvExpressionBasicMath.text.toString()

        if (currentTv.isNotEmpty() && currentTv[0].equals('=')) {
            currentTv = currentTv.drop(1)
        }

        if (currentTv.isNotEmpty()&&validOperators(currentTv) && validOperators(view.tag.toString())) {
            currentTv = currentTv.dropLast(1)
        }

        currentTv += view.tag.toString()
        tvExpressionBasicMath.text = currentTv

        val resultRuntime = calculateExpression(currentTv)

        if (!resultRuntime.equals("error")) {
            tvResultBasicMath.text = "= $resultRuntime"
        }
    }

    private fun calculateExpression(texviewValue: String): String {


        var currentTv = texviewValue //modificationTextView(texviewValue)

        if (currentTv.isNotEmpty()&&currentTv[0].equals('=')){
            currentTv=currentTv.drop(1)
        }

        val expression = Expression(currentTv)
        val result: Double = expression.calculate()
        if (result.isNaN()) {
            return "error"
        }
        return result.toString()
    }

    private fun validOperators(currentTv: String): Boolean {

        if (currentTv.last().equals('÷')) return true

        if (currentTv.last().equals('×')) return true
        if (currentTv.last().equals('-')) return true
        if (currentTv.last().equals('+')) return true

        return false
    }
}