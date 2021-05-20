//File: LoginFormState
// LoginFormState helps LoginActivity with the login portion of the application
package edu.sjsu.android.recipe1.ui.login;

import androidx.annotation.Nullable;

/**
 * Data validation state of the login form.
 */
class LoginFormState {
    @Nullable
    private Integer usernameError;
    @Nullable
    private Integer passwordError;
    private boolean isDataValid;
    /**
     * This method, LoginFormState sets the  parameter
     * @return void
     * @param usernameError
     * @param passwordError
     **/
    LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }
    /**
     * This method, loginFormSTate sets values
     * @return void
     * @param isDataValid
     **/
    LoginFormState(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }
    /**
     * This method, getUserNameError returns usernameError 
     * @return Integer
     * @param
     **/
    @Nullable
    Integer getUsernameError() {
        return usernameError;
    }

    /**
     * This method, getPasswordError returns password Error
     * @return Integer
     **/
    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    /**
     * This method, loginFormSTate returns if Data is Valid
     * @return boolean
     **/
    boolean isDataValid() {
        return isDataValid;
    }
}