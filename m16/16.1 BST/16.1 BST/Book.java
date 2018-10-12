/**.
 * Class for book.
 */
class Book {
	/**.
	 * bookname
	 */
	String bookname;
	/**.
	 * author
	 */
	String author;
	/**.
	 * price
	 */
	double price;
	/**.
	 * Constructs the object.for Book class
	 *
	 * @param      bookname  The bookname
	 * @param      author    The author
	 * @param      price     The price
	 */
	Book(String bookname, String author, double price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	/**.
	 * Gets the bookname.
	 *
	 * @return     The bookname.
	 */
	public String getBookname() {
		return this.bookname;
	}
	/**.
	 * Gets the author.
	 *
	 * @return     The author.
	 */
	public String getAuthor() {
		return this.author;
	}
	/**.
	 * Gets the price.
	 *
	 * @return     The price.
	 */
	public double getPrice() {
		return this.price;
	}
	/**.
	 * Sets the bookname.
	 *
	 * @param      bookname  The bookname
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	/**.
	 * Sets the author.
	 *
	 * @param      author  The author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**.
	 * Sets the price.
	 *
	 * @param      price  The price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**.
	 * { compares two objects }
	 *
	 * @param      that  The that
	 * 
	 * @return     { compares the bookname and returns 1 if this.bookname 
	 * is greater than that.bookname else it returns -1 if equals it retuns 0 }
	 */
	public int compareTo(Book that) {
		return this.bookname.compareTo(that.bookname);
	}
}