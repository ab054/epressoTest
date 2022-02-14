package com.example.mylogin

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.mylogin.ui.login.LoginActivity
import org.junit.Rule
import org.junit.Test

class LoginUITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)


    @Test
    fun greeterSaysHello() {
        onView(withId(R.id.username)).perform(typeText("SomeLoginName"))
        onView(withId(R.id.password)).perform(typeText("somepassword"))

        onView(withId(R.id.login)).perform(click())



    }

}