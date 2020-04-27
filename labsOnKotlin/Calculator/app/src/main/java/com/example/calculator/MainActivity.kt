package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


        private var inputnumber: TextView? = null
        private var n1 = 0.0
        private var n2 = 0.0
        private var result = 0.0
        private var check = false
        private var dot = false
        private val eq = false

        internal enum class Sign {
            PlUS, MINUS, MUL, DIV
        }

        private var sign: Sign? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            inputnumber = findViewById(R.id.Input)
            buttonCE.setOnClickListener(this)
            buttonC.setOnClickListener(this)
            button1.setOnClickListener(this)
            button2.setOnClickListener(this)
            button3.setOnClickListener(this)
            button4.setOnClickListener(this)
            button5.setOnClickListener(this)
            button6.setOnClickListener(this)
            button7.setOnClickListener(this)
            button8.setOnClickListener(this)
            button9.setOnClickListener(this)
            button0.setOnClickListener(this)
            buttonMinus.setOnClickListener(this)
            buttonMul.setOnClickListener(this)
            buttonDiv.setOnClickListener(this)
            buttonDot.setOnClickListener(this)
            buttonSqr.setOnClickListener(this)
            buttonSqrt.setOnClickListener(this)
            buttonPlus.setOnClickListener(this)
            buttonEqual.setOnClickListener(this)
        }



        override fun onClick(view: View) {
            when (view.id) {
                R.id.button1 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("1")
                }
                R.id.button2 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("2")
                }
                R.id.button3 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("3")
                }
                R.id.button4 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("4")
                }
                R.id.button5 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("5")
                }
                R.id.button6 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("6")
                }
                R.id.button7 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("7")
                }
                R.id.button8 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("8")
                }
                R.id.button9 -> {
                    if (inputnumber?.text.toString() == "Error" || inputnumber?.text
                            .toString() == "0"
                    ) {
                        inputnumber?.text = ""
                    }
                    inputnumber?.append("9")
                }
                R.id.button0 -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (inputnumber?.length() == 0) {
                        inputnumber?.append("0")
                        return
                    }
                    if (inputnumber?.text.toString()[0] != '0') inputnumber?.append("0")
                }
                R.id.buttonDot -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (!dot and (inputnumber!!.length() > 0)) {
                        inputnumber?.append(".")
                        dot = true
                    }
                }
                R.id.buttonC -> {
                    inputnumber?.text = ""
                    dot = false
                }
                R.id.buttonCE -> {
                    if (inputnumber?.length() == 0) return
                    if (inputnumber?.length() == 1) {
                        inputnumber?.text = ""
                        return
                    }
                    if (inputnumber!!.length() > 2) {
                        if (inputnumber?.text.toString()[inputnumber!!.length() - 2] == '.') {
                            inputnumber?.text = inputnumber?.text.toString()
                                .substring(0, inputnumber!!.length() - 2)
                            dot = false
                             return
                        }
                    }
                    inputnumber?.text =
                        inputnumber?.text.toString().substring(0, inputnumber!!.length() - 1)
                }
                R.id.buttonDiv -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (dot) {
                        inputnumber?.append("0")
                        n1 = inputnumber?.text.toString().toDouble()
                        inputnumber?.text = ""
                        dot = false
                    } else n1 = inputnumber?.text.toString().toInt().toDouble()
                    inputnumber?.text = ""
                    sign = Sign.DIV
                }
                R.id.buttonMinus -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (dot) {
                        inputnumber?.append("0")
                        n1 = inputnumber?.text.toString().toDouble()
                        inputnumber?.text = ""
                        dot = false
                    } else n1 = inputnumber?.text.toString().toInt().toDouble()
                    inputnumber?.text = ""
                    sign = Sign.MINUS
                }
                R.id.buttonPlus -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (dot) {
                        inputnumber?.append("0")
                        n1 = inputnumber?.text.toString().toDouble()
                        inputnumber?.text = ""
                        dot = false
                    } else n1 = inputnumber?.text.toString().toInt().toDouble()
                    inputnumber?.text = ""
                    sign = Sign.PlUS
                }
                R.id.buttonMul -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (dot) {
                        inputnumber?.append("0")
                        n1 = inputnumber?.text.toString().toDouble()
                        inputnumber?.text = ""
                        dot = false
                    } else n1 = inputnumber?.text.toString().toInt().toDouble()
                    inputnumber?.text = ""
                    sign = Sign.MUL
                }
                R.id.buttonSqr -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (inputnumber!!.length() > 0) {
                        n1 = inputnumber?.text.toString().toDouble()
                        if (n1 == Math.floor(n1)) {
                            inputnumber?.setText((n1 * n1).toString())
                        } else {
                            inputnumber?.text = (n1 * n1).toString()
                        }
                    }
                }
                R.id.buttonSqrt -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                    }
                    if (inputnumber!!.length() > 0) {
                        n1 = inputnumber?.text.toString().toDouble()
                        n1 = Math.sqrt(n1)
                        if (n1 == Math.floor(n1)) {
                            inputnumber?.setText(n1 as Int)
                        } else {
                            inputnumber?.text = n1.toString()
                        }
                    }
                }
                R.id.buttonEqual -> {
                    if (inputnumber?.text.toString() == "Error") {
                        inputnumber?.text = ""
                        return
                    }
                    n2 = if (inputnumber?.text.toString() !== "") {
                        if (dot) inputnumber?.text.toString()
                            .toDouble() else inputnumber?.text.toString().toInt().toDouble()
                    } else {
                        return
                    }
                    if (sign == Sign.PlUS) {
                        result = n1 + n2
                    }
                    if (sign == Sign.MINUS) {
                        result = n1 - n2
                    }
                    if (sign == Sign.MUL) {
                        result = n1 * n2
                    }
                    if (sign == Sign.DIV) {
                        if (Math.floor(n2) == 0.0) {
                            inputnumber?.text = "Error"
                        }
                        result = n1 / n2
                    }
                    if (result == Math.floor(result) && !java.lang.Double.isInfinite(
                            result
                        )
                    ) {
                        inputnumber?.setText(result.toString())
                    } else {
                        inputnumber?.text = java.lang.Double.toString(result)
                        dot = true
                    }
                    n2 = 0.0
                }
            }
        }
    fun IsLong() {
        check = if (inputnumber!!.length() > 8) {
            true
        } else {
            false
        }
    }

}
