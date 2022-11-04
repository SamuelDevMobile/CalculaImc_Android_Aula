package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ACIONA BOTAO CLIQUE
        btn_make_calc.setOnClickListener {
            // PEGA INFORMACOES DO TEXT INPUT
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()

            // PASSA OS VALORES DIGITADOS PARA UM METODO
            val imcResult = getImcResult(pesoTxt, alturaTxt)

            // MOSTRA O RESULTADO NA TELA
            txt_result_imc.text = imcResult.result.label
        }
    }
}