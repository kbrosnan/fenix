/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

@file:Suppress("TooManyFunctions")

package org.mozilla.fenix.ui.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers

class HomeScreenRobot {

}
    fun verifyFenixMenu() = fenixMenu()

//    class Transition {
//
//        fun goForward(interact: BrowserRobot.() -> Unit): BrowserRobot.Transition {
//            forwardButton().click()
//            BrowserRobot().interact()
//            return BrowserRobot.Transition()
//        }
//    }

fun homeScreen(interact: HomeScreenRobot.() -> Unit) {
    HomeScreenRobot().interact()
//    return HomeScreenRobot.Transition()
}


private fun fenixMenu() = onView(ViewMatchers.withResourceName("org.mozilla.fenix:id/menuButton"))

