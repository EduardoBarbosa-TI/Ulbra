package com.example.tde_jetpack.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tde_jetpack.presentation.domain.model.Product

class ProductViewModel : ViewModel() {

    private val list = mutableListOf(
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/06/93/09/47/240_F_693094707_Eavnydwp6Su2Tx9REPzSZxDmEbElu0Az.jpg",
            name = "Laranja",
            description = "Creme refrescante",
            price = "32.00"
        ),
        Product(
            urlImage = "https://t4.ftcdn.net/jpg/04/13/50/15/240_F_413501576_JBNFcI7nQ34BYAu7FXJTWLZQ8Y7ptSz3.jpg",
            name = "Pêssego",
            description = "Creme refrescante",
            price = "40.00"
        ),
        Product(
            urlImage = "https://th.bing.com/th/id/OIP.tPRs9UMY-ncO2WP3_76tIwHaE7?rs=1&pid=ImgDetMain",
            name = "Blueberry",
            description = "Creme refrescante",
            price = "22.90"
        ),
        Product(
            urlImage = "https://www.hiteshkumar.com/wp-content/uploads/2021/07/GREEN-PRINT-WE-BREAK-DOWN-THE-LABELS_1_OI.jpg",
            name = "Limão",
            description = "Creme refrescante",
            price = "10.90"
        ),
        Product(
            urlImage = "https://th.bing.com/th/id/OIP.cFPHsLnWstjr4ljHalZ0swAAAA?rs=1&pid=ImgDetMain",
            name = "Maracujá",
            description = "Creme refrescante",
            price = "17.90"
        )
    )

    fun getProducts() = list

    fun removeItem(index: Int) {
        list.removeAt(index)
    }
}
