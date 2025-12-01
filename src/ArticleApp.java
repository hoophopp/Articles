package www.example2.exe;

public class ArticleApp {

	public static void main(String[] args) {
		Article.setVatRate(19.0);
		// --- 5. إنشاء 3 كائنات باستخدام constructors مختلفة ---
		Article a1 = new Article();
		a1.setReference("A001");
        a1.setDesignation("Laptop");
        a1.setPriceExclTax(1000);
      
        
     // constructor بالـ reference و designation 
        Article a2 = new Article("A002", "Mouse");
        a2.setPriceExclTax(50);
        //another constructor
        Article a3 = new Article("A003", "Keyboard", 80);
       
        System.out.println(a1.getDesignation() + " price incl. VAT: " + a1.calculatePriceIncludingTax());
        System.out.println(a2.getDesignation() + " price incl. VAT: " + a2.calculatePriceIncludingTax());
        System.out.println(a3.getDesignation() + " price incl. VAT: " + a3.calculatePriceIncludingTax());

        // --- يمكن أيضًا عرض المعلومات بالكامل ---
        System.out.println("\nDisplaying full article info:");
        a1.displayArticle();
        a2.displayArticle();
        a3.displayArticle();
        
        System.out.println(a1.toString());
        System.out.println(a1);
        //calling directly the tostring even if we didnt use it we gonna get the same result
        //----there is class bigger than the mum class it class (OBBJET)----//
	}
}
