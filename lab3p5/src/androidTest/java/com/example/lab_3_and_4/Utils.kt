package com.example.lab_3_and_4

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed as matcherIsDisplayed

fun ViewInteraction.isDisplayed() = check(matches(matcherIsDisplayed()))
fun ViewInteraction.performClick() = perform(click())

fun goToFirst() {
    clickOnToFirstButton()
    checkIsFragment1()
}

fun goToSecond() {
    clickOnToSecondButton()
    checkIsFragment2()
}

fun goToThird() {
    clickOnToThirdButton()
    checkIsFragment3()
}

fun goToAbout() {
    clickOnAboutMenuItem()
    checkIsAboutActivity()
}
