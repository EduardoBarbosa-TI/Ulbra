package com.example.tde_jetpack.presentation.commons.extensions

fun String.convertToManyWithSymbol() = "R$".plus(this.replace(".", ","))