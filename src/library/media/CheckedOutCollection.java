package library.media;

import java.util.ArrayList;

/**
 * CheckedOutCollection is the collection of all Media that has been checked out
 * by a specific Patron. The CheckedOutCollection has an array for Media and an
 * array for Patrons
 *
 * @author <a href="abasit1@oldwestbury.edu">Abdul Basit</a>
 */
public class CheckedOutCollection {

    private ArrayList<CheckedOutMedia> checkmedia = new ArrayList();

    /**
     * Default constructor
     */
    public CheckedOutCollection() {

    }

    /**
     * Constructor for CheckedOutCollection
     *
     * @param media an ArrayList of Media
     */
    public CheckedOutCollection(ArrayList<Media> media) {
    }

    /**
     * This methods records info of the checked out media and the info of the
     * patron checking it out
     *
     * @param insertCheckoutMedia record of info pertaining to check out
     * @return true if recorded successfully or false otherwise
     */
    public boolean insertCheckoutMedia(CheckedOutMedia insertCheckoutMedia) {
        return true;
    }

    /**
     * This method allows people to search the checked out media allowing the
     * patron to view borrowing history
     *
     * @param searchCheckedOutMedia provides checked out media history
     * @return true if this was successful or false otherwise
     */
    public boolean searchCheckedOutMedia(CheckedOutMedia searchCheckedOutMedia) {
        return true;
    }

    /**
     * This method marks the media that is currently checked out of the catalog,
     * as returned. It is only called when checkIn is true
     *
     * @param deletedCheckedOutMedia Media to be marked as returned
     *
     * @return true if this was successful or false otherwise
     */
    public boolean deleteCheckedOutMedia(CheckedOutMedia deletedCheckedOutMedia) {
        return true;
    }

    /**
     * This methods validates a renewal for media that is currently checked from
     * the catalog if it is not currently reserved already
     *
     * @param renewMedia Media is renewed
     * @return true if media was renewed successfully, false otherwise
     */
    public boolean renewMedia(CheckedOutMedia renewMedia) {
        return true;
    }

    /**
     * toString() method to CheckedOutCollection
     *
     * @return detail for every Media
     */
    @Override
    public String toString() {

        String str = "";

        for (int i = 0; i < checkmedia.size(); i++) {
            str += String.valueOf(checkmedia.get(i).getMediaId()) + " " + String.valueOf(checkmedia.get(i).getPatronId()) + ""
                    + " " + checkmedia.get(i).getBorrowDate().toString() + " " + checkmedia.get(i).getDueDate().toString()
                    + " " + checkmedia.get(i).getPatronEmail() + "\n";

        }

        return str;

    }

    public ArrayList<CheckedOutMedia> getMedia() {
        return checkmedia;
    }

}
