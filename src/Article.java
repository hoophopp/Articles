package www.example2.exe;

public class Article {
	


    // Attributes
    private String reference;
    private String designation;
    private double priceExclTax;
    
    // VAT rate is shared by all articles → static
    private static double vatRate;
    
    //A default constructor (without parameters).
    public Article(){
    	this.designation = "";
    	this.reference = "";
    	this.priceExclTax = 0.0;
    }

    // Constructor
    //A constructor that initializesall attributes.
    public Article(String reference, String designation, double priceExclTax) {
        this.reference = reference;
        this.designation = designation;
        this.priceExclTax = priceExclTax;
    }
    
    //A constructor that allows setting the reference and designation during instantiation.
    public Article(String reference , String designation ) {
    	this.reference = reference;
    	this.designation = designation;
    	this.priceExclTax = 0.0;
    }

    // --- Getters and Setters ---
    // Reference
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }

    // Designation
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Price excluding tax
    public double getPriceExclTax() {
        return priceExclTax;
    }
    public void setPriceExclTax(double priceExclTax) {
        this.priceExclTax = priceExclTax;
    }

    // VAT rate → static getter and setter
    public static double getVatRate() {
        return vatRate;
    }
    public static void setVatRate(double rate) {
        vatRate = rate;
    }

    /*Implement the calculatePriceIncludingTax() method. This method should calculate the price including
	tax for an article, which is equivalent to: price_excluding_tax + (price_excluding_tax * VAT_rate / 100)
	and return the calculated value.
	*/
    public double calculatePriceIncludingTax() {
    	double d ;
    	d = priceExclTax + (priceExclTax * vatRate / 100);
    	return d;
    }
    
    public void displayArticle() {
        System.out.println("Article Information:");
        System.out.println("Reference: " + getReference());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Price (Excl. Tax): " + getPriceExclTax());
        System.out.println("VAT Rate: " + getVatRate() + "%");
        System.out.println("Price (Incl. Tax): " + calculatePriceIncludingTax());
        System.out.println("---------------------------");
    }

    
    
    
    
    
    
    
}
