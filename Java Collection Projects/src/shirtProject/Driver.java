package shirtProject;

public class Driver {
	public static void main(String[] args) {
		Service service = new Service();
		service.addShirt(new Shirt("Arrow", 1234.5, "Red", 40));
		service.addShirt(new Shirt("BlackBerry", 3234.5, "White", 42));
		service.addShirt(new Shirt("Arrow", 1234.5, "Red", 38));
		service.addShirt(new Shirt("LP", 3234.5, "Black", 40));
		
		// Qa
		System.out.println("\n==================== Qa =====================");
		service.displayAllShirts();
		
		
		// Qb
		System.out.println("\n==================== Qb =====================");
		service.displayAllShirtsOfArrowBrand();
		
		
		// Qc
		System.out.println("\n==================== Qc =====================");		
		service.displayAllShirtsOfBlackberryBrandAndSize40();
		
		
		// Qd
		System.out.println("\n==================== Qd =====================");
		service.displayAllShirtsOfPriceBelow2500();
		
		// Qe
		System.out.println("\n==================== Qe =====================");
		service.displayAllShirtsOfSize40AndPriceGreaterThan2000();
		
		// Qf
		System.out.println("\n==================== Qf =====================");
		service.sortOnSizeLowToHigh();
		
		// Qg
		System.out.println("\n==================== Qg =====================");
		service.sortOnSizeHighToLow();
		
		// Qh
		System.out.println("\n==================== Qh =====================");
		service.sortOnPriceLowToHigh();
		
		// Qi
		System.out.println("\n==================== Qi =====================");
		service.sortOnPriceHighToLow();
		
		// Qj
		System.out.println("\n==================== Qj =====================");
		service.sortOnBrandLowToHigh();
		
		// Qk
		System.out.println("\n==================== Qk =====================");
		service.sortOnBrandHighToLow();
		
		// Ql
		System.out.println("\n==================== Ql =====================");
		service.sortOnPriceLowToHighAndSizeLowToHigh();
		
		// Qm
		System.out.println("\n==================== Qm =====================");
		service.sortOnPriceLowToHighAndBrandLowToHigh();
		
		// Qn
		System.out.println("\n==================== Qn =====================");
		service.sortOnBrandLowToHighAndPriceLowToHigh();
		
		// Qo
		System.out.println("\n==================== Qo =====================");
		service.sortOnBrandHighToLowAndPriceHighToLow();
		
		// Qp
		System.out.println("\n==================== Qp =====================");
		service.displayAllTheBrands();
		
		// Qq
		System.out.println("\n==================== Qq =====================");
		service.displayAllTheSize();
		
		// Qr List all the colour available
		System.out.println("\n=========== Qr. List all the colour available ============");
		service.displayAllTheColor();
		
		// Qs Count the number of shirts available for a particular brand as per user input
		System.out.println("\n=========== Qs. Count the number of shirts available for a particular brand as per user input ============");		
		service.countShirtsOnBrand();
		
		// Qt Count the number of shirts available for a particular colour
		System.out.println("\n=========== Qt. Count the number of shirts available for a particular colour ============");		
		service.countShirtsOnColor();
		
		// Qu Count the number of shirts available for a particular size
		System.out.println("\n=========== Qu. Count the number of shirts available for a particular size ============");		
		service.countShirtsOnSize();
		
		// Qv.Count the number of shirts available in each brand
		System.out.println("\n=========== Qv.Count the number of shirts available in each brand ============");
		service.countShirtsAvailableInEachBrand();
		
		// Qw. Count the number of shirts available in each size
		System.out.println("\n=========== Qw. Count the number of shirts available in each size ============");
		service.countShirtsAvailableInEachSize();

		// Qx. Count the number of shirts available in each colour
		System.out.println("\n=========== Qx. Count the number of shirts available in each colour ============");
		service.countShirtsAvailableInEachColor();
	}
}
