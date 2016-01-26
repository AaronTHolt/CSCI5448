class Book extends Media
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}

    public int bookCompare(Media obj)
    {
        Book book = (Book)obj;
        int titleCmp =  this.getTitle().compareTo(book.getTitle());
        int authorCmp = this.getAuthor().compareTo(book.getAuthor());
        return (titleCmp != 0 ? titleCmp : authorCmp);
    }

    // public int compareTo(Media obj)
    // {
    //     //if book, use book compare, otherwise use super.compareTo
    // }

}

