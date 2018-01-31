package com.feedhenry.securenativeandroidtemplate.integrationtests

import org.aerogear.ake2e.pageobject.dsl.appium
import org.junit.Test

/**
 * Created on 1/30/18.
 */
class NewTest {

    @Test
    fun test() {
        appium("http://sss") {
            applications {
                androidApplication {

                }
            }
        }
    }

}