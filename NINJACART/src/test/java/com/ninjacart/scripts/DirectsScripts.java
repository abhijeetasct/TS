/**
 * 
 */
package com.ninjacart.scripts;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ninjacart.businessLibrary.BusinessKeywords;
import com.ninjacart.objectLibrary.biFrostObjects;
import com.ninjacart.objectLibrary.DirectObjects;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

/**
 * @author Abhijeet
 *
 */
public class DirectsScripts extends BusinessKeywords {

	static DirectObjects direct = new DirectObjects();
	static biFrostObjects bifrost = new biFrostObjects();

	@BeforeSuite
	public void start() {
		report = new ExtentReports("Reports/ExecutionReport.html", true);
		report.loadConfig(new File("src/test/resources/extent-config.xml"));
	}

    @BeforeMethod()
	public void clearingData() {

		updateQuery(fetchDirectData("direct", "saleOrderbyAbhidirect"));
		updateQuery(fetchDirectData("direct", "skuAsInactive"));
		updateQuery(fetchDirectData("direct", "PO"));
		updateQuery(fetchDirectData("direct", "skuAsActive"));
		updateQuery(fetchDirectData("direct", "skuSlabActiveAs0"));
		updateQuery(fetchDirectData("direct", "skuPriceAsMain"));
		updateQuery(fetchDirectData("direct", "stockOverrideAs0"));
		updateQuery(fetchDirectData("direct", "minimumOrderValue"));
		updateQuery(fetchDirectData("direct", "captureExactDemandAs0"));
		updateQuery(fetchDirectData("direct", "promotionsAs0"));
		updateQuery(fetchDirectData("direct", "promotionMoreThan9000As0"));

	}


	@Test
	public void simpleCreationOfSaleOrder() throws Exception {
		logger = report.startTest("simpleCreationOfSaleOrder", "Validate That Sale Order Is Creating Successfully");

		updateQuery(fetchDirectData("direct", "purchasePriceAs10"));
		//updateQuery(fetchDirectData("direct", "skuAsActive"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		searchSKUInSearchBox();
		clickCauliflowerPlusBtnAndValidate();
		clickLemonPlusBtnAndValidate();
		clickOnionPlusBtnAndValidate();
		clickPotatoPlusBtnAndValidate();
		clickTomatoPlusBtnAndValidate();
		clickCornPlusBtnAndValidate();
		clickApplePlusBtnAndValidate();
		clickBananaPlusBtnAndValidate();
    	clickMosambiPlusBtnAndValidate();
		clickOrangePlusBtnAndValidate();
		clickTotalButtonAndValidateMyCartScreen();
		clickMyCartCauliflowerPlusBtnAndValidate();
		clickMyCartLemonPlusBtnAndValidate();
		clickMyCartPotatoPlusBtnAndValidate();
		clickMyCartOnionPlusBtnAndValidate();
		clickMyCartTomatoPlusBtnAndValidate();
		clickMyCartApplePlusBtnAndValidate();
		clickMyCartBananaPlusBtnAndValidate();
		clickMyCartMosambiPlusBtnAndValidate();
		clickMyCartOrangePlusBtnAndValidate();
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	public void normalEditSaleOrder() throws Exception {
		logger = report.startTest("normalEditSaleOrder", "Validate That Normal Sale Order Is Editing Successfully");

		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		searchSKUInSearchBox();
		clickCauliflowerPlusBtnAndValidate();
		clickLemonPlusBtnAndValidate();
		clickOnionPlusBtnAndValidate();
		clickPotatoPlusBtnAndValidate();
		clickTomatoPlusBtnAndValidate();
		clickCornPlusBtnAndValidate();
		clickApplePlusBtnAndValidate();
		clickBananaPlusBtnAndValidate();
		clickMosambiPlusBtnAndValidate();
		clickOrangePlusBtnAndValidate();
		clickTotalButtonAndValidateMyCartScreen();
		clickMyCartCauliflowerPlusBtnAndValidate();
		clickMyCartLemonPlusBtnAndValidate();
		clickMyCartPotatoPlusBtnAndValidate();
		clickMyCartOnionPlusBtnAndValidate();
		clickMyCartTomatoPlusBtnAndValidate();
		clickMyCartApplePlusBtnAndValidate();
		clickMyCartBananaPlusBtnAndValidate();
		clickMyCartMosambiPlusBtnAndValidate();
		clickMyCartOrangePlusBtnAndValidate();
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		validateAllSkusQuantityAfterEditOrder();
		searchSKUAndAddIntoCartAndValidateTotalPrice();
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	@SuppressWarnings("unused")
	public void saleOrderWithStockOverride() throws Exception {
		logger = report.startTest("saleOrderWithStockOverride", "Validate That Stock Override Is Working Properlly");

		//updateQuery(fetchDirectData("direct", "stockOverride"));
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "skuAsActive"));
		//updateQuery(fetchDirectData("direct", "stockOverrideAs0"));

		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
	
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		placeSaleOrderMoreThanSupplyQuantityForCauliflower();
		placeSaleOrderMoreThanSupplyQuantityForLemon();
		placeSaleOrderMoreThanSupplyQuantityForOnion();
		placeSaleOrderMoreThanSupplyQuantityForTomato();
		placeSaleOrderMoreThanSupplyQuantityForPotato();
		placeSaleOrderMoreThanSupplyQuantityForCorn();
		placeSaleOrderMoreThanSupplyQuantityForApple();
		placeSaleOrderMoreThanSupplyQuantityForOrange();
		placeSaleOrderMoreThanSupplyQuantityForBanana();
		placeSaleOrderMoreThanSupplyQuantityForToMosambi();
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "cauliflower"),
				direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "lemon"), direct.myCartLemonQuantity,
				this.lemonQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "onion"), direct.myCartOnionQuantity,
				this.onionQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "tomato"), direct.myCartTomatoQuantity,
				this.tomatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "potato"), direct.myCartPotatoQuantity,
				this.potatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "corn"), direct.myCartCornQuantity,
				this.cornQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "apple"), direct.mycartAppleQuantity,
				this.appleQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "banana"), direct.myCartbananaQuantity,
				this.bananaQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "mosambi"), direct.myCartMosambiQuantity,
				this.mosambiQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "orange"), direct.mycartOrangeQuantit,
				this.orangeQuantity);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTOTALPriceAndCartRevaluatedPriceIsNotSame();
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test
	@SuppressWarnings("unused")
	public void editOrderWithStockOverride() throws Exception {
		logger = report.startTest("editOrderWithStockOverride",
				"Validate That Edit Stock Override Is Working Properlly");

		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "skuAsActive"));
    	launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		placeSaleOrderMoreThanSupplyQuantityForCauliflower();
		placeSaleOrderMoreThanSupplyQuantityForLemon();
		placeSaleOrderMoreThanSupplyQuantityForOnion();
		placeSaleOrderMoreThanSupplyQuantityForTomato();
		placeSaleOrderMoreThanSupplyQuantityForPotato();
		placeSaleOrderMoreThanSupplyQuantityForCorn();
		placeSaleOrderMoreThanSupplyQuantityForApple();
		placeSaleOrderMoreThanSupplyQuantityForOrange();
		placeSaleOrderMoreThanSupplyQuantityForBanana();
		placeSaleOrderMoreThanSupplyQuantityForToMosambi();
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "cauliflower"),
				direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "tomato"), direct.myCartTomatoQuantity,
				this.tomatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "lemon"), direct.myCartLemonQuantity,
				this.lemonQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "onion"), direct.myCartOnionQuantity,
				this.onionQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "potato"), direct.myCartPotatoQuantity,
				this.potatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "corn"), direct.myCartCornQuantity,
				this.cornQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "apple"), direct.mycartAppleQuantity,
				this.appleQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "banana"), direct.myCartbananaQuantity,
				this.bananaQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "mosambi"), direct.myCartMosambiQuantity,
				this.mosambiQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "orange"), direct.mycartOrangeQuantit,
				this.orangeQuantity);

		this.TOTALPrice = getPrice("PLACE ORDER", direct.PLACEORDERValue);

		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		
		mBackButton();
		ValidateEditAndViewOrderButton();
		updateQuery(fetchDirectData("direct", "stockOverride"));
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		placeOrderMoreThenSupplyQuantityAfterClickedEditbutton(fetchDirectData("direct", "cauliflower"),
				direct.cauliflowerQuantity, direct.cauliflowerPlusButton);
		placeOrderMoreThenSupplyQuantityAfterClickedEditbutton(fetchDirectData("direct", "tomato"),
				direct.tomatoQuantity, direct.tomatoPlusButton);
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test

	public void saleOrderWithStockOut() throws Exception {
		logger = report.startTest("saleOrderWithStockOut",
				"Validate That Sale Order With Stock Out Is Working Properlly");

		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "skuAsActive"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		placeSaleOrderMoreThanSupplyQuantityForCauliflower();
		placeSaleOrderHalfOfSupplyQuantityForlemon();
		placeSaleOrderMoreThanSupplyQuantityForOnion();
		placeSaleOrderHalfOfSupplyQuantityForTomato();
		placeSaleOrderHalfOfSupplyQuantityForPotato();
		placeSaleOrderMoreThanSupplyQuantityForCorn();
		placeSaleOrderMoreThanSupplyQuantityForApple();
		placeSaleOrderHalfOfSupplyQuantityForOrange();
		placeSaleOrderMoreThanSupplyQuantityForBanana();
		placeSaleOrderMoreThanSupplyQuantityForToMosambi();
		clickTotalButtonAndValidateMyCartScreen();

		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "cauliflower"),
				direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "tomato"), direct.myCartTomatoQuantity,
				this.tomatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "lemon"), direct.myCartLemonQuantity,
				this.lemonQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "onion"), direct.myCartOnionQuantity,
				this.onionQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "potato"), direct.myCartPotatoQuantity,
				this.potatoQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "corn"), direct.myCartCornQuantity,
				this.cornQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "apple"), direct.mycartAppleQuantity,
				this.appleQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "banana"), direct.myCartbananaQuantity,
				this.bananaQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "mosambi"), direct.myCartMosambiQuantity,
				this.mosambiQuantity);
		validateSkuQuantityAfterCartRevaluate(fetchDirectData("direct", "orange"), direct.mycartOrangeQuantit,
				this.orangeQuantity);

		this.TOTALPrice = getPrice("PLACE ORDER", direct.PLACEORDERValue);

		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		updateQuery(fetchDirectData("direct", "skuAsInactive"));
		ValidateEditAndViewOrderButton();
		closeApplication();
		
		updateQuery(fetchDirectData("direct", "skuAsActive"));
		reLaunchApplication();
		loginToDirectApp(fetchDirectData("direct", "directUserName1"), fetchDirectData("direct", "directPassword"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		placeSaleOrderMoreThanSupplyQuantityForCauliflower();
		placeSaleOrderHalfOfSupplyQuantityForlemon();
		placeSaleOrderMoreThanSupplyQuantityForOnion();
		placeSaleOrderHalfOfSupplyQuantityForTomato();
		placeSaleOrderHalfOfSupplyQuantityForPotato();
		placeSaleOrderMoreThanSupplyQuantityForCorn();
		placeSaleOrderMoreThanSupplyQuantityForApple();
		placeSaleOrderHalfOfSupplyQuantityForOrange();
		placeSaleOrderMoreThanSupplyQuantityForBanana();
		placeSaleOrderMoreThanSupplyQuantityForToMosambi();
		clickTotalButtonAndValidateMyCartScreen();
		this.TOTALPrice = getPrice("PLACE ORDER", direct.PLACEORDERValue);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		validateStockOutTextForSKUs();
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@SuppressWarnings("unused")
	@Test
	public void createSimpleSaleOrderBasedOnSlab() throws Exception {
		logger = report.startTest("createSimpleSaleOrderBasedOnSlab",
				"Validate That Sale Order Is Creating Based On Sku Slab ");

		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		goToSalePriceManagementPrice();
		uploadSkuSlabs(fetchDirectData("direct", "skuSlabFilePath"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		createSupplyQuantityForCauliflowerForSlab();
		scrollDown(fetchDirectData("direct", "onion"));
		createSupplyQuantityForLemonForSlab();
		createSupplyQuantityForOnionForSlab();
		createSupplyQuantityForPotatoForSlab();
		createSupplyQuantityForTomatoForSlab();
		createSupplyQuantityForAppleForSlab();
		clickTotalButtonAndValidateMyCartScreen();
		validateSkuQuantityOnMyCartScreen("cauliflower", direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityOnMyCartScreen("onion", direct.myCartOnionQuantity, this.onionQuantity);
		validateSkuQuantityOnMyCartScreen("lemon", direct.myCartLemonQuantity, this.lemonQuantity);
		validateSkuQuantityOnMyCartScreen("potato", direct.myCartPotatoQuantity, this.potatoQuantity);
		validateSkuQuantityOnMyCartScreen("tomato", direct.myCartTomatoQuantity, this.tomatoQuantity);
		validateSkuQuantityOnMyCartScreen("apple", direct.mycartAppleQuantity, this.appleQuantity);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		clickOnOrderSummaryBtnAndValidateOrderDetailsScreen();
		scrollDown(fetchDirectData("direct", "cauliflower"));
		double cauliflowerPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Cauliflower",
				direct.orderDetailsCauliflowerPrice, this.cauliflowerSlabPrice, this.cauliflowerQuantity);
		scrollDown(fetchDirectData("direct", "tomato"));
		double tomatoPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Tomato", direct.orderDetailsTomatoPrice,
				this.tomatoSlabPrice, this.tomatoQuantity);
		scrollDown(fetchDirectData("direct", "onion"));
		double onionPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Onion", direct.orderDetailsOnionPrice,
				this.onionSlabPrice, this.onionQuantity);
		scrollDown(fetchDirectData("direct", "potato"));
		double potatoPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Potato", direct.orderDetailsPotatoPrice,
				this.potatoSlabPrice, this.potatoQuantity);
		scrollDown(fetchDirectData("direct", "apple"));
		double applePrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Apple", direct.orderDetailsApplePrice,
				this.appleSlabPrice, this.appleQuantity);
		scrollDown(fetchDirectData("direct", "lemon"));
		double lemonPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Lemon", direct.orderDetailsLemonPrice,
				this.lemonSlabPrice, this.lemonQuantity);
		scrollDown(fetchDirectData("direct", "cauliflower"));
		double orderDetailsTotalPrice = getPrice("orderdetailsTotal", direct.orderDetailsTotalPrice);

		if ((cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice
				+ lemonPrice) == orderDetailsTotalPrice) {
			System.out.println("Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
					+ " Is Equal After Adding All SKus Price As "
					+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
			logger.log(LogStatus.INFO, "Matched",
					"Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
							+ " Is Equal After Adding All SKus Price As "
							+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
		} else {
			System.out.println("Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
					+ " Is Not Equal After Adding All SKus Price As "
					+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
			logger.log(LogStatus.INFO, "Matched",
					"Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
							+ " Is Not Equal After Adding All SKus Price As "
							+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
		}
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@SuppressWarnings("unused")
	@Test
	public void createSimpleSaleOrderBasedOnSlabWithCartRevaluate() throws Exception {
		logger = report.startTest("createSimpleSaleOrderBasedOnSlabWithCartRevaluate",
				"Validate That Sale Order Is Creating Based On Sku Slab With Cart Revaluate ");

		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		goToSalePriceManagementPrice();
		uploadSkuSlabs(fetchDirectData("direct", "skuSlabFilePathForCartRevaluate"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		saleOrderMoreThanSupplyQuantityOfCauliflowerToChechRevaluateCartSlabPrice();
		scrollDown(fetchDirectData("direct", "onion"));
		saleOrderMoreThanSupplyQuantityOfLemonToCheckRevaluateCartSlabPrice();
		scrollDown(fetchDirectData("direct", "tomato"));
		saleOrderMoreThanSupplyQuantityOfOnionToCheckRevaluateCartSlabPrice();
		saleOrderMoreThanSupplyQuantityOfPotatoToCheckRevaluateCartSlabPrice();
		saleOrderMoreThanSupplyQuantityOfTomatoToCheckRevaluateCartSlabPrice();
		saleOrderMoreThanSupplyQuantityOfApplyToCheckRevaluateCartSlabPrice();
		clickTotalButtonAndValidateMyCartScreen();
		validateSkuQuantityOnMyCartScreen("cauliflower", direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityOnMyCartScreen("onion", direct.myCartOnionQuantity, this.onionQuantity);
		validateSkuQuantityOnMyCartScreen("lemon", direct.myCartLemonQuantity, this.lemonQuantity);
		validateSkuQuantityOnMyCartScreen("potato", direct.myCartPotatoQuantity, this.potatoQuantity);
		validateSkuQuantityOnMyCartScreen("tomato", direct.myCartTomatoQuantity, this.tomatoQuantity);
		validateSkuQuantityOnMyCartScreen("apple", direct.mycartAppleQuantity, this.appleQuantity);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		this.myCartCauliflowerQuantity = validateQuantityAfterCartRevaluate("cauliflower",
				direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		this.myCartOnionQuantity = validateQuantityAfterCartRevaluate("onion", direct.myCartOnionQuantity,
				this.onionQuantity);
		this.myCartLemonQuantity = validateQuantityAfterCartRevaluate("lemon", direct.myCartLemonQuantity,
				this.lemonQuantity);
		this.myCartPotatoQuantity = validateQuantityAfterCartRevaluate("potato", direct.myCartPotatoQuantity,
				this.potatoQuantity);
		this.myCartTomatoQuantity = validateQuantityAfterCartRevaluate("tomato", direct.myCartTomatoQuantity,
				this.tomatoQuantity);
		this.myCartAppleQuantity = validateQuantityAfterCartRevaluate("apple", direct.mycartAppleQuantity,
				this.appleQuantity);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		clickOnOrderSummaryBtnAndValidateOrderDetailsScreen();
		scrollDown(fetchDirectData("direct", "cauliflower"));
		double cauliflowerPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Cauliflower",
				direct.orderDetailsCauliflowerPrice, this.cauliflowerSlabPrice, this.myCartCauliflowerQuantity);
		scrollDown(fetchDirectData("direct", "tomato"));
		double tomatoPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Tomato", direct.orderDetailsTomatoPrice,
				this.tomatoSlabPrice, this.myCartTomatoQuantity);
		scrollDown(fetchDirectData("direct", "onion"));
		double onionPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Onion", direct.orderDetailsOnionPrice,
				this.onionSlabPrice, this.myCartOnionQuantity);
		scrollDown(fetchDirectData("direct", "potato"));
		double potatoPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Potato", direct.orderDetailsPotatoPrice,
				this.potatoSlabPrice, this.myCartPotatoQuantity);
		scrollDown(fetchDirectData("direct", "apple"));
		double applePrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Apple", direct.orderDetailsApplePrice,
				this.appleSlabPrice, this.myCartAppleQuantity);
		scrollDown(fetchDirectData("direct", "lemon"));
		double lemonPrice = ValidateSkuPriceOnOrderDetailsBasedOnSlabPrice("Lemon", direct.orderDetailsLemonPrice,
				this.lemonSlabPrice, this.myCartLemonQuantity);
		scrollDown(fetchDirectData("direct", "cauliflower"));
		double orderDetailsTotalPrice = getPrice("orderdetailsTotal", direct.orderDetailsTotalPrice);
		if ((cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice
				+ lemonPrice) == orderDetailsTotalPrice) {
			System.out.println("Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
					+ " Is Equal After Adding All SKus Price As "
					+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
			logger.log(LogStatus.INFO, "Matched",
					"Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
							+ " Is Equal After Adding All SKus Price As "
							+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
		} else {
			System.out.println("Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
					+ " Is Not Equal After Adding All SKus Price As "
					+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
			logger.log(LogStatus.INFO, "Matched",
					"Validate That Total Price Of Order Details Screen " + orderDetailsTotalPrice
							+ " Is Not Equal After Adding All SKus Price As "
							+ (cauliflowerPrice + tomatoPrice + onionPrice + potatoPrice + applePrice + lemonPrice));
		}
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	public void createSaleOrderWithSlabPriceRevaluate() throws Exception {
		logger = report.startTest("createSaleOrderWithSlabPriceRevaluate",
				"Validate That Sale Order Is Successfully Creating With Slab Price Revaluate");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));

		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		goToSalePriceManagementPrice();
		uploadSkuSlabs(fetchDirectData("direct", "skuSlabFilePath"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		createSupplyQuantityForCauliflowerForSlab();
		scrollDown(fetchDirectData("direct", "onion"));
		createSupplyQuantityForLemonForSlab();
		createSupplyQuantityForOnionForSlab();
		createSupplyQuantityForPotatoForSlab();
		createSupplyQuantityForTomatoForSlab();
		createSupplyQuantityForAppleForSlab();
		clickTotalButtonAndValidateMyCartScreen();
		validateSkuQuantityOnMyCartScreen("cauliflower", direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityOnMyCartScreen("onion", direct.myCartOnionQuantity, this.onionQuantity);
		validateSkuQuantityOnMyCartScreen("lemon", direct.myCartLemonQuantity, this.lemonQuantity);
		validateSkuQuantityOnMyCartScreen("potato", direct.myCartPotatoQuantity, this.potatoQuantity);
		validateSkuQuantityOnMyCartScreen("tomato", direct.myCartTomatoQuantity, this.tomatoQuantity);
		validateSkuQuantityOnMyCartScreen("apple", direct.mycartAppleQuantity, this.appleQuantity);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		clickOnOrderSummaryBtnAndValidateOrderDetailsScreen();
		// pending test scriprs..we have bug in that once fixed then have to

	}

	@Test
	public void createSaleOrderAndRevaluateSlabPriceAndValidate() throws Exception {
		logger = report.startTest("createSaleOrderAndRevaluateSlabPriceAndValidate",
				"Validate That Slab Price Is Not Changing After Creating Sale Order");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));

		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		goToSalePriceManagementPrice();
		uploadSkuSlabs(fetchDirectData("direct", "skuSlabFilePath"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		createSupplyQuantityForCauliflowerForSlab();
		scrollDown(fetchDirectData("direct", "onion"));
		createSupplyQuantityForLemonForSlab();
		createSupplyQuantityForOnionForSlab();
		createSupplyQuantityForPotatoForSlab();
		createSupplyQuantityForTomatoForSlab();
		createSupplyQuantityForAppleForSlab();
		this.TOTALPrice = getPrice("TOTAL Price", direct.totalPrice);
		clickTotalButtonAndValidateMyCartScreen();
		validateSkuQuantityOnMyCartScreen("cauliflower", direct.myCartCauliflowerQuantity, this.cauliflowerQuantity);
		validateSkuQuantityOnMyCartScreen("onion", direct.myCartOnionQuantity, this.onionQuantity);
		validateSkuQuantityOnMyCartScreen("lemon", direct.myCartLemonQuantity, this.lemonQuantity);
		validateSkuQuantityOnMyCartScreen("potato", direct.myCartPotatoQuantity, this.potatoQuantity);
		validateSkuQuantityOnMyCartScreen("tomato", direct.myCartTomatoQuantity, this.tomatoQuantity);
		validateSkuQuantityOnMyCartScreen("apple", direct.mycartAppleQuantity, this.appleQuantity);
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		clickOnOrderSummaryBtnAndValidateOrderDetailsScreen();
		updateQuery(fetchDirectData("direct", "skuPriceAs20"));
		mBackButton();
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		ValidateEditAndViewOrderButton();
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		validateSkuPriceIsSameForEditSaleOrder("cauliflower", this.cauliflowerSlabPrice, direct.cauliflowerSlab);
		validateSkuPriceIsSameForEditSaleOrder("lemon", this.lemonSlabPrice, direct.lemonSlab);
		validateSkuPriceIsSameForEditSaleOrder("onion", this.onionSlabPrice, direct.onionSlab);
		validateSkuPriceIsSameForEditSaleOrder("potato", this.potatoSlabPrice, direct.potatoSlab);
		validateSkuPriceIsSameForEditSaleOrder("tomato", this.tomatoSlabPrice, direct.tomatoSlab);
		mClick(direct.fruitsTab, "Click On Fruits Tab");
		validateSkuPriceIsSameForEditSaleOrder("apple", this.appleSlabPrice, direct.appleSlab);

	}

	@Test
	public void minimumOrderValue() throws Exception {
		logger = report.startTest("minimumOrderValue",
				"Validate That 'Minimum order value Rs 1000.0' Message Displayed");
		updateQuery(fetchDirectData("direct", "minimumOrderPrice"));
		//updateQuery(fetchDirectData("direct", "skuAsActive"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		loginToDirectApp(fetchDirectData("direct","directUserName"),fetchDirectData("direct","directPassword"));
		searchSKUInSearchBox();
		placeOrderForLessThan1000AndValidateErrorMessage();
		placeOrderForMoreThan1000AndValidateSuccess();
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test
	public void minimumOrderValueWithCartRevaluate() throws Exception {
		logger = report.startTest("minimumOrderValueWithCartRevaluate",
				"Validate That 'Minimum order value Rs 1000.0' Message Displayed After Cart Revaluated");

		updateQuery(fetchDirectData("direct", "minimumOrderPrice"));
	//	updateQuery(fetchDirectData("direct", "skuAsActive"));
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "minOrderQuantityForPO"));
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		searchSKUInSearchBox();
		placeOrderForMoreThan1000AndValidateCartRevaluate();
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		mExists(direct.minimumOrderValueAlertMsg, "'Minimum order value Rs 1000.0' Displayed");
		mBackButton();
		AddMoreSkuQuantityAndValidateSuccess();
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "CLick On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPriceOnOrderDetailsScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test
	public void captureExactDemand() throws Exception {
		logger = report.startTest("captureExactDemand", "Validate That Db IS Showing Capture Exact Demand ");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "clearDemandQuantity"));
		updateQuery(fetchDirectData("direct", "captureExactDemandAs1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectApp(fetchDirectData("direct", "directUserName"), fetchDirectData("direct", "directPassword"));
		placeSaleOrderMoreThanSupplyQuantityForCauliflower();
		createSaleOrderOf10LotsForCabbage();
		clickTotalButtonAndValidateMyCartScreen();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		mBackButton();
		ValidateEditAndViewOrderButton();
		validateTextfromDB(fetchDirectData("direct", "originalDemandQueryforCabbage"), "30");
		validateTextfromDB(fetchDirectData("direct", "missedQuantityForCabbage"), "30");
		validateTextfromDB(fetchDirectData("direct", "originalDemandQueryforCauliflower"), "72");
		validateTextfromDB(fetchDirectData("direct", "missedQuantityForCauliflower"), "22");
	}

	@Test
	public void discount_Promotions() throws Exception {
		logger = report.startTest("discount_Promotions",
				"Validate That After Ordering More Than Rs5000,User Is Getting 10% Of Discount");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
	//	updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeSaleOrderHalfOfSupplyQuantityForPotato();
		placeOrderForMoreThan5000AndValidateDiscount();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		// ValidateTotalDiscountPriceOnOrderDetailsScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	public void discount_PromotionsWithCartRevaluated() throws Exception {
		logger = report.startTest("discount_PromotionsWithCartRevaluated",
				"Validate That After Ordering More Than Rs5000,User Is Getting 10% Of Discount But Because Of Less Stock Cart Is Revaluating");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeOrderForMoreThan5000AndValidateDiscountForPotato();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		mBackButton();
		validateThatAfterCartRevaluatedDiscountIsNotApplicable();
		placeOrderForMoreThan5000AndValidateDiscount();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		// ValidateTotalDiscountPriceOnOrderDetailsScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);
		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	public void discount_PromotionsAfterCartRevaluated() throws Exception {
		logger = report.startTest("discount_PromotionsAfterCartRevaluated",
				"Validate That Even After Cart Revaluate Customer Is Getting Discount Since Total Price Is More Than 5000");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		//GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeOrderForMoreThan5000AndValidateDiscountForPotato();
		placeOrderForMoreThan9000AndValidateDiscount();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		minWait();
		this.TOTALPrice = getPrice("PLACEORDER", direct.PLACEORDERValue);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		//ValidateTotalPriceOnOrderDetailsScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);

		mBackButton();
		ValidateEditAndViewOrderButton();
	}

	@Test
	public void discount_PromotionsAfterEditOrder() throws Exception {
		logger = report.startTest("discount_PromotionsAfterEditOrder",
				"Validate That Customer Is Not Getting Any Discount After Editing Order For Total Price Less Than 5000");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeSaleOrderHalfOfSupplyQuantityForPotato();
		this.potatoSlabPrice = getPrice("potato", direct.potatoPrice);
		placeOrderForMoreThan5000AndValidateDiscount();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		// ValidateTotalDiscountPriceOnOrderDetailsScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);
		mBackButton();
		ValidateEditAndViewOrderButton();
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		clickOnAppleMinusButtonAndValidateNoDiscount();
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test
	public void validateDiscountForRs5000AndRs9000() throws Exception {
		logger = report.startTest("validateDiscountForRs5000AndRs9000",
				"Validate That Customer Is Getting 10% Discount After 5000 And 15% Discount After Total Price More Than 9000");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		updateQuery(fetchDirectData("direct", "promotionMoreThan9000As1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityAs250"));
		//GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();

		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
	
		placeOrderForMoreThan5000AndValidateDiscountForPotato();
		mExists(direct.discountMsgAs15, "'Order for Rs 9000 and get 15 % discount' Message");
		placeOrderForMoreThan9000AndValidate15PercentDiscount();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(15);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(15);
		mBackButton();
		ValidateEditAndViewOrderButton();
		/*//clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		//mExists(direct.discountMsgAs15, "'Order for Rs 9000 and get 15 % discount' Message");
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		mClick(direct.orderSummaryBtn, "Click On Order Summary Button");
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(15);
		mBackButton();
		ValidateEditAndViewOrderButton();
*/
	}

	@Test
	public void validate10PercentDiscountAfterCartRevaluateForLessThanRs9000() throws Exception {
		logger = report.startTest("validate10PercentDiscountAfterCartRevaluateForLessThanRs9000",
				"Validate That Customer Is Getting Only 10% Discount After Cart Revaluating And Total Price Less Than 9000");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
	//	updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		updateQuery(fetchDirectData("direct", "promotionMoreThan9000As1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityForPO"));
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeOrderForMoreThan9000AndValidate15PercentDiscount();
		this.appleSlabPrice = getPrice("apple", direct.applePrice);
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(15);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		validateCartUpdateMessage();
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreenAfterCartRevaluate(10);
		mBackButton();
		ValidateEditAndViewOrderButton();

	}

	@Test
	public void validate10PercentDiscountAfterEditOrderForLessThanRs9000() throws Exception {
		logger = report.startTest("validate10PercentDiscountAfterEditOrderForLessThanRs9000",
				"Validate That Customer Is Getting Only 10% Discount After Editing Order For Total Price Less Than 9000");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
	//	updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		updateQuery(fetchDirectData("direct", "promotionMoreThan9000As1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "slabOrderQuantityForPO"));
		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
		placeOrderForMoreThan9000AndValidate15PercentDiscount();
		// this.appleSlabPrice = getPrice("apple", direct.applePrice);
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(15);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(15);
		mBackButton();
		ValidateEditAndViewOrderButton();
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		mClick(direct.fruitsTab, "Click On fruits Tab");
		mClick(direct.appleMinusButton, "Click On Apple Minus button");
		mExists(direct.discountMsgAs15, "'Order for Rs 9000 and get 15 % discount' Message");
		this.TOTALPrice = getPrice("TOTAL", direct.totalPrice);
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);
		mBackButton();
		ValidateEditAndViewOrderButton();

	}
	
	@Test
	public void validateDiscountForRs5000AndRs9000WithEditOrder() throws Exception {
		logger = report.startTest("validateDiscountForRs5000AndRs9000WithEditOrder",
				"Validate That Customer Is Getting 10% Discount After 5000 And 15% Discount After Total Price More Than 9000 In Edit Order Case");
		updateQuery(fetchDirectData("direct", "skuInventry"));
		updateQuery(fetchDirectData("direct", "SkuInventoryPriceLog"));
		updateQuery(fetchDirectData("direct", "todaysPO"));
		//updateQuery(fetchDirectData("direct", "activeSkuForSlab"));
		updateQuery(fetchDirectData("direct", "promotionsAs1"));
		updateQuery(fetchDirectData("direct", "promotionMoreThan9000As1"));
		launchApplication();
		createPOForDirectApp(fetchDirectData("direct", "orderQuantityAs250"));
		//GoToRealTimeStockTrackerSelectCityFacilityAndCategotyFromDropDown();

		loginToDirectAppAndAvoidPopUp(fetchDirectData("direct", "directUserName"),
				fetchDirectData("direct", "directPassword"), direct.discountPopup);
		mExists(direct.discountMsg, "'Order for Rs 5000 and get 10 % discount' Message");
	
		placeOrderForMoreThan5000AndValidateDiscountForPotato();
		clickTotalButtonAndValidateMyCartScreen();
		validateMyCartPLACEORDERPriceWithTOTALPrice(10);
		mClick(direct.placeOrderText, "Click On PLACE ORDER Arrow Button");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreen();
		// ValidateTotalDiscountPriceOnOrderDetailsScreen();
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(10);
		mBackButton();
		ValidateEditAndViewOrderButton();
		clickEditOrderBtnAndValidatePlaceOrderPriceWithEditOrderPrice();
		mExists(direct.discountMsgAs15, "'Order for Rs 9000 and get 15 % discount' Message");
		placeOrderForMoreThan9000AndValidate15PercentDiscount();
		mClick(direct.totalArrowBtn, "CLick On Total Arrow Button");
		mClick(direct.EDITORDERBtn, "CLick On EDIT ORDER Button On My Cart Screen");
		clickPlaceOrderButtonAndValidateAllFieldsOnOrderDetailsScreen();
		orderConfirmedScreenWithEditedSuccessMessage();
		mClick(direct.orderSummaryBtn, "Click On Order Summary Button");
		ValidateTotalPercentDiscountPriceOnOrderDetailsScreen(15);
		mBackButton();
		ValidateEditAndViewOrderButton();

	}


	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			//bifrostCaptureScreenshot();
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
