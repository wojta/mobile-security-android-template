package org.aerogear.ake2e.pageobject

/**
 * Created on 1/29/18.
 */
interface PageObject {

    val pageName:String
        get()=this::class.toString()


}