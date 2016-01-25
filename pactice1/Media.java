abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }

    public int compareTo(Media obj)
    {
        if ( (this instanceof DVD) && (this.getClass() == obj.getClass()) )
        {
            return this.dvdCompare(obj);
        }

        if ( (this instanceof Book) && (this.getClass() == obj.getClass()) )
        {
            return this.bookCompare(obj);
        }

        return this.getTitle().compareTo(obj.getTitle());
    }

    public int typeCompare(Object obj1, Object obj2)
    {
        
    }

    protected int dvdCompare(Media obj)
    {
      // this should not be called directly
      return 0; // could throw an exception here too
    }

    protected int bookCompare(Media obj)
    {
      // this should not be called directly
      return 0; // could throw an exception here too
    }

}
