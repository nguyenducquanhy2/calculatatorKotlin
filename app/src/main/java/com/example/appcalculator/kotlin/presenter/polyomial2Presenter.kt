package com.example.appcalculator.kotlin.presenter

import com.example.appcalculator.kotlin.Ipolyomial2

class polyomial2Presenter(var polyomial2: Ipolyomial2) {

    //Public
    public fun calculatePolynomialDegree2(ax2:String,bx:String,constans:String):Map<String,Double>?{

        var result:Map<String,Double>? =calculatePolynomial2(ax2,bx,constans)

        return result
    }


    //Private
    private fun calculatePolynomial2(ax2:String,bx:String,constans:String):Map<String,Double>?{
        if (ax2.isEmpty()){
            polyomial2.errorAx2()
            return null
        }

        var mapValue:MutableMap<String,Double> = mutableMapOf()

        if (bx.isEmpty()&&constans.isEmpty()){
            mapValue.put("Root 1",0.0)
            return mapValue
        }


        val D_ax2=ax2.toDouble()
        val D_bx=bx.toDouble()
        val D_constans=constans.toDouble()

        val delta= (D_bx*D_bx)-(4*D_ax2*D_constans)

        if (delta<0){
            polyomial2.ExpressionNotExistsRoot()
            return null
        }

        if (delta>0){
            val root1=(-D_bx+Math.sqrt(delta))/(2*D_ax2)
            val root2=(-D_bx-Math.sqrt(delta))/(2*D_ax2)

            mapValue.put("Root 1",root1)
            mapValue.put("Root 2",root2)
        }

        return mapValue
    }


}