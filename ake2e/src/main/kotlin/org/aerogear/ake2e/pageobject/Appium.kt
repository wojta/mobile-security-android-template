package org.aerogear.ake2e.pageobject

/**
 * Created on 1/30/18.
 */
class Appium() {

    lateinit var serverPath: String

    val applications=listOf(Applications())

    fun applications(applications: Applications.() -> Unit): Applications = Applications().also(applications)

    class Applications:ArrayList<Applications>() {

        fun androidApplication(init: AndroidApplication.() -> Unit): AndroidApplication = AndroidApplication().also(init).also { add(it) }
    }

}

