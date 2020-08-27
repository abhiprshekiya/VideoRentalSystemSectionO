package definitions;

public class Video {
    //creating Definitions Classes
    // Rule 1 . Always put private as the visibility modifiers for fields unless specified
    // Rule 2 . Always put non-static as the access modifiers for the fields unless specified

    //member variables also known as fields / variables
    private String videoName;
    private boolean checkOut;
    private int rating;

    /*
     * This method returns the name of the video selected currently.
     * @return the name of the video selected currently.
     * */

    String getName() {
        return videoName;
    }

    void doCheckOut() {

    }

    void doReturn() {

    }
}
