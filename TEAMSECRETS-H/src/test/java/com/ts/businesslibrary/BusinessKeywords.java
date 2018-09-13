/**
 * 
 */
package com.ts.businesslibrary;

import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;

import com.ts.genericlibrary.GenericKeywords;
import com.ts.repositorylibrary.Common;
import com.ts.repositorylibrary.TeamSecrets;

/**
 * @author Abhijeet
 *
 */
public class BusinessKeywords extends GenericKeywords {

	static Common com = new Common();
	static TeamSecrets ts = new TeamSecrets();

	public static void loginToJIRA(String str_URL, String str_Username, String str_Password) {

		loadURL(str_URL);
		enterText(com.userName, str_Username, "Enter Username Into Textbox");
		enterText(com.password, str_Password, "Enter Password Into Textbox");
		Click(com.loginBtn, "Click On Login Button");
		exists(com.dashBoard, "JIRA Dashboard");
	}

	public static void validateTeamSecretPanel() throws Exception {

		exists(ts.teamSecretsPanel, "Team Secrets Panel");
		switchToiFrame(1);
		//scrollDownUsingXpath("(//div[@class='ts-secret-wrapper ng-scope ng-isolate-scope'])[2]");
		scrollDown();
		existsWithScreenshot(ts.postaTeamSecretsBtn, "Post a Team Secrets Button");

	}

	public static void clickAndValidatePostaTeamSecretPage() throws Exception {
		//scrollDownUsingXpath("(//div[@class='ts-secret-wrapper ng-scope ng-isolate-scope'])[2]");
		scrollDown();
		Click(ts.postaTeamSecretsBtn, "Click on the Post a team secrets button");
		switchToParent();
		switchToiFrame(5);
		existsWithScreenshot(ts.postaTeamSecretPage, "Post a team secrets page");

	}

	public static void validateLogoAndSelectFilesComponentsOfPostaTeamSecretsPage() throws Exception {

		exists(ts.teamSecretLogo, "Team secrets logo");
		exists(ts.dropFileHereToAttach, "Drop file here to attach them");
		exists(ts.selectFiles, "Select files");

	}

	public static void validateRightSectionOfPostaTeamSecretsPage() throws Exception {

		exists(ts.postThisTeamSecretsTo, "Post this team secrets to...");
		exists(ts.everyoneWillSee,
				"NOTE: Everyone will see that a secret was added, but only those you choose will be able to view it.");
		exists(ts.onlyPepleAccessToThisPrjct, "Only people with access to this project (TEAM)");
		exists(ts.onlyThesePeple, "Only these people");
		exists(ts.onlyThesePepleTextbox, "Only these people textbox");
		exists(ts.accessWillExpire, "Access will expire...");
		exists(ts.expire_Never, "Never");
		exists(ts.expire_In, "In");
		exists(ts.expireTextbox, "Expire textbox");
		exists(ts.expire_Days, "Days button");
		exists(ts.expire_Weeks, "Weeks button");
		exists(ts.expire_Months, "Months button");
		exists(ts.alsoRequiredThisToView, "Also required this to view...");
		exists(ts.auth_Mobile, "Verify mobile phone number with a text message");
		exists(ts.auth_Passphrase, "Generate a secure passphrase");
		exists(ts.confirmUpload, "Confirm upload Button");
		exists(ts.cancelBtn, "Cancel Button");

	}

	public static void allImportantMessageAtPostaTeamScertsScreen() {

		Click(ts.confirmUpload, "Click on confirm upload button");
		existsWithScreenshot(ts.attachAtleastOneFile, "'Attach atleast one file to encrypt and upload' message");
		// Click(ts.onlyThesePeple, "Click on 'Only these people' radio
		// button");
		// medWait();

		// clickUsingJS(ts.confirmUpload, "Click on confirm upload button");
		// existsWithScreenshot(ts.alteastOneUserIsRequired, "'At least one
		// valid user is required to continue.' message");
		// enterText(ts.onlyThesePepleTextbox, fetchData("onlyThesePeople"),
		// "Enter username into 'Only these people' textbox");
		// Click(ts.onlyThesePeopleHighlightedText, "Select first highlighted
		// option from textbox");
		// Click(ts.confirmUpload, "Click on confirm upload button");
		// notExistsWithScreenshot(ts.alteastOneUserIsRequired, "At least one
		// valid user is required to continue.");
		Click(ts.expire_In, "Select 'In' radio button under Access will expire");
		Click(ts.confirmUpload, "Click on confirm upload button");
		existsWithScreenshot(ts.chooseNeverOrEnterValidTime,
				"Please choose 'Never' or enter a valid expiration time in whole numbers.message");
		enterText(ts.expireTextbox, fetchData("expiredDays"), "Enter 30 into textbox");
		Click(ts.confirmUpload, "Click on confirm upload button");
		notExistsWithScreenshot(ts.chooseNeverOrEnterValidTime,
				"Please choose 'Never' or enter a valid expiration time in whole numbers. message");
		Click(ts.expire_Weeks, "Select Weeks Button");
		enterText(ts.expireTextbox, fetchData("expiredWeek_Invalid"), "Enter 157 into textbox");
		Click(ts.confirmUpload, "Click on confirm upload button");
		existsWithScreenshot(ts.maximimExpiryIs3Years,
				"'Maximum expiry limit is 3 years. Please adjust expiry input accordingly' message");
		enterText(ts.expireTextbox, fetchData("expiredWeek_Valid"), "Enter 156 into textbox");
		Click(ts.confirmUpload, "Click on confirm upload button");
		notExistsWithScreenshot(ts.maximimExpiryIs3Years,
				"'Maximum expiry limit is 3 years. Please adjust expiry input accordingly' message");
		Click(ts.expire_Months, "Select Months Button");
		enterText(ts.expireTextbox, fetchData("expiredMonths_Invalid"), "Enter 37 into textbox");
		Click(ts.confirmUpload, "Click on confirm upload button");
		existsWithScreenshot(ts.maximimExpiryIs3Years,
				"'Maximum expiry limit is 3 years. Please adjust expiry input accordingly' message");
		enterText(ts.expireTextbox, fetchData("expiredMonths_Valid"), "Enter 36 into textbox");
		Click(ts.confirmUpload, "Click on confirm upload button");
		notExistsWithScreenshot(ts.maximimExpiryIs3Years,
				"'Maximum expiry limit is 3 years. Please adjust expiry input accordingly' message");

		

	}

}
