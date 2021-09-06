package com.trianglz.testing_demo


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    //Naming convention should follow (MethodName_StateUnderTest_ExpectedBehavior)
    @Test
    fun validateRegistration_emptyUserName_returnsFalse() {
        // Given is username, password, confirmPassword

        val result = RegistrationUtil.validateRegistration(
            "", "123456aF",
            "123456aF"
        )

        //assertEquals(result, false)
        assertThat(result).isFalse()

        //assertThat("some text").

    }


}