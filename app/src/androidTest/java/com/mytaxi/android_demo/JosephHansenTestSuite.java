package com.mytaxi.android_demo;

import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by josephhansen on 3/7/18.
 */


@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JosephHansenTestSuite {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Before
    public void setUp() throws Exception {
        // Before Test case execution
    }

    @Test
    public void addLoginInfo1() throws Exception {
        String newUsername = "";
        String newPassword = "";

        // Input username and password and login.
        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        // Verify the login's didn't work
        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));

        // Clear the login fields.
        onView(withId(R.id.edt_username)).perform(clearText());
        onView(withId(R.id.edt_password)).perform(clearText());

    }

    @Test
    public void addLoginInfo2() throws Exception {
        String newUsername = "s";
        String newPassword = "Q";

        // Input username and password and login.
        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        // Verify the login's didn't work
        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));

        // Clear the login fields.
        onView(withId(R.id.edt_username)).perform(clearText());
        onView(withId(R.id.edt_password)).perform(clearText());

    }

    @Test
    public void addLoginInfo3() throws Exception {
        String newUsername = "9DragonsWillFindTheWayToHelmsDeepWithoutAnyHobbits";
        String newPassword = "IsThatReallyAU5ern@me?IAmUnsureOfIt'sMeaning";

        // Input username and password and login.
        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        // Verify the login's didn't work
        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));

        // Clear the login fields.
        onView(withId(R.id.edt_username)).perform(clearText());
        onView(withId(R.id.edt_password)).perform(clearText());

    }

    @Test
    public void addLoginInfo4() throws Exception {
        String newUsername = "--------";
        String newPassword = "```````~~";

        // Input username and password and login.
        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        // Verify the login's didn't work
        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));

        // Clear the login fields.
        onView(withId(R.id.edt_username)).perform(clearText());
        onView(withId(R.id.edt_password)).perform(clearText());

    }

    @Test
    public void test1ChooseDriver() {
        String newUsername = "whiteelephant261";
        String newPassword = "video";
        String driverName = "Na";

        // Verify the correct page pulled up.
        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));

        // Input username and password. Then login.
        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

        // I commented out this portion of the test, since I couldn't quite figure out how to give certain fields or buttons, ID's. I couldn't find anything online that clarified this, but I know that with your training, I would pick it up quickly.
//        // logout
//        onView(withId(R.id.AppCompatImageButton)).perform(click());
//        onView(withId(R.id.nav_logout)).perform(click());
//
//        // Verify the correct page pulled up.
//        onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
//        onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
//        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
//
//        // Input username and password. Then login.
//        onView(withId(R.id.edt_username)).perform(typeText(newUsername), closeSoftKeyboard());
//        onView(withId(R.id.edt_password)).perform(typeText(newPassword), closeSoftKeyboard());
//        onView(withId(R.id.btn_login)).perform(click());

        // Search drivers and choose one.
//        onView(withId(R.id.textSearch)).perform(typeText(driverName));
//        onView(withId(R.id.text1)).perform(click());

        // Verify the correct driver is pulled up, then click call.
//        onView(withText("Naomi Le gall")).check(matches(isDisplayed()));
//        onView(withId(R.id.fab)).perform(click());

    }

    @After
    public void tearDown() throws Exception {
        //After Test case Execution
    }
}


// SCENARIOS TO BE TESTED:
        // Does the login page recognize characters and letters from different languages?
        // When logged in, will the app show in their preferred language?
        // Will their credit card information be saved in their account (correctly) and pull from their account not someone else's?
        // Is the GPS accurate for both customer and driver?
        // Are all the clients preferences about drivers saved?
        // Is their account information secure?

// UX ISSUES:
        // When attempting to login, the login fail message needs to appear above the keyboard (could benefit from the screen shaking to signify incorrect logins).
        // It should have an option to create a new account.
        // It should also have a button for those who have an account but forgot their login information.