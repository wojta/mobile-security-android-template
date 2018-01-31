package org.aerogear.ake2e.pageobject

import org.aerogear.ake2e.pageobject.dsl.AndroidDesiredCapabilities
import org.aerogear.ake2e.pageobject.dsl.DesiredCapabilities

/**
 * Created on 1/30/18.
 */
class AndroidApplication : Application() {

    fun initDriver(init: DesiredCapabilities.() -> Unit): AndroidDesiredCapabilities = AndroidDesiredCapabilities().also(init).also {
        //webDriver=AndroidDriver<MobileElement>()
    }


}
