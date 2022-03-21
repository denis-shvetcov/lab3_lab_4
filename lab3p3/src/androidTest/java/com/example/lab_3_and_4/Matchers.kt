package com.example.lab_3_and_4

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers

fun onFragment1() = Espresso.onView(ViewMatchers.withId(R.id.fragment1))
fun onFragment2() = Espresso.onView(ViewMatchers.withId(R.id.fragment2))
fun onFragment3() = Espresso.onView(ViewMatchers.withId(R.id.fragment3))
fun onAboutActivity() = Espresso.onView(ViewMatchers.withId(R.id.activity_about))

fun onToFirstButton() = Espresso.onView(ViewMatchers.withId(R.id.bnToFirst))
fun onToSecondButton() = Espresso.onView(ViewMatchers.withId(R.id.bnToSecond))
fun onToThirdButton() = Espresso.onView(ViewMatchers.withId(R.id.bnToThird))

fun onNavigateUpButton() = Espresso.onView(ViewMatchers.withContentDescription(R.string.abc_action_bar_up_description))
fun onAboutMenuItem() = Espresso.onView(ViewMatchers.withText(R.string.title_about))
