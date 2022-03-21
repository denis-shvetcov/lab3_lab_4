package com.example.myapplication

import androidx.test.espresso.Espresso

fun clickOnToFirstButton() = onToFirstButton().performClick()
fun clickOnToSecondButton() = onToSecondButton().performClick()
fun clickOnToThirdButton() = onToThirdButton().performClick()

fun clickOnNavigateUpButton() = onNavigateUpButton().performClick()
fun clickOnAboutMenuItem() = Espresso.openContextualActionModeOverflowMenu().also {
    onAboutMenuItem().performClick()
}
