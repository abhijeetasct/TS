/**
 * 
 */
package com.ninjacart.scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ninjacart.businessLibrary.BusinessKeywords;
import com.ninjacart.objectLibrary.biFrostObjects;
import com.ninjacart.objectLibrary.FlashObject;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Abhijeet
 *
 */
public class FlashScripts extends BusinessKeywords {

	static FlashObject flash = new FlashObject();
	static biFrostObjects bifrost = new biFrostObjects();

	@BeforeSuite
	public void start() {
		report = new ExtentReports("Reports/ExecutionReport.html", true);
		report.loadConfig(new File("src/test/resources/extent-config.xml"));
	}

	@BeforeMethod()
	public void clearingData() {

		
		updateQuery(fetchData("SkuInventoryPriceLog"));
		updateQuery(fetchData("SkuInventory"));
		updateQuery(fetchData("WarehouseTracker"));
		updateQuery(fetchData("PO"));
		System.out.println("All SQl Query Executed");
		
	}

	@Test
	public void createSimpleGRN() throws InterruptedException {

		logger = report.startTest("CreateSimpleGRN", "Create Simple GRN(Good Received Node)");
		launchApplication();
		
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		/*
		createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		//PO_StatusTracker();
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantity"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantity"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantity"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantity"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		medWait();
		medWait();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValue"),
				fetchData("cauliflowerLottingValue"));
		medWait();
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantity"),
				fetchData("tomatoLottingValue"));

	}

	@Test
	public void createPartialGRN() throws InterruptedException {

		logger = report.startTest("CreatePartialGRN", "Create Partial GRN(Good Received Node)");
		launchApplication();
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		/*createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantityP"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantityP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantityR"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantityR"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantityP"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantityP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantityR"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantityR"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		waitTillMElementPresent(flash.cauliflowerGradingStartBtn);
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValue"),
				fetchData("cauliflowerLottingValue"));
		waitTillMElementPresent(flash.tomatoGradingStartBtn);
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantity"),
				fetchData("tomatoLottingValue"));
	}

	@Test
	public void editSupplyQuantitySimple() throws InterruptedException {

		logger = report.startTest("EditSupplyQuantitySimple", "After Received SKU Edit Supplied Quantity");
		launchApplication();
		loginToBiFrost(fetchData("biFrostURL"), fetchData("biFrostUN"), fetchData("biFrostPsw"));
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		/*createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToPOEditScreen(flash.POByDevegowda);
		clickOnSKUAndEditSupplyQuantity(flash.waitingForGeadingBtn, fetchData("cauliflowerEditSupplyValue"));
		enterExtraSupplyQuantityOfSKU(flash.waitingForGeadingBtn2, fetchData("tomatoEditSupplyValue"));
		goBackFromEditSupplyQuantityScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingValueSQS"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNvalueSQS"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingValueSQS"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNvalueSQS"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValueSQS"),
				fetchData("cauliflowerLottingValueSQS"));

		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantitySQS"),
				fetchData("tomatoLottingValueSQS"));

	}

	@Test
	public void editSupplyQuantityPartial() throws InterruptedException {

		logger = report.startTest("EditSupplyQuantityPartial",
				"After Received SKU Edit Supplied Quantity,Grade It Partially");

		launchApplication();

		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
	/*	createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToPOEditScreen(flash.POByDevegowda);
		clickOnSKUAndEditSupplyQuantity(flash.waitingForGeadingBtn, fetchData("cauliflowerEditSupplyValue"));
		enterExtraSupplyQuantityOfSKU(flash.waitingForGeadingBtn2, fetchData("tomatoEditSupplyValue"));
		goBackFromEditSupplyQuantityScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);

		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingValueSQP"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNvalueSQP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingValueSQPR"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNvalueSQPR"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingValueSQP"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNvalueSQP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingValueSQPR"));
		minWait();
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNvalueSQPR"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValueSQP"),
				fetchData("cauliflowerLottingValueSQP"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantitySQP"),
				fetchData("tomatoLottingValueSQP"));
	}

	@Test
	public void partialGRNPartialLotting() throws InterruptedException {

		logger = report.startTest("partialGRNPartialLotting",
				"Create Partial GRN(Good Received Node) And Partial Lotting");
		launchApplication();

		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		/*createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantityP"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantityP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantityR"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantityR"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantityP"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantityP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantityR"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantityR"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValuePGPL"),
				fetchData("cauliflowerLottingValuePGPL"));
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValuePGRL"),
				fetchData("cauliflowerLottingValuePGRL"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferValuePGPL"),
				fetchData("tomatoLottingValuePGPL"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("ctomatoTransferValuePGRL"),
				fetchData("tomatoLottingValuePGRL"));
	}

	@Test
	public void partialEditSupplyQuantityPartialLotting() throws InterruptedException {

		logger = report.startTest("partialEditSupplyQuantityPartialLotting",
				"After Received SKU Edit Supplied Quantity.Grade And Lotting Partially");

		launchApplication();

		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		/*createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToPOEditScreen(flash.POByDevegowda);
		clickOnSKUAndEditSupplyQuantity(flash.waitingForGeadingBtn, fetchData("cauliflowerEditSupplyValue"));
		enterExtraSupplyQuantityOfSKU(flash.waitingForGeadingBtn2, fetchData("tomatoEditSupplyValue"));
		goBackFromEditSupplyQuantityScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingValueSQP"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNvalueSQP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingValueSQPR"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNvalueSQPR"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingValueSQP"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNvalueSQP"));
		clickGradeMoreBtn();
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingValueSQPR"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNvalueSQPR"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValueSQPLP"),
				fetchData("cauliflowerLottingValueSQPLP"));
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValueSQPLR"),
				fetchData("cauliflowerLottingValueSQPLR"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantitySQPLP"),
				fetchData("tomatoLottingValueSQPLP"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantitySQPLR"),
				fetchData("tomatoLottingValueSQPLR"));
	}

	@Test
	public void simpleGradingSKUVarients() {

		logger = report.startTest("simpleGradingSKUVarients", "Validate That SKU Varient Is Working As Expected");

		launchApplication();
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
	/*	createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		*/
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));

		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantity"));
		enterGRNQuantityForSKUVarient(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantity"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantity"));
		enterGRNAndValidateSwitchNotPresent(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantity"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		scrollDown(fetchData("cauliflower"));
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValue"),
				fetchData("cauliflowerLottingValue"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		scrollDown(fetchData("tomato"));
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantity"),
				fetchData("tomatoLottingValue"));

	}

	@Test
	public void reGradingToGrading() throws InterruptedException {

		logger = report.startTest("ReGradingToGrading",
				"Tranfer SKUs Quantity From Stock To ReGrading And Grade Them Again");

		launchApplication();
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		/*createPO(bifrost.kalasipalyaAsVendor, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));*/
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantity"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantity"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantity"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantity"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		scrollDown(fetchData("cauliflower"));
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValue"),
				fetchData("cauliflowerLottingValue"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		scrollDown(fetchData("tomato"));
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantity"),
				fetchData("tomatoLottingValue"));
		transferSKUFromGradingToRegrading();
		goToReGradingScreenFromLottingScreen();
		startRegrading(flash.cauliflowerGradingStartBtn, "32", "8");
		startRegradingWithScanner(flash.tomatoGradingStartBtn, "50", "6");
	}

	@Test
	public void reGradingToGradingForSKuVarient() throws InterruptedException {

		logger = report.startTest("ReGradingToGradingForSKUVarient",
				"Tranfer SKUs Quantity From Stock To ReGrading And Grade Them Again With SKU Varients");

		launchApplication();
		createPO(bifrost.vendorNameAsDevegowda, bifrost.orderQuantityBoxOfCauliflower,
				fetchData("cauliflowerOrderedQuantity"), bifrost.orderQuantityBoxOfTomato,
				fetchData("tomatoOrderedQuantity"));
		
		loginToFlashApp(fetchData("flashUserName"), fetchData("flashPassword"));
		goToRecevingSKUScreen(flash.POByDevegowda);
		selectSKUAsArrived();
		clickOnSKUAndEnterSupplyQuantity(flash.cauliflowerAsSKU, "CLick On Cauliflower To Enter Supply Quantity",
				fetchData("supplyQuantityForCauliflower"));
		enterTotalSupplyQuantityt(flash.clickSKUForTotalWeight, fetchData("supplyQuantityForTomato"));
		goBackFromSKURecevingScreenToHomeScreen();
		goToGradingScreen(flash.POByDevegowda);
		enterGradingQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGradingQuantity"));
		enterGRNQuantity(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerGRNQuantity"));
		enterGradingQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGradingQuantity"));
		enterGRNQuantity(flash.tomatoGradingStartBtn, fetchData("tomatoGRNQuantity"));
		goBackToHomeScreenFromGradingScreen();
		goToLottingScreen();
		scrollDown(fetchData("cauliflower"));
		startLottingBtn(flash.cauliflowerGradingStartBtn);
		enterTotalLotsValue(flash.cauliflowerGradingStartBtn, fetchData("cauliflowerTransferValue"),
				fetchData("cauliflowerLottingValue"));
		scrollDown(fetchData("tomato"));
		startLottingBtn(flash.tomatoGradingStartBtn);
		enterTotalLotsValueWithScanner(flash.tomatoGradingStartBtn, fetchData("tomatoTransferQuantity"),
				fetchData("tomatoLottingValue"));
		transferSKUFromGradingToRegrading();
		goToReGradingScreenFromLottingScreen();
		startRegradingForVarientSKU(flash.cauliflowerGradingStartBtn, "32", "8");
		startRegradingWithScanner(flash.tomatoGradingStartBtn, "50", "6");

	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			captureScreenshot();

		}
		report.endTest(logger);
		report.flush();
		Appdriver.quit();
		driver.quit();
	}

	@AfterSuite()

	public void last() {

		report.close();

	}

}
