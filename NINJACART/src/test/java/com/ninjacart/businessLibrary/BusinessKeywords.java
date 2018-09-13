/**
 * 
 */
package com.ninjacart.businessLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.ninjacart.genericLibrary.GenericKeywords;
import com.ninjacart.objectLibrary.biFrostObjects;
import com.ninjacart.objectLibrary.DirectObjects;
import com.ninjacart.objectLibrary.FlashObject;
import com.ninjacart.scripts.customInt;

import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Abhijeet Kumar
 *
 */
public class BusinessKeywords extends GenericKeywords {

	// protected double = 0;
	double createdOrderId = 0;

	int cauliflowerMinimumQuantity, lemonMinimumQuantity, onionMinimumQuantity, potatoMinimumQuantity,
			tomatoMinimumQuantity, cornMinimumQuantity, appleMinimumQuantity, bananaMinimumQuantity,
			chiccoMinimumQuantity, mosambiMinimumQuantity, orangeMinimumQuantity = 0;

	protected int skuQuantity, cauliflowerQuantity, lemonQuantity, onionQuantity, potatoQuantity, tomatoQuantity,
			cornQuantity, appleQuantity, bananaQuantity, chiccoQuantity, mosambiQuantity, orangeQuantity,
			myCartCauliflowerQuantity, myCartLemonQuantity, myCartOnionQuantity, myCartPotatoQuantity,
			myCartTomatoQuantity, myCartAppleQuantity = 0;

	protected double TOTALPrice, cauliflowerSlabPrice, lemonSlabPrice, onionSlabPrice, potatoSlabPrice, tomatoSlabPrice,
			appleSlabPrice = 0;

	/*
	 * int lemonMinimumQuantity; int onionMinimumQuantity; int
	 * potatoMinimumQuantity; int tomatoMinimumQuantity; int
	 * cornMinimumQuantity; int appleMinimumQuantity; int bananaMinimumQuantity;
	 * int chiccoMinimumQuantity; int mosambiMinimumQuantity; int
	 * orangeMinimumQuantity;
	 */

	/*
	 * int cauliflowerQuantity; int lemonQuantity; int onionQuantity; int
	 * potatoQuantity; int tomatoQuantity; int cornQuantity; int appleQuantity;
	 * int bananaQuantity; int chiccoQuantity; int mosambiQuantity; int
	 * orangeQuantity;
	 */

	static DirectObjects direct = new DirectObjects();
	static FlashObject flash = new FlashObject();
	static biFrostObjects bifrost = new biFrostObjects();

	/**
	 * loginToBiFrost method Login to the NinjaCart Application
	 *
	 * @author Abhijeet
	 */

	public static void loginToBiFrost(String str_URL, String str_UN, String str_PSW) {
		try {

			loadURL(str_URL);
			waitTillPageLoad();
			enterText(bifrost.userName, str_UN, "Enter UserName In Text Box" + " " + str_UN);
			enterText(bifrost.password, str_PSW, "Enter Password In Text Box" + " " + str_PSW);
			click(bifrost.loginBtn, "Click On BiFrost Login Button");
			exists(bifrost.createPOPage, "Create Purchase Order Page");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * createPO method Create Purchase Order With Papaya And Potato By
	 * VendorName As Vamsi
	 *
	 * @author Abhijeet
	 */

	public void createPO() {
		try {
			loginToBiFrost(fetchData("biFrostURL"), fetchData("biFrostUN"), fetchData("biFrostPsw"));
			click(bifrost.cityDrpDwn, "Click On City Drop Down");
			click(bifrost.cityAsBangalore, "Select City As Bangalore");
			click(bifrost.facilityDrpDwn, "Click On Facility Drop Down");
			click(bifrost.bangaloreFcAsFacility, "Select WhiteField As Facility");
			click(bifrost.orderTypeDrpDwn, "Click On Order Type Drop Down");
			click(bifrost.orderTypeAsNormal, "Select Order Type As Normal");
			click(bifrost.vendorDrpDwn, "Click On Vendor Drop Down");
			click(bifrost.vendorAsVamsi, "Select Vamsi As Vendor");
			exists(bifrost.registeredSKUsPage, "Registered SKUs Page");
			maxWait();
			enterText(bifrost.orderQuantityBoxOfPapaya, fetchData("papayaOrderedQuantity"),
					"Enter Ordered Quantity Of Papaya");
			enterText(bifrost.orderQuantityBoxOfPotatao, fetchData("potatoOrderedQuantity"),
					"Enter Ordered Quantity Of Potato");
			enterText(bifrost.arrivalTileOfPapaya, "10:00", "Enter Arrival Tile For Papaya");
			click(bifrost.arrivalTuleOfPotato, "Enter Arrival Time Of Potatao");
			click(bifrost.createPOBtn, "Click On Create PO Button");
			exists(bifrost.POSummaryPage, "PO Summary Page");
			click(bifrost.confirmBtn, "Click On Confirm Button");
			exists(bifrost.viewPurchaseOrderPage, " View Purchase Order Page");
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * createPO method Create Purchase Order With 2 SKUs
	 *
	 * @author Abhijeet
	 */

	public static void createPO(String str_vendorXpath, String str_1skuXpath, String str_1skuQuantity,
			String str_2skuXpath, String str_2skuQuantity) {
		try {
			loginToBiFrost(fetchData("biFrostURL"), fetchData("biFrostUN"), fetchData("biFrostPsw"));
			
			Thread.sleep(3000);
			click(bifrost.cityDrpDwn, "Click On City Drop Down");
			click(bifrost.cityAsBangalore, "Select City As Bangalore");
			click(bifrost.facilityDrpDwn, "Click On Facility Drop Down");
			click(bifrost.bangaloreFcAsFacility, "Select BangaloreFC As Facility");
			// click(bifrost.ninjaAsfacility, "Select Ninja As Facility");
			click(bifrost.orderTypeDrpDwn, "Click On Order Type Drop Down");
			click(bifrost.orderTypeAsNormal, "Select Order Type As Normal");
			click(bifrost.vendorDrpDwn, "Click On Vendor Drop Down");
			click(str_vendorXpath, "Select Devegowda As Vendor");
			exists(bifrost.registeredSKUsPage, "Registered SKUs Page");
			maxWait();
			enterText(bifrost.cauliflowerPurchasePrice, "12", "Enter Purchase Price Of Cauliflower");
			enterText(str_1skuXpath, str_1skuQuantity, "Enter Ordered Quantity Of Cauliflower");
			ScrollDownUsingXpath(bifrost.tomatoPurchasePrice);
			enterText(bifrost.tomatoPurchasePrice, "12", "Enter Purchase Price Of Tomato");
			enterText(str_2skuXpath, str_2skuQuantity, "Enter Ordered Quantity Of Tomato");
			ScrollDownUsingXpath(bifrost.cityDrpDwn);
			enterText(bifrost.arrivalTileOfPapaya, "10:00", "Enter Arrival Tile For Cauliflower");
			click(bifrost.arrivalTuleOfPotato, "Enter Arrival Time Of Tomato");
			click(bifrost.createPOBtn, "Click On Create PO Button");
			exists(bifrost.POSummaryPage, "PO Summary Page");
			click(bifrost.confirmBtn, "Click On Confirm Button");
			exists(bifrost.viewPurchaseOrderPage, " View Purchase Order Page");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}
	/*
		*//**
			 * createPOForFlashApp method Create Purchase Order For Direct App
			 * 
			 * @author Abhijeet
			 *//*
			 * 
			 * public static void createPOForFlashApp() { try {
			 * loginToBiFrost(fetchDirectData("direct", "biFrostURL"),
			 * fetchDirectData("direct", "biFrostUN"), fetchDirectData("direct",
			 * "biFrostPsw")); click(bifrost.cityDrpDwn,
			 * "Click On City Drop Down"); click(bifrost.cityAsBangalore,
			 * "Select City As Bangalore"); click(bifrost.facilityDrpDwn,
			 * "Click On Facility Drop Down"); click(bifrost.ninjaAsfacility,
			 * "Select Ninja As Facility"); click(bifrost.orderTypeDrpDwn,
			 * "Click On Order Type Drop Down");
			 * click(bifrost.orderTypeAsNormal, "Select Order Type As Normal");
			 * click(bifrost.vendorDrpDwn, "Click On Vendor Drop Down");
			 * click(bifrost.kalasipalyaAsVendor, "Select Kalasiplya As Vendor"
			 * ); exists(bifrost.registeredSKUsPage, "Registered SKUs Page");
			 * maxWait(); enterText(bifrost.orderQuantityBoxOfAppleWashington,
			 * fetchData("orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Apple");
			 * enterText(bifrost.orderQuantityTextBoxOfCauliflower,
			 * fetchData("orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Cauliflower");
			 * enterText(bifrost.orderQuantityBoxOfCornSweet,
			 * fetchData("cornOrderQuantity"),
			 * "Enter Ordered Quantity Of Corn(Sweet)");
			 * enterText(bifrost.orderQuantityBoxofPotatoLocal,
			 * fetchData("orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Potato");
			 * 
			 * enterText(bifrost.orderQuantityBoxOfAppleWashington,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Apple");
			 * ScrollDownUsingXpath(bifrost.orderQuantityBoxOfBananaYellaki);
			 * enterText(bifrost.orderQuantityBoxOfBananaYellaki,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Banana");
			 * 
			 * enterText(bifrost.orderQuantityBoxOfChiccoSapota,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Chicco");
			 * 
			 * enterText(bifrost.orderQuantityBoxOfLemonSmall,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Lemon");
			 * enterText(bifrost.orderQuantityBoxOfMosambiSweetlime,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Mosambi");
			 * enterText(bifrost.orderQuantityBoxOfOnionGradedLocal,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Onion");
			 * enterText(bifrost.orderQuantityBoxOfOrangeNagpura,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Orange");
			 * enterText(bifrost.orderQuantityBoxOfPotatoLocalHassan,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Potato");
			 * ScrollDownUsingXpath(bifrost.nextBtn); click(bifrost.nextBtn,
			 * "Click On Next Button");
			 * enterText(bifrost.orderQuantityBoxOfTomatoLocal,
			 * fetchDirectData("direct", "orderQuantityForPO"),
			 * "Enter Ordered Quantity Of Tomato Local");
			 * 
			 * ScrollDownUsingXpath(bifrost.cityDrpDwn);
			 * enterText(bifrost.arrivalTileOfPapaya, "10:00",
			 * "Enter Arrival Time For Apple");
			 * click(bifrost.arrivalTuleOfPotato, "Enter Arrival Time Of Banana"
			 * ); click(bifrost.createPOBtn, "Click On Create PO Button");
			 * exists(bifrost.POSummaryPage, "PO Summary Page");
			 * click(bifrost.confirmBtn, "Click On Confirm Button");
			 * exists(bifrost.viewPurchaseOrderPage, " View Purchase Order Page"
			 * );
			 * 
			 * } catch (Exception e) { e.printStackTrace(); Assert.fail(); } }
			 */

	/**
	 * createPOForDirectApp method Create Purchase Order For Direct App
	 * 
	 * @author Abhijeet
	 */

	public static void createPOForDirectApp(String str_orderQuantity) {
		try {
			loginToBiFrost(fetchDirectData("direct", "biFrostURL"), fetchDirectData("direct", "biFrostUN"),
					fetchDirectData("direct", "biFrostPsw"));
			click(bifrost.cityDrpDwn, "Click On City Drop Down");
			click(bifrost.cityAsBangalore, "Select City As Bangalore");
			click(bifrost.facilityDrpDwn, "Click On Facility Drop Down");
			click(bifrost.bangaloreFcAsFacility, "Select Bangalore FC As Facility");
			click(bifrost.orderTypeDrpDwn, "Click On Order Type Drop Down");
			click(bifrost.orderTypeAsNormal, "Select Order Type As Normal");
			click(bifrost.vendorDrpDwn, "Click On Vendor Drop Down");
			click(bifrost.vendorAsoldWarehouse, "Select Old WareHouse As Vendor");
			exists(bifrost.registeredSKUsPage, "Registered SKUs Page");
			maxWait();
			enterText(bifrost.orderQuantityBoxOfAppleWashington, str_orderQuantity,
					"Enter Ordered Quantity Of Apple " + str_orderQuantity);
			ScrollDownUsingXpath(bifrost.orderQuantityBoxOfBananaYellaki);
			enterText(bifrost.orderQuantityBoxOfBananaYellaki, str_orderQuantity,
					"Enter Ordered Quantity Of Banana " + str_orderQuantity);
			enterText(bifrost.orderQuantityTextBoxOfCauliflower, str_orderQuantity,
					"Enter Ordered Quantity Of Cauliflower" + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfChiccoSapota, str_orderQuantity,
					"Enter Ordered Quantity Of Chicco " + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfCornSweet, fetchDirectData("direct", "cornOrderQuantity"),
					"Enter Ordered Quantity Of Corn(Sweet)");
			enterText(bifrost.orderQuantityBoxOfLemonSmall, str_orderQuantity,
					"Enter Ordered Quantity Of Lemon " + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfMosambiSweetlime, str_orderQuantity,
					"Enter Ordered Quantity Of Mosambi" + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfOnionGradedLocal, str_orderQuantity,
					"Enter Ordered Quantity Of Onion " + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfOrangeNagpura, str_orderQuantity,
					"Enter Ordered Quantity Of Orange " + str_orderQuantity);
			enterText(bifrost.orderQuantityBoxOfPotatoLocalHassan, str_orderQuantity,
					"Enter Ordered Quantity Of Potato " + str_orderQuantity);
			ScrollDownUsingXpath(bifrost.nextBtn);
			click(bifrost.nextBtn, "Click On Next Button");
			enterText(bifrost.orderQuantityBoxOfTomatoLocal, str_orderQuantity,
					"Enter Ordered Quantity Of Tomato Local " + str_orderQuantity);

			ScrollDownUsingXpath(bifrost.cityDrpDwn);
			enterText(bifrost.arrivalTileOfPapaya, "10:00", "Enter Arrival Time For Apple");
			click(bifrost.arrivalTuleOfPotato, "Enter Arrival Time Of Banana");
			click(bifrost.createPOBtn, "Click On Create PO Button");
			exists(bifrost.POSummaryPage, "PO Summary Page");
			click(bifrost.confirmBtn, "Click On Confirm Button");
			exists(bifrost.viewPurchaseOrderPage, " View Purchase Order Page");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * loginToApp method Login to the NinjaCart Application
	 *
	 * @author Abhijeet
	 */

	public static void loginToDirectApp(String str_UN, String str_PSW) {
		try {

			mEnterText(direct.mUserName, str_UN, "Enter mUserName In Text Box" + " " + str_UN);
			hideKeyword();
			mEnterText(direct.mPassword, str_PSW, "Enter mPassword In Text Box" + " " + str_PSW);
			hideKeyword();
			mClick(direct.mLoginBtn, "Click On Login Button");
			mExists(direct.directAppHomeScreen, "Home Screen");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * loginToFlashApp method Login to the NinjaCart Flash Application
	 *
	 * @author Abhijeet
	 */

	public static void loginToFlashApp(String str_UN, String str_PSW) {
		try {

			mEnterTextWithoutClear(flash.flashUserName, str_UN, "Enter mUserName In Text Box" + " " + str_UN);

			mEnterTextWithoutClear(flash.flashPassword, str_PSW, "Enter mPassword In Text Box" + " " + str_PSW);
			hideKeyword();
			mClick(flash.flashLoginBtn, "Click On Login Button");
			mExists(flash.PoStatusTrackerTab, "Home Screen");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * selectSKUAsArrived method will Select all SKUs As Click On Arrived Button
	 *
	 * @author Abhijeet
	 */

	public static void selectSKUAsArrived() {
		try {
			medWait();
			mClick(flash.allSKUCheckBox, "Click On All SKU Checkbox To Select All SKU");
			mClick(flash.arrivedBtn, "Click On Arrived Button");
			mClick(flash.yesBtn, "Click On Yes Button On Arrived Confirmation Popup");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goToRecevingSKUScreen method Navigate User To SKU's Receving Screen
	 * 
	 * @param str_vendorXpat
	 *            is Vendor Xpath
	 * @author Abhijeet
	 */

	public static void goToRecevingSKUScreen(String str_vendorXpath) {
		try {

			mExists(flash.recevingTag, "Receving Tag");
			mClick(flash.recevingTag, "Click On Receving Tab");
			mExists(flash.recevingTag, "Receving Screen");
			mClick(str_vendorXpath, "Click On Vendor Name");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * totalReceivedWeight method will Enter Total received Amount For SKU's
	 * 
	 * @param str_totalWeightValue
	 *            is Total Received SKU's Value
	 * @author Abhijeet
	 */

	public static void enterTotalSupplyQuantityt(String str_SKUXpath, String str_totalWeightValue) {
		try {
			minWait();

			mClick(str_SKUXpath, "Click On SKU To Enter Total Weight Recevied");
			mEnterTextWithoutClear(flash.totalWeightTxtBox, str_totalWeightValue, "Enter Total Received Wait");
			mEnterTextWithoutClear(flash.noOfCratesTxtBx, fetchData("noOfCretes"), "Enter Numer Of Crates");
			mEnterTextWithoutClear(flash.crateWeightTxtBx, fetchData("noOfCretes"), "Enter Cretes Weights");
			mClick(flash.add_CalcBtn, "CLick On Add/Calc Button");
			mClick(flash.confirmBtn, "Click On Confirm Button");
			mClick(flash.yesBtn, "Click On Yes Button On Supplied Quantity Confirmation Popup");
			medWait();
			mClick(flash.refreshBtn, "Click On Refresh Button");
			medWait();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goToGradingScreen method will Navigate To Grading Screen
	 * 
	 * @param str_vendorXpat
	 *            is Vendor Xpath
	 * @author Abhijeet
	 */

	public static void goToGradingScreen(String str_vendorXpath) {
		try {

			mClick(flash.manualGradingTAb, "Click On Manual Grading Tag");
			mExists(flash.manualGradingScreen, "Manual Grading Screen");
			mExists(flash.gradingToGradingTab, "Grading To Grading Tab");
			mExists(flash.returnsToGradingTab, "Returns To Grading Tab");
			mClick(flash.gradingTab, "Click On Grading Tab On Manual Grading Screen");
			mExists(flash.gradingTab, "Grading Screen");
			mClick(str_vendorXpath, "Click On Vendor Name");
			minWait();
			mExists(flash.sKUScreen, "SKU's Screen");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goBackFromSKURecevingScreenToHomeScreen method will Navigate To Grading
	 * Screen
	 * 
	 * @author Abhijeet
	 */

	public static void goBackFromSKURecevingScreenToHomeScreen() {
		try {
			minWait();

			mBackButton();
			mExists(flash.recevingTag, "Receving Screen");

			mBackButton();
			mExists(flash.recevingTag, "Receving Tag");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * enterGradingQuantity method will Navigate To Grading Screen
	 * 
	 * @param str_SKUStartBtnXpat
	 *            is SKU's Start Grading Button Xpath
	 * @param str_GradingQuantity
	 *            is Grading Quantity
	 * @author Abhijeet
	 */

	public static void enterGradingQuantity(String str_SKUStartBtnXpath, String str_GradingQuantity) {
		try {

			maxWait();
			mClick(str_SKUStartBtnXpath, "Click On Start Grading Button");
			mExists(flash.enterGradingQuantityScreen, "Enter Grading Quantity Screen");
			mEnterTextWithoutClear(flash.gradingQuantityTxtBx, str_GradingQuantity,
					"Enter Grading Quantity" + str_GradingQuantity);
			mClick(flash.startBtn, "Click On Start button");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * enterGRNQuantity method will Enter Grading Quantity In Text Box
	 * 
	 * @param str_SKUStartBtnXpat
	 *            is SKU's Started Grading Button Xpath
	 * @param str_GradingQuantity
	 *            is GRN Quantity
	 * @author Abhijeet
	 */

	public static void enterGRNQuantity(String str_SKUStartedBtnXpath, String str_GRNQuantity) {
		try {

			medWait();
			mClick(str_SKUStartedBtnXpath, "Click On Started Grading Button");
			mEnterTextWithoutClear(flash.GRNQuantityTxtBx, str_GRNQuantity, "Enter GRN Quantity" + str_GRNQuantity);
			mClick(flash.finishGradingBtn, "Click On Finish Grading Button");
			mClick(flash.yesBtn, "Click On Yes Button On Supplied Quantity Confirmation Popup");
			maxWait();
			minWait();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * clickGradeMoreBtn method will CLick On Grade More button And Select YES
	 * From Popup
	 *
	 * @author Abhijeet
	 */

	public static void clickGradeMoreBtn() {
		try {
			minWait();
			mClick(flash.gradeMoreBtn, "Click On Grade More Button");
			minWait();
			mClick(flash.yesBtn, "Click On YES Button On PopUp");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goToPOListScreen method will Navigate to PO List Screen
	 * 
	 * 
	 * @author Abhijeet
	 */

	public static void goToPOListScreen() {
		try {

			mClick(flash.PoStatusTrackerTab, "Click On PO Status Tracker");
			mExists(flash.PoListScreen, "PO List Screen");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goToPOEditScreen method will Navigate to PO Edit Screen
	 * 
	 * 
	 * @author Abhijeet
	 */

	public static void goToPOEditScreen(String str_vendorName) {
		try {

			mClick(flash.PoStatusTrackerTab, "Click On PO Status Tracker");
			mExists(flash.PoListScreen, "PO List Screen");
			mClick(str_vendorName, "Click On Vendor Name");
			mExists(flash.sKUScreen, "SKU Screen ");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * enterExtraSupplyQuantityOfSKU method will Edit Supply Quantity For SKU
	 *
	 * @author Abhijeet
	 */

	public static void enterExtraSupplyQuantityOfSKU(String longPress_element, String str_editSupplyValue) {
		try {

			longPress(longPress_element, "Performing Long Press On SKU");
			mClick(flash.yesBtn, "Click On YES Button On PopUp");

			mEnterTextWithoutClear(flash.totalWeightTxtBoxForESQ, str_editSupplyValue,
					"Enter Extra Amount Of SKU Value As " + str_editSupplyValue);
			mEnterTextWithoutClear(flash.noOfCratesTxtBxForESQ, fetchData("noOfCretes"), "Enter Numer Of Crates");
			mEnterTextWithoutClear(flash.crateWeightTxtBxForESQ, fetchData("noOfCretes"), "Enter Cretes Weights");
			mClick(flash.CalcBtn, "CLick On Calc Button");
			mClick(flash.confirmBtn, "Click On Confirm Button");
			mClick(flash.yesBtn, "Click On Yes Button On Supplied Quantity Confirmation Popup");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goBackFromSKURecevingScreenToHomeScreen method will Navigate To Grading
	 * Screen
	 * 
	 * @author Abhijeet
	 */

	public static void goBackFromEditSupplyQuantityScreenToHomeScreen() {
		try {

			// mClick(flash.PoListBackBtn, "Click On Back Arrow On Edit Supply
			// Quantity SKU's Screen");
			mBackButton();
			mExists(flash.PoListScreen, "PO List Screen");
			// mClick(flash.PoListBackBtn, "Click On Back Arrow On PO List
			// Screen");
			mBackButton();
			mExists(flash.PoStatusTrackerTab, "Home Screen");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * selectSKUCheckBoxAndClickOnArrived method will Select SKUs Check box And
	 * Click On Arrived Button And Select Yes Button From PopUp Screen
	 * 
	 * @author Abhijeet
	 */

	public static void selectSKUCheckBoxAndClickOnArrived(String str_sKUsCheckBoxXpath, String str_discription) {
		try {

			mClick(str_sKUsCheckBoxXpath, str_discription);
			mClick(flash.arrivedBtn, "CLick On Arrived Button");
			mClick(flash.yesBtn, "Click On YES Buton From Confirmation PopUP");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * clickOnSKUToEnterSupplyQuantity method will Enter Supply Quantity For
	 * Particular SKU Screen
	 * 
	 * @author Abhijeet
	 */

	public static void clickOnSKUAndEnterSupplyQuantity(String str_sKUsXpath, String str_discription, String str_Data) {
		try {

			mClick(str_sKUsXpath, str_discription);
			mExists(flash.enterSupplyQuantityScreen, "Enter Supply Quantity Screen");
			minWait();
			mEnterTextWithoutClear(flash.supplyQuantityTextBox, str_Data, "Enter Supply Quantity");
			minWait();
			mClick(flash.saveBtn, "Click On Save Button");
			mClick(flash.refreshBtn, "CLick On Refresh Button");
			medWait();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * PO_StatusTracker method will Validate All Function Related To Status
	 * Tracker Tab
	 * 
	 * @author Abhijeet
	 */

	public void PO_StatusTracker() {

		goToPOListScreen();
		mExists(flash.POByDevegowda, "Created PO Under PO List Screen");
		mClick(flash.POByDevegowda, "CLick On First SKU");
		mExists(flash.sKUScreen, "SKU Screen ");
		mExists(flash.cauliflowerAsSKU, "Details Of PO");
		// mClick(flash.PoListBackBtn, "Click On Back Arrow On PO List Screen");
		mBackButton();
		mExists(flash.searchSKUText, "Search SKU Text ");
		mClick(flash.searchSKUText, "Click On Search Sku Text To Enter Sku Name");
		mEnterText(flash.searchSKUTextBox, "Tomato", "Enter SKU Name In Sku SearchBox");
		mClick(flash.fetchBtn, "Click On Fetch Button");
		mExists(flash.POByDevegowda, "PO,Which Belongs To Searched SKU ");
		// mClick(flash.backBtn, "Click On Back Button");
		// mClick(flash.backBtn, "Click On Again Back Button");
		mBackButton();
		mBackButton();
		mBackButton();
	}

	/**
	 * goToLottingScreen method will Navigate to Lotting Screen
	 * 
	 * @author Abhijeet
	 */

	public static void goToLottingScreen() {
		try {
			mClick(flash.lottingTab, "Click On Lotting Tab");
			mExists(flash.searchSKUText, "Lotting Screen");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * startLottingBtn method will Start Lotting And Click On Yes
	 * 
	 * @author Abhijeet
	 */

	public static void startLottingBtn(String str_lottingSkuXpath) {
		try {
			minWait();
			mClick(str_lottingSkuXpath, "Click On SKU Start Lotting Button");
			mClick(flash.yesBtn, "Click On Yes Button On PopUp");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * enterTotalLotsValue method will Enter Lotting Value
	 * 
	 * @param str_lottingSkuXpath
	 *            is SKU Xpath
	 * @param str_transferValue
	 *            is Transfer Quantity Value
	 * @param str_lottingValue
	 *            is Lotting Value
	 * @author Abhijeet
	 */

	public static void enterTotalLotsValue(String str_lottingSkuXpath, String str_transferValue,
			String str_lottingValue) {
		try {
			minWait();
			minMinWait();
			mClick(str_lottingSkuXpath, "Click On SKU Started Lotting Button");
			mExists(flash.totalLotsTextBox, "Total Lots Text Box");
			mEnterText(flash.transferQuantity, str_transferValue,
					"Enter Transfer Quantity In Text Box" + str_transferValue);
			mEnterText(flash.totalLotsTextBox, str_lottingValue, "Enter Total Lots In Text Box" + str_lottingValue);
			hideKeyword();
			mClick(flash.finishBtn, "CLick On Finish Button");
			mClick(flash.yesBtn, "Click On Yes Button");
			mExists(flash.lottingTab, "Lotting Is Done For SKU");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * enterTotalLotsValueWithScanner method will Enter Lotting Value And Handle
	 * Scanner Screen
	 * 
	 * @param str_lottingSkuXpath
	 *            is SKU Xpath
	 * @param str_transferValue
	 *            is Transfer Quantity Value
	 * @param str_lottingValue
	 *            is Lotting Value
	 * @author Abhijeet
	 */

	public static void enterTotalLotsValueWithScanner(String str_lottingSkuXpath, String str_transferValue,
			String str_lottingValue) {
		try {
			medWait();
			mClick(str_lottingSkuXpath, "Click On SKU Started Lotting Button");
			// mClick(flash.doneBtn, "CLick On Done Button");
			// mClick(flash.yesBtn, "CLick On YES On PopUp");
			mExists(flash.totalLotsTextBoxVariable, "Total Lots Text Box");
			mEnterText(flash.transferQuantity, str_transferValue,
					"Enter Transfer Quantity In Text Box" + str_transferValue);
			mEnterText(flash.totalLotsTextBoxVariable, str_lottingValue,
					"Enter Total Lots In Text Box" + str_lottingValue);
			hideKeyword();
			mClick(flash.finishBtn, "CLick On Finish Button");
			mClick(flash.yesBtn, "Click On Yes Button");
			mExists(flash.lottingTab, "Lotting Is Done For SKU");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * goBackToHomeScreenFromGradingScreen method will Navigate To Home Screen
	 * From Grading Screen
	 * 
	 * @author Abhijeet
	 */

	public static void goBackToHomeScreenFromGradingScreen() {
		try {
			medWait();
			maxWait();
			mBackButton();
			maxWait();
			medWait();
			mClick(flash.gradingBackBtn, "Click On Grading Back Button");
			//mBackButton();
			medWait();
			maxWait();
			mBackButton();
			medWait();
			maxWait();
			mBackButton();
			medWait();
			
			

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * enterExtraSupplyQuantityOfSKU method will Edit Supply Quantity For SKU
	 *
	 * @author Abhijeet
	 */

	public static void clickOnSKUAndEditSupplyQuantity(String longPress_element, String str_editSupplyValue) {
		try {

			longPress(longPress_element, "Performing Long Press On SKU");
			mClick(flash.yesBtn, "Click On YES Button On PopUp");
			mExists(flash.editSupplyQuantityScreen, "Edit Supply Quantity Screen");
			mEnterTextWithoutClear(flash.supplyQuantityTextBox, str_editSupplyValue, "Enter Extra Supply Quantity");
			mClick(flash.saveBtn, "Click On Save Button");
			mClick(flash.refreshBtn, "CLick On Refresh Button");
			medWait();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * goToOrderTakingScreen method will Navigate To Customer Screen Under Order
	 * Taking Link
	 * 
	 * @author Abhijeet
	 *//*
		 * 
		 * public static void goToOrderTakingScreen() { try {
		 * loginToBiFrost(fetchData("biFrostURL"), fetchData("biFrostUN"),
		 * fetchData("biFrostPsw")); getHrefAndLoad(flash.orderTakingLink);
		 * exists(flash.orderTakingPage, "Order Taking Page");
		 * getHrefAndLoad(flash.orderTakingPage); exists(flash.customersPage,
		 * "Customers Page");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); Assert.fail(); } }
		 */

	/**
	 * createSalesOrderForLeelaPalac method will Create Sales Order With Tomato
	 * And Cauliflower
	 * 
	 * @author Abhijeet
	 *//*
		 * 
		 * public static void createSalesOrderForLeelaPalac() { try {
		 * Thread.sleep(4000); enterText(flash.customerTxtBx,
		 * fetchData("leelaPalacAsCustomer"), "Enter Customer Name In Text Box"
		 * ); Thread.sleep(4000); mClick(flash.suggestedCustomer,
		 * "Click On Suggested Customer As Leela palace"); Thread.sleep(4000);
		 * mClick(flash.takeOrderBtn, "Click On Take Order Button");
		 * Thread.sleep(4000); exists(flash.theLeelaPalacPage,
		 * "The Leela Palac Page"); Thread.sleep(4000);
		 * mEnterTextWithoutClear(flash.cauliflowerTxtBx,
		 * fetchData("cauliflowerValue"), "Enter Cauliflower Value");
		 * mEnterTextWithoutClear(flash.tomatoLocalTxtBx,
		 * fetchData("tomatoValue"), "Enter Tomato Value");
		 * mClick(flash.placeOrderBtn, "CLick On Place Order button");
		 * mClick(flash.confirmOrderBtn, "CLick On Confirm Buuton");
		 * mClick(flash.OKBtn, "Click On OK Button");
		 * mExists(flash.editOrderBtn,
		 * "Validate That Sales Order Is Craeted For Leela Palac");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); Assert.fail(); } }
		 */

	/**
	 * enterVarientSKusDetails method will Enter Grading Quantity In Text Box
	 * 
	 * @param str_SKUStartBtnXpat
	 *            is SKU's Started Grading Button Xpath
	 * @param str_GradingQuantity
	 *            is GRN Quantity
	 * @author Abhijeet
	 */

	public static void enterGRNQuantityForSKUVarient(String str_SKUStartedBtnXpath, String str_GRNQuantity) {
		try {

			medWait();
			mClick(str_SKUStartedBtnXpath, "Click On Started Grading Button");
			// mEnterTextWithoutClear(flash.GRNQuantityTxtBx, str_GRNQuantity,
			// "Enter GRN Quantity" + str_GRNQuantity);
			mExists(flash.toggleSwitch, "Toggle Switch");
			mEnterTextWithoutClear(flash.GRNQuantityTxtBx, str_GRNQuantity, "Enter GRN Quantity" + str_GRNQuantity);
			mClick(flash.toggleSwitch, "CLick On Toggle Switch Button");
			hideKeyword();
			mEnterText(flash.SKUVarientGRNQuantityTxtBx, fetchData("cauliflowerTransferValue"), "Enter GRN Quantity" + fetchData("cauliflowerTransferValue"));
			mClick(flash.finishGradingBtn, "Click On Finish Grading Button");
			mClick(flash.yesBtn, "Click On Yes Button On Supplied Quantity Confirmation Popup");
			medWait();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}

	}

	/**
	 * enterGRNAndValidateSwitchNotPresent method will Enter Grading Quantity In
	 * Text Box And Validate That Toggle Switch Is Not Present
	 * 
	 * @param str_SKUStartBtnXpat
	 *            is SKU's Started Grading Button Xpath
	 * @param str_GradingQuantity
	 *            is GRN Quantity
	 * @author Abhijeet
	 */

	public static void enterGRNAndValidateSwitchNotPresent(String str_SKUStartedBtnXpath, String str_GRNQuantity) {
		try {

			medWait();
			mClick(str_SKUStartedBtnXpath, "Click On Started Grading Button");
			mNotExists(flash.toggleSwitch, "Toggle Switch");
			mEnterTextWithoutClear(flash.GRNQuantityTxtBx, str_GRNQuantity, "Enter GRN Quantity" + str_GRNQuantity);
			mClick(flash.finishGradingBtn, "Click On Finish Grading Button");
			mClick(flash.yesBtn, "Click On Yes Button On Supplied Quantity Confirmation Popup");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * transferSKUFromGradingToRegrading method will Pull Stock From Grading
	 * Department And Transfer To Regrading
	 * 
	 * @author Abhijeet
	 */

	public static void transferSKUFromGradingToRegrading() {
		try {
			getHrefAndLoad(bifrost.inventoryManagementLink);
			exists(bifrost.inventoryManagementPage, "Inventry Management Page");
			click(bifrost.facilityDrpDwn, "Click On Facility Drop Down");
			click(bifrost.bangaloreFcAsFacility, "Select Ninja As Facility");
			medWait();
			click(bifrost.actionDropDown, "CLick On Action Drop Down");
			click(bifrost.pullStockfromGrading, "Select Pull Stock From Grading In Drop Down");
			click(bifrost.cauliflowerMediumInventryChkBx, "Select Cauliflower Medium CheckBox");
			enterText(bifrost.cauliflowerMediumInventryTxtBx, "10", "Enter Transfer Quantity Of Cauliflower");

			click(bifrost.tomatoLocalInventruChkBx, "Select Tomato Local CheckBox");
			enterText(bifrost.tomatoLocalInventruTxtBx, "10", "Enter Transfer Quantity Of Tomato");
			click(bifrost.stockUpdateBtn, "CLick On Stock Update Button");
			medWait();
			click(bifrost.actionDropDown, "CLick On Action Drop Down");
			click(bifrost.pushToRegrading, "Select Push To Grading From Drop Down");
			click(bifrost.cauliflowerMediumInventryChkBx, "Select Cauliflower Medium CheckBox");
			enterText(bifrost.cauliflowerMediumInventryTxtBx, "10", "Enter Transfer Quantity Of Cauliflower");
			click(bifrost.tomatoLocalInventruChkBx, "Select Tomato Local CheckBox");
			enterText(bifrost.tomatoLocalInventruTxtBx, "10", "Enter Transfer Quantity Of Tomato");
			click(bifrost.stockUpdateBtn, "CLick On Stock Update Button");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * goToReGradingScreenFromLottingScreen method will Navigate To ReGrading
	 * Screen From Lotting Screen
	 * 
	 * @author Abhijeet
	 */

	public static void goToReGradingScreenFromLottingScreen() {
		try {
			waitTillMElementPresent(flash.lotiingBackBtn);
			medWait();
			// mClick(flash.lotiingBackBtn, "Click On Back Button On Lotting
			// Screen");
			mBackButton();
			mExists(flash.manualGradingTAb, "Manual Grading Tab");
			mClick(flash.manualGradingTAb, "Click On Manual Grading Tab");
			mClick(flash.regradinfToGradingTab, "CLick On Regrading To Grading Tab");
			mExists(flash.regradingScreen, "Regrading Screen");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * startRegrading method will ReGrade SKUs
	 * 
	 * @author Abhijeet
	 */

	public static void startRegrading(String str_regradingSKUXpath, String int_goodStock, String int_noOflots) {
		try {
			mClick(str_regradingSKUXpath, "Click On SKU Start Button");
			mClick(flash.yesBtn, "Click On YES  Button");
			mClick(str_regradingSKUXpath, "Click On SKU Started Button");
			mEnterTextWithoutClear(flash.goodStockTxtBx, int_goodStock,
					"Enter Quantity In Good Stock Text Box" + int_goodStock);
			mEnterTextWithoutClear(flash.noOfLots, int_noOflots, "Enter No Of Lots " + int_noOflots);
			mClick(flash.finishBtn, "Click On Finish Buton");
			mClick(flash.yesBtn, "Click On YES  Button");
			mExists(flash.searchSKUText, "Validate That ReGrading Is Done");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * startRegradingWithScanner method will ReGrade SKUs
	 * 
	 * @author Abhijeet
	 */

	public static void startRegradingWithScanner(String str_regradingSKUXpath, String int_goodStock,
			String int_noOflots) {
		try {
			mClick(str_regradingSKUXpath, "Click On SKU Start Button");
			mClick(flash.yesBtn, "Click On YES  Button");
			mClick(str_regradingSKUXpath, "Click On SKU Started Button");
			mClick(flash.doneBtn, "CLick On Done Button");
			mClick(flash.yesBtn, "Click On YES  Button");
			mEnterTextWithoutClear(flash.goodStockTxtBx, int_goodStock,
					"Enter Quantity In Good Stock Text Box" + int_goodStock);
			mEnterTextWithoutClear(flash.noOfLots, int_noOflots, "Enter No Of Lots " + int_noOflots);
			mClick(flash.finishBtn, "Click On Finish Buton");
			mClick(flash.yesBtn, "Click On YES  Button");
			mExists(flash.searchSKUText, "Validate That ReGrading Is Done");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	/**
	 * startRegradingForVarientSKU method will ReGrade SKUs
	 * 
	 * @author Abhijeet
	 */

	public static void startRegradingForVarientSKU(String str_regradingSKUXpath, String int_goodStock,
			String int_noOflots) {
		try {
			mClick(str_regradingSKUXpath, "Click On SKU Start Button");
			mClick(flash.yesBtn, "Click On YES  Button");
			mClick(str_regradingSKUXpath, "Click On SKU Started Button");
			minMinWait();
		
			mClick(flash.toggleSwitch, "Click On Toggle Switch Button");
			minWait();
			mBackButton();
			minWait();
			mEnterTextWithoutClear(flash.goodTStockVarienTxtBox, int_goodStock,
					"Enter Quantity In Good Stock Text Box" + int_goodStock);
			mBackButton();
			mEnterTextWithoutClear(flash.noOflotsVarientTxtBx, int_noOflots, "Enter No Of Lots " + int_noOflots);
			mClick(flash.finishBtn, "Click On Finish Buton");
			mClick(flash.yesBtn, "Click On YES  Button");
			mExists(flash.searchSKUText, "Validate That ReGrading Is Done");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	// .....................Direct App..........................

	/**
	 * placeOrderForPrecondition method will Place Sale Order And Validate
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void placeOrderForPrecondition() throws Exception {
		minWait();
		mClick(direct.skuPlusBtn, "CLick On Plus Button");
		mClick(direct.skuPlusBtn, "CLick On Plus Button");
		mClick(direct.skuPlusBtn, "CLick On Plus Button");
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "CLick On Place Order Button");
		mClick(direct.confirmBtn, "Click On Confirm Button");
		mExists(direct.orderConfirmedScreen, "Order Confirmed Screen");
	}

	/**
	 * clickCauliflowerPlusBtnAndValidate method will Click On Cauliflower Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickCauliflowerPlusBtnAndValidate() throws Exception {

		this.TOTALPrice = 0;
		minWait();
		scrollDown(fetchDirectData("direct", "cauliflower"));
		minWait();

		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		medWait();
		validatePriceAfterClickedOnPlusBtn("Cauliflower", direct.cauliflowerPrice, direct.cauliflowerMinQuantity,
				direct.cauliflowerQuantity, direct.cartValueAs1);
		minWait();
		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Cauliflower", direct.cauliflowerPrice, direct.cauliflowerMinQuantity,
				direct.cauliflowerQuantity, direct.cartValueAs1, direct.cauliflowerQty);
		minWait();
		mClick(direct.cauliflowerMinusButton, "CLick On Cauliflower Minus button");

		validatePriceAfterClickedOnMinusBtn("Cauliflower", direct.cauliflowerPrice, direct.cauliflowerMinQuantity,
				direct.cauliflowerQuantity, direct.cartValueAs1, direct.cauliflowerQty);

		this.cauliflowerMinimumQuantity = getSKUQuantity("Cauliflower", direct.cauliflowerMinQuantity);

	}

	/**
	 * clickLemonPlusBtnAndValidate method will Click On Lemon Plus Button And
	 * Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickLemonPlusBtnAndValidate() throws Exception {
		minWait();
		scrollDown(fetchDirectData("direct", "tomato"));
		scrollDown(fetchDirectData("direct", "lemon"));
		minWait();

		mClick(direct.lemonPlusButton, "Click On Lemon Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Lemon", direct.lemonPrice, direct.lemonMinQuantity, direct.lemonQuantity,
				direct.cartValueAs2);
		minWait();
		mClick(direct.lemonPlusButton, "Click On Lemon Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Lemon", direct.lemonPrice, direct.lemonMinQuantity,
				direct.lemonQuantity, direct.cartValueAs2, direct.lemonQty);
		minWait();
		mClick(direct.lemonMinusButton, "CLick On Lemon Minus(-) Button");
		validatePriceAfterClickedOnMinusBtn("Lemon", direct.lemonPrice, direct.lemonMinQuantity, direct.lemonQuantity,
				direct.cartValueAs2, direct.lemonQty);
		// Get The Minimum Value For Lemon
		this.lemonMinimumQuantity = getSKUQuantity("Lemon", direct.lemonMinQuantity);

	}

	/**
	 * clickOnionPlusBtnAndValidate method will Click On Onion Plus Button And
	 * Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickOnionPlusBtnAndValidate() throws Exception {

		scrollDown(fetchDirectData("direct", "tomato"));
		scrollDown(fetchDirectData("direct", "onion"));
		medWait();
		mClick(direct.onionPlusButtoon, "Click On Onion Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Onion", direct.onionPrice, direct.onionMinQuantity, direct.onionQuantity,
				direct.cartValueAs3);
		minWait();
		mClick(direct.onionPlusButtoon, "Click On Onion Plus(+) Button");

		validatePriceAfterDoubleClickedOnPlusBtn("Lemon", direct.onionPrice, direct.onionMinQuantity,
				direct.onionQuantity, direct.cartValueAs3, direct.onionQty);
		minWait();
		mClick(direct.onionMinusButtoon, "Click On Onion Minus(-) Button");
		validatePriceAfterClickedOnMinusBtn("onion", direct.onionPrice, direct.onionMinQuantity, direct.onionQuantity,
				direct.cartValueAs3, direct.onionQty);

		this.onionMinimumQuantity = getSKUQuantity("Onion", direct.onionMinQuantity);
	}

	/**
	 * clickPotatoPlusBtnAndValidate method will Click On Potato(Locak)Hassan
	 * Plus Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickPotatoPlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "tomato"));
		scrollDown(fetchDirectData("direct", "potato"));
		minWait();

		mClick(direct.potatoPlusButon, "Click On Potato Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Potato", direct.potatoPrice, direct.potatoMinQuantity,
				direct.potatoQuantity, direct.cartValueAs4);
		minWait();
		mClick(direct.potatoPlusButon, "Click On Potato Plus(+) Button");

		validatePriceAfterDoubleClickedOnPlusBtn("Potato", direct.potatoPrice, direct.potatoMinQuantity,
				direct.potatoQuantity, direct.cartValueAs4, direct.potatoQty);
		minWait();
		mClick(direct.potatoMinusButon, "Click On Potato Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Potato", direct.potatoPrice, direct.potatoMinQuantity,
				direct.potatoQuantity, direct.cartValueAs4, direct.potatoQty);
		this.potatoMinimumQuantity = getSKUQuantity("Potato", direct.potatoMinQuantity);

	}

	/**
	 * clickTomatoPlusBtnAndValidate method will Click On Tomato(Locak) Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickTomatoPlusBtnAndValidate() throws Exception {

		scrollDown(fetchDirectData("direct", "tomato"));
		medWait();

		mClick(direct.tomatoPlusButton, "Click On Tomato Plus(+) Button");

		validatePriceAfterClickedOnPlusBtn("Tomato", direct.tomatoPrice, direct.tomatoMinQiuantity,
				direct.tomatoQuantity, direct.cartValueAs5);
		minWait();
		mClick(direct.tomatoPlusButton, "Click On Tomato Plus(+) Button");

		validatePriceAfterDoubleClickedOnPlusBtn("Tomato", direct.tomatoPrice, direct.tomatoMinQiuantity,
				direct.tomatoQuantity, direct.cartValueAs5, direct.tomatoQty);
		minWait();
		mClick(direct.tomatoMinusButton, "Click On Tomato Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Tomato", direct.tomatoPrice, direct.tomatoMinQiuantity,
				direct.tomatoQuantity, direct.cartValueAs5, direct.tomatoQty);
		this.tomatoMinimumQuantity = getSKUQuantity("Tomato", direct.tomatoMinQiuantity);
	}

	/**
	 * clickCornPlusBtnAndValidate method will Click On Corn(Sweet) Plus Button
	 * And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickCornPlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "corn"));
		minWait();
		mClick(direct.cornPlusButton, "Click On Corn Plus(+) Button");
		minWait();
		validatePriceAfterClickedOnPlusBtn("Corn", direct.cornPrice, direct.cornMinQuantity, direct.cornQuantity,
				direct.cartValueAs6);
		minWait();
		mClick(direct.cornPlusButton, "Click On Corn Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Corn", direct.cornPrice, direct.cornMinQuantity, direct.cornQuantity,
				direct.cartValueAs6, direct.cornQty);
		minWait();
		mClick(direct.cornMinusButton, "Click On Corn Minus(-) Button");
		validatePriceAfterClickedOnMinusBtn("Corn", direct.cornPrice, direct.cornMinQuantity, direct.cornQuantity,
				direct.cartValueAs6, direct.cornQty);

		this.cornMinimumQuantity = getSKUQuantity("Corn", direct.cornMinQuantity);
		this.cornQuantity = getSKUQuantity("Corn", direct.cornQuantity);
	}

	/**
	 * clickApplePlusBtnAndValidate method will Click On Apple Washington(Small)
	 * Plus Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickApplePlusBtnAndValidate() throws Exception {

		mClick(direct.fruitsTab, "CLick On Fruits Tab");
		scrollDown(fetchDirectData("direct", "apple"));

		medWait();
		mClick(direct.applePlusButton, "Click On Apple Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Apple", direct.applePrice, direct.appleMinQuantity, direct.appleQuantity,
				direct.cartValueAs7);
		minWait();
		mClick(direct.applePlusButton, "Click On Apple Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Apple", direct.applePrice, direct.appleMinQuantity,
				direct.appleQuantity, direct.cartValueAs7, direct.appleQty);
		minWait();
		mClick(direct.appleMinusButton, "Click On Apple Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Apple", direct.applePrice, direct.appleMinQuantity, direct.appleQuantity,
				direct.cartValueAs7, direct.appleQty);
		this.appleMinimumQuantity = getSKUQuantity("Apple", direct.appleMinQuantity);
	}

	/**
	 * clickBananaPlusBtnAndValidate method will Click On Banana Yallaki Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickBananaPlusBtnAndValidate() throws Exception {

		/*
		 * if (Appdriver.findElement(By.xpath(direct.bananaMinQuantity)).
		 * isDisplayed()) { minWait(); System.out.println("Banana Is Displaying"
		 * ); } else { minWait(); scrollDown(fetchDirectData("direct",
		 * "banana")); }
		 */

		minWait();
		scrollDown(fetchDirectData("direct", "mosambi"));
		scrollDown(fetchDirectData("direct", "banana"));
		medWait();
		mClick(direct.bananaPlusButton, "Click On Banana Plus(+) Button");
		// scrollDown(fetchDirectData("direct", "banana"));
		validatePriceAfterClickedOnPlusBtn("Banana", direct.bananaPrice, direct.bananaMinQuantity,
				direct.bananaQuantity, direct.cartValueAs8);
		minWait();
		mClick(direct.bananaPlusButton, "Click On Banana Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Banana", direct.bananaPrice, direct.bananaMinQuantity,
				direct.bananaQuantity, direct.cartValueAs8, direct.bananaQty);
		minWait();
		mClick(direct.bananaMinusButton, "Click On Banana Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Banana", direct.bananaPrice, direct.bananaMinQuantity,
				direct.bananaQuantity, direct.cartValueAs8, direct.bananaQty);
		minWait();
		this.bananaMinimumQuantity = getSKUQuantity("Banana", direct.bananaMinQuantity);
	}

	/**
	 * clickChiccoPlusBtnAndValidate method will Click On Chicco(sapota) Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickChiccoPlusBtnAndValidate() throws Exception {
		minWait();
		// scrolldown to mosambi because its not scrolling
		scrollDown(fetchDirectData("direct", "mosambi"));
		scrollDown(fetchDirectData("direct", "chicco"));
		minWait();

		if (Appdriver.findElement(By.xpath(direct.chicooMinQuantity)).isDisplayed()) {
			minWait();

			this.chiccoMinimumQuantity = getSKUQuantity("Chicco", direct.chicooMinQuantity);
		} else {
			minWait();
			// scrolldown to mosambi because its not scrolling
			scrollDown(fetchDirectData("direct", "mosambi"));
			scrollDown(fetchDirectData("direct", "chicco"));

		}

		mClick(direct.chiccoPlusButton, "Click On Chicco Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Chicco", direct.chiccoPrice, direct.chicooMinQuantity,
				direct.chiccoQuantity, direct.cartValueAs9);
		minWait();
		mClick(direct.chiccoPlusButton, "Click On Chicco Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Chicco", direct.chiccoPrice, direct.chicooMinQuantity,
				direct.chiccoQuantity, direct.cartValueAs9, direct.chiccoQty);
		minWait();
		mClick(direct.chiccoMinusButton, "Click On Chicco Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Chicco", direct.chiccoPrice, direct.chicooMinQuantity,
				direct.chiccoQuantity, direct.cartValueAs9, direct.chiccoQty);
		this.chiccoMinimumQuantity = getSKUQuantity("Chicco", direct.chicooMinQuantity);
	}

	/**
	 * clickMosambiPlusBtnAndValidate method will Click On Mosambi(Sweet lime)
	 * Plus Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMosambiPlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "mosambi"));
		minWait();

		mClick(direct.mosambiPlusButton, "Click On Mosambi Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Mosambi", direct.mosambiPrice, direct.mosambiMinQuantity,
				direct.mosambiQuantity, direct.cartValueAs9);
		minWait();
		mClick(direct.mosambiPlusButton, "Click On Mosambi Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Mosambi", direct.mosambiPrice, direct.mosambiMinQuantity,
				direct.mosambiQuantity, direct.cartValueAs9, direct.mosambiQty);
		minWait();
		mClick(direct.mosambiMinusButton, "Click On Mosambi Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Mosambi", direct.mosambiPrice, direct.mosambiMinQuantity,
				direct.mosambiQuantity, direct.cartValueAs9, direct.mosambiQty);
		this.mosambiMinimumQuantity = getSKUQuantity("Mosambi", direct.mosambiMinQuantity);

	}

	/**
	 * clickOrangePlusBtnAndValidate method will Click On Orange(nagoura) Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickOrangePlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "orange"));
		minWait();

		mClick(direct.orangePlusButton, "Click On Orange Plus(+) Button");
		validatePriceAfterClickedOnPlusBtn("Orange", direct.orangePrice, direct.orangeMinQuantity,
				direct.orangeQuantity, direct.cartValueAs10);
		minWait();
		mClick(direct.orangePlusButton, "Click On Orange Plus(+) Button");
		validatePriceAfterDoubleClickedOnPlusBtn("Orange", direct.orangePrice, direct.orangeMinQuantity,
				direct.orangeQuantity, direct.cartValueAs10, direct.orangeQty);
		minWait();
		mClick(direct.orangeMinusButton, "Click On Orange Minus(-)Button");
		validatePriceAfterClickedOnMinusBtn("Orange", direct.orangePrice, direct.orangeMinQuantity,
				direct.orangeQuantity, direct.cartValueAs10, direct.orangeQty);
		this.orangeMinimumQuantity = getSKUQuantity("Orange", direct.orangeMinQuantity);

	}

	/**
	 * clickTotalArrowAndValidateMyCartScreen method will Click On Total Button
	 * And Validate Mycart Screen
	 * 
	 * @author Abhijeet
	 */

	public static void clickTotalButtonAndValidateMyCartScreen() {
		mClick(direct.totalArrowBtn, "Click On TOTAL Arrow Button");
		mExists(direct.myCartScreen, "MyCart Screen");
	}

	/**
	 * clickMyCartCauliflowerPlusBtnAndValidate method will Click On Cauliflower
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartCauliflowerPlusBtnAndValidate() throws Exception {
		minWait();

		validateMyCartPriceAfterClickedOnPlusBtn("Cauliflower", direct.cauliflowerPrice,
				direct.myCartCauliflowerQuantity, direct.myCartCauliflowerPlusButton, this.cauliflowerMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Cauliflower", direct.cauliflowerPrice,
				direct.myCartCauliflowerQuantity, direct.myCartCauliflowerPlusButton, this.cauliflowerMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Cauliflower", direct.cauliflowerPrice,
				direct.myCartCauliflowerQuantity, direct.myCartCauliflowerMinusButton, this.cauliflowerMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Cauliflower", direct.myCartCauliflowerQuantity);
		this.cauliflowerQuantity = skuQuantity;

	}

	/**
	 * clickMyCartLemonPlusBtnAndValidate method will Click On Lemon(Small) Plus
	 * Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartLemonPlusBtnAndValidate() throws Exception {
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Lemon", direct.lemonPrice, direct.myCartLemonQuantity,
				direct.myCartLemonPlusButton, this.lemonMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Lemon", direct.lemonPrice, direct.myCartLemonQuantity,
				direct.myCartLemonPlusButton, this.lemonMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Lemon", direct.lemonPrice, direct.myCartLemonQuantity,
				direct.myCartLemonMinusButton, this.lemonMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Lemon", direct.myCartLemonQuantity);
		this.lemonQuantity = skuQuantity;
	}

	/**
	 * clickMyCartPotatoPlusBtnAndValidate method will Click On
	 * Potato(Local)-Hassan Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartPotatoPlusBtnAndValidate() throws Exception {
		minWait();

		validateMyCartPriceAfterClickedOnPlusBtn("Potato", direct.potatoPrice, direct.myCartPotatoQuantity,
				direct.myCartPotatoPlusButton, this.potatoMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Potato", direct.potatoPrice, direct.myCartPotatoQuantity,
				direct.myCartPotatoPlusButton, this.potatoMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Potato", direct.potatoPrice, direct.myCartPotatoQuantity,
				direct.myCartPotatoMinusButton, this.potatoMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Potato", direct.myCartPotatoQuantity);
		this.potatoQuantity = skuQuantity;

	}

	/**
	 * clickMyCartTomatoPlusBtnAndValidate method will Click On Tomato(Local)
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartTomatoPlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "tomato"));
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Tomato", direct.tomatoPrice, direct.myCartTomatoQuantity,
				direct.mycartTomatoPlusButton, this.tomatoMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Tomato", direct.tomatoPrice, direct.myCartTomatoQuantity,
				direct.mycartTomatoPlusButton, this.tomatoMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Tomato", direct.tomatoPrice, direct.myCartTomatoQuantity,
				direct.mycartTomatoMinusButton, this.tomatoMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Tomato", direct.myCartTomatoQuantity);
		this.tomatoQuantity = skuQuantity;

	}

	/**
	 * clickMyCartOnionPlusBtnAndValidate method will Click On
	 * Onion-Graded(Local) Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartOnionPlusBtnAndValidate() throws Exception {
		// scrollDown(fetchDirectData("direct", "onion"));
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Onion", direct.onionPrice, direct.myCartOnionQuantity,
				direct.mycartOnionPlusButton, this.onionMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Onion", direct.onionPrice, direct.myCartOnionQuantity,
				direct.mycartOnionPlusButton, this.onionMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Onion", direct.onionPrice, direct.myCartOnionQuantity,
				direct.mycartOnionMinusButton, this.onionMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Onion", direct.myCartOnionQuantity);
		this.onionQuantity = skuQuantity;

	}

	/**
	 * clickMyCartApplePlusBtnAndValidate method will Click On Apple
	 * Washington(Small) Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartApplePlusBtnAndValidate() throws Exception {
		medWait();
		scrollDown(fetchDirectData("direct", "apple"));
		medWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Apple", direct.applePrice, direct.mycartAppleQuantity,
				direct.myCartApplePlusButton, this.appleMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Apple", direct.applePrice, direct.mycartAppleQuantity,
				direct.myCartApplePlusButton, this.appleMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Apple", direct.applePrice, direct.mycartAppleQuantity,
				direct.myCartAppleMinusButton, this.appleMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Apple", direct.mycartAppleQuantity);
		this.appleQuantity = skuQuantity;
	}

	/**
	 * clickMyCartBananaPlusBtnAndValidate method will Click On Banana Yallaki
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartBananaPlusBtnAndValidate() throws Exception {
		// minWait();
		// scroll till mosambi so that banana will be visible
		scrollDown(fetchDirectData("direct", "mosambi"));
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Banana", direct.bananaPrice, direct.myCartbananaQuantity,
				direct.myCartBananaPlusButton, this.bananaMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Banana", direct.bananaPrice, direct.myCartbananaQuantity,
				direct.myCartBananaPlusButton, this.bananaMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Banana", direct.bananaPrice, direct.myCartbananaQuantity,
				direct.myCartBananaMinusButton, this.bananaMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Banana", direct.myCartbananaQuantity);
		this.bananaQuantity = skuQuantity;
	}

	/**
	 * clickMyCartChiccoPlusBtnAndValidate method will Click On Chicco(sapota)
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartChiccoPlusBtnAndValidate() throws Exception {
		// scrollDown(fetchDirectData("direct", "chicco"));
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Chicco", direct.chiccoPrice, direct.MyCartChiccoQuantity,
				direct.myCartChiccoPlusButton, this.chiccoMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Chicco", direct.chiccoPrice, direct.MyCartChiccoQuantity,
				direct.myCartChiccoPlusButton, this.chiccoMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Chicco", direct.chiccoPrice, direct.MyCartChiccoQuantity,
				direct.myCartChiccoMinusButton, this.chiccoMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Chicco", direct.MyCartChiccoQuantity);
		this.chiccoQuantity = skuQuantity;

	}

	/**
	 * clickMyCartMosambiPlusBtnAndValidate method will Click On Mosambi(sweet)
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartMosambiPlusBtnAndValidate() throws Exception {
		scrollDown(fetchDirectData("direct", "mosambi"));
		minWait();
		validateMyCartPriceAfterClickedOnPlusBtn("Mosambi", direct.mosambiPrice, direct.myCartMosambiQuantity,
				direct.myCartMosambiPlusButton, this.mosambiMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Mosambi", direct.mosambiPrice, direct.myCartMosambiQuantity,
				direct.myCartMosambiPlusButton, this.mosambiMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Mosambi", direct.mosambiPrice, direct.myCartMosambiQuantity,
				direct.myCartMosambiMinusButton, this.mosambiMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Mosambi", direct.myCartMosambiQuantity);
		this.mosambiQuantity = skuQuantity;
	}

	/**
	 * clickMyCartOrangePlusBtnAndValidate method will Click On Orange(Nagpura)
	 * Plus Button And Validate All Fields On MyCart Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickMyCartOrangePlusBtnAndValidate() throws Exception {

		scrollDown(fetchDirectData("direct", "orange"));
		minWait();

		if (Appdriver.findElement(By.xpath(direct.mycartOrangeQuantit)).isDisplayed()) {
			minWait();

			int skuQuantity = MyCartGetSKUQuantity("Orange", direct.mycartOrangeQuantit);

		} else {
			minWait();
			scrollDown(fetchDirectData("direct", "orange"));
			minWait();
		}
		validateMyCartPriceAfterClickedOnPlusBtn("Orange", direct.orangePrice, direct.mycartOrangeQuantit,
				direct.myCartOrangePlusButton, this.orangeMinimumQuantity);

		validateMyCartPriceAfterDoubleClickedOnPlusBtn("Orange", direct.orangePrice, direct.mycartOrangeQuantit,
				direct.myCartOrangePlusButton, this.orangeMinimumQuantity);

		validateMyCartPriceAfterClickedOnMinusBtn("Orange", direct.orangePrice, direct.mycartOrangeQuantit,
				direct.myCartOrangeMinusButton, this.orangeMinimumQuantity);

		int skuQuantity = MyCartGetSKUQuantity("Orange", direct.mycartOrangeQuantit);
		this.orangeQuantity = skuQuantity;

		mClick(direct.placeOrderText, "CLick On Place Order Button");
	}

	/**
	 * CLickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen method will
	 * Click On Place Order Button And Validate All Fields On Order Details
	 * Screen
	 * 
	 * @author Abhijeet
	 */

	public static void clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen() {

		mExists(direct.confirmOrderDetailsScreen, "Kindly Confirm your Order Details Screen");
		mExists(direct.orderValueText, "Order Value Text");
//		mExists(direct.deliveryChargesText, "Delivery Charges");
//		mExists(direct.totalValueText, "Total Value Text");
		mExists(direct.deliveryDateText, "Delivery Date Text");
		mExists(direct.confirmBtn, "Confirm Button");
		mExists(direct.cancelBtn, "Cancel Button");
		mClick(direct.confirmBtn, "Click On Confirm Button");
	}

	/**
	 * orderConfirmedScreen method will Validate All Mandatory Fields On Order
	 * Confirmed Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void orderConfirmedScreen() throws Exception {
		mExists(direct.orderConfirmedScreen, "Order Confirmed");
		mExists(direct.orderPlacedSuccessfullyMsg, "Order Placed Successfully");
		mExists(direct.orderSummaryBtn, "Order Summary Button");

		this.createdOrderId = getOrderID(direct.orderID);
	}

	/**
	 * ValidateTotalPriceOnOrderDetailsScreen method will Validate Total Price
	 * On Order Details Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void ValidateTotalPriceOnOrderDetailsScreen() throws Exception {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");
		double skuprice = getPrice("OrderDetailTotalPrice", direct.orderDetailsTotalPrice);
		if (skuprice == this.TOTALPrice) {
			System.out.println("Order Details Total Price (" + skuprice + ") is Matched With PLACE ORDER PRICE "
					+ this.TOTALPrice);
			logger.log(LogStatus.PASS, "Matched",
					"Order Details Total Price " + skuprice + " is Matched With PLACE ORDER PRICE " + this.TOTALPrice);
		} else {
			System.out.println("Order Details Total Price " + skuprice + " Does Not Matched With PLACE ORDER PRICE "
					+ this.TOTALPrice);
			logger.log(LogStatus.WARNING, "Matched", "Order Details Total Price " + skuprice
					+ " Does Not Matched With PLACE ORDER PRICE " + this.TOTALPrice);

		}
	}

	/**
	 * ValidateEditAndViewOrderButton method will Validate Edit And Order Button
	 * 
	 * @author Abhijeet
	 */

	public static void ValidateEditAndViewOrderButton() {
		mExists(direct.editOrderBtn, "Edit Order Button");
		mExists(direct.viewOrderBtn, "View Order Button");

	}

	/**
	 * clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice method will
	 * Edit Order And Validate Total Price
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice() throws Exception {
		medWait();
		medWait();
		mClick(direct.editOrderBtn, "Click On Edit Order Button");
		mExists(direct.directAppHomeScreen, "Vegetable Tab");
		mExists(direct.fruitsTab, "Fruits Tab");
		// mExists(direct.cartValueAs10, "Cart Value As 10");
		waitTillMElementPresent(direct.totalPrice);
		double skuprice = getPrice("TOTAL Price", direct.totalPrice);
		if (skuprice == this.TOTALPrice) {
			System.out.println(
					"Order Details Total Price " + skuprice + " is Matched With PLACE ORDER PRICE " + this.TOTALPrice);
			logger.log(LogStatus.PASS, "Matched",
					"Order Details Total Price " + skuprice + " is Matched With PLACE ORDER PRICE " + this.TOTALPrice);
		} else {
			System.out.println("Order Details Total Price " + skuprice + " Does Not Matched With PLACE ORDER PRICE "
					+ this.TOTALPrice);
			logger.log(LogStatus.FAIL, "Matched", "Order Details Total Price " + skuprice
					+ " Does Not Matched With PLACE ORDER PRICE " + this.TOTALPrice);
		}

	}

	/**
	 * searchOrangeAndAddIntoCart method will Search Orange In SearchBox And Add
	 * IntoCart Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 *//*
		 * 
		 * public static void searchOrangeAndAddIntoCart() {
		 * mEnterTextWithoutClear(direct.sKUSearchBox, fetchDirectData("direct",
		 * "orange"), "Enter Orange In SKU Search Box"); minWait();
		 * mClick(direct.orangePlusButton, "Click On Orange Plus(+) Button");
		 * mExists(direct.cartValueAs10, "Number Of Item In Cart As 10");
		 * mExists(direct.orangeQuantityAs5Kg, "Orange Quantity As 5 Kg");
		 * mBackButton(); mBackButton(); mExists(direct.totalAs4759,
		 * "Total Price As Rs 4759");
		 * 
		 * }
		 */

	/**
	 * getSKUsPrice method will get the price value from the mobile UI
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the WebElement
	 * 
	 * @author Abhijeet
	 */
	public static double getPrice(String skuName, String ObjXpath) {

		WebElement textBox = Appdriver.findElement(By.xpath(ObjXpath));
		String skuprice = textBox.getAttribute("text").replace(" ", "").toUpperCase();
		String[] split = skuprice.split("S");
		minMinWait();
		System.out.println(split[1]);
		String skuPrice = (split[1]);
		double priceOfSKU = Double.parseDouble(skuPrice);
		logger.log(LogStatus.INFO, "getPrice", "Get The Price Of " + skuName + " " + priceOfSKU);
		return priceOfSKU;

	}

	/**
	 * getSKUMinQuantity method will get the minimum sku quantity value from the
	 * mobile UI
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the WebElement
	 * 
	 * @author Abhijeet
	 */
	public static int getSKUQuantity(String skuName, String str_quantityXpath) {

		WebElement textBox = Appdriver.findElement(By.xpath(str_quantityXpath));
		String quantity = textBox.getAttribute("text").toUpperCase();
		String split[] = quantity.split(" ");
		minMinWait();
		String sKUQuantity = (split[0]);
		int quantityOfSKU = Integer.parseInt(sKUQuantity);
		System.out.println(quantityOfSKU);
		logger.log(LogStatus.INFO, "getSKUQuantity", "Get The Quantity Of " + skuName + quantityOfSKU);
		return quantityOfSKU;

	}

	/**
	 * getSKUMinQuantity method will get the Second minimum sku quantity value
	 * from the mobile UI
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the WebElement
	 * 
	 * @author Abhijeet
	 */
	public int getSkuQty(String skuName, String ObjXpath) throws Exception {

		WebElement textBox = Appdriver.findElement(By.xpath(ObjXpath));
		String quantity = textBox.getAttribute("text").toUpperCase();
		String split[] = quantity.split(" ");
		String sKUQuantity = (split[1]);
		minMinWait();
		int QtyOfSKU = Integer.parseInt(sKUQuantity);
		System.out.println(QtyOfSKU);
		logger.log(LogStatus.INFO, "getSkuQty", "Get The QTY Of " + skuName + QtyOfSKU);
		return QtyOfSKU;

	}

	/**
	 * getSKUQuantityKG method will get the minimum sku quantity value from the
	 * mobile UI In KG
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the WebElement
	 * 
	 * @author Abhijeet
	 */
	public int MyCartGetSKUQuantity(String skuName, String ObjXpath) throws Exception {

		WebElement textBox = Appdriver.findElement(By.xpath(ObjXpath));
		String quantity = textBox.getAttribute("text").replace(" ", "").toUpperCase();
		int quantityOfSKU = Integer.parseInt(quantity);
		System.out.println(quantityOfSKU);
		logger.log(LogStatus.INFO, "MyCartGetSKUQuantity", "Get The Quantity Of " + skuName + quantityOfSKU);
		return quantityOfSKU;

	}

	/**
	 * validatePriceAfterClickedOnPlusBtn method will Validate Price And
	 * Quantity For SKU After Clicked On Plus Buuton Of SKU
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_MinQuantityXpath
	 *            is Minimum Quantity xpath
	 * @param str_CartValueXpath
	 *            is cart Value Xpath
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validatePriceAfterClickedOnPlusBtn(String str_skuName, String str_skuPriceXath,
			String str_MinQuantityXpath, String str_QuantityXpath, String str_CartValueXpath) throws Exception {

		try {

			waitTillMElementPresent(str_skuPriceXath);
			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			waitTillMElementPresent(str_MinQuantityXpath);
			int skuMinQuantity = getSKUQuantity(str_skuName, str_MinQuantityXpath);
			waitTillMElementPresent(str_QuantityXpath);
			int skuQuantity = getSKUQuantity(str_skuName, str_QuantityXpath);
			waitTillMElementPresent(direct.totalPrice);
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			minWait();
			//mExists(str_CartValueXpath, "Cart Value ");

			if (skuMinQuantity == skuQuantity) {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Is Matched With Minimum Quantity" + skuMinQuantity);
				logger.log(LogStatus.PASS, "Matched", "Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Is Matched With Minimum Quantity" + skuMinQuantity);

				if ((skuprice * skuQuantity + this.TOTALPrice) == totalvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQuantity + "+" + this.TOTALPrice + "=")
							+ (skuprice * skuQuantity + this.TOTALPrice) + " Is Matched With Total Price" + totalvalue);
					logger.log(LogStatus.PASS, "Matched", "Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQuantity + "+" + this.TOTALPrice + "=")
							+ (skuprice * skuQuantity + this.TOTALPrice) + " Is Matched With Total Price" + totalvalue);
				}

				else {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQuantity + "+" + this.TOTALPrice + "=")
							+ (skuprice * skuQuantity + this.TOTALPrice) + " Is Matched With Total Price" + totalvalue);
					logger.log(LogStatus.WARNING, "Matched", "Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQuantity + "+" + this.TOTALPrice + "=")
							+ (skuprice * skuQuantity + this.TOTALPrice) + " Is Matched With Total Price" + totalvalue);
				}
			} else {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Doesn't Matched With Minimum Quantity" + skuMinQuantity);
				logger.log(LogStatus.WARNING, "Matched", "Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Doesn't Matched With Minimum Quantity" + skuMinQuantity);
			}
			this.TOTALPrice = totalvalue;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * validatePriceAfterDoubleClickedOnPlusBtn method will Validate Price And
	 * Quantity For SKU After Double Clicked On Plus Button Of SKU
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_MinQuantityXpath
	 *            is Minimum Quantity xpath
	 * @param str_CartValueXpath
	 *            is cart Value Xpath
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void validatePriceAfterDoubleClickedOnPlusBtn(String str_skuName, String str_skuPriceXath,
			String str_MinQuantityXpath, String str_QuantityXpath, String str_CartValueXpath, String str_SkuQtyXpath)
			throws Exception {
		try {
			waitTillMElementPresent(str_skuPriceXath);
			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			waitTillMElementPresent(str_MinQuantityXpath);
			int skuMinQuantity = getSKUQuantity(str_skuName, str_MinQuantityXpath);
			waitTillMElementPresent(str_QuantityXpath);
			int skuQuantity = getSKUQuantity(str_skuName, str_QuantityXpath);
			waitTillMElementPresent(direct.totalPrice);
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			int skuQUnty = getSkuQty(str_skuName, str_SkuQtyXpath);
			minWait();

			//mExists(str_CartValueXpath, "Cart Value ");

			if ((skuMinQuantity + skuQUnty) == skuQuantity) {
				System.out.println("Total Quantity Of " + "str_skuName" + (skuMinQuantity + "+" + skuQUnty)
						+ " Is Matched With Minimum Quantity" + " As" + skuQuantity);
				logger.log(LogStatus.PASS, "Matched",
						"Total Quantity Of " + "str_skuName" + (skuMinQuantity + "+" + skuQUnty)
								+ " Is Matched With Minimum Quantity" + " As" + skuQuantity);

				if ((skuprice * skuQUnty + this.TOTALPrice) == totalvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQUnty + "+" + this.TOTALPrice + "= ")
							+ (skuprice * skuQUnty + this.TOTALPrice) + " Is Matched With TOTAL Price" + totalvalue);
					logger.log(LogStatus.PASS, "Matched", "Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQUnty + "+" + this.TOTALPrice + "= ")
							+ (skuprice * skuQUnty + this.TOTALPrice) + " Is Matched With TOTAL Price" + totalvalue);
				} else {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + skuQUnty + "+" + this.TOTALPrice + "= ")
							+ (skuprice * skuQUnty + this.TOTALPrice) + " Doesn't Matched With TOTAL Price"
							+ totalvalue);
					logger.log(LogStatus.WARNING, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (skuprice + "*" + skuQUnty + "+" + this.TOTALPrice + "= ")
									+ (skuprice * skuQUnty + this.TOTALPrice) + " Doesn't Matched With TOTAL Price"
									+ totalvalue);
				}
			} else {

				System.out.println("Total Quantity Of " + "str_skuName" + skuMinQuantity + "+" + skuQUnty
						+ (skuMinQuantity + skuQUnty) + " Doesn't Matched With Minimum Quantity" + skuMinQuantity + "+"
						+ " As" + skuQuantity);
				logger.log(LogStatus.WARNING, "Matched",
						"Total Quantity Of " + "str_skuName" + skuMinQuantity + "+" + skuQUnty
								+ (skuMinQuantity + skuQUnty) + " Doesn't Matched With Minimum Quantity"
								+ skuMinQuantity + "+" + " As" + skuQuantity);

			}

			this.TOTALPrice = totalvalue;
			this.skuQuantity = skuQuantity;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * validatePriceAfterClickedOnPlusBtn method will Validate Price And
	 * Quantity For SKU After Clicked On Plus Buuton Of SKU
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_MinQuantityXpath
	 *            is Minimum Quantity xpath
	 * @param str_CartValueXpath
	 *            is cart Value Xpath
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validatePriceAfterClickedOnMinusBtn(String str_skuName, String str_skuPriceXath,
			String str_MinQuantityXpath, String str_QuantityXpath, String str_CartValueXpath, String str_SkuQtyXpath)
			throws Exception {

		try {
			waitTillMElementPresent(str_skuPriceXath);
			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			waitTillMElementPresent(str_MinQuantityXpath);
			int skuMinQuantity = getSKUQuantity(str_skuName, str_MinQuantityXpath);
			waitTillMElementPresent(str_QuantityXpath);
			int skuQuantity = getSKUQuantity(str_skuName, str_QuantityXpath);
			waitTillMElementPresent(direct.totalPrice);
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			waitTillMElementPresent(str_SkuQtyXpath);
			double skuQTY = getSkuQty(str_skuName, str_SkuQtyXpath);

			minWait();
			//mExists(str_CartValueXpath, "Cart Value ");

			if (this.skuQuantity - skuQTY == skuMinQuantity) {
				System.out.println(
						"Total Quantity Of " + str_skuName + " " + (skuQuantity) + " Is Matched With Minimum Quantity"
								+ (this.skuQuantity + "-" + skuQTY + "=" + (skuMinQuantity)));
				logger.log(LogStatus.PASS, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (this.skuQuantity + "-" + skuQTY + "=" + (skuMinQuantity)));

				if ((this.TOTALPrice - (skuprice * skuQTY)) == totalvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (this.TOTALPrice + "-" + (skuprice + "*" + skuQTY)) + "="
							+ (this.TOTALPrice - (skuprice * skuQTY)) + " Is Matched With Total Price" + totalvalue);
					logger.log(LogStatus.PASS, "Matched",
							"Total Value Of " + str_skuName + " " + (this.TOTALPrice + "-" + (skuprice + "*" + skuQTY))
									+ "= " + (this.TOTALPrice - (skuprice * skuQTY)) + " Is Matched With Total Price"
									+ totalvalue);
				}

				else {
					System.out.println(
							"Total Value Of " + str_skuName + " " + (this.TOTALPrice + "-" + (skuprice + "*" + skuQTY))
									+ "=" + (this.TOTALPrice - (skuprice * skuQTY))
									+ " Does Not Matched With Total Price" + totalvalue);
					logger.log(LogStatus.WARNING, "Matched",
							"Total Value Of " + str_skuName + " " + (this.TOTALPrice + "-" + (skuprice + "*" + skuQTY))
									+ "=" + (this.TOTALPrice - (skuprice * skuQTY))
									+ " Does Not Matched With Total Price" + totalvalue);
				}
			} else {
				System.out.println(
						"Total Quantity Of " + str_skuName + " " + (skuQuantity) + " Is Matched With Minimum Quantity"
								+ (this.skuQuantity + "-" + skuQTY + "=" + (skuMinQuantity)));
				logger.log(LogStatus.WARNING, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (this.skuQuantity + "-" + skuQTY + "=" + (skuMinQuantity)));
			}
			this.TOTALPrice = totalvalue;

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * validateMyCartPriceAfterClickedOnPlusBtn method will Validate Price And
	 * Quantity For SKU After Clicked On Plus Buuton Of SKU On My Cart Screen
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_MinQuantityXpath
	 *            is Minimum Quantity xpath
	 * @param str_SKUPlusbtnxpath
	 *            is SKUs Plus Button Xpath
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validateMyCartPriceAfterClickedOnPlusBtn(String str_skuName, String str_skuPriceXath,
			String str_QuantityXpath, String str_SKUPlusBtnXpath, double cauliflowerMinimumQuantity) throws Exception {

		try {

			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			minWait();
			double skuMinQuantity = cauliflowerMinimumQuantity;
			medWait();
			mClick(str_SKUPlusBtnXpath, "CLick On " + str_skuName + " Plus(+) Button On Mycart Screen");
			minWait();
			int skuQuantity = MyCartGetSKUQuantity(str_skuName, str_QuantityXpath);
			minWait();
			double PLACEORDERvalue = getPrice("PLACEORDER", direct.PLACEORDERValue);

			if (skuMinQuantity * 2 == skuQuantity) {
				System.out.println(
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (skuMinQuantity + "*" + "2") + "=" + (skuMinQuantity * 2));
				logger.log(LogStatus.PASS, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (skuMinQuantity + "*" + "2") + "=" + (skuMinQuantity * 2));

				if ((skuprice * (skuMinQuantity) + this.TOTALPrice) == PLACEORDERvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
							+ (skuprice * (skuMinQuantity) + this.TOTALPrice) + " Is Matched With Total Price"
							+ PLACEORDERvalue);
					logger.log(LogStatus.PASS, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
									+ (skuprice * (skuMinQuantity) + this.TOTALPrice) + " Is Matched With Total Price"
									+ PLACEORDERvalue);
				}

				else {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
							+ (skuprice * (skuMinQuantity) + this.TOTALPrice) + " Doesn't Matched With Total Price"
							+ PLACEORDERvalue);
					logger.log(LogStatus.WARNING, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
									+ (skuprice * (skuMinQuantity) + this.TOTALPrice)
									+ " Doesn't Matched With Total Price" + PLACEORDERvalue);
				}
			} else {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Does Not Matched With Minimum Quantity" + (skuMinQuantity + "*" + "2") + "="
						+ (skuMinQuantity * 2));
				logger.log(LogStatus.WARNING, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity
								+ " Does Not Matched With Minimum Quantity" + (skuMinQuantity + "*" + "2") + "="
								+ (skuMinQuantity * 2));
			}
			this.TOTALPrice = PLACEORDERvalue;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * validateMyCartPriceAfterDoubleClickedOnPlusBtn method will Validate Price
	 * And Quantity For SKU After Double Clicked On Plus Buuton Of SKU On My
	 * Cart Screen
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_MinQuantityXpath
	 *            is Minimum Quantity xpath
	 * @param str_SKUPlusbtnxpath
	 *            is SKUs Plus Button Xpath
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validateMyCartPriceAfterDoubleClickedOnPlusBtn(String str_skuName, String str_skuPriceXath,
			String str_QuantityXpath, String str_SKUPlusbtnxpath, double cauliflowerMinimumQuantity2) throws Exception {

		try {

			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			double skuMinQuantity = cauliflowerMinimumQuantity2;
			medWait();
			mClick(str_SKUPlusbtnxpath, "CLick On " + str_skuName + " Plus(+) Button On Mycart Screen");
			int skuQuantity = MyCartGetSKUQuantity(str_skuName, str_QuantityXpath);
			double PLACEORDERvalue = getPrice("PLACEORDER", direct.PLACEORDERValue);

			if (skuMinQuantity * 3 == skuQuantity) {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Is Matched With Minimum Quantity" + (skuMinQuantity + "*" + "3"));
				logger.log(LogStatus.PASS, "Matched", "Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Is Matched With Minimum Quantity" + (skuMinQuantity + "*" + "3"));

				if ((skuprice * (skuMinQuantity) + this.TOTALPrice) == PLACEORDERvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
							+ (skuprice * (skuMinQuantity) + this.TOTALPrice) + " Is Matched With Total Price"
							+ PLACEORDERvalue);
					logger.log(LogStatus.PASS, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (skuprice + "*" + (skuMinQuantity) + "+" + this.TOTALPrice + "=")
									+ (skuprice * (skuMinQuantity) + this.TOTALPrice) + " Is Matched With Total Price"
									+ PLACEORDERvalue);
				}

				else {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (skuprice + "*" + (skuMinQuantity * 3) + "+" + this.TOTALPrice + "=")
							+ (skuprice * (skuMinQuantity * 3) + this.TOTALPrice) + " Doesn't Matched With Total Price"
							+ PLACEORDERvalue);
					logger.log(LogStatus.WARNING, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (skuprice + "*" + (skuMinQuantity * 3) + "+" + this.TOTALPrice + "=")
									+ (skuprice * (skuMinQuantity * 3) + this.TOTALPrice)
									+ " Doesn't Matched With Total Price" + PLACEORDERvalue);
				}
			} else {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Doesn't Matched With Minimum Quantity" + (skuMinQuantity + "*" + 3) + skuMinQuantity);
				logger.log(LogStatus.WARNING, "Matched", "Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Doesn't Matched With Minimum Quantity" + (skuMinQuantity + "*" + 3) + skuMinQuantity);
			}
			this.TOTALPrice = PLACEORDERvalue;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * validateMyCartPriceAfterClickedOnMinusBtn method will Validate Price And
	 * Quantity For SKU After Clicked On Minus Button Of SKU On My Cart Screen
	 * 
	 * @param str_skuName
	 *            is SKU Name
	 * @param str_skuPriceXath
	 *            is SKU Price Xpath
	 * @param str_QuantityXpath
	 *            is Quantity xpath
	 * @param str_SKUMinusBtnXpath
	 *            is SKUs Minus Button Xpath
	 * 
	 * @param cauliflowerMinimumQuantity
	 *            is globally stored SKUs MinimumQuantity
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validateMyCartPriceAfterClickedOnMinusBtn(String str_skuName, String str_skuPriceXath,
			String str_QuantityXpath, String str_SKUMinusBtnXpath, double cauliflowerMinimumQuantity) throws Exception {

		try {

			double skuprice = getPrice(str_skuName, str_skuPriceXath);
			double skuMinQuantity = cauliflowerMinimumQuantity;
			minWait();
			mClick(str_SKUMinusBtnXpath, "CLick On " + str_skuName + " Minus(-) Button On Mycart Screen");
			int skuQuantity = MyCartGetSKUQuantity(str_skuName, str_QuantityXpath);
			minWait();
			double PLACEORDERvalue = getPrice("PLACEORDER", direct.PLACEORDERValue);

			if (skuMinQuantity * 2 == skuQuantity) {
				System.out.println(
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (skuMinQuantity + "*" + "2") + "= " + (skuMinQuantity * 2));
				logger.log(LogStatus.PASS, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity + " Is Matched With Minimum Quantity"
								+ (skuMinQuantity + "*" + "2") + "= " + (skuMinQuantity * 2));

				if (this.TOTALPrice - (skuprice * (skuMinQuantity)) == PLACEORDERvalue) {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (this.TOTALPrice + " -" + (skuprice + "*" + (skuMinQuantity)) + "=")
							+ (this.TOTALPrice - (skuprice * (skuMinQuantity)) + " Is Matched With Total Price"
									+ PLACEORDERvalue));
					logger.log(LogStatus.PASS, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (this.TOTALPrice + " -" + (skuprice + "*" + (skuMinQuantity)) + "=")
									+ (this.TOTALPrice - (skuprice * (skuMinQuantity)) + " Is Matched With Total Price"
											+ PLACEORDERvalue));
				}

				else {
					System.out.println("Total Value Of " + str_skuName + " "
							+ (this.TOTALPrice + " -" + (skuprice + "*" + (skuMinQuantity)) + "=")
							+ (this.TOTALPrice - (skuprice * (skuMinQuantity)) + " Does Not Matched With Total Price"
									+ PLACEORDERvalue));
					logger.log(LogStatus.WARNING, "Matched",
							"Total Value Of " + str_skuName + " "
									+ (this.TOTALPrice + " -" + (skuprice + "*" + (skuMinQuantity)) + "=")
									+ (this.TOTALPrice - (skuprice * (skuMinQuantity))
											+ " Does Not Matched With Total Price" + PLACEORDERvalue));
				}
			} else {
				System.out.println("Total Quantity Of " + str_skuName + " " + skuQuantity
						+ " Does Not Matched With Minimum Quantity" + (skuMinQuantity + "*" + "2") + "= "
						+ (skuMinQuantity * 2));
				logger.log(LogStatus.WARNING, "Matched",
						"Total Quantity Of " + str_skuName + " " + skuQuantity
								+ " Does Not Matched With Minimum Quantity" + (skuMinQuantity + "*" + "2") + "= "
								+ (skuMinQuantity * 2));
			}
			this.TOTALPrice = PLACEORDERvalue;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * searchSKUInSearchBox method will Enter SKU Name In Search Box And
	 * Validate That Given SKU Is Displaying
	 * 
	 * 
	 * @author Abhijeet
	 */

	public void searchSKUInSearchBox() {

		try {

			mExists(direct.sKUSearchBox, "SKUs Search Box Displayed");
			mEnterTextWithoutClear(direct.sKUSearchBox, "orange", "Enter Orange In Search Box");
			minMinWait();
			mExists(direct.orangeSearchBoxresult, "SearckBox Is Giving Result As Orange(Nagpura)");
			mBackButton();
			minMinWait();
			mBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity method will
	 * Validate That Placed Order SKUs Quantity and Edit Order SKus Quantity Are
	 * Same
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(String str_skuName,
			String str_EditOrderSkuQuantityXpath, int PlacedOrderSkuQuantity) throws Exception {

		minWait();
		scrollDown(str_skuName);
		minWait();

		int EditOrderSkuQuantity = getSKUQuantity(str_skuName, str_EditOrderSkuQuantityXpath);

		if (EditOrderSkuQuantity == PlacedOrderSkuQuantity) {

			System.out.println("Validate That Placed Order Quantity for " + str_skuName + " " + PlacedOrderSkuQuantity
					+ " Is Matched With Edit Order Sku Quantity " + EditOrderSkuQuantity);
			logger.log(LogStatus.PASS, "Matched", "Validate That Placed Order Quantity for " + str_skuName + " "
					+ PlacedOrderSkuQuantity + " Is Matched With Edit Order Sku Quantity " + EditOrderSkuQuantity);
		} else {
			System.out.println("Validate That Placed Order Quantity for " + str_skuName + " " + PlacedOrderSkuQuantity
					+ " Does Not Matched With Edit Order Sku Quantity " + EditOrderSkuQuantity);
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Placed Order Quantity for " + str_skuName + " " + PlacedOrderSkuQuantity
							+ " Does Not Matched With Edit Order Sku Quantity " + EditOrderSkuQuantity);
		}
	}

	/**
	 * validateAllSkusQuantityAfterEditOrder method will Validate All SKUs
	 * Quantity
	 * 
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void validateAllSkusQuantityAfterEditOrder() throws Exception {
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "cauliflower"),
				direct.cauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "lemon"),
				direct.lemonQuantity, this.lemonQuantity);
		scrollDown(fetchDirectData("direct", "tomato"));
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "onion"),
				direct.onionQuantity, this.onionQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "potato"),
				direct.potatoQuantity, this.potatoQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "tomato"),
				direct.tomatoQuantity, this.tomatoQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "corn"), direct.cornQuantity,
				this.cornQuantity);
		mClick(direct.fruitsTab, "CLick On Fruits Tab");
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "apple"),
				direct.appleQuantity, this.appleQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "banana"),
				direct.bananaQuantity, this.bananaQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "chicco"),
				direct.chiccoQuantity, this.chiccoQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "mosambi"),
				direct.mosambiQuantity, this.mosambiQuantity);
		validateSkuQuantityOnEditOrderWithPlacedOrderSkuQuantity(fetchDirectData("direct", "orange"),
				direct.orangeQuantity, this.orangeQuantity);

	}

	/**
	 * searchSKUInSearchBox method will Enter SKU Name In Search Box And
	 * Validate That Given SKU Is Displaying
	 * 
	 * 
	 * @author Abhijeet
	 */

	public void searchSKUAndAddIntoCartAndValidateTotalPrice() {

		try {

			mExists(direct.sKUSearchBox, "SKUs Search Box Displayed");
			mEnterTextWithoutClear(direct.sKUSearchBox, "orange", "Enter Orange In Search Box");
			minWait();
			mExists(direct.orangeSearchBoxresult, "SearckBox Is Giving Result As Orange(Nagpura)");
			mClick(direct.orangePlusButton, "Click On Orangre Plus(+) Button");
			minWait();

			double skuprice = getPrice("Orange", direct.orangePrice);

			int orangeQuantity = getSKUQuantity("Orange", direct.orangeQuantity);

			double orangeQTY = getSkuQty("Orange", direct.orangeSearchQty);

			minWait();
			mExists(direct.cartValueAs10, "Cart Value As 10");

			if (this.orangeQuantity + orangeQTY == orangeQuantity) {
				System.out.println("Total Quantity Of Orange " + orangeQuantity + " Is Matched With "
						+ this.orangeQuantity + "+" + orangeQTY + "=" + (this.orangeQuantity + orangeQTY));

				logger.log(LogStatus.PASS, "Matched", "Total Quantity Of Orange " + orangeQuantity + " Is Matched With "
						+ this.orangeQuantity + "+" + orangeQTY + "=" + (this.orangeQuantity + orangeQTY));

			} else {
				System.out.println("Total Quantity Of Orange " + orangeQuantity + " Does Not Matched With "
						+ this.orangeQuantity + "+" + orangeQTY + "=" + (this.orangeQuantity + orangeQTY));
				logger.log(LogStatus.WARNING, "Matched",
						"Total Quantity Of Orange " + orangeQuantity + " Does Not Matched With " + this.orangeQuantity
								+ "+" + orangeQTY + "=" + (this.orangeQuantity + orangeQTY));
			}

			this.TOTALPrice = (skuprice * orangeQTY) + this.TOTALPrice;

			mBackButton();
			minWait();
			mBackButton();
			minWait();

			double TotalPrice = getPrice("TOTAL", direct.totalPrice);

			if (this.TOTALPrice == TotalPrice) {
				System.out.println("Validate That TOTAL Price " + TotalPrice + " Is Matched With "
						+ (this.orangeQuantity + orangeQTY + "=" + orangeQuantity));

				logger.log(LogStatus.PASS, "Matched", "Validate That TOTAL Price " + TotalPrice + " Is Matched With "
						+ (this.orangeQuantity + orangeQTY + "=" + orangeQuantity));

			} else {
				System.out.println("Validate That TOTAL Price " + TotalPrice + " Does Not Matched With "
						+ (this.orangeQuantity + orangeQTY + "=" + orangeQuantity));
				logger.log(LogStatus.WARNING, "Matched", "Validate That TOTAL Price " + TotalPrice
						+ " Does Not Matched With " + (this.orangeQuantity + orangeQTY + "=" + orangeQuantity));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * orderConfirmedScreenWithEditedSuccessMessage method will Validate All
	 * Mandatory Fields On Order Confirmed Screen With Order Edited Successfully
	 * Message
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void orderConfirmedScreenWithEditedSuccessMessage() throws Exception {
		mExists(direct.orderConfirmedScreen, "Order Confirmed");
		mExists(direct.orderEditedSuccessMsg, "Order Edited Successfully");
		mExists(direct.orderSummaryBtn, "Order Summary Button");

		int editedOrderId = getOrderID(direct.orderID);

		if (editedOrderId == this.createdOrderId) {
			System.out.println("Validate That Created OrderID " + this.createdOrderId + " And Edited OrderID "
					+ editedOrderId + " Is Same");
			logger.log(LogStatus.PASS, "Matched", "Validate That Created OrderID " + this.createdOrderId
					+ " And Edited OrderID " + editedOrderId + " Is Same");
		} else {
			System.out.println("Validate That Created OrderID " + this.createdOrderId + " And Edited OrderID "
					+ editedOrderId + "Is Not Same");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Created OrderID " + this.createdOrderId
					+ " And Edited OrderID " + editedOrderId + " Is Not Same");

		}
	}

	/**
	 * getOrderID method will get the Order ID from the mobile UI
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the Order ID
	 * 
	 * @author Abhijeet
	 */
	public int getOrderID(String str_orderIDXpath) throws Exception {

		WebElement textBox = Appdriver.findElement(By.xpath(str_orderIDXpath));
		String order = textBox.getAttribute("text").replace(" ", "").toUpperCase();
		String[] split = order.split("-");
		System.out.println(split[1]);
		String skuPrice = (split[1]);
		int orderID = Integer.parseInt(skuPrice);
		logger.log(LogStatus.INFO, "getOrderID", "Get The OrderID " + orderID);
		return orderID;

	}

	/**
	 * clickCauliflowerPlusBtnAndValidate method will Click On Cauliflower Plus
	 * Button And Validate All Fields
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 *//*
		 * 
		 * public void truRunPlusBtn(String skuName) throws Exception { ////
		 * android.widget.LinearLayout[android.widget.LinearLayout[android.
		 * widget.TextView[@text='Amaranthus ////
		 * green']]]/following-sibling::android.widget.LinearLayout/android.
		 * widget.LinearLayout/android.widget.ImageView[@index='0'] String
		 * tempPlusBtn =
		 * "//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='"
		 * + skuName +
		 * "']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
		 * String tempMinusBtn =
		 * "//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='"
		 * + skuName +
		 * "']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
		 * ////
		 * android.widget.TextView[@text='Cauliflower']//following-sibling::
		 * android.widget.LinearLayout[1]/android.widget.TextView[1] String
		 * tempSkuPrice = ""; String tempMinQty = ""; String tempSkuQuantity =
		 * "";
		 * 
		 * scrollDown(skuName); minWait(); //
		 * android.widget.TextView[@text='Amaranthus //
		 * green']//following-sibling::android.widget.LinearLayout[2]/android.
		 * widget.TextView[2] String tempMinQuantity =
		 * "//android.widget.TextView[@text='" + skuName +
		 * "']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
		 * 
		 * // this.cauliflowerMinimumQuantity = getSKUQuantity(skuName, //
		 * tempMinQuantity);
		 * 
		 * minWait(); mClick(tempPlusBtn, "Click On " + skuName + " Plus Button"
		 * );
		 * 
		 * validatePriceAfterClickedOnPlusBtn(skuName, tempSkuPrice,
		 * tempMinQuantity, tempSkuQuantity, direct.cartValueAs1); minWait();
		 * mClick(direct.cauliflowerPlusButton,
		 * "Click On Cauliflower Plus Button");
		 * validatePriceAfterDoubleClickedOnPlusBtn("Cauliflower",
		 * direct.cauliflowerPrice, direct.cauliflowerMinQuantity,
		 * direct.cauliflowerQuantity, direct.cartValueAs1,
		 * direct.cauliflowerQty); minWait();
		 * mClick(direct.cauliflowerMinusButton,
		 * "CLick On Cauliflower Minus button");
		 * 
		 * validatePriceAfterClickedOnMinusBtn("Cauliflower",
		 * direct.cauliflowerPrice, direct.cauliflowerMinQuantity,
		 * direct.cauliflowerQuantity, direct.cartValueAs1,
		 * direct.cauliflowerQty);
		 * 
		 * }
		 */
	/**
	 * GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown method
	 * will Navigate To Real Time Stock Tracker Page And Select City,Facility
	 * And Categoty From Drop Down
	 * 
	 * @author Abhijeet
	 */

	public void GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown() {

		getHrefAndLoad(bifrost.realTimeStockTrackerlink);
		minWait();
		exists(bifrost.realtimeStocktrackerPage, "Real Time Stock Tracker Page");
		medWait();
		click(bifrost.cityDrpDwn, "Click On City Drop Down");
		click(bifrost.cityAsBangalore, "Select City As Bangalore");
		medWait();
		click(bifrost.facilityDrpDwn, "Click On Facility Drop Down");
		click(bifrost.bangaloreFcAsFacility, "Select Facility As BangaloreFC");
		minWait();
		click(bifrost.categoryDropDown, "Click On Categoty Drop Down");
		click(bifrost.vagetablesAsCategory, "Select Categoty As Vagetables");
		minWait();
	}

	/**
	 * enterSkuNameAndGetStockValue method will Enter skuName in Search Box And
	 * Get The Stock Value
	 * 
	 * @param str_SkuName
	 *            is SkuName
	 * @param str_skuStockBoxXpath
	 *            is SKUs stockValue Xpath
	 * @author Abhijeet
	 */

	public int searchSkuNameAndGetStockvalue(String str_SkuName, String str_skuStockBoxXpath) {

		enterText(bifrost.searchTextBoxOnRealTimeTrackerPage, str_SkuName, "Enter " + str_SkuName + " In Search Box");

		waitTillElementPresent(str_skuStockBoxXpath);
		medWait();
		WebElement textBox = driver.findElement(By.xpath(str_skuStockBoxXpath));
		String stockValue = textBox.getText().replace(",", "").toUpperCase();
		String[] splitt = stockValue.split(" ");
		minWait();
		String skuvalue = (splitt[0]);
		int skuStockValue = Integer.parseInt(skuvalue);
		// System.out.println(skuStockValue);
		System.out.println("Stock value of " + str_SkuName + " is " + skuStockValue);
		logger.log(LogStatus.INFO, "GetStockValue", "Stock value of " + str_SkuName + " is " + skuStockValue);
		return skuStockValue;
	}

	/**
	 * placeOrderMoreThenSupplyQuantity method will Get The Stock value From
	 * Bifrost And Place Order More Then That From Direct App.
	 * 
	 * @param str_SkuName
	 *            is SkuName
	 * @param str_supplyQuantityBox
	 *            is SKUs stockValue Xpath
	 * @param str_skuQuantity
	 *            is skuQuantityXpath on app
	 * @param str_skuPlusBtn
	 *            is Sku plus button xpath
	 * @param str_globalVariableXpath
	 *            is Gloval Value
	 * 
	 * @author Abhijeet
	 */
	public void placeOrderMoreThenSupplyQuantity(String str_skuName, String str_supplyQuantityBox,
			String str_skuQuantityXpath, String str_skuPlusBtn, int str_globalVariable) throws Exception {
		minWait();
		int StockValue = searchSkuNameAndGetStockvalue(str_skuName, str_supplyQuantityBox);
		scrollDown(str_skuName);
		while (true) {
			int SKUsQuantity = getSKUQuantity(str_skuName, str_skuQuantityXpath);

			if (SKUsQuantity > StockValue + 10) {
				break;
			}
			mClickWithoutWait(str_skuPlusBtn, "Click On " + str_skuName + " Plus (+) Button");
			minWait();

		}

	}

	/**
	 * selectFruitsAsCategory method will Click On Categoty Drop Down And Select
	 * Fruits In Bifrost
	 * 
	 * @author Abhijeet
	 */
	public void selectFruitsAsCategory() {
		click(bifrost.categoryDropDown, "Click On Categoty Drop Down");
		click(bifrost.fruitsAsCategory, "Select Categoty As Fruits");
		minWait();

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForCauliflower method will create
	 * sale order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForCauliflower() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "cauliflower"), bifrost.cauliflowerSupplyBox,
				direct.cauliflowerQuantity, direct.cauliflowerPlusButton, this.cauliflowerQuantity);

		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "cauliflower"), direct.cauliflowerQuantity);
		this.cauliflowerQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForTomato method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForTomato() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "tomato"), bifrost.tomatoSupplyBox,
				direct.tomatoQuantity, direct.tomatoPlusButton, this.tomatoQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "tomato"), direct.tomatoQuantity);
		this.tomatoQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForLemon method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForLemon() throws Exception {
		scrollDown(fetchDirectData("direct", "tomato"));
		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "lemon"), bifrost.lemonSupplyBox,
				direct.lemonQuantity, direct.lemonPlusButton, this.lemonQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "lemon"), direct.lemonQuantity);
		this.lemonQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForOnion method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForOnion() throws Exception {

		scrollDown(fetchDirectData("direct", "tomato"));
		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "onion"), bifrost.onionSupplyBox,
				direct.onionQuantity, direct.onionPlusButtoon, this.onionQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "onion"), direct.onionQuantity);
		this.onionQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForPotato method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForPotato() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "potato"), bifrost.potatoSupplyBox,
				direct.potatoQuantity, direct.potatoPlusButon, this.potatoQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "potato"), direct.potatoQuantity);
		this.potatoQuantity = SKUsQuantity;
	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForCorn method will create sale order
	 * more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForCorn() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "corn"), bifrost.cornSupplyBox, direct.cornQuantity,
				direct.cornPlusButton, this.cornQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "corn"), direct.cornQuantity);
		this.cornQuantity = SKUsQuantity;
	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForApple method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForApple() throws Exception {
		selectFruitsAsCategory();
		mClick(direct.fruitsTab, "Click On Fruits Tab ");
		minWait();
		scrollDown(fetchDirectData("direct", "apple"));
		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "apple"), bifrost.appleSupplyBox,
				direct.appleQuantity, direct.applePlusButton, this.appleQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "apple"), direct.appleQuantity);
		this.appleQuantity = SKUsQuantity;
	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForBanana method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForBanana() throws Exception {
		// first scrolling to mosambi so that later it will scroll to banana
		scrollDown(fetchDirectData("direct", "mosambi"));
		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "banana"), bifrost.bananaSupplyBox,
				direct.bananaQuantity, direct.bananaPlusButton, this.bananaQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "banana"), direct.bananaQuantity);
		this.bananaQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForToMosambi method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForToMosambi() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "mosambi"), bifrost.mosambiSupplyBox,
				direct.mosambiQuantity, direct.mosambiPlusButton, this.mosambiQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "mosambi"), direct.mosambiQuantity);
		this.mosambiQuantity = SKUsQuantity;
		this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);
	}

	/**
	 * placeSaleOrderMoreThanSupplyQuantityForOrange method will create sale
	 * order more Than Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderMoreThanSupplyQuantityForOrange() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "orange"), bifrost.orangeSupplyBox,
				direct.orangeQuantity, direct.orangePlusButton, this.orangeQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "orange"), direct.orangeQuantity);
		this.orangeQuantity = SKUsQuantity;

	}

	/**
	 * validateCartUpdateMessage method will Validate Cart UPdate MEssage With
	 * OK Button
	 * 
	 * @author Abhijeet
	 */

	public static void validateCartUpdateMessage() {
		mExists(direct.cartUpdatedMsg, "Your Cart Has Been Updated Message");
		mExists(direct.OKBtn, "OK Button Displayed");
		mClick(direct.OKBtn, "Click On OK Button");
		mExists(direct.myCartScreen, "My Cart Screen");
	}

	/**
	 * validateSkuQuantityAfterCartRevaluate method will Validate SKUs Quantity
	 * After Cart Revaluating
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	@SuppressWarnings("unused")
	public void validateSkuQuantityAfterCartRevaluate(String str_SkuName, String str_MycartSkuQuantityXpath,
			int int_GlobalVariable) throws Exception {
		medWait();

		scrollDown(str_SkuName);
		int myCartSkuQuantity = MyCartGetSKUQuantity(str_SkuName, str_MycartSkuQuantityXpath);

		if (int_GlobalVariable == myCartSkuQuantity) {

			System.out.println("Validate That  Quantity of " + str_SkuName + int_GlobalVariable
					+ " Is Same After Cart Revaluating" + myCartSkuQuantity);
			logger.log(LogStatus.PASS, "Matched", " Validate That Quantity of " + str_SkuName + int_GlobalVariable
					+ " Is Same After Cart Revaluating" + myCartSkuQuantity);

		} else if (int_GlobalVariable > myCartSkuQuantity) {

			System.out.println("Validate That Revaluated  Quantity of " + str_SkuName + myCartSkuQuantity
					+ " Is Smaller Than Ordered  Quantity " + int_GlobalVariable);
			logger.log(LogStatus.PASS, "Matched", "Validate That Revaluated Quantity of " + str_SkuName
					+ myCartSkuQuantity + " Is Smaller Than Ordered Quantity " + int_GlobalVariable);

		} else {
			System.out.println("Validate That Quantity of " + str_SkuName + int_GlobalVariable
					+ " Is Not Same After Cart Revaluating" + myCartSkuQuantity);
			logger.log(LogStatus.WARNING, "Matched", "Validate That Quantity of " + str_SkuName + int_GlobalVariable
					+ " Is Not Same After Cart Revaluating" + myCartSkuQuantity);
		}

	}

	/**
	 * ValidateTOTALPriceAndCartRevaluatedPriceIsNotSame method will Validate
	 * That TOTAL Price And Cart Revaluated Price Are Not Same
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void ValidateTOTALPriceAndCartRevaluatedPriceIsNotSame() throws Exception {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");
		double skuprice = getPrice("OrderDetailTotalPrice", direct.orderDetailsTotalPrice);
		if (skuprice < this.TOTALPrice) {
			System.out.println(
					"Order Details Total Price " + skuprice + " Is Samller Than TOTAL PRICE " + this.TOTALPrice);
			logger.log(LogStatus.PASS, "Matched",
					"Order Details Total Price " + skuprice + " Is Smaller Than TOTAL PRICE " + this.TOTALPrice);
		} else {
			System.out.println(
					"Order Details Total Price " + skuprice + " Is Not Smaller Then TOTAL  PRICE " + this.TOTALPrice);
			logger.log(LogStatus.WARNING, "Matched",
					"Order Details Total Price " + skuprice + " Is Not Smaller Than TOTAL  PRICE " + this.TOTALPrice);
		}
	}

	/**
	 * placeOrderMoreThenSupplyQuantityAfterClickedEditbutton method will Create
	 * sale Order More Than Supply Quantity
	 * 
	 * @param str_SkuName
	 *            is SkuName
	 * @param str_supplyQuantityBox
	 *            is SKUs stockValue Xpath
	 * @param str_skuQuantity
	 *            is skuQuantityXpath on app
	 * @param str_skuPlusBtn
	 *            is Sku plus button xpath
	 * @param str_globalVariableXpath
	 *            is Gloval Value
	 * 
	 * @author Abhijeet
	 */
	public void placeOrderMoreThenSupplyQuantityAfterClickedEditbutton(String str_skuName, String str_skuQuantityXpath,
			String str_skuPlusBtn) throws Exception {

		scrollDown(str_skuName);
		while (true) {
			int SKUsQuantity = getSKUQuantity(str_skuName, str_skuQuantityXpath);

			if (SKUsQuantity > 100) {

				break;
			}
			mClickWithoutWait(str_skuPlusBtn, "Click On " + str_skuName + " Plus (+) Button");
			minWait();
		}
		this.TOTALPrice = getPrice(str_skuName, direct.totalPrice);
	}

	/**
	 * placeOrderHalfOfSupplyQuantity method will Get The Stock value From
	 * Bifrost And Place Order Half Of That From Direct App.
	 * 
	 * @param str_SkuName
	 *            is SkuName
	 * @param str_supplyQuantityBox
	 *            is SKUs stockValue Xpath
	 * @param str_skuQuantity
	 *            is skuQuantityXpath on app
	 * @param str_skuPlusBtn
	 *            is Sku plus button xpath
	 * @param str_globalVariableXpath
	 *            is Gloval Value
	 * 
	 * @author Abhijeet
	 */
	public void placeOrderHalfOfSupplyQuantity(String str_skuName, String str_supplyQuantityBox,
			String str_skuQuantityXpath, String str_skuPlusBtn, int str_globalVariable) throws Exception {

		int StockValue = searchSkuNameAndGetStockvalue(str_skuName, str_supplyQuantityBox);
		scrollDown(str_skuName);
		while (true) {
			int SKUsQuantity = getSKUQuantity(str_skuName, str_skuQuantityXpath);

			if (SKUsQuantity > (StockValue / 2)) {
				break;
			}
			mClickWithoutWait(str_skuPlusBtn, "Click On " + str_skuName + " Plus (+) Button");
			minWait();
		}
	}

	/**
	 * placeSaleOrderHalfOfSupplyQuantityForlemon method will create sale order
	 * Half Of Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderHalfOfSupplyQuantityForlemon() throws Exception {

		scrollDown(fetchDirectData("direct", "tomato"));
		minWait();
		placeOrderHalfOfSupplyQuantity(fetchDirectData("direct", "lemon"), bifrost.lemonSupplyBox, direct.lemonQuantity,
				direct.lemonPlusButton, this.lemonQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "lemon"), direct.lemonQuantity);
		this.lemonQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderHalfOfSupplyQuantityForTomato method will create sale order
	 * Half Of Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderHalfOfSupplyQuantityForTomato() throws Exception {

		placeOrderHalfOfSupplyQuantity(fetchDirectData("direct", "tomato"), bifrost.tomatoSupplyBox,
				direct.tomatoQuantity, direct.tomatoPlusButton, this.tomatoQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "tomato"), direct.tomatoQuantity);
		this.tomatoQuantity = SKUsQuantity;

	}

	/**
	 * placeSaleOrderHalfOfSupplyQuantityForPotato method will create sale order
	 * Half Of Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderHalfOfSupplyQuantityForPotato() throws Exception {
		scrollDown(fetchDirectData("direct", "tomato"));
		placeOrderHalfOfSupplyQuantity(fetchDirectData("direct", "potato"), bifrost.potatoSupplyBox,
				direct.potatoQuantity, direct.potatoPlusButon, this.potatoQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "potato"), direct.potatoQuantity);
		this.potatoQuantity = SKUsQuantity;
	}

	/**
	 * placeSaleOrderHalfOfSupplyQuantityForOrange method will create sale order
	 * Half Of Supply Quantity And Store SKUs Quantity To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeSaleOrderHalfOfSupplyQuantityForOrange() throws Exception {

		placeOrderHalfOfSupplyQuantity(fetchDirectData("direct", "orange"), bifrost.orangeSupplyBox,
				direct.orangeQuantity, direct.orangePlusButton, this.orangeQuantity);
		int SKUsQuantity = getSKUQuantity(fetchDirectData("direct", "orange"), direct.orangeQuantity);
		this.orangeQuantity = SKUsQuantity;

	}

	/**
	 * validateStockOutTextForSKUs method will Validate StockOut Text For SKUs
	 * 
	 * @author Abhijeet
	 */
	public void validateStockOutTextForSKUs() {
		try {
			mExists(direct.cauliflowerStockOutText, "StockOut Text For cauliflower");
			scrollDown(fetchDirectData("direct", "lemon"));
			mExists(direct.lemonStockOutText, "StockOut Text For Lemon");
			mExists(direct.onionStockOutText, "StockOut Text For Onion");
			mNotExists(direct.tomatoStockOutText, "StockOut Text For Tomato");
			scrollDown(fetchDirectData("direct", "potato"));
			mNotExists(direct.potatoStockOutText, "StockOut Text For Potato");
			scrollDown(fetchDirectData("direct", "corn"));
			mExists(direct.cornStockOutText, "StockOut Text For Corn");
			scrollDown(fetchDirectData("direct", "mosambi"));
			mExists(direct.mosambiStockOutText, "StockOut Text For Mosambi");
			mExists(direct.appleStockOutText, "StockOut Text For Apple");
			mExists(direct.bananaStockOutText, "StockOut Text For Banana");
			scrollDown(fetchDirectData("direct", "orange"));
			mNotExists(direct.orangeStockOutText, "StockOut Text For Orange");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * goToSalePriceManagementPrice method will Navigate To Sale Price
	 * Managament Page
	 * 
	 * @author Abhijeet
	 */
	public void goToSalePriceManagementPrice() {
		try {

			getHrefAndLoad(bifrost.salePriceLink);
			click(bifrost.skuSlabPricing, "Click On Sku Slab Pricinh Tab");
			exists(bifrost.salePriceManagementPage, "Sale Price Management Page");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * uploadSkuSlabsPrice method will upload sku slabs
	 * 
	 * @author Abhijeet
	 */
	public void uploadSkuSlabs(String str_filepath) {
		try {
			minWait();
			clickIfExist(bifrost.removeSlabsBtn, "Click On Remove Slab Button");
			waitTillElementPresent(bifrost.chooseFileBtn);
			minWait();
			WebElement element = driver.findElement(By.xpath(bifrost.chooseFileBtn));
			element.sendKeys(str_filepath);
			System.out.println("Enter SKU Slabs File To Upload After Clicked On Choose File");
			logger.log(LogStatus.INFO, "upload", "Enter SKU Slabs File To Upload After Clicked On Choose File");
			minWait();
			click(bifrost.uploadCSVBtn, "Click On Upload CSV Button");
			exists(bifrost.successMsg, "Success Message");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * getSkuSlabValue method will Fetch Slab Value
	 * 
	 * @author Abhijeet
	 * @return
	 */
	public double getSkuSlabValue(String str_skuSlabXpath) {

		waitTillMElementPresent(str_skuSlabXpath);
		minWait();
		WebElement textBox = Appdriver.findElement(By.xpath(str_skuSlabXpath));
		String[] slab = textBox.getText().split(" ");
		String slabValue = slab[slab.length - 1].replace("Pcs", "").replace("Kg", "").replace(")", "").toUpperCase();
		System.out.println(slabValue);
		double skuSlabValue = Double.parseDouble(slabValue);
		return skuSlabValue;

	}

	/**
	 * getSkuSlabValue method will Fetch Slab Price
	 * 
	 * @author Abhijeet
	 */
	public double getSkuSlabPrice(String str_skuSlabXpath) {

		waitTillMElementPresent(str_skuSlabXpath);
		minWait();
		WebElement textBox = Appdriver.findElement(By.xpath(str_skuSlabXpath));

		String[] slabPrice = textBox.getText().split(" ");
		String Price = slabPrice[slabPrice.length - 3].replace("/Pcs", "").replace("/Kg", "").toUpperCase();
		System.out.println(Price);
		double skuSlabPrice = Double.parseDouble(Price);
		return skuSlabPrice;
	}

	/**
	 * createSupplyQuantityForCauliflowerForSlab method will create sale order
	 * equals to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForCauliflowerForSlab() {
		try {
			double cauliflowerSlabValue = getSkuSlabValue(direct.cauliflowerSlab);
			this.cauliflowerSlabPrice = getSkuSlabPrice(direct.cauliflowerSlab);

			while (true) {
				this.cauliflowerQuantity = getSKUQuantity("Cauliflower", direct.cauliflowerQuantity);
				if (cauliflowerSlabValue <= this.cauliflowerQuantity) {
					break;
				}
				mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
				minWait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * createSupplyQuantityForLemonForSlab method will create sale order equals
	 * to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForLemonForSlab() {
		try {
			scrollDown(fetchDirectData("direct", "lemon"));

			double lemonSlabValue = getSkuSlabValue(direct.lemonSlab);
			this.lemonSlabPrice = getSkuSlabPrice(direct.lemonSlab);

			while (true) {
				this.lemonQuantity = getSKUQuantity("Lemon", direct.lemonQuantity);
				if (lemonSlabValue <= this.lemonQuantity) {
					break;
				}
				mClick(direct.lemonPlusButton, "Click On Lemon Plus Button");
				minWait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * createSupplyQuantityForOnionForSlab method will create sale order equals
	 * to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForOnionForSlab() {
		try {
			scrollDown(fetchDirectData("direct", "potato"));
			minWait();
			double onionSlabValue = getSkuSlabValue(direct.onionSlab);
			this.onionSlabPrice = getSkuSlabPrice(direct.onionSlab);

			while (true) {
				this.onionQuantity = getSKUQuantity("onion", direct.onionQuantity);
				if (onionSlabValue <= this.onionQuantity) {
					break;
				}
				mClick(direct.onionPlusButtoon, "Click On Onion Plus Button");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * createSupplyQuantityForPotatoForSlab method will create sale order equals
	 * to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForPotatoForSlab() {
		try {
			scrollDown(fetchDirectData("direct", "potato"));
			minWait();
			double potatoSlabValue = getSkuSlabValue(direct.potatoSlab);
			this.potatoSlabPrice = getSkuSlabPrice(direct.potatoSlab);

			while (true) {
				this.potatoQuantity = getSKUQuantity("potato", direct.potatoQuantity);
				if (potatoSlabValue <= this.potatoQuantity) {
					break;
				}
				mClick(direct.potatoPlusButon, "Click On Potato Plus Button");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * createSupplyQuantityForPotatoForSlab method will create sale order equals
	 * to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForTomatoForSlab() {
		try {
			scrollDown(fetchDirectData("direct", "tomato"));
			minWait();
			double tomatoSlabValue = getSkuSlabValue(direct.tomatoSlab);
			this.tomatoSlabPrice = getSkuSlabPrice(direct.tomatoSlab);

			while (true) {
				this.tomatoQuantity = getSKUQuantity("tomato", direct.tomatoQuantity);
				if (tomatoSlabValue <= this.tomatoQuantity) {
					break;
				}
				mClick(direct.tomatoPlusButton, "Click On Tomato Plus Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * createSupplyQuantityForAppleForSlab method will create sale order equals
	 * to slab value
	 * 
	 * @author Abhijeet
	 */
	public void createSupplyQuantityForAppleForSlab() {
		try {
			mClick(direct.fruitsTab, "CLick on fruits Tab");
			minWait();
			double appleSlabValue = getSkuSlabValue(direct.appleSlab);
			this.appleSlabPrice = getSkuSlabPrice(direct.appleSlab);

			while (true) {
				this.appleQuantity = getSKUQuantity("apple", direct.appleQuantity);
				if (appleSlabValue <= this.appleQuantity) {
					break;
				}
				mClick(direct.applePlusButton, "Click On Apple Plus Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * validateSkuQuantityOnMyCartScreen method will Validate Order Quantity Of
	 * Sku with My-cart Screen Quantity
	 * 
	 * @author Abhijeet
	 */
	public void validateSkuQuantityOnMyCartScreen(String str_SkuName, String str_MycartSkuQuantityXpath,
			int int_GlobalVariableSkuQuantity) {
		try {

			scrollDown(fetchDirectData("direct", str_SkuName));

			int myCartSkuQuantity = MyCartGetSKUQuantity(str_SkuName, str_MycartSkuQuantityXpath);

			if (int_GlobalVariableSkuQuantity == myCartSkuQuantity) {

				System.out
						.println("Validate That  Quantity of " + str_SkuName + " On My-Cart Screen " + myCartSkuQuantity
								+ " Is Same As Creating Sale Order Quantity " + int_GlobalVariableSkuQuantity);
				logger.log(LogStatus.PASS, "Matched",
						"Validate That  Quantity of " + str_SkuName + " On My-Cart Screen " + myCartSkuQuantity
								+ " Is Same As Creating Sale Order Quantity " + int_GlobalVariableSkuQuantity);
			} else {

				System.out
						.println("Validate That  Quantity of " + str_SkuName + " On My-Cart Screen " + myCartSkuQuantity
								+ " Is Not Same As Creating Sale Order Quantity " + int_GlobalVariableSkuQuantity);
				logger.log(LogStatus.WARNING, "Matched",
						"Validate That  Quantity of " + str_SkuName + " On My-Cart Screen " + myCartSkuQuantity
								+ " Is Not Same As Creating Sale Order Quantity " + int_GlobalVariableSkuQuantity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * clickOnOrderSummaryBtnAndValidateOrderDetailsScreen method will Validate
	 * Order Detials Screen
	 * 
	 * @author Abhijeet
	 * 
	 */

	public void clickOnOrderSummaryBtnAndValidateOrderDetailsScreen() {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");

	}

	/**
	 * ValidateTotalPriceOnOrderDetailsBasedOnSlabPrice method will Validate
	 * Total Price On Order Details Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public double ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice(String str_skuName,
			String str_OrderDetailsSkuPriceXpath, double dbl_GlobalSlabPrice, int int_globalSkuQuantity)
			throws Exception {

		double skuPrice = getPrice("orderDetails" + str_skuName, str_OrderDetailsSkuPriceXpath);
		if ((dbl_GlobalSlabPrice * int_globalSkuQuantity) == skuPrice) {

			System.out.println("Validate That " + str_skuName + " My-Cart Quantity " + int_globalSkuQuantity + " * "
					+ dbl_GlobalSlabPrice + " =" + skuPrice + " Is As Slab Price");
			logger.log(LogStatus.INFO, "Matched", "Validate That " + str_skuName + " Quantity " + int_globalSkuQuantity
					+ " * " + dbl_GlobalSlabPrice + " =" + skuPrice + " Is As Slab Price");
		} else {

			System.out.println("Validate That " + str_skuName + " My-Cart Quantity " + int_globalSkuQuantity + " * "
					+ dbl_GlobalSlabPrice + " =" + skuPrice + " Is Not As Slab Price");
			logger.log(LogStatus.WARNING, "Matched", "Validate That " + str_skuName + " Quantity "
					+ int_globalSkuQuantity + " * " + dbl_GlobalSlabPrice + " =" + skuPrice + " Is Not As Slab Price");
		}
		return skuPrice;

	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfCauliflowerToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfCauliflowerToChechRevaluateCartSlabPrice() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "cauliflower"), bifrost.cauliflowerSupplyBox,
				direct.cauliflowerQuantity, direct.cauliflowerPlusButton, this.cauliflowerQuantity);

		this.cauliflowerSlabPrice = getSkuSlabPrice(direct.cauliflowerSlab);
		this.cauliflowerQuantity = getSKUQuantity("Cauliflower", direct.cauliflowerQuantity);

	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfLemonToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfLemonToCheckRevaluateCartSlabPrice() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "lemon"), bifrost.lemonSupplyBox,
				direct.lemonQuantity, direct.lemonPlusButton, this.lemonQuantity);

		this.lemonSlabPrice = getSkuSlabPrice(direct.lemonSlab);
		this.lemonQuantity = getSKUQuantity("Lemon", direct.lemonQuantity);

	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfOnionToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfOnionToCheckRevaluateCartSlabPrice() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "onion"), bifrost.onionSupplyBox,
				direct.onionQuantity, direct.onionPlusButtoon, this.onionQuantity);

		this.onionSlabPrice = getSkuSlabPrice(direct.onionSlab);
		this.onionQuantity = getSKUQuantity("Onion", direct.onionQuantity);
	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfPotatoToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfPotatoToCheckRevaluateCartSlabPrice() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "potato"), bifrost.potatoSupplyBox,
				direct.potatoQuantity, direct.potatoPlusButon, this.potatoQuantity);

		this.potatoSlabPrice = getSkuSlabPrice(direct.potatoSlab);
		this.potatoQuantity = getSKUQuantity("Potato", direct.potatoQuantity);
	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfTomatoToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfTomatoToCheckRevaluateCartSlabPrice() throws Exception {

		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "tomato"), bifrost.tomatoSupplyBox,
				direct.tomatoQuantity, direct.tomatoPlusButton, this.tomatoQuantity);

		this.tomatoSlabPrice = getSkuSlabPrice(direct.tomatoSlab);
		this.tomatoQuantity = getSKUQuantity("Tomato", direct.tomatoQuantity);
	}

	/**
	 * saleOrderMoreThanSupplyQuantityOfApplyToChechRevaluateCartSlabPrice
	 * method will create sale order more Than Supply Quantity And Store SKUs
	 * slab price To Global.
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void saleOrderMoreThanSupplyQuantityOfApplyToCheckRevaluateCartSlabPrice() throws Exception {
		selectFruitsAsCategory();
		mClick(direct.fruitsTab, "Click On Fruits Tab");
		placeOrderMoreThenSupplyQuantity(fetchDirectData("direct", "apple"), bifrost.appleSupplyBox,
				direct.appleQuantity, direct.applePlusButton, this.appleQuantity);

		this.appleSlabPrice = getSkuSlabPrice(direct.appleSlab);
		this.appleQuantity = getSKUQuantity("Apple", direct.appleQuantity);

	}

	/**
	 * validateQuantityAfterCartRevaluate method will Validate SKUs Quantity
	 * After Cart Revaluating And Globally Store MyCart Sku quantity Value
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	@SuppressWarnings("unused")
	public int validateQuantityAfterCartRevaluate(String str_SkuName, String str_MycartSkuQuantityXpath,
			int int_GlobalVariable) throws Exception {
		minWait();
		scrollDown(fetchDirectData("direct", str_SkuName));
		int mycartSkuQuantity = MyCartGetSKUQuantity(str_SkuName, str_MycartSkuQuantityXpath);

		if (int_GlobalVariable > mycartSkuQuantity) {

			System.out.println("Validate That Revaluated  Quantity of " + str_SkuName + mycartSkuQuantity
					+ " Is Smaller Than Ordered  Quantity " + int_GlobalVariable);
			logger.log(LogStatus.PASS, "Matched", "Validate That Revaluated Quantity of " + str_SkuName
					+ mycartSkuQuantity + " Is Smaller Than Ordered Quantity " + int_GlobalVariable);

		} else {
			System.out.println("Validate That Revaluated  Quantity of " + str_SkuName + mycartSkuQuantity
					+ " Is Not Smaller Than Ordered  Quantity " + int_GlobalVariable);
			logger.log(LogStatus.WARNING, "Matched", "Validate That Revaluated Quantity of " + str_SkuName
					+ mycartSkuQuantity + " Is Not Smaller Than Ordered Quantity " + int_GlobalVariable);

		}
		return mycartSkuQuantity;
	}

	/**
	 * getSlabRevaluatedPrice method will create sale order equals to slab value
	 * 
	 * @author Abhijeet
	 */
	public void validateSkuPriceIsSameForEditSaleOrder(String str_skuName, double str_globalSkuPrice,
			String str_currentSkuPrice) {
		try {
			scrollDown(fetchDirectData("direct", str_skuName));
			double currentSkuprice = getSkuSlabPrice(str_currentSkuPrice);

			if (str_globalSkuPrice == currentSkuprice) {
				System.out.println("Validate That " + str_skuName + " Creating Sales Order Price(" + str_globalSkuPrice
						+ ") Is Still Same(" + currentSkuprice + ") For Edit Order After Price Revaluating");
				logger.log(LogStatus.PASS, "Matched",
						"Validate That " + str_skuName + " Creating Sales Order Price(" + str_globalSkuPrice
								+ ") Is Still Same(" + currentSkuprice + ") For Edit Order After Price Revaluating");

			} else {
				System.out.println("Validate That " + str_skuName + " Creating Sales Order Price(" + str_globalSkuPrice
						+ ") Is Not Same(" + currentSkuprice + ") For Edit Order After Price Revaluating");
				logger.log(LogStatus.WARNING, "Matched",
						"Validate That " + str_skuName + " Creating Sales Order Price(" + str_globalSkuPrice
								+ ") Is Not Same(" + currentSkuprice + ") For Edit Order After Price Revaluating");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * placeOrderForLessThan1000AndValidateErrorMessage method will Create Sale
	 * Order Less Than 1000 And Validate Error Message
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForLessThan1000AndValidateErrorMessage() throws Exception {

		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		while (true) {
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			if ((totalvalue + 100 <= 1000) && (totalvalue + 100 >= 800)) {

				break;
			}
			mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		}
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		mExists(direct.minimumOrderValueAlertMsg, "'Minimum order value Rs 1000.0' Displayed");
	}

	/**
	 * placeOrderForMoreThan1000AndValidateSuccess method will Create Sale Order
	 * More Than 1000 And Validate Success Message
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan1000AndValidateSuccess() throws Exception {
		minWait();
		mClick(direct.myCartCauliflowerPlusButton, "Click On My-Cart Cauliflower Plus Button");
		while (true) {
			double PlaceOrderValue = getPrice("TOTAL", direct.PLACEORDERValue);
			if ((PlaceOrderValue > 1000)) {

				break;
			}
			mClick(direct.myCartCauliflowerPlusButton, "Click On My-Cart Cauliflower Plus Button");
		}
		this.TOTALPrice = getPrice("TOTAL", direct.PLACEORDERValue);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
	}

	/**
	 * placeOrderForLessThan1000AndValidateErrorMessage method will Create Sale
	 * Order Less Than 1000 And Validate Error Message
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan1000AndValidateCartRevaluate() throws Exception {

		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		while (true) {
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			if ((totalvalue > 1000)) {

				break;
			}
			mClick(direct.cauliflowerPlusButton, "Click On Cauliflower Plus Button");
		}

	}

	/**
	 * placeOrderForMoreThan1000AndValidateSuccess method will Create Sale Order
	 * Less Than 1000 And Validate Error Message
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void AddMoreSkuQuantityAndValidateSuccess() throws Exception {

		mClick(direct.fruitsTab, "Click On Fruits Tab");
		mClick(direct.applePlusButton, "Click On Apple Plus Button");
		while (true) {
			double totalvalue = getPrice("TOTAL", direct.totalPrice);
			if ((totalvalue > 1000)) {

				break;
			}
			mClick(direct.applePlusButton, "Click On Apple Plus Button");
		}
		this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);
	}

	/**
	 * createSaleOrderOf10LotsForCabbage method will create Sale order For
	 * Cabbage Of 10 Lots
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void createSaleOrderOf10LotsForCabbage() {

		while (true) {
			int cabbageQuantity = getSKUQuantity("Cabbage", direct.cabbageQuantity);
			if ((cabbageQuantity >= 30)) {

				break;
			}
			mClick(direct.cabbagePlusBtn, "Click On Cabbage Plus Button");
		}

	}

	/**
	 * placeOrderForMoreThan5000AndValidateDiscount method will Create Sale More
	 * Than 5000 And Validate Discount Of 10%
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan5000AndValidateDiscount() throws Exception {

		mClick(direct.fruitsTab, "Click On Friuts Tab ");
		while (true) {
			this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);
			if ((this.TOTALPrice > 5000)) {
				break;
			}
			mClickWithoutWait(direct.applePlusButton, "Click On Apple Plus Button");
		}

		double discountPrice = getPrice("TOTAL", direct.discountPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * 10 / 100) == discountPrice) {

			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		} else {
			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		}
	}

	/**
	 * createSaleOrderOf10LotsForCabbage method will create Sale order For
	 * Cabbage Of 10 Lots
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void validateMyCartPLACEORDERPriceWithTOTALPrice(int int_percent) {
		double PlaceOrderdiscountedPrice = getPrice("PLACEORDER", direct.PLACEORDERDiscountedPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * int_percent / 100) == PlaceOrderdiscountedPrice) {

			System.out.println(
					"Validate That Total Price After RS 5000 (" + PlaceOrderdiscountedPrice + ") Is Displaying As "
							+ int_percent + "% Discount Of Actual Price(" + this.TOTALPrice + ") On My-Cart Screen");
			logger.log(LogStatus.PASS, "Matched",
					"Validate That Total Price After RS 5000 (" + PlaceOrderdiscountedPrice + ") Is Displaying As "
							+ int_percent + "% Discount Of Actual Price(" + this.TOTALPrice + ") On My-Cart Screen");
		} else {
			System.out.println("Validate That Total Price After RS 5000 (" + PlaceOrderdiscountedPrice
					+ ") Does Not Displaying As " + int_percent + "% Discount Of Actual Price(" + this.TOTALPrice
					+ ") On My-Cart Screen");
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Total Price After RS 5000 (" + PlaceOrderdiscountedPrice
							+ ") Does Not Displaying As " + int_percent + "% Discount Of Actual Price("
							+ this.TOTALPrice + ") On My-Cart Screen");
		}

	}

	/**
	 * ValidateTotalDiscountPriceOnOrderDetailsScreen method will Validate Total
	 * Discounted Price On Order Details Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void ValidateTotalDiscountPriceOnOrderDetailsScreen() throws Exception {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");
		double skuprice = getPrice("OrderDetailTotalPrice", direct.orderDetailsTotalPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * 10 / 100) == skuprice) {
			System.out.println("Validate That Total Price After RS 5000 (" + skuprice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice
					+ ") On Order Details Screen");
			logger.log(LogStatus.PASS, "Matched",
					"Validate That Total Price After RS 5000 (" + skuprice
							+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice
							+ ") On Order Details Screen");
		} else {
			System.out.println("Validate That Total Price After RS 5000 (" + skuprice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice
					+ ") On Order Details Screen");
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Total Price After RS 5000 (" + skuprice
							+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice
							+ ") On Order Details Screen");

		}
	}

	/**
	 * loginToDirectAppAndAvoidPopUp method Login to the NinjaCart Application
	 * And Click On Discount Popup If Display
	 *
	 * @author Abhijeet
	 */

	public static void loginToDirectAppAndAvoidPopUp(String str_UN, String str_PSW, String str_xpath) {
		try {

			mEnterText(direct.mUserName, str_UN, "Enter mUserName In Text Box" + " " + str_UN);
			hideKeyword();
			mEnterText(direct.mPassword, str_PSW, "Enter mPassword In Text Box" + " " + str_PSW);
			hideKeyword();
			mClick(direct.mLoginBtn, "Click On Login Button");
			medWait();
			mClickIfExist(str_xpath, "Click On Popup If Displayed ");
			mExists(direct.directAppHomeScreen, "Home Screen");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * placeOrderForMoreThan5000AndValidateDiscountForpotato method will Create
	 * Sale More Than 5000 And Validate Discount Of 10%
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan5000AndValidateDiscountForPotato() throws Exception {
		scrollDown(fetchDirectData("direct", "potato"));
		mClick(direct.potatoPlusButon, "Click On Potato Plus Button");
		mClick(direct.potatoPlusButon, "Click On Potato Plus Button");
		while (true) {
			this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);
			if ((this.TOTALPrice > 5000)) {
				break;
			}
			mClickWithoutWait(direct.potatoPlusButon, "Click On Potato Plus Button");
		}

		double discountPrice = getPrice("TOTAL", direct.discountPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * 10 / 100) == discountPrice) {

			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		} else {
			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		}
	}

	/**
	 * validateThatAfterCartRevaluatedDiscountIsNotApplicable method will
	 * Valodate That After Cart Revaluate Discount Is Not Applicable
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void validateThatAfterCartRevaluatedDiscountIsNotApplicable() throws Exception {
		scrollDown(fetchDirectData("direct", "potato"));
		int potatoQuantity = getSKUQuantity("potato", direct.potatoQuantity);
		double potatoPrice = getPrice("potato", direct.potatoPrice);
		double TOTALPrice = getPrice("TOTALPrice", direct.totalPrice);

		if (potatoQuantity * potatoPrice == TOTALPrice) {
			System.out.println("Validate That Total Price(" + TOTALPrice + ") Is Displaying As Potato Quantity("
					+ potatoQuantity + ")*(" + potatoPrice + ")Potato Price");
			logger.log(LogStatus.PASS, "Matched", "Validate That Total Price(" + TOTALPrice
					+ ") Is Displaying As Potato Quantity(" + potatoQuantity + ")*(" + potatoPrice + ")Potato Price");
		} else {
			System.out.println("Validate That Total Price(" + TOTALPrice + ") Does Not Displaying As Potato Quantity("
					+ potatoQuantity + ")*(" + potatoPrice + ")Potato Price");
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Total Price(" + TOTALPrice + ") Does Not Displaying As Potato Quantity("
							+ potatoQuantity + ")*(" + potatoPrice + ")Potato Price");

		}

	}

	/**
	 * placeOrderForMoreThan8000AndValidateDiscount method will Create Sale More
	 * Than 8000 And Validate Discount Of 10%
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan9000AndValidateDiscount() throws Exception {

		mClick(direct.fruitsTab, "Click On Friuts Tab ");
		while (true) {
			this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);

			if ((this.TOTALPrice > 9000)) {
				break;
			}

			mClickWithoutWait(direct.applePlusButton, "Click On Apple Plus Button");
		}

		double discountPrice = getPrice("TOTAL", direct.discountPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * 10 / 100) == discountPrice) {

			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Is Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		} else {
			System.out.println("Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Total Price After RS 5000 (" + discountPrice
					+ ") Does Not Displaying As 10% Discount Of Actual Price(" + this.TOTALPrice + ")");
		}
	}

	/**
	 * clickOnAppleMinusButtonAndValidateNoDiscount method will click on Apple
	 * Minus Button and Validate That Customer
	 * 
	 *
	 * @author Abhijeet
	 */

	public void clickOnAppleMinusButtonAndValidateNoDiscount() {
		try {
			mClick(direct.fruitsTab, "Click On fruits Tab");
			mClick(direct.appleMinusButton, "Click On Apple Minus Button");
			minMinWait();
			int appleQuantity = getSKUQuantity("Apple", direct.appleQuantity);
			double applePrice = getPrice("apple", direct.applePrice);
			double totalPrice = getPrice("TOTAL", direct.totalPrice);
			if ((this.potatoSlabPrice * this.potatoQuantity) + (appleQuantity * applePrice) == totalPrice) {

				System.out.println(
						"Validate That After Reducing Quantity In Edit Case Below Rs5000, User Is Not Getting Any Discount And Price Is Calculating Based On Base Price("
								+ ((this.potatoSlabPrice * this.potatoQuantity) + (appleQuantity * applePrice) + "="
										+ totalPrice)
								+ ")");
				logger.log(LogStatus.PASS, "Matched",
						"Validate That After Reducing Quantity In Edit Case Below Rs5000, User Is Not Getting Any Discount And Price Is Calculating Based On Base Price("
								+ ((this.potatoSlabPrice * this.potatoQuantity) + (appleQuantity * applePrice) + "="
										+ totalPrice)
								+ ")");

			} else {
				System.out.println(
						"Validate That After Reducing Quantity In Edit Case Below Rs5000, User Is Getting Discount And Price Is Calculating Based On Base Price("
								+ ((this.potatoSlabPrice * this.potatoQuantity) + (appleQuantity * applePrice) + "="
										+ totalPrice)
								+ ")");
				logger.log(LogStatus.WARNING, "Matched",
						"Validate That After Reducing Quantity In Edit Case Below Rs5000, User Is Getting Any Discount And Price Is Calculating Based On Base Price("
								+ ((this.potatoSlabPrice * this.potatoQuantity) + (appleQuantity * applePrice) + "="
										+ totalPrice)
								+ ")");

			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();

		}
	}

	/**
	 * placeOrderForMoreThan9000AndValidate15PercentDiscount method will Create
	 * Sale More Than 9000 And Validate Discount Of 15%
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */
	public void placeOrderForMoreThan9000AndValidate15PercentDiscount() throws Exception {

		mClick(direct.fruitsTab, "Click On Friuts Tab ");
		mClick(direct.applePlusButton, "Click On Apple Plus Button");
		while (true) {
			this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);

			if ((this.TOTALPrice > 9000)) {
				break;
			}

			mClickWithoutWait(direct.applePlusButton, "Click On Apple Plus Button");
		}

		double discountPrice = getPrice("TOTAL", direct.discountPrice);
		if (this.TOTALPrice - ((this.TOTALPrice) * 15 / 100) == discountPrice) {

			System.out.println("Validate That Total Price After RS 9000 (" + discountPrice
					+ ") Is Displaying As 15% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Total Price After RS 9000 (" + discountPrice
					+ ") Is Displaying As 15% Discount Of Actual Price(" + this.TOTALPrice + ")");
		} else {
			System.out.println("Validate That Total Price After RS 9000 (" + discountPrice
					+ ") Does Not Displaying As 15% Discount Of Actual Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Total Price After RS 9000 (" + discountPrice
					+ ") Does Not Displaying As 15% Discount Of Actual Price(" + this.TOTALPrice + ")");
		}
	}

	/**
	 * ValidateTotalPercentDiscountPriceOnOrderDetailsScreen method will
	 * Validate Total Discounted Price On Order Details Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(int int_percentValue) throws Exception {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");
		double subTotalValue = getValue("SubTotal", direct.subTotal);
		double discountValue = getValue("Discount", direct.discount);
		double skuprice = getPrice("OrderDetailTotalPrice", direct.orderDetailsTotalPrice);

		if (this.TOTALPrice == subTotalValue) {

			System.out.println("Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Same As TOTAL Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Same As TOTAL Price(" + this.TOTALPrice + ")");
		} else {
			System.out.println("Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Not Same As TOTAL Price(" + this.TOTALPrice + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Not Same As TOTAL Price(" + this.TOTALPrice + ")");
		}

		if (((this.TOTALPrice) * int_percentValue / 100) == discountValue) {

			System.out.println("Validate That Order Details Discount Price(" + discountValue + ") Is Equals To "
					+ int_percentValue + "%(" + discountValue + ") Of Total Price(" + (this.TOTALPrice) + ")");
			logger.log(LogStatus.PASS, "Matched",
					"Validate That Order Details Discount Price(" + discountValue + ") Is Equal To " + int_percentValue
							+ "%(" + discountValue + ") Of Total Price(" + (this.TOTALPrice) + ")");
		} else {

			System.out.println("Validate That Order Details Discount Price(" + discountValue + ") Is Not Equals To "
					+ int_percentValue + "%(" + discountValue + ") Of Total Price(" + (this.TOTALPrice) + ")");
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Order Details Discount Price(" + discountValue + ") Is Not Equals To "
							+ int_percentValue + "%(" + discountValue + ") Of Total Price(" + (this.TOTALPrice) + ")");
		}

		if ((subTotalValue - discountValue) == skuprice) {
			System.out.println("Validate That Total Price (" + skuprice + ") Is Displaying As" + int_percentValue
					+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen");

			logger.log(LogStatus.PASS, "Matched", ("Validate That Total Price (" + skuprice + ") Is Displaying As"
					+ int_percentValue + "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen"));
		} else {
			System.out.println("Validate That Total Price (" + skuprice + ") Is Not Displaying As" + int_percentValue
					+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen");

			logger.log(LogStatus.WARNING, "Matched",
					("Validate That Total Price (" + skuprice + ") Is Not Displaying As" + int_percentValue
							+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen"));
		}
	}

	/**
	 * getValue method will get the Value from the mobile UI
	 * 
	 * @param ObjXpath
	 *            is describes the Xpath of the WebElement
	 * 
	 * @author Abhijeet
	 */
	public double getValue(String skuName, String ObjXpath) {
		WebElement textBox = Appdriver.findElement(By.xpath(ObjXpath));
		String value = textBox.getAttribute("text").replace(" ", "").replace("-", "").toUpperCase();
		System.out.println(value);
		double Value1 = Double.parseDouble(value);
		logger.log(LogStatus.INFO, "getValue", "Get The getValue Of " + skuName + " " + Value1);
		return Value1;

	}

	/**
	 * ValidateTotalPercentDiscountPriceOnOrderDetailsScreenAfterCartRevaluate
	 * method will Validate Total Discounted Price On Order Details Screen
	 * 
	 * @author Abhijeet
	 * @throws Exception
	 */

	public void ValidateTotalPercentDiscountPriceOnOrderDetailsScreenAfterCartRevaluate(int int_percentValue)
			throws Exception {
		mClick(direct.orderSummaryBtn, "CLick On Order Summary Button");
		mExists(direct.orderDetailsScreen, "Order Details");
		double subTotalValue = getValue("SubTotal", direct.subTotal);
		double discountValue = getValue("Discount", direct.discount);
		double skuprice = getPrice("OrderDetailTotalPrice", direct.orderDetailsTotalPrice);
		// int appleStockValue =
		// searchSkuNameAndGetStockvalue(fetchDirectData("direct", "apple"),
		// bifrost.appleSupplyBox);
		if (this.appleSlabPrice * 50 == subTotalValue) {

			System.out.println("Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Same As Multiple Of Apple Quantity And Price(" + this.appleSlabPrice * 50 + ")");
			logger.log(LogStatus.PASS, "Matched", "Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Same As Multiple Of Apple Quantity And Price(" + this.appleSlabPrice * 50 + ")");
		} else {
			System.out.println("Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Not Same As Multiple Of Apple Quantity And Price(" + this.appleSlabPrice * 50 + ")");
			logger.log(LogStatus.WARNING, "Matched", "Validate That Order Details SubTotal Price(" + subTotalValue
					+ ") Is Not Same As Multiple Of Apple Quantity And Price(" + this.appleSlabPrice * 50 + ")");

		}
		if (((subTotalValue) * int_percentValue / 100) == discountValue) {

			System.out.println("Validate That Order Details Discount Price(" + discountValue + ") Is Equals To "
					+ int_percentValue + "%(" + discountValue + ") Of Sub Total(" + (subTotalValue) + ")");
			logger.log(LogStatus.PASS, "Matched",
					"Validate That Order Details Discount Price(" + discountValue + ") Is Equals To " + int_percentValue
							+ "%(" + discountValue + ") Of Sub Total(" + (subTotalValue) + ")");
		} else {

			System.out.println("Validate That Order Details Discount Price(" + discountValue + ") Is Not Equals To "
					+ int_percentValue + "%(" + discountValue + ") Of Sub Total(" + (subTotalValue) + ")");
			logger.log(LogStatus.WARNING, "Matched",
					"Validate That Order Details Discount Price(" + discountValue + ") Is Not Equals To "
							+ int_percentValue + "%(" + discountValue + ") Of Sub Total(" + (subTotalValue) + ")");
		}

		if ((subTotalValue - discountValue) == skuprice) {
			System.out.println("Validate That Total Price (" + skuprice + ") Is Displaying As" + int_percentValue
					+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen");

			logger.log(LogStatus.PASS, "Matched", ("Validate That Total Price (" + skuprice + ") Is Displaying As"
					+ int_percentValue + "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen"));
		} else {
			System.out.println("Validate That Total Price (" + skuprice + ") Is Not Displaying As" + int_percentValue
					+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen");

			logger.log(LogStatus.WARNING, "Matched",
					("Validate That Total Price (" + skuprice + ") Is Not Displaying As" + int_percentValue
							+ "% Discount Of Actual Price(" + subTotalValue + ") On Order Details Screen"));
		}

	}

	/**
	 * launchAndLoginToBiFrost method launch Only Bifrost And login to Bifrost
	 * 
	 * @param str_URL
	 *            is URL
	 * @param str_UN
	 *            is UserName
	 * @param str_PSW
	 *            is Password
	 * @author Abhijeet
	 */

	public static void launchAndLoginToBiFrost(String str_URL, String str_UN, String str_PSW) {

		try {

			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
			driver = new ChromeDriver();
			minWait();
			//Dimension a=driver.manage().window().getSize();
			
			loadURL(str_URL);
			waitTillPageLoad();
			enterText(bifrost.userName, str_UN, "Enter UserName In Text Box" + " " + str_UN);
			enterText(bifrost.password, str_PSW, "Enter Password In Text Box" + " " + str_PSW);
			click(bifrost.loginBtn, "Click On BiFrost Login Button");
			exists(bifrost.createPOPage, "Create Purchase Order Page");

			logger.log(LogStatus.INFO, "BrowsweUp", "Browser Is Up And Running");
			System.out.println("Browser launched");

			logger.log(LogStatus.INFO, "launchBiFrost", "BiFrost Is Launched");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(LogStatus.FAIL, "launchBiFrost", "BiFrost Is Launched");
			Assert.fail();
		}

	}

}