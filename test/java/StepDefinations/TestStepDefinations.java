package StepDefinations;

import ResultVerifications.ColorVerification;
import ResultVerifications.FacebookPageVerification;
import WebElements.TestPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStepDefinations {

    TestPage testPage = new TestPage();
    ColorVerification colorVerification = new ColorVerification();
    //FacebookPageVerification facebookPageVerification = new FacebookPageVerification();
    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {

    }

    @Given("^Enter Url$")
    public void enter_Url()  {

    }

    @Then("^User is on HomePage and Verify the webpage displays current date and time$")
    public void user_is_on_HomePage_and_Verify_the_webpage_displays_current_date_and_time()  {

    }

    @Then("^User able to Navigate to the Sport menu$")
    public void user_able_to_Navigate_to_the_Sport_menu()  {
        testPage.doTest();


    }

    @Then("^Ensure primary navigation colour \\(Sport\\) and secondary navigation \\(Football\\) are same$")
    public void ensure_primary_navigation_colour_Sport_and_secondary_navigation_Football_are_same()  {
        colorVerification.verifyColor();

    }

    @Then("^User able to Click on the Football sub navigation item$")
    public void user_able_to_Click_on_the_Football_sub_navigation_item()  {

    }

    @Then("^Click the first article displayed and traverse to the gallery image$")
    public void click_the_first_article_displayed_and_traverse_to_the_gallery_image()  {

    }

    @Then("^click the gallery icon appearing on the right-hand side corner with numbers and gallery loads on full screen$")
    public void click_the_gallery_icon_appearing_on_the_right_hand_side_corner_with_numbers_and_gallery_loads_on_full_screen()  {

    }

    @Then("^Now verify if it has previous and next arrows buttons and when clicked previous or next it navigates to the appropriate gallery picture$")
    public void now_verify_if_it_has_previous_and_next_arrows_buttons_and_when_clicked_previous_or_next_it_navigates_to_the_appropriate_gallery_picture() {

    }

    @Then("^on the gallery embedded in the article page click on the Facebook share icon and verify it opens Facebook modal dialog$")
    public void on_the_gallery_embedded_in_the_article_page_click_on_the_Facebook_share_icon_and_verify_it_opens_Facebook_modal_dialog() {
       // facebookPageVerification.FacebookPageTitle();

    }

    @Then("^Go to a video embedded within the article and click the full screen button on the right-hand corner, ensure video can be viewed in full screen and minimized$")
    public void go_to_a_video_embedded_within_the_article_and_click_the_full_screen_button_on_the_right_hand_corner_ensure_video_can_be_viewed_in_full_screen_and_minimized()  {

    }

    @Then("^Navigate to the bottom right of the article page to the Premier League Table section$")
    public void navigate_to_the_bottom_right_of_the_article_page_to_the_Premier_League_Table_section()  {

    }

    @Then("^exhibit the points or positions from the Premier league table for the Liverpool team$")
    public void exhibit_the_points_or_positions_from_the_Premier_league_table_for_the_Liverpool_team()  {

    }

    @Then("^User close the Browser$")
    public void user_close_the_Browser() {

    }

}
