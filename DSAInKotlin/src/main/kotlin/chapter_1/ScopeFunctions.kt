package org.iyaselerehoboth.chapter_1

import org.iyaselerehoboth.models.Car

fun main() {
    scope1(Car("Coupe 1", 2 ,"Coupe engine"))
    scope2(Car("Lambourghini", 2, "Lambo engine"))
}

fun scope1(car: Car?){
    val isCoupe = car?.let{
        it.doors == 2
    }

    if(isCoupe == true){
        println("Coupes are awesome vehicles")
    }
}

fun scope2(car: Car?){
    val isCoupe = car?.run {
        this.doors == 2
    }

    if (isCoupe == true){
        println("Coupes are awesome cars in Scope 2")
    }
}