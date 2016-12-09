class Rectangle {
    private int length;
    private int width;
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    //accessor
    public int retLen()
    {
        return length;
    }
    public int retWid()
    {
        return width;
    }
    //mutator
    public void setSize(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    public int Area()
    {
        return (length*width);
    }

}