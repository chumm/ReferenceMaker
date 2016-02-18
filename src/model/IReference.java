package model;

import java.util.ArrayList;

/**
 * Created by CHUMM on 14/02/2016.
 * Interface for interacting with the stored references in the program
 */
public interface IReference
{
    public ArrayList<Reference> retrieveAllReferences();
    public boolean addReference(Reference x);
    public boolean removeReference(Reference x);

    // If saved in custom format
    public boolean convertToHarvard(Reference x);
}
