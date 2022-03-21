package com.example.myapplication

import android.content.pm.ActivityInfo
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RotateTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private fun performRotation() = activityRule.scenario.onActivity {
        it.requestedOrientation = if (it.requestedOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        } else {
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }
        Thread.sleep(1000L)
    }

    @Test
    fun rotationTest() { // проверка поворотов + навигация по кнопкам
        checkIsFragment1()
        performRotation()
        checkIsFragment1()

        goToSecond()
        performRotation()
        checkIsFragment2()

        goToThird()
        performRotation()
        checkIsFragment3()

        goToFirst()
        performRotation()
        checkIsFragment1()

        goToSecond()
        performRotation()
        checkIsFragment2()

        goToThird()
        performRotation()
        checkIsFragment3()

        goToAbout()
        performRotation()
        checkIsAboutActivity()
        clickOnNavigateUpButton()
        checkIsFragment3()

        goToSecond()
        performRotation()
        checkIsFragment2()

        goToFirst()
        performRotation()
        checkIsFragment1()
    }
}
