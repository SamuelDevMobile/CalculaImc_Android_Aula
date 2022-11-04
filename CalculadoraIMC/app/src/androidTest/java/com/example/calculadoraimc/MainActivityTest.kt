package com.example.calculadoraimc

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun `testa_CliqueButton_ExibeMensagemSaudavel`() {
        onView(withId(R.id.edt_peso))
            .perform(typeText("67"))
        onView(withId(R.id.edt_altura))
            .perform(typeText("1.76"))
        onView(withId(R.id.btn_make_calc))
            .perform(click())
        onView(withText("Saudável"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun `testa_CliqueButton_ExibeMensagemError`() {
        onView(withId(R.id.btn_make_calc))
            .perform(click())
        onView(withText("Insira os valores de altura e peso corretamente"))
            .check(matches(isDisplayed()))
    }
}