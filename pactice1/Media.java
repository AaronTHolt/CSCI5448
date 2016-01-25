abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }

    public int compareTo(Media obj)
    {
        // boolean type = typeCompare(this, obj);
        int typeCmp = typeCompare(this, obj);

        if ((typeCmp == 0) && (this instanceof DVD))
        {
            typeCmp = this.dvdCompare(obj);
        }
        else if ((typeCmp == 0) && (this instanceof Book))
        {
            typeCmp = this.bookCompare(obj);
        }
        else if (typeCmp == 0)
        {
            typeCmp = this.getTitle().compareTo(obj.getTitle());
        }

        return typeCmp;

    }

    public int typeCompare(Object obj1, Object obj2)
    {
        if (obj1.getClass() == obj2.getClass()){
            return 0;
        }
        try
        {
            return obj1.toString().compareTo(obj2.toString());
        } catch (Exception e)
        {
            return 1;
        }
        
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
