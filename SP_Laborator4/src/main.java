public class main {
	
	public String Author;
	public String Book;
	public String Chapter;
	public String subChapter;
	public int Paragraph;
	public String Image;
	public String Table;
	
	public main(String A, String B, String C, String sC, int P, String I, String T)
	{
		this.Author = A;
		this.Book = B;
		this.Chapter = C;
		this.subChapter = sC;
		this.Image = I;
		this.Table = T;
	}
	
	public static void main(String [] args)
	{
//		Book onEarth = new Book ("On Earth");
//		Author pAndrei = new Author ("Porcarin Andrei");
//		onEarth.addAuthor(pAndrei);
//		int indexOfChapter = onEarth.createChapter("Chapter One");
//		Chapter chOne = onEarth.getChapter(indexOfChapter);
//		int indexOfSubChapter = chOne.createSubChapterList("Chapter One One");
//		subChapter chOneOne = chOne.getSubChapter(indexOfSubChapter);
//		int indexOfParagraph = chOneOne.createParagraphList("Paragraph 1");
//		int indexOfImage = chOneOne.createImageList("Image 1");
//		int indexOfParagraph2 = chOneOne.createParagraphList("Paragraph 2");
//		int indexOfParagraph3 = chOneOne.createParagraphList("Paragraph 3");
//		int indexOfTable = chOneOne.createTableList("Table 1");
//		onEarth.print();
		
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Capitolul 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor prezenti!"));
		noapteBuna.addContent(cap1);
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Paragraph("Image from subchapter 1.1.1.1"));
		noapteBuna.print();
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}

	public String getBook()
	{
		return Book;
	}

	public void setBook(String book)
	{
		Book = book;
	}

//	public String getChapter()
//	{
//		return Chapter;
//	}
//
//	public void setChapter(String chapter)
//	{
//		Chapter = chapter;
//	}
//
//	public String getSubChapter()
//	{
//		return subChapter;
//	}
//
//	public void setSubChapter(String subChapter)
//	{
//		this.subChapter = subChapter;
//	}

	public int getParagraph()
	{
		return Paragraph;
	}

	public void setParagraph(int paragraph)
	{
		Paragraph = paragraph;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getTable()
	{
		return Table;
	}

	public void setTable(String table)
	{
		Table = table;
	}
	
	
}
