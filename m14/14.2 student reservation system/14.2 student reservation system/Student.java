/**
 * Class for student.
 */
class Student {
    /**.
     * { name of string type }
     */
    private String name;
    /**.
     * { date of string tupe }
     */
    private String date;
    /**.
     * { marks1 of int type }
     */
    private int marks1;
    /**.
     * { marks2 of int type  }
     */
    private int marks2;
    /**.
     * { marks3 of int type }
     */
    private int marks3;
    /**.
     * { total of int type }
     */
    private int total;
    /**.
     * { category of string type }
     */
    private String category;
    /**.
     * Constructs the object.
     *
     * @param      nme      The nme
     * @param      dte      The dte
     * @param      m1       The m 1
     * @param      m2       The m 2
     * @param      m3       The m 3
     * @param      tot      The total
     * @param      categry  The categry
     */
    Student(final String nme, final String dte, final int m1,
        final int m2, final int m3, final int tot, final String categry) {
        this.name = nme;
        this.date = dte;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.total = tot;
        this.category = categry;
    }
    /**.
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * Gets the date.
     *
     * @return     The date.
     */
    public String getDate() {
        String revdate = "";
        revdate = date.substring(2 + 2 + 2) + "-"
        + date.substring(2 + 1, 2 + 2 + 1) + "-" + date.substring(0, 2);
        return revdate;
    }
    /**.
     * Gets the marks 1.
     *
     * @return     The marks 1.
     */
    public int getMarks1() {
        return this.marks1;
    }
    /**.
     * Gets the marks 2.
     *
     * @return     The marks 2.
     */
    public int getMarks2() {
        return this.marks2;
    }
    /**.
     * Gets the marks 3.
     *
     * @return     The marks 3.
     */
    public int getMarks3() {
        return this.marks3;
    }
    /**.
     * Gets the total.
     *
     * @return     The total.
     */
    public int getTotal() {
        return this.total;
    }
    /**.
     * Gets the category.
     *
     * @return     The category.
     */
    public String getCategory() {
        return this.category;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String print() {
        return this.getName() + "," + this.getTotal() + ","
        + this.getCategory();
    }
    // time complexity of this method is O(1) as it checks one time.
    /**.
     * { compares two objects }
     *
     * @param      that  The that
     *
     * @return     { retuns 1 if condition is staisfied returns -1
     elseif condition is satisfied returns 0 else condition is statisfied }
     */
    public int compareTo(final Student that) {
        if (this.getTotal() > that.getTotal()) {
            return 1;
        } else if (this.getTotal() < that.getTotal()) {
            return -1;
        } else {
            if (this.getMarks3() > that.getMarks3()) {
                return 1;
            } else if (this.getMarks3() < that.getMarks3()) {
                return -1;
            } else {
                if (this.getMarks2() > that.getMarks2()) {
                    return 1;
                } else if (this.getMarks2() < that.getMarks2()) {
                    return -1;
                } else {
                    return compareDate(this.getDate(), that.getDate());
                }
                // return 0;
            }
        }
    }
    /**.
     * { compares two strings }
     *
     * @param      d1    The d 1
     * @param      d2    The d 2
     * @return     { returns - 1 if condition statisfies else returns 1}
     */
    public int compareDate(final String d1, final String d2) {
        int res = d1.compareTo(d2);
        if (res < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
