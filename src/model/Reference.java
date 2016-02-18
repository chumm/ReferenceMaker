package model;
import java.sql.Timestamp;
/**
 * Created by CHUMM on 14/02/2016.
 *
 * This class contains all the information to create a reference of any type.
 * It is stored and kept here.
 */
public class Reference
{
    private int id;
    protected final byte MAX_VALUE = 127;
    protected final byte MAX__AUTHOR_VALUE = 16;

    public enum ReferenceType
    {
        ONLINE(1), BOOKS(2);

        private int value;
        ReferenceType(int i)
        {
            this.value = i;
        }
    }
    // All references require this data
    //--------------------------
    private String authors;
    private String datePublished;
    private String dateAccessed;
    private String lastAccessed;
    //--------------------------

    //  BOOKS
    //--------------------------
    private String ISBN10;
    private String ISBN13;
    private String publisherDetails;
    private String pageNo;          // Defined as string due to multiple page numbers being needed per source
    //--------------------------

    // ONLINE
    //--------------------------
    private String availableLocation;
    //--------------------------

    //ID FOR DB
    public int getId() {
        return id;
    }

    public boolean setId(int id)
    {
        if(id >= 0 && id <= MAX_VALUE)
        {
            this.id = id;
            return true;
        }
        else
        {
            return false;
        }
    }

    //  BOOKS
    //--------------------------
    public String getAuthors()
    {
        if(authors == null)
            return "Unknown";
        else
            return authors;
    }

    public void setAuthors(String authors) {

        if(authors == null || authors.length() <= 0 || authors.length() > MAX__AUTHOR_VALUE)
        {
            this.authors = "";
            //This is an ERROR.
            //Ensure author contains a VALUE.
        }
        else {
            this.authors = authors;
        }
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getDateAccessed() {
        return dateAccessed;
    }

    public void setDateAccessed(String dateAccessed) {
        this.dateAccessed = dateAccessed;
    }

    public String getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(String lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    public String getISBN()
    {
        if(ISBN10 != null || ISBN10 != "")
        {
            return this.ISBN10;
        }
        else
        {
            return this.ISBN13;
        }
    }

    public void setISBN(String ISBN)
    {
        if(ISBN.length() == 10)
        {
            this.ISBN10 = ISBN;
            this.ISBN13 = "";
        }
        else
        {
            this.ISBN13 = ISBN;
            this.ISBN13 = "";
        }
    }

    public String getPublisherDetails() {
        return publisherDetails;
    }

    public void setPublisherDetails(String publisherDetails) {
        this.publisherDetails = publisherDetails;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    //  online
    //--------------------------
    public String getAvailableLocation() {
        return availableLocation;
    }

    public void setAvailableLocation(String availableLocation) {
        this.availableLocation = availableLocation;
    }
}
