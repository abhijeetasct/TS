/**
 * 
 */
package com.ninjacart.objectLibrary;

/**
 * @author MrX
 *
 */
public class biFrostObjects {
	
	
	public String userName = "//input[@name='username']";
	public String password = "//input[@name='pass']";
	public String loginBtn="//button[text()='Log in']";
	public String createPOPage="//h1[text()='Create Purchase Order ']";
	public String cityDrpDwn="(//span[@class='btn btn-default form-control ui-select-toggle'])[1]";
	public String cityAsBangalore="//a/span[text()='Bangalore']";
	public String facilityDrpDwn="(//span[@class='btn btn-default form-control ui-select-toggle'])[2]";
	//public String whitefieldAsFacility="//a/span[text()='Whitefield']";
	public String bangaloreFcAsFacility="//a/span[text()='Bangalore FC' or text()='Whitefield']";
	
	public String orderTypeDrpDwn="(//span[@class='btn btn-default form-control ui-select-toggle'])[3]";
	public String orderTypeAsNormal="//a/span[text()='Normal Order']";
	public String vendorDrpDwn="(//span[@class='btn btn-default form-control ui-select-toggle'])[4]";
	public String vendorAsVamsi="//a/span[text()='Vamsi']";
	public String vendorAsoldWarehouse="//a/span[text()='Old Warehouse']";
	public String registeredSKUsPage="//div[text()=' Registered SKUs']";
	public String orderQuantityBoxOfPapaya="//td[h6[contains(text(),'Papaya (round) - Grade A')]]//following-sibling::td/input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfPotatao="//td[h6[contains(text(),'Potato (local) - Grade A')]]//following-sibling::td/input[@ng-model='product.skuQuantity']";
	public String arrivalTileOfPapaya="(//input[@ng-model='item.expectedArrivalTime'])[1]";
	public String arrivalTuleOfPotato="(//input[@ng-model='item.expectedArrivalTime'])[2]";
	public String createPOBtn ="//button[@ng-click='ctrl.approve()']";
	public String POSummaryPage="//h3[contains(text(),'PO Summary :: Vendor ')]";
	public String confirmBtn="//button[@ng-click='modal.submit()']";
	public String viewPurchaseOrderPage="//h1[text()='View Purchase Order ']";

	public String orderQuantityBoxOfCauliflower="//td[h6[contains(text(),'Cauliflower(Medium) - Grade A')]]//following-sibling::td/input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfTomato ="//td[h6[contains(text(),'Tomato (local) - Grade A')]]//following-sibling::td/input[@ng-model='product.skuQuantity']";
	public String vendorNameAsDevegowda ="//span[text()='Devegowda.cauliflower']";
	
	public String orderTakingLink ="//a[@href='../order-taking/dist/index.html']";
	public String orderTakingPage ="//a[text()='Order Taking']";
	public String customersPage="//span[text()='Customers']";
	public String customerTxtBx="//input[@ng-model='customerName']";
	public String suggestedCustomer="//div[@class='panel-heading']/h4/div";
	public String theLeelaPalacPage ="//label[text()='The Leela Palace']";
	public String cauliflowerTxtBx="//td[h6[text()='Cauliflower - Grade A']]/following-sibling::td//input";
	public String tomatoLocalTxtBx="//td[h6[text()='Tomato (local) - Grade A']]/following-sibling::td//input";
	public String placeOrderBtn="//span[text()='Place Order']";
	public String confirmOrderBtn="//button[text()='Confirm']";
	public String OKBtn="//button[@ng-click='ctrl.closeDialog()']";
	public String takeOrderBtn="//button[@ng-click='takeOrder(customer)']";
	public String editOrderBtn="//span[text()=' Edit Order']";
	
	public String inventoryManagementLink="//a[@href='#/app/playground/inventory']";
	public String inventoryManagementPage="//h1[text()='Inventory Management ']";
	public String actionDropDown="//div[@placeholder='Select a mode...']";
	public String pullStockfromGrading="//span[text()='Pull Stock from Grading']";
	public String cauliflowerMediumInventryChkBx="//td[h5[text()='Cauliflower(Medium) - Grade A - 4 pcs Cauliflower lot']]/preceding-sibling::td/button";
	public String cauliflowerMediumInventryTxtBx="//td[h5[text()='Cauliflower(Medium) - Grade A - 4 pcs Cauliflower lot']]/following-sibling::td/input";
	public String tomatoLocalInventruChkBx="//td[h5[text()='Tomato (local) - Grade A - 8 Kg Tomato Lot']]/preceding-sibling::td/button";
	public String tomatoLocalInventruTxtBx="//td[h5[text()='Tomato (local) - Grade A - 8 Kg Tomato Lot']]/following-sibling::td/input";
	public String stockUpdateBtn="//button[@ng-click='ctrl.bulkTransfer()']";
	public String pushToRegrading="//span[text()='Push to Regrading']";

	
//Bifrost For Direct Application
	public String orderQuantityBoxOfAppleWashington="//td[h6[contains(text(),'Apple Washington (big) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfBananaYellaki="//td[h6[contains(text(),'Banana yellaki - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityTextBoxOfCauliflower="//td[h6[contains(text(),'Cauliflower - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfChiccoSapota="//td[h6[contains(text(),'Chicco (sapota) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfLemonSmall="//td[h6[contains(text(),'Lemon (small) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfMosambiSweetlime="//td[h6[contains(text(),'Mosambi (sweet lime) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfOnionGradedLocal="//td[h6[contains(text(),'Onion - Graded (Local) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfPotatoLocalHassan="//td[h6[contains(text(),'Potato (local) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfTomatoLocal="//td[h6[contains(text(),'Tomato (local) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfOrangeNagpura="//td[h6[contains(text(),'Orange (nagpura) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String nextBtn="//a[text()='Next']";
	public String searchTextBoxOnCreatePurchaseOrder="//label[text()='Search:']/input";
	public String snakeGuardTextBox="//td[h6[contains(text(),'Snake gourd - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxOfCornSweet="//td[h6[contains(text(),'Corn (baby) - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	
	public String realTimeStockTrackerlink="//a[span[text()='Real Time Stock Track']]";
	public String realtimeStocktrackerPage="//h1[text()='Real Time Stock Track ']";
	public String categoryDropDown="(//span[@class='btn btn-default form-control ui-select-toggle'])[3]";
	public String vagetablesAsCategory="//a[span[text()='Vegetables']]";
	public String fruitsAsCategory="//a[span[text()='Fruits']]";
	public String searchTextBoxOnRealTimeTrackerPage="//input[@placeholder='Type here to search....']";
	public String cauliflowerSupplyBox="//td[text()='Cauliflower']/following-sibling::td[4]";
	public String tomatoSupplyBox="//td[text()='Tomato (local)']/following-sibling::td[4]";
	public String lemonSupplyBox="//td[text()='Lemon (small)']/following-sibling::td[4]";
	public String onionSupplyBox="//td[text()='Onion - Graded (Local)']/following-sibling::td[4]";
	public String potatoSupplyBox="//td[text()='Potato (local)']/following-sibling::td[4]";
	public String cornSupplyBox="//td[text()='Corn (baby)']/following-sibling::td[4]";
	public String appleSupplyBox="//td[text()='Apple Washington (big)']/following-sibling::td[4]";
	public String bananaSupplyBox="//td[text()='Banana yellaki']/following-sibling::td[4]";
	public String mosambiSupplyBox="//td[text()='Mosambi (sweet lime)']/following-sibling::td[4]";
	public String orangeSupplyBox="//td[text()='Orange (nagpura)']/following-sibling::td[4]";
	
	//28Dec
	public String ninjaAsfacility="//a/span[text()='ninja']";
	public String kalasipalyaAsVendor="//a/span[text()='Kalasipalya cash purchase']";
	public String orderQuantityBoxOfArvi="//td[h6[contains(text(),'Arvi - Grade A')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String orderQuantityBoxofPotatoLocal="//td[h6[contains(text(),'Potato (local)')]]/following-sibling::td//input[@ng-model='product.skuQuantity']";
	public String cauliflowerPurchasePrice="//td[h6[contains(text(),'Cauliflower(Medium) - Grade A')]]//following-sibling::td//input[@ng-model='product.purchasePrice']";
	public String tomatoPurchasePrice="//td[h6[contains(text(),'Tomato (local) - Grade A')]]//following-sibling::td//input[@ng-model='product.purchasePrice']";
	
	//2 jan 2017
	
	public String salePriceLink="//a[span[text()='Sale Price']]";
	public String salePriceManagementPage="//h1[text()='Sale Price Managment ']";
	public String removeSlabsBtn="//button[@ng-click='ctrl.removeCurrentSlabs()']";
	public String facilityDropDown="//span[span[text()='Select a facility']]";
	public String chooseFileBtn ="(//input[@type='file'])[last()]";
	public String uploadCSVBtn ="//button[@ng-click='ctrl.uploadSkuSlabs(csv.result)']";
	public String skuSlabPricing="//a[text()='Sku Slab Pricing']";
	public String successMsg="//div[text()='Success']";
	
	
	
	
	
	
	
}
