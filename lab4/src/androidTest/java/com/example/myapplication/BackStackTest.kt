package com.example.myapplication

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.pressBackUnconditionally
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BackStackTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private fun checkIsActivityDestroyed() = assert(activityRule.scenario.state.isAtLeast(Lifecycle.State.DESTROYED))

    private fun goToAboutAndBack() {
        goToAbout()
        pressBackUnconditionally()
    }

    @Test
    fun exitFrom1() {
        pressBackUnconditionally()
        checkIsActivityDestroyed()
    }

    @Test
    fun exitFrom1_2_1_2_1() {
        goToSecond()
        goToFirst()
        goToSecond()
        goToFirst()
        pressBackUnconditionally()
        checkIsActivityDestroyed()
    }

    @Test
    fun exitFrom1_2_3_2_3_2_1() {
        goToSecond()
        goToThird()
        goToSecond()
        goToThird()
        clickOnNavigateUpButton()
        checkIsFragment2()
        clickOnNavigateUpButton()
        checkIsFragment1()
        pressBackUnconditionally()
        checkIsActivityDestroyed()
    }

    @Test
    fun exitFrom1_2_3_1_2_1_2_3_2() {
        goToSecond()
        goToAboutAndBack()
        goToThird()
        goToAboutAndBack()
        goToFirst()
        goToAboutAndBack()
        goToSecond()
        goToAboutAndBack()
        goToFirst()
        goToAboutAndBack()
        goToSecond()
        goToAboutAndBack()
        goToThird()
        goToAboutAndBack()
        goToSecond()
        pressBackUnconditionally()
        checkIsFragment1()
        pressBackUnconditionally()
        checkIsActivityDestroyed()
    }
}
