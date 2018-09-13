/**
 * 
 */
package com.ts.repositorylibrary;

/**
 * @author user
 *
 */
public class TeamSecrets {

	public String secureFieldPanel = "//h2[text()='Team Secrets Secure Fields']";
	public String titleTxtbox = "//div[text()='Title '][span[@class='tssf-important' and text()='*']]/following-sibling::input[@id='tssf-Title']";
	public String secureTextTxtbox = "//div[text()='Secure Text '][span[@class='tssf-important' and text()='*']]/following-sibling::textarea";
	public String saveAndEncryptBtn = "//div[text()='Save And Encrypt']";
	public String disabledSaveAndEncryptBtn = "//div[@class='tssf-save disabled-button']";

	public String teamSecretsPanel = "//h2[text()='Team Secrets']";
	public String iFrameTeamSecretPanel = "//iframe[contains(@id,'io.teamsecrets__js-ts-view-issue-left-panel')]";
	public String postaTeamSecretsBtn = "//span[text()='Post a Team Secret']";
	public String postaTeamSecretPage = "//h2[text()='Post a Team Secret']";
	public String iFramePostTeamSecretPage = "//iframe[contains(@id,'io.teamsecrets__ts-post-dialog')]";
	public String teamSecretLogo = "//div[@class='ts-logo']";
	public String dropFileHereToAttach = "//div[div[text()='to attach them']/span[text()='Drop files here']]//div[text()='or']";
	public String selectFiles = "//div[text()='Select Files']";
	public String postThisTeamSecretsTo = "//div[text()=' Post this Team Secret to...']";
	public String everyoneWillSee = "//i[text()=': Everyone will see that a secret was added, but only those you choose will be able to view it.']/b[text()='NOTE']";
	public String onlyPepleAccessToThisPrjct = "//label[text()='Only people with access to this project (TEAM)']/preceding-sibling::input[@id='ts-recipient-type-all']";
	public String onlyThesePeple = "//label[text()='Only these people']/preceding-sibling::input[@id='ts-recipient-type-selected']";
	public String onlyThesePepleTextbox = "//div[@id='s2id_js-ts-recipients-select']//input";
	public String accessWillExpire = "//div[text()=' Access will expire...']";
	public String expire_Never = "//label[text()='Never']/preceding-sibling::input[@id='ts-expiry-type-never']";
	public String expire_In = "//label[text()='In']/preceding-sibling::input[@id='ts-expiry-type-in']";
	public String expireTextbox = "//input[@ng-model='userInputs.expiryDuration']";
	public String expire_Days = "//div[text()='Days']";
	public String expire_Weeks = "//div[text()='Weeks']";
	public String expire_Months = "//div[text()='Months']";
	public String alsoRequiredThisToView = "//div[text()='Also require this to view...']";
	public String auth_Mobile = "//label[text()='Verify mobile phone number with a text message']//preceding-sibling::input[@id='ts-auth-type-mobile']";
	public String auth_Passphrase = "//label[text()='Generate a secure passphrase']//preceding-sibling::input[@id='ts-auth-type-passphrase']";
	public String confirmUpload = "//button[text()='Confirm Upload']";
	public String cancelBtn = "//button[text()='Cancel']";
	public String someOfTheFilesfailedToUpload = "//span[text()='Some of the files failed to upload. Please check and fix/remove the failures before proceeding.']";
	public String attachAtleastOneFile = "//span[text()='Please attach at least one file to encrypt and upload.']";
	public String emptyFilesAreNotAllowed = "//div[@class='ts-secret-files-zone expand']//div[span[text()='Empty files are not allowed.']]";
	public String fileMustBeUnder25MB ="//div[@class='ts-files-selected ng-scope']//span[text()='File must be under 25 MB.']";
	public String alteastOneUserIsRequired = "//div[text()='At least one valid user is required to continue.’]";
	public String onlyThesePeopleHighlightedText="//div[@class='select2-result-label'][span[@class='aui-avatar aui-avatar-small']]";
    public String chooseNeverOrEnterValidTime="//div[contains(text(),'or enter a valid expiration time in whole numbers.')]";
    public String maximimExpiryIs3Years="//div[text()='Maximum expiry limit is 3 years. Please adjust expiry input accordingly']";
    public String addNewFile="//div[text()=' Add New File']";
    public String removeFileBtn="//span[@ng-click='deleteFile(file)']";
}
