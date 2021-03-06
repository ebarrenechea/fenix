/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.components.toolbar

open class BrowserInteractor(
    private val browserToolbarController: BrowserToolbarController
) : BrowserToolbarViewInteractor {

    override fun onTabCounterClicked() {
        browserToolbarController.handleTabCounterClick()
    }

    override fun onTabCounterMenuItemTapped(item: TabCounterMenuItem) {
        browserToolbarController.handleTabCounterItemInteraction(item)
    }

    override fun onBrowserToolbarPaste(text: String) {
        browserToolbarController.handleToolbarPaste(text)
    }

    override fun onBrowserToolbarPasteAndGo(text: String) {
        browserToolbarController.handleToolbarPasteAndGo(text)
    }

    override fun onBrowserToolbarClicked() {
        browserToolbarController.handleToolbarClick()
    }

    override fun onBrowserToolbarMenuItemTapped(item: ToolbarMenu.Item) {
        browserToolbarController.handleToolbarItemInteraction(item)
    }

    override fun onBrowserMenuDismissed(lowPrioHighlightItems: List<ToolbarMenu.Item>) {
        browserToolbarController.handleBrowserMenuDismissed(lowPrioHighlightItems)
    }

    override fun onScrolled(offset: Int) {
        browserToolbarController.handleScroll(offset)
    }

    override fun onReaderModePressed(enabled: Boolean) {
        browserToolbarController.handleReaderModePressed(enabled)
    }
}
