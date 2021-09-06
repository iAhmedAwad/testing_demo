package com.trianglz.testing_demo

object RegistrationUtil {

    private val existingUsers = listOf("John", "Doe")

    /**
     * The input is not valid if
     * 1- The username or password is empty
     * 2- The username is already taken
     * 3- The confirmed password is not the same as password
     * 4- The password length is shorter than 8
     * 5- The password contains less than two letters
     * 6- The password contains less than two numbers
     */
    fun validateRegistration(
        username: String,
        password: String,
        passwordConfirmation: String
    ): Boolean {

        return true

    }
}