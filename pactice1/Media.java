abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }

    public int compareTo(Media obj)
    {
        if ( (this instanceof DVD) && (this.getClass() == obj.getClass()) )
        {
            return this.subCompare(obj);
        }


        return this.getTitle().compareTo(obj.getTitle());
    }

    protected int subCompare(Media obj)
    {
      // this should not be called directly
      return 0; // could throw an exception here too
    }

}
