package edu.sjsu.android.recipe1.ui.login;

import androidx.annotation.Nullable;

/**
 * Authentication result : success (user details) or error message.
 */
class LoginResult {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    /***
     * This method LoginResult sets the error variable to the Integer parameter
     * @param error
     */
    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    /***
     * Method LoginResult #2 has different parameters and sets the LoggedInUserView success variable.
     * @param success
     */
    LoginResult(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    /***
     * Both methods, getSuccess() & getError() return the success and error variable values
     * @return
     */
    @Nullable
    LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}