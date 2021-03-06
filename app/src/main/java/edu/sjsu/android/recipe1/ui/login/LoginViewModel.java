package edu.sjsu.android.recipe1.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import edu.sjsu.android.recipe1.data.LoginRepository;
import edu.sjsu.android.recipe1.data.Result;
import edu.sjsu.android.recipe1.data.model.LoggedInUser;
import edu.sjsu.android.recipe1.R;

/**
 * LoginViewModel is a class that manages all login information
 * It creates a login state and repository,
 * allows you to login with a user name and password, and verifies the login
 */
public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    /***
     * initiates the loginRepository variable
     * @param loginRepository
     */
    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    /***
     * returns the loginFormState variable
     * @return
     */
    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    /***
     * returns the loginResult variable
     * @return
     */
    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    /***
     * takes in the username and password variables to login and displays the names.
     * returns "login failed" if username and password don't match.
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        // can be launched in a separate asynchronous job
        Result<LoggedInUser> result = loginRepository.login(username, password);

        if (result instanceof Result.Success) {
            LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
            loginResult.setValue(new LoginResult(new LoggedInUserView(data.getDisplayName())));
        } else {
            loginResult.setValue(new LoginResult(R.string.login_failed));
        }
    }

    /***
     * Takes in username and password to change the Login information.
     * returns "not a valid username" if username is invalid
     * @param username
     * @param password
     */
    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new LoginFormState(true));
        }
    }

    /***
     * Checks if the username is valid
     * @param username
     * @return
     */
    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    /***
     * checks if the password is valid
     * @param password
     * @return
     */
    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}