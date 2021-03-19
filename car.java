package carDetails;

public class java 
{ 
    private String cname;
    private String cbrand;
    private String price;

	//Method 1:KLIFFORD
    public void getcname(String cname)
    {
        this.cname = cname;

    }	
	public String showcname()
    {
        return cname;
    }
	//Method 2:KLIFFORD
    public void getcbrand(String cbrand)
    {
        this.cbrand = cbrand;
    }
    
    public String showcbrand()
    {
        return cbrand;
    }
	//Method 3:KLIFFORD
     public void getprice(String price)
    {
        this.price = price;
    }
    
    public String showprice()
    {
        return price;
    }
}
