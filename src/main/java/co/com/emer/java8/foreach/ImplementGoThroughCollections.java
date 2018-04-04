package co.com.emer.java8.foreach;

public class ImplementGoThroughCollections {

	public static void main(String[] args) {
		GoThroughCollections goThroughCollection = new GoThroughCollections();
		goThroughCollection.useForEach();
		goThroughCollection.userSort();
		System.out.println("******Use Sort*****");
		goThroughCollection.useForEach();
		goThroughCollection.userRemoveIf();
		System.out.println("******Remove Element******");
		goThroughCollection.useForEach();
	}

}
