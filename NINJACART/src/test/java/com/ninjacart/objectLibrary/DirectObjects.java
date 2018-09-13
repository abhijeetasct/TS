/**
 * 
 */
package com.ninjacart.objectLibrary;

/**
 * @author Abhijeet
 *
 */


public class DirectObjects {
	//Preconditions Objects
	public String skuPlusBtn="(//android.widget.ImageView[@index='2'])[3]";
	

	public String mUserName = "//android.widget.EditText[@text='Enter Username']";
	public String mPassword = "//android.widget.EditText[@password='true']";
	public String mLoginBtn = "//android.widget.TextView[@text='LOGIN']";
	public String directAppHomeScreen = "//android.widget.TextView[@text='Vegetables']";
	public String fruitsTab ="//android.widget.TextView[@text='Fruits']";
	public String totalArrowBtn = "//android.widget.TextView[@resource-id='com.nc.direct:id/checkoutValueHeader']/following-sibling:: android.widget.ImageView";
	public String myCartScreen = "//android.widget.TextView[@text='My Cart']";
	public String minimumOrderValueAlertMsg = "//android.widget.TextView[@text='Minimum order value Rs 1000.0']";
	public String placeOrderText = "//android.widget.TextView[@text='PLACE ORDER : ']";
	public String confirmOrderDetailsScreen = "//android.widget.TextView[@text='Kindly confirm your order details']";
	public String confirmBtn="//android.widget.TextView[@text='Confirm']";
	public String orderConfirmedScreen = "//android.widget.TextView[@text='Order Confirmed']";
	public String orderPlacedSuccessfullyMsg = "//android.widget.TextView[@text='Order Placed Successfully']";
	public String orderSummaryBtn = "//android.widget.TextView[@text='ORDER SUMMARY']";
  //Veg
	//public String cauliflowerMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	//public String cauliflowerPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	//public String cartValueAs1 = "//android.widget.TextView[@text='1']";
	/*public String cauliflowerPriceAsRs22 = "//android.widget.TextView[@text='Cauliflower']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 22.0']/following-sibling:: android.widget.TextView[@text=' / Pcs']";
	public String cauliflowerAsMin4Pcs = "//android.widget.TextView[@text='Cauliflower']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='4 Pcs']";
	public String cauliflowerQuantityAs4Pcs="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='4']";
	public String cauliflowerQuantityAs12Pcs="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='12']";
	public String totalAs88="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling:: android.widget.TextView[@text='Rs 88']";
	public String cauliflowerQuantityAs8Pcs="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='8']";
	public String totalAs176="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling:: android.widget.TextView[@text='Rs 176']";
	public String lemonPriceAs175="//android.widget.TextView[@text='Lemon (small)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 1.75']/following-sibling::android.widget.TextView[@text=' / Pcs']";
	public String lemonAsMin20Pcs="//android.widget.TextView[@text='Lemon (small)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='20 Pcs']";*/
	/*public String lemonMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String lemonPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String cartValueAs2="//android.widget.TextView[@text='2']";*/
	
	
	/*public String totalAs123="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 123']";
	public String lemonQuantityAs20="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='20']";
	public String lemonQuantityAs40="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='40']";
	public String totalAs158="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 158']";
	public String onionMinusButtoon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String onionPlusButtoon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String onionAsMin10Kg="//android.widget.TextView[@text='Onion - Graded (Local)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='10 Kg']";
	public String onionPriceAsRs17="//android.widget.TextView[@text='Onion - Graded (Local)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 17.0']/following-sibling::android.widget.TextView[@text=' / Kg']";
	public String onionQuantityAs10="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String onionQuantityAs20="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='20']";
	public String totalAs293="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 293']";
	public String totalAs463="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 463']";
	public String potatoMinusButon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String potatoPlusButon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String potatoPriceAs22="//android.widget.TextView[@text='Potato (local)-Hassan']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 22.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String potatoMinAs10Kg="//android.widget.TextView[@text='Potato (local)-Hassan']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='10 Kg']";
	public String potatoQuantityAs10="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String potatoQuantityAs20="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='20']";
	public String totalAs513="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 513']";
	public String totalAs733="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 733']";
	public String tomatoMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String tomatoPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String tomatoPriceAs5="//android.widget.TextView[@text='Tomato (local)']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 5.5']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String tomatoMinAs8Kg="//android.widget.TextView[@text='Tomato (local)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='8 Kg']";
	public String tomatoQuantityAs8="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='8']";
	public String tomatoQuantityAs16="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='16']";
	public String totalAs557="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 557']";
	public String totalAs601="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 601']";
	public String placeOrderPriceAs557="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 557']";
  //Fruits
	public String applePlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String appleMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String applePriceAs130="//android.widget.TextView[@text='Apple Washington (small)']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 130.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String appleMinAs5Kg="//android.widget.TextView[@text='Apple Washington (small)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='5 Kg']";
	public String appleQuantityAs5Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='5']";
	public String appleQuantityAs10Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String totalAs1207="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 1207']";
	public String totalAs1857="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 1857']";
	public String bananaPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String bananaMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String bananaPriceAs50="//android.widget.TextView[@text='Banana yellaki']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 50.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String bananaMinAs5Kg="//android.widget.TextView[@text='Banana yellaki']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='5 Kg']";
	public String bananaQuantityAs5Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='5']";
	public String bananaQuantityAs10Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String totalAs1457="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 1457']";
	public String totalAs1707="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 1707']";
	public String chiccoPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String chiccoMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String chiccoPriceAs62="//android.widget.TextView[@text='Chicco (sapota)']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 62.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String chiccoMinAs5Kg="//android.widget.TextView[@text='Chicco (sapota)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='5 Kg']";
	public String chiccoQuantityAs5Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='5']";
	public String chiccoQuantityAs10Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String totalAs1767="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 1767']";
	public String totalAs2077="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 2077']";
	public String mosambiPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String mosambiMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String mosambiPriceAs95="//android.widget.TextView[@text='Mosambi (sweet lime)']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 95.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	public String mosambiMinAs5Kg="//android.widget.TextView[@text='Mosambi (sweet lime)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='5 Kg']";
	public String mosambiQuantityAs5Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='5']";
	public String mosambiQuantityAs10Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String totalAs2242="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 2242']";
	public String totalAs2717="//android.widget.TextView[@resource-id='com.nc.skadi:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 2717']";
	public String orangePlusButton ="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String orangeMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
	//public String orangePriceAs55="//android.widget.TextView[@text='Orange (nagpura)']//following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Rs 55.0']/following-sibling:: android.widget.TextView[@text=' / Kg']";
	//public String orangeMinAs5Kg="//android.widget.TextView[@text='Orange (nagpura)']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='Min ']/following-sibling::android.widget.TextView[@text='5 Kg']";
	//public String orangeQuantityAs5Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='5']";
	//public String orangeQuantityAs10Kg="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	//public String totalAs2517="//android.widget.TextView[@resource-id='com.nc.direct:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 2517']";
	//public String totalAs2792="//android.widget.TextView[@resource-id='com.nc.direct:id/checkoutValueHeader']/following-sibling::android.widget.TextView[@text='Rs 2792']";
  //MyCart(Veg)
	/*public String myCartCauliflowerPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartCauliflowerMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
	//public String placeOrderPriceAs2605="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2605']";
	//public String myCartCauliflowerQuantityAs8Pcs="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='8']";
//	public String myCartCauliflowerQuantityAs12Pcs="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='12']";
//	public String placeOrderPriceAs2693="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2693']";
//	/*public String myCartLemonPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
//	public String myCartLemonMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
//	public String placeOrderPriceAs2640="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2640']";
//	public String myCartLemonQuantityAs40Pls="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='40']";
//	public String myCartLemonQuantityAs60Pls="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='60']";
//	public String placeOrderPriceAs2675="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2675']";
//	/*public String myCartPotatoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
//	public String myCartPotatoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
//	public String placeOrderPriceAs2860="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2860']";
//	public String myCartPotatoQuantityAs20Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='20']";
//	public String myCartPotatoQuantityAs30Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)-Hassan']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='30']";
//	public String placeOrderPriceAs3080="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 3080']";
//	//public String mycartTomatoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
//	//public String mycartTomatoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
//	public String placeOrderPriceAs2904="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2904']";
//	public String myCartTomatoQuantityAs16Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='16']";
//	public String myCartTomatoQuantityAs24Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='24']";
//	public String placeOrderPriceAs2948="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 2948']";
//	/*public String mycartOnionPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
//	public String mycartOnionMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
//	public String placeOrderPriceAs3074="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 3074']";
//	public String myCartOnionQuantityAs20Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='20']";
//	public String myCartOnionQuantityAs30Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='30']";
//	//public String placeOrderPriceAs3244="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 3244']";
//	//public String totalValueAs5034="//android.widget.TextView[@text='Total Value ']/following-sibling::android.widget.TextView[@text=' Rs 5034.0']";
	
	//MyCart Fruits
	/*public String myCartApplePlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartAppleMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";*/
	/*public String placeOrderPriceAs3724="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 3724']";
	public String myCartAppleQuantityAs10Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='10']";
	public String myCartAppleQuantityAs15Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='15']";
	public String placeOrderPriceAs4374="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 4374']";
	public String myCartBananaPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartBananaMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String placeOrderPriceAs3974="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 3974']";
	public String myCartBananaQuantityAs10Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='10']";
	public String myCartBananaQuantityAs15Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='15']";
	public String placeOrderPriceAs4224="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 4224']";
	public String myCartChiccoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartChiccoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String placeOrderPriceAs4284="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 4284']";
	public String myCartChiccoQuantityAs10Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='10']";
	public String myCartChiccoQuantityAs15Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='15']";
	public String placeOrderPriceAs4594="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 4594']";
	public String myCartMosambiPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartMosambiMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String placeOrderPriceAs4759="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 4759']";
	public String myCartMosambiQuantityAs10Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='10']";
	public String myCartMosambiQuantityAs15Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='15']";
	public String placeOrderPriceAs5234="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 5234']";
	public String myCartOrangePlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartOrangeMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String placeOrderPriceAs5034="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 5034']";
	public String myCartOrangeQuantityAs10Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='10']";
	public String myCartOrangeQuantityAs15Kg="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.TextView[@text='15']";
	public String placeOrderPriceAs5309="//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView[@text='Rs 5309']";
	*/
	public String editOrderBtn="//android.widget.TextView[@resource-id='com.nc.direct:id/tvContinueInEdit']";
	public String viewOrderBtn="//android.widget.TextView[@text='View Order']";
	public String sKUSearchBox="//android.widget.EditText[@text='Search']";
	public String orderDetailsScreen="//android.widget.TextView[@text='ORDER DETAILS']";
	public String orderValueText="//android.widget.TextView[@text='Order Value ']";
	public String deliveryChargesText="//android.widget.TextView[@text='Delivery Charges']";
	public String totalValueText="//android.widget.TextView[@text='Total Value ']";
	public String deliveryDateText="//android.widget.TextView[@text='Delivery Date']";
	public String cancelBtn="//android.widget.TextView[@text='Cancel']";
	
	//14 Dec
	public String cartValueAs1="//android.widget.TextView[@text='1']";
	public String cartValueAs2="//android.widget.TextView[@text='2']";
	public String cartValueAs3="//android.widget.TextView[@text='3']";
	public String cartValueAs4="//android.widget.TextView[@text='4']";
	public String cartValueAs5="//android.widget.TextView[@text='5']";
	public String cartValueAs6="//android.widget.TextView[@text='6']";
	public String cartValueAs7="//android.widget.TextView[@text='7']";
	public String cartValueAs8="//android.widget.TextView[@text='8']";
	public String cartValueAs9="//android.widget.TextView[@text='9']";
	public String cartValueAs10="//android.widget.TextView[@text='10']";
	public String cartValueAs11="//android.widget.TextView[@text='11']";
	
	public String cauliflowerPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String cauliflowerMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String cauliflowerPrice="//android.widget.TextView[@text='Cauliflower']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String cauliflowerMinQuantity="//android.widget.TextView[@text='Cauliflower']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String totalPrice="(//android.widget.TextView[@resource-id='com.nc.direct:id/checkoutValueHeader']/following-sibling::android.widget.TextView)[1]";
	public String cauliflowerQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String cauliflowerQty="//android.widget.TextView[@text='Cauliflower']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String lemonPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String lemonMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String lemonPrice="//android.widget.TextView[@text='Lemon (small)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String lemonMinQuantity="//android.widget.TextView[@text='Lemon (small)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String lemonQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String lemonQty="//android.widget.TextView[@text='Lemon (small)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String onionMinusButtoon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String onionPlusButtoon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String onionPrice="//android.widget.TextView[@text='Onion - Graded (Local)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String onionMinQuantity="//android.widget.TextView[@text='Onion - Graded (Local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String onionQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String onionQty="//android.widget.TextView[@text='Onion - Graded (Local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String potatoMinusButon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String potatoPlusButon="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String potatoPrice="//android.widget.TextView[@text='Potato (local)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String potatoMinQuantity="//android.widget.TextView[@text='Potato (local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String potatoQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String potatoQty="//android.widget.TextView[@text='Potato (local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String tomatoMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String tomatoPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String tomatoPrice="//android.widget.TextView[@text='Tomato (local)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String tomatoMinQiuantity="//android.widget.TextView[@text='Tomato (local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String tomatoQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String tomatoQty="//android.widget.TextView[@text='Tomato (local)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String cornPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String cornMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String cornPrice="//android.widget.TextView[@text='Corn (baby)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String cornMinQuantity="//android.widget.TextView[@text='Corn (baby)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String cornQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String cornQty="//android.widget.TextView[@text='Corn (baby)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	//15 Dec
	public String applePlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String appleMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String applePrice="//android.widget.TextView[@text='Apple Washington (big)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String appleMinQuantity="//android.widget.TextView[@text='Apple Washington (big)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String appleQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String appleQty="//android.widget.TextView[@text='Apple Washington (big)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String bananaPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String bananaMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String bananaPrice="//android.widget.TextView[@text='Banana yellaki']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String bananaMinQuantity="//android.widget.TextView[@text='Banana yellaki']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String bananaQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String bananaQty="//android.widget.TextView[@text='Banana yellaki']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String chiccoPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String chiccoMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String chiccoPrice="//android.widget.TextView[@text='Chicco (sapota)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String chicooMinQuantity="//android.widget.TextView[@text='Chicco (sapota)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String chiccoQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String chiccoQty="//android.widget.TextView[@text='Chicco (sapota)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String mosambiPlusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String mosambiMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String mosambiPrice="//android.widget.TextView[@text='Mosambi (sweet lime)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String mosambiMinQuantity="//android.widget.TextView[@text='Mosambi (sweet lime)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String mosambiQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String mosambiQty="//android.widget.TextView[@text='Mosambi (sweet lime)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	
	public String orangePlusButton ="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String orangeMinusButton="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String orangePrice="//android.widget.TextView[@text='Orange (nagpura)']//following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[1]";
	public String orangeMinQuantity="//android.widget.TextView[@text='Orange (nagpura)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2]";
	public String orangeQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	public String orangeQty="//android.widget.TextView[@text='Orange (nagpura)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvMultipleQty']";
	public String orangeSearchQty="//android.widget.TextView[@text='Orange (nagpura)']//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[@resource-id='com.nc.direct:id/tvSearchMultipleQty']";
	//mycart
	
	public String PLACEORDERValue="(//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView)[1]";
	public String myCartCauliflowerPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartCauliflowerMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartCauliflowerQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	//public String myCartCauliflowerMinQuantity="//android.widget.TextView[@text='Cauliflower']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	
	
	public String myCartLemonPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartLemonMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartLemonQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartPotatoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartPotatoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartPotatoQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String mycartTomatoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String mycartTomatoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartTomatoQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String mycartOnionPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String mycartOnionMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartOnionQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartCornQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartApplePlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartAppleMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String mycartAppleQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartBananaPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String myCartBananaMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='0']";
	public String myCartbananaQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartChiccoPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartChiccoMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String MyCartChiccoQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Chicco (sapota)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartMosambiPlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartMosambiMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String myCartMosambiQuantity="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String myCartOrangePlusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='2']";
	public String myCartOrangeMinusButton="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@index='0']";
	public String mycartOrangeQuantit="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	
	public String orderDetailsTotalPrice="//android.widget.TextView[@text='Total']/following-sibling:: android.widget.TextView";
	public String orangeSearchBoxresult="//android.widget.TextView[@text='Orange (nagpura)']";
	public String EDITORDERBtn="//android.widget.TextView[@text='EDIT ORDER : ']";
	public String orderEditedSuccessMsg="//android.widget.TextView[@text='Your order has been edited successfully']";
	
	public String orderID="//android.widget.LinearLayout [android.widget.TextView[@text='ORDER SUMMARY']]/preceding-sibling:: android.widget.TextView[2]";
	public String cartUpdatedMsg="//android.widget.TextView[@text='Your cart has been updated due to change in prices or stock. Kindly check the order before confirmation.']";
	public String OKBtn="//android.widget.TextView[@text='OK']";
	
	public String cauliflowerStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String cornStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Corn (baby)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String lemonStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String onionStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String appleStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String bananaStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Banana yellaki']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String mosambiStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Mosambi (sweet lime)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String tomatoStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String potatoStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	public String orangeStockOutText="//android.widget.LinearLayout[android.widget.TextView[@text='Orange (nagpura)']]/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='STOCKOUT']";
	
	//3Jan
	public String cauliflowerSlab="//android.widget.TextView[@text='Cauliflower']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	public String lemonSlab="//android.widget.TextView[@text='Lemon (small)']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	public String onionSlab="//android.widget.TextView[@text='Onion - Graded (Local)']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	public String potatoSlab="//android.widget.TextView[@text='Potato (local)']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	public String tomatoSlab="//android.widget.TextView[@text='Tomato (local)']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	public String appleSlab="//android.widget.TextView[@text='Apple Washington (big)']/following-sibling::android.widget.LinearLayout[2]/android.widget.TextView";
	
	public String orderDetailsCauliflowerPrice="//android.widget.LinearLayout[android.widget.TextView[@text='Cauliflower']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String orderDetailsTomatoPrice="//android.widget.LinearLayout[android.widget.TextView[@text='Tomato (local)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String orderDetailsOnionPrice="//android.widget.LinearLayout[android.widget.TextView[@text='Onion - Graded (Local)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String orderDetailsPotatoPrice="//android.widget.LinearLayout[android.widget.TextView[@text='Potato (local)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String orderDetailsApplePrice="//android.widget.LinearLayout[android.widget.TextView[@text='Apple Washington (big)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String orderDetailsLemonPrice="//android.widget.LinearLayout[android.widget.TextView[@text='Lemon (small)']]/following-sibling:: android.widget.LinearLayout/android.widget.TextView";
	public String cabbagePlusBtn="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cabbage local']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[@index='2']";
	public String cabbageQuantity="//android.widget.LinearLayout[android.widget.LinearLayout[android.widget.TextView[@text='Cabbage local']]]/following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
	//...............................13 jan
	
	public String discountMsg="//android.widget.TextView[@text='Order for Rs 5000 and get 10 % discount']";
	public String discountPrice="(//android.widget.TextView[@resource-id='com.nc.direct:id/checkoutValueHeader']/following-sibling::android.widget.TextView)[2]";
	public String PLACEORDERDiscountedPrice="(//android.widget.TextView[@text='PLACE ORDER : ']/following-sibling::android.widget.TextView)[2]";
	public String discountPopup="//android.widget.ImageView[@resource-id='com.nc.direct:id/ivPopupOfferBtnClose']";
	public String discountMsgAs15="//android.widget.TextView[@text='Order for Rs 9000 and get 15 % discount']";
	public String subTotal="//android.widget.TextView[@text='Sub Total']/following-sibling:: android.widget.TextView";
	public String discount="//android.widget.TextView[@text='Discount']/following-sibling::android.widget.TextView";
	
	
	
	
	
	
	
}

