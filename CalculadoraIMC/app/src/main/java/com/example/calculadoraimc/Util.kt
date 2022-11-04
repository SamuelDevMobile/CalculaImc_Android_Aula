package com.example.calculadoraimc

internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {
    // VERIFICA SE UM DOS VALORES DIGITADOS SAO VAZIOS
    return if (verificaPesoAlturaVazio(pesoTxt, alturaTxt)) {
        // SE UM DOS VALORES DOR VAZIO ELE RETORNA ESSA MENSAGEM
        IMCResult(Result.BLANK)
    } else {
        // RECEBE OS VALORES PELO METODO E CONVERT PARA FLOAT E GUARDA NA VARIAVEL
        val peso = pesoTxt.toFloat()
        val altura = alturaTxt.toFloat()
        // CALCULA O IMC
        val imc = peso / (altura * altura)

        // ENTRA EM UMA CONDICAO E RETORNA UMA MENSAGEM DE ACORDO COM O ENUM
        return when {
            imc < 16 -> IMCResult(Result.MAGREZA_III)
            imc < 17 -> IMCResult(Result.MAGREZA_II)
            imc < 18.5 -> IMCResult(Result.MAGREZA_I)
            imc < 25 -> IMCResult(Result.OK)
            imc < 30 -> IMCResult(Result.SOBREPESO)
            imc < 35 -> IMCResult(Result.OBESIDADE_I)
            imc < 40 -> IMCResult(Result.OBESIDADE_II)
            else -> {
                IMCResult(Result.OBESIDADE_III)
            }
        }
    }
}

// METODO QUE VERIFICA SE OS VALORES SAO VAZIOS
private fun verificaPesoAlturaVazio(peso: String, altura: String) =
    peso.isEmpty() || altura.isEmpty()

// CLASSE DE DADOS
data class IMCResult(val result: Result)

// CLASSE DE NUMERADORES COM UMA MENSAGEM JÁ DEFINIDA
enum class Result(val label: String) {
    MAGREZA_III("Magreza grave"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade Grau II (severa)"),
    OBESIDADE_III("Obesidade Grau III (mórbida)"),
    BLANK("Insira os valores de altura e peso corretamente")
}
