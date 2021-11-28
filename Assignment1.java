class ProductDetails {
	String pName,pCode,bAuthour;
	int pPrice,pQty;
	
	void getProductDetails(){
		System.out.println("Product name is "+pName);
		System.out.println("Authour name is "+bAuthour);
		System.out.println("Product code is "+pCode);
		System.out.println("Product price is $"+pPrice);
		System.out.println("Product quantity is "+pQty);
	}
	
	public static void main(String[] args){
		ProductDetails pd = new ProductDetails();
		pd.pName = "JAVA 1st Edition";
		pd.bAuthour = "SuperMan";
		pd.pCode = "XGSHKSK";
		pd.pPrice = 199;
		pd.pQty = 2;
		pd.getProductDetails();
	}
	
}
