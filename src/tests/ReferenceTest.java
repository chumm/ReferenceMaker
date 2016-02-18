package tests;

import model.Reference;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by CHUMM on 18/02/2016.
 *
 * Test cases for reference class
 * contains lots of range checks for each reference type
 * Essential for DB implementation
 */



public class ReferenceTest extends TestBase {


    @org.junit.Test
    public void testGetId() throws Exception
    {
        Reference test = new Reference();
        int retrievedId = test.getId();
        Assert.assertThat(retrievedId, CoreMatchers.is(0));
        Assert.assertNotNull((retrievedId));
        Assert.assertEquals(TestBase.isPositive(retrievedId),true);
        Assert.assertTrue(retrievedId <= MAX_VALUE);

    }

    @org.junit.Test
    public void testSetId() throws Exception {
        Reference test = new Reference();

        int value = 0;
        test.setId(value);
        //Checking setting methods work
        Assert.assertEquals(value,test.getId());
        //Assert.assertFalse(test.setId(Integer.parseInt(null)));

        //Check for illegal values caught
        Assert.assertFalse(test.setId(BELOW_ZERO));
        Assert.assertFalse(test.setId(MAX_VALUE + 1));

        //Check for valid values
        Assert.assertTrue(test.setId(ABOVE_ZERO));
        Assert.assertTrue(test.setId(IS_ZERO));
    }

    @org.junit.Test
    public void testGetAuthors() throws Exception {
        Reference test = new Reference();

        //Ensure author can be returned.
        //Some references may have no author
        Assert.assertNotNull(test.getAuthors());
        Assert.assertTrue(test.getAuthors().length() <= MAX__AUTHOR_VALUE);
        Assert.assertFalse(test.getAuthors().length() <= ABOVE_ZERO);
    }

    @org.junit.Test
    public void testSetAuthors() throws Exception {
        Reference test = new Reference();

        String value = "TestAuthor";
        test.setAuthors(value);
        Assert.assertEquals(value,test.getAuthors());

        test.setAuthors(null);
        Assert.assertTrue(test.getAuthors() == "");
        String s = String.format("%0" + (MAX__AUTHOR_VALUE + 1) + "d", 0).replace('0', '0');
        test.setAuthors(s);
        Assert.assertTrue(test.getAuthors() == "");
    }

    @org.junit.Test
    public void testGetDatePublished() throws Exception {

    }

    @org.junit.Test
    public void testSetDatePublished() throws Exception {

    }

    @org.junit.Test
    public void testGetDateAccessed() throws Exception {

    }

    @org.junit.Test
    public void testSetDateAccessed() throws Exception {

    }

    @org.junit.Test
    public void testGetLastAccessed() throws Exception {

    }

    @org.junit.Test
    public void testSetLastAccessed() throws Exception {

    }

    @org.junit.Test
    public void testGetISBN() throws Exception {

    }

    @org.junit.Test
    public void testSetISBN() throws Exception {

    }

    @org.junit.Test
    public void testGetPublisherDetails() throws Exception {

    }

    @org.junit.Test
    public void testSetPublisherDetails() throws Exception {

    }

    @org.junit.Test
    public void testGetPageNo() throws Exception {

    }

    @org.junit.Test
    public void testSetPageNo() throws Exception {

    }

    @org.junit.Test
    public void testGetAvailableLocation() throws Exception {

    }

    @org.junit.Test
    public void testSetAvailableLocation() throws Exception {

    }
}