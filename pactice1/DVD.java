class DVD extends Media 
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}

    public int subCompare(Media obj)
    {
        DVD dvd = (DVD)obj;
        int titleCmp =  this.getTitle().compareTo(dvd.getTitle());
        int yearCmp = Integer.compare(this.getYear(), dvd.getYear());
        return (titleCmp != 0 ? titleCmp : yearCmp);
    }
}
