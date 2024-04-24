package org.example

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        println(Main.javaClass.`package`.implementationVersion) // retrieve version from Jar
    }
}