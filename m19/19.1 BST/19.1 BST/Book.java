/**.
 * Class for book.
 */
public class Book implements Comparable<Book> {
    /**.
     * book name of String type
     */
    private String bookname;
    /**.
     * auhtor of book of String type
     */
    private String author;
    /**.
     * price of book of double type
     */
    private double price;
    /**.
     * Constructs the object for BOok class
     *
     * @param      bookname  The bookname
     * @param      author    The author
     * @param      price     The price
     */
    Book(final String bookname, final String author, final double price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
    /**.
     * {returns book name }
     *
     * @return     { String type}
     */
    public String getbookname() {
        return this.bookname;
    }
    /**
     * returns auhtor name
     *
     * @return     { author name of String type }
     */
    public String getauthor() {
        return this.author;
    }
    /**.
     * { returns price of the book}
     *
     * @return     { price of double type}
     */
    public double getprice() {
        return this.price;
    }
    /**
     * sets bookname
     *
     * @param      bookname  The bookname
     */
    public void setbookname(String bookname) {
        this.bookname = bookname;
    }
    /**
     * sets author
     *
     * @param      author  The author
     */
    public void setauthor(String author) {
        this.author = author;
    }
    /**
     * sets price
     *
     * @param      price  The price
     */
    public  void setprice(double price) {
        this.price = price;
    }
    /**
     * compares two objects.
     *
     * @param      that  The that
     *
     * @return     {returns positive if this.bookname is greater than that.bookname else returns negative }
     */
    public  int compareTo(final Book that) {
        return this.bookname.compareTo(that.bookname);
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str =  this.bookname + ","+" "+this.author + ","+" "+this.price;
        return str;
    }
}
