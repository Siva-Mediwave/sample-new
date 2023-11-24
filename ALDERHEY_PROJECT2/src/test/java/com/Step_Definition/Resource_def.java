package com.Step_Definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Resource_def extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	/*@Given("Launch the external {string}")
	public void launch_the_external(String string) throws Throwable {
		browserLaunch("chrome");
		sleep(2000);

	}

	@When("User click the clinician button")
	public void user_click_the_clinician_button() throws Throwable {

		btnClick(si.getResourcepg().getClinician());
		sleep(4000);

	}

	@When("User enter the external {string} and click next button")
	public void user_enter_the_external_and_click_next_button(String string) throws Throwable {

		String exemail = FileReaderManager.getInstanceFRM().getInstanceCR().getExternalemail();
		enterText(si.getResourcepg().getExternalemail(), exemail);
		sleep(3000);

		btnClick(si.getResourcepg().getExternalnext());
		sleep(2000);

	}

	@When("User enter the external {string} and click sign up button")
	public void user_enter_the_external_and_click_sign_up_button(String string) throws Throwable {

		String expass = FileReaderManager.getInstanceFRM().getInstanceCR().getExternalpass();
		enterText(si.getResourcepg().getExternalpass(), expass);
		sleep(2000);

		btnClick(si.getResourcepg().getSignin());
		sleep(4000);

	}

	@When("User click the resource button and select the my resources button and moves to my resources page")
	public void user_click_the_resource_button_and_select_the_my_resources_button_and_moves_to_my_resources_page()
			throws Throwable {
		btnClick(si.getResourcepg().getResourcelib());
		sleep(1000);

		btnClick(si.getResourcepg().getMyresources());
		sleep(3000);

	}

	@When("User click the add resources button")
	public void user_click_the_add_resources_button() throws Throwable {

		btnClick(si.getResourcepg().getAddresources());
		sleep(2000);

	}

	@When("User add the resource title and resource type in the text field")
	public void user_add_the_resource_title_and_resource_type_in_the_text_field() throws Throwable {

		String titles = FileReaderManager.getInstanceFRM().getInstanceCR().getTitle();
		enterText(si.getResourcepg().getTitle(), titles);
		sleep(4000);
		
		btnClick(si.getResourcepg().getClicktypes());
		sleep(2000);
		btnClick(si.getResourcepg().getType());
		sleep(1000);
	}

	@When("User click the upload image and uploaded the file")
	public void user_click_the_upload_image_and_uploaded_the_file() throws Throwable {
		
		btnClick(si.getResourcepg().getUploadimage());
		StringSelection str = new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		sleep(2000);

	}

	@When("User click the age group button and select the age group")
	public void user_click_the_age_group_button_and_select_the_age_group() {
		

	}

	@When("User click the Add new age group button and add age group name and starts and end age and click add age group button")
	public void user_click_the_add_new_age_group_button_and_add_age_group_name_and_starts_and_end_age_and_click_add_age_group_button() {

	}

	@When("User click the speciality button and select the speciality")
	public void user_click_the_speciality_button_and_select_the_speciality() {

	}

	@When("User click the Tags button and select the tags")
	public void user_click_the_tags_button_and_select_the_tags() {

	}

	@When("User add new tags button and enter the tags and click add tag button")
	public void user_add_new_tags_button_and_enter_the_tags_and_click_add_tag_button() {

	}

	@When("User click the publish button and success message popsup")
	public void user_click_the_publish_button_and_success_message_popsup() {

	}
*/
}
