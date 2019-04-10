/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.ui

import org.junit.Rule
import org.junit.Test
//import org.mozilla.fenix.helpers.AndroidAssetDispatcher
import org.mozilla.fenix.helpers.HomeActivityTestRule
import org.mozilla.fenix.ui.robots.HomeScreenRobot
import org.mozilla.fenix.ui.robots.homeScreen
import org.mozilla.fenix.ui.robots.verifyFenixMenu

/**
 *  Tests for verifying the main three dot menu options
 *
 *  Including:
 * - Verify all menu items present
 * - Forward button navigates forward to a page
 * - Refresh button refreshes page content
 * - Share button opens app overlay menu
 * - Request desktop site toggle forwards to desktop view of web page (TBD)
 * - Find in page button can locate web page text
 * - Report issue button forwards to gitubh issues (TBD)
 * - Open settings button opens Settings sub-menu
 *
 * Not included:
 * - TODO: Request desktop site (user mockWebServer to parse request headers)
 * - Stop button stops page loading (covered by smoke tests)
 */

class HomeScreenTest {
    @get:Rule
    val activityTestRule = HomeActivityTestRule()


    /* ktlint-disable no-blank-line-before-rbrace */ // This imposes unreadable grouping.
    @Test
    fun homeScreenItemsTest() {
        homeScreen {
            verifyFenixMenu()
        }
    }
}
