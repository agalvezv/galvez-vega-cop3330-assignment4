package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 alex g-v
 */

public class ListManagement {

    //Preset set of array lists for
    //title
    //description
    //due date
    //bool to mark complete part of a list
    //dominating list of lists that represent the total package of items and info

    //Strings to intake information received from interface
    //constructor to receive in bulk
    //get and set for each type string to receive in a larger bulk

    //get and setter for each array list

    //get set in the vein of this:
    /*
        public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
     */

    //function to add this into array list
    //this can be implemented simply with using the add functionality
    //this add function will represent the add operations of multiple lists that are part of the title, description and so on.

    //function to sort list
    //sort will be a private functino and used internally in list management
    //most likely I will bring in java.util.Collections
    //and sort using its sort option for the titles and
    //using a loop to adjust description and due date in conjunction with the alphabetically arranged titles

    //function to remove from the array list
    //this will be implemented with the remove function that is part of the array list
    //this add function will represent the remove operations of multiple lists that are part of the title, description and so on.
    //obviously as an item is taken from the list everything else must be removed

    //function edit array lists
    //loop to parse through and find a match for what needs to change,
    //compare it to a scanned string
    //if no match is found print that nothing is found
    //if a match /is/ found then edit the information of the specific variable
    //replace old variable with new variable


    //function for  lists completion
    //bool in the array list is set to false if the item is incomplete
    //use a loop to check for a specific match
    //as things will be organize it might be possible to use a binary search
    //if match found set item on array list to true
    //adjust other array lists according with loop method

    //function to print completed parts of list
    //loop to print out completed items with the bool parameter as a check

    //function to print non-completed parts of list
    //loop to print out non-completed items with the bool parameter as a check

}
