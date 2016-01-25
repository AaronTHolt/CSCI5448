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

    // @Override
    // public int subCompare(Media obj)
    // {
    //     return this.getTitle().compareTo(obj.getTitle());
    // }
}

