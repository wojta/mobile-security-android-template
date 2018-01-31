package org.aerogear.ake2e.pageobject.dsl

import org.aerogear.ake2e.pageobject.Appium

/**
 * Created on 1/30/18.
 */

fun appium(serverPath:String,init: Appium.() -> Unit) = Appium().also(init)