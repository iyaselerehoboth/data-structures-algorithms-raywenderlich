package org.iyaselerehoboth.chapter_1

fun main() {
    val noOfCups = Box<Int>()
    noOfCups.put(4)
    println(noOfCups.retrieve())

    val check = Box<Boolean>()
    check.put(false)
    println(check.retrieve())
}


/**
 * Generics classes can be used for abstracting code.
 * Its a kind of class that can allow for any type of variable, provided the type is instantiated on creation.
 */
class Box<T>{
    private var content: T? = null

    fun put(content: T?){
        this.content = content
    }

    fun retrieve(): T?{
        return content
    }

    fun isEmpty(): Boolean{
        return content == null
    }

}