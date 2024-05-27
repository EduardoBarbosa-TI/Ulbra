package com.example.tde_jetpack

fun String.convertToManyWithSymbol() = "R$".plus(this.replace(".", ","))