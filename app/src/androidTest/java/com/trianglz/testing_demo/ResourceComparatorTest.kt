package com.trianglz.testing_demo

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceComparatorTest{

    //Bad practice .. what if there is a counter or whatever? every test case will change that counter
    //private val resourceCompare = ResourceComparator()
    private lateinit var resourceCompare : ResourceComparator

    @Before
    fun setup(){
        resourceCompare = ResourceComparator()
        Log.d(TAG, "setup: setting up...")
    }

    @After
    fun eliminate(){
        //close database or whatever is necessary after finishing each and every testcase...
        Log.d(TAG, "eliminate: Eliminating...")
    }

    @Test
    fun isEqual_sameAsGivenString_returnsTrue(){

        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceCompare.isEqual(context, R.string.app_name, "testing_demo")

        assertThat(result).isTrue()
    }

    @Test
    fun isEqual_DifferentFromGivenString_returnsFalse(){


        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceCompare.isEqual(context, R.string.app_name, "meh")

        assertThat(result).isFalse()
    }
    companion object{
        private const val TAG = "ResourceComparatorTest"
    }
}