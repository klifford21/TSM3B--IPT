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

	
	//Method 4:CHERRY
     public void getctype(String ctype)
    {
        this.ctype = ctype;
    }
    
    public String showctype()
    {
        return ctype;

	
	//Method 5:CHERRY
     public void getccolor(String ccolor)
    {
        this.ccolor = ccolor;
    }
    
    public String showccolor()
    {
        return ccolor;
	
	
	//Method 6:CHERRY
     public void getcgas(String cgas)
    {
        this.cgas = cgas;
    }
    
    public String showcgas()
    {
        return cgas;
    }
}
