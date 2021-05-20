package edu.sjsu.android.recipe1.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI
    /**
     * This method LoggedInUserView sets displayName to the parameter
     * @return void
     * @param displayName
     **/
    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    /**
     * This method getDisplayName() returns displayName
     * @return String
     **/
    String getDisplayName() {
        return displayName;
    }
}