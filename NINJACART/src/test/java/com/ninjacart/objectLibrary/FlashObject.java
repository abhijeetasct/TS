/**
 * 
 */
package com.ninjacart.objectLibrary;

/**
 * @author Abhijeet
 *
 */
public class FlashObject {
	
	public String flashUserName ="//android.widget.EditText[@text='Username']";
	public String flashPassword="//android.widget.EditText[@password='true']";
	public String flashLoginBtn="//android.widget.TextView[@text='Login']";
	
	public String recevingTag="//android.widget.TextView[@text='Receiving']";
	public String manualGradingTAb ="//android.widget.TextView[@text='Manual - Grading']";
	public String vendorName ="(//android.widget.TextView[@text='Vamsi'])[1]";
	public String arrivedBtn="//android.widget.TextView[@text='Arrived']";
	public String allSKUCheckBox="//android.widget.LinearLayout[android.widget.TextView[@text='SKU']]/preceding-sibling::android.widget.LinearLayout/android.widget.CheckBox";
	public String yesBtn="//android.widget.Button[@text='Yes']";
	public String recevingBackBtn="//android.widget.TextView[@text='Receiving']/preceding-sibling:: android.widget.ImageView";
	public String ChooseQuality1 ="(//android.widget.TextView[@text='Choose Quality'])[1]";
	public String backBtn="//android.widget.ImageView[@resource-id='com.ninja.flash:id/cancelPurchaseOrders']";
	public String chooseQualityDrpDwn="//android.widget.TextView[@text='Quality']/following-sibling::android.widget.RelativeLayout/android.widget.Spinner//android.widget.TextView[@text='Choose Quality']";
	public String qualityAsGood="//android.widget.TextView[@text='Good']";
	public String chooseSizeDrpDwn="//android.widget.TextView[@text='Choose Size']";
	public String sizeAsMedium="//android.widget.TextView[@text='Medium']";
	public String confirmBtn="//android.widget.TextView[@text='Confirm']";
	public String totalWeightTxtBox="//android.widget.EditText[@resource-id='com.ninja.flash:id/etTotalWeight']";
	public String noOfCratesTxtBx="//android.widget.EditText[@resource-id='com.ninja.flash:id/etNoOfCrates']";
	public String crateWeightTxtBx="//android.widget.EditText[@resource-id='com.ninja.flash:id/etCrateWeight']";
	public String add_CalcBtn="//android.widget.TextView[@resource-id='com.ninja.flash:id/tvAddOrCalc']";
	public String ripeStateDrpDwn="//android.widget.TextView[@text='Choose Ripe State']";
	public String ripeStateAsRipped="//android.widget.TextView[@text='Ripened']";
	public String averageWeightDropDown="//android.widget.TextView[@text='Choose Average Weight']";
	public String averageWeightAs2_3="//android.widget.TextView[@text='2 to 3 kg']";
	public String manualGradingScreen="//android.widget.TextView[@text='Manual Grading']";
	public String gradingTab="//android.widget.TextView[@text='Grading']";
	public String gradingToGradingTab="//android.widget.TextView[@text='Regrading-To-Grading']";
	public String returnsToGradingTab ="//android.widget.TextView[@text='Returns-To-Grading']";
	public String gradingStartBtn="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]//following-sibling:: android.widget.LinearLayout[3]//android.widget.ImageView";
	public String papayaGradingStartBtn ="//android.widget.LinearLayout[android.widget.TextView[@text='Papaya (round)']]//following-sibling:: android.widget.LinearLayout[3]/android.widget.RelativeLayout";
	public String potatoGradingStartBtn ="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]//following-sibling:: android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView";									
	public String gradingStartedBtn="(//android.widget.RelativeLayout[android.widget.ImageView[@index=0]])[2]";
	public String enterGradingQuantityScreen="//android.widget.TextView[@text='Enter Grading Quantity']";
	public String gradingQuantityTxtBx="//android.widget.TextView[@text='Grading Quantity']/following-sibling:: android.widget.EditText";
	public String startBtn="//android.widget.Button[@text='Start']";
	public String gradingStartBtn2="(//android.widget.RelativeLayout[android.widget.ImageView[@index=0]])[3]";
	public String gradingStartBtn3="(//android.widget.RelativeLayout[android.widget.ImageView[@index=0]])[4]";
	public String GRNQuantityTxtBx="//android.widget.EditText[@resource-id='com.ninja.flash:id/etWastageQuantity']";
	public String finishGradingBtn="//android.widget.TextView[@text='FINISH GRADING']";
	public String refreshBtn="//android.widget.TextView[@text='Refresh']/following-sibling::android.widget.ProgressBar";
	
	
	
	public String clickSKUForTotalWeight="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='SKU']]]/following-sibling::android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[@index='2']/android.widget.TextView[@index=0]";
	public String sKUScreen="//android.widget.TextView[@text='SKU']";
	public String gradeMoreBtn="//android.widget.TextView[@text='Grade More']";
	public String PoStatusTrackerTab="//android.widget.TextView[@text='PO Status Tracker']";
	public String PoListScreen="//android.widget.TextView[@text='PO List']";
	public String waitingForGeadingBtn="(//android.widget.TextView[@text='Waiting for grading'])[1]";
	public String waitingForGeadingBtn2="(//android.widget.TextView[@text='Waiting for grading'])[2]";
	public String PoListBackBtn="//android.widget.TextView[@text='PO List']/preceding-sibling::android.widget.ImageView";
	public String totalWeightTxtBoxForESQ="(//android.widget.TextView[@text='Calc']/preceding-sibling::android.widget.EditText)[1]";
	public String noOfCratesTxtBxForESQ="(//android.widget.TextView[@text='Calc']/preceding-sibling::android.widget.EditText)[2]";
	public String crateWeightTxtBxForESQ="(//android.widget.TextView[@text='Calc']/preceding-sibling::android.widget.EditText)[3]";
	public String CalcBtn="//android.widget.TextView[@text='Calc']";
	public String POByDevegowda="(//android.widget.TextView[@text='Devegowda.cauliflower'])[1]";
	//public String POByDevegowda="(//android.widget.TextView[@text='Kalasipalya cash purchase'])[1]";
	public String POByDevegowda2="(//android.widget.TextView[@text='Devegowda.cauliflower'])[2]";
	public String cauliflowerAsSKU="//android.widget.TextView[@text='Cauliflower(Medium)']";
	public String tomatoAsSKU="//android.widget.TextView[@text='Tomato (local)']";
	public String searchSKUText="//android.widget.TextView[@text='Search SKU']";
	public String fetchBtn="//android.widget.TextView[@text='Fetch']";
	public String searchSKUTextBox="//android.widget.TextView[@text='Search Sku']/preceding-sibling:: android.widget.EditText";
	public String arrivalTimeAsNullForCauliFlower ="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower(Medium)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView[@text='----']";
	public String arrivalTimeAsNullForTomato="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView[@text='----']";
	public String cauliflowerCheckBox ="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower(Medium)']]/preceding-sibling::android.widget.LinearLayout/android.widget.CheckBox";
	public String tomatoCheckBox ="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/preceding-sibling::android.widget.LinearLayout/android.widget.CheckBox";
	public String enterSupplyQuantityScreen="//android.widget.TextView[@text='Enter supply quantity']";
	//public String supplyQuantityTextBox ="//android.widget.EditText[@resource-id='com.ninja.flash:id/etSaveQty']";
	public String supplyQuantityTextBox="//android.widget.TextView[@resource-id='com.ninja.flash:id/tvSupplyQty']/following-sibling:: android.widget.EditText";
	public String saveBtn="//android.widget.Button[@text='Save']";
	public String cauliflowerGradingStartBtn="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower(Medium)']]//following-sibling::android.widget.LinearLayout[3]/android.widget.RelativeLayout";
	public String tomatoGradingStartBtn="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]//following-sibling::android.widget.LinearLayout[3]/android.widget.RelativeLayout";
	public String lottingTab="//android.widget.TextView[@text='Lotting']";
	public String totalLotsTextBox="(//android.widget.EditText[@resource-id='com.ninja.flash:id/etVariableLotCount'])[1]";
	public String totalLotsTextBoxVariable="(//android.widget.TextView[@text='8 Kg Tomato Lot'])/following-sibling:: android.widget.EditText";
	public String finishBtn="//android.widget.TextView[@text='FINISH']";
	public String transferQuantity="//android.widget.EditText[@resource-id='com.ninja.flash:id/etTotQuantity']";
	public String gradingBackBtn="//android.widget.ImageView[@resource-id='com.ninja.flash:id/cancelGrading']";
	public String manualGradingBackBtn="//android.widget.ImageView[@resource-id='com.ninja.flash:id/ivBackButton']";
	public String editSupplyQuantityScreen="//android.widget.TextView[@text='Edit Supply Quantity']";
	public String doneBtn="//android.widget.TextView[@text='Done']";
	public String toggleSwitch="//android.widget.Switch[@resource-id='com.ninja.flash:id/toggleSkuVariant']";
	public String SKUVarientGRNQuantityTxtBx="(//android.widget.TextView[@text='GRN Quantity'])[2]/following-sibling::android.widget.EditText";
	public String regradinfToGradingTab="//android.widget.TextView[@text='Regrading-To-Grading']";
	public String regradingScreen="//android.widget.TextView[@text='Regrading']";
	public String goodStockTxtBx="//android.widget.EditText[@resource-id='com.ninja.flash:id/etGoodStock']";
	public String noOfLots="//android.widget.EditText[@resource-id='com.ninja.flash:id/etNoOfLots']";
	public String lotiingBackBtn="//android.widget.ImageView[@resource-id='com.ninja.flash:id/cancelLot']";
	public String goodTStockVarienTxtBox="(//android.widget.EditText[@resource-id='com.ninja.flash:id/etSkuVariantGoodStock'])[2]";
	public String noOflotsVarientTxtBx="(//android.widget.EditText[@resource-id='com.ninja.flash:id/etSkuVariantNoOfLots'])[2]";
	
	
	
	
	
	
	
	
}
