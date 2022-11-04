package com.example.calculadoraimc

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