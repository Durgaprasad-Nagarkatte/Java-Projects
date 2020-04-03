package com.durgaprasad.Books;

import java.util.Comparator;

public class PubDateDescComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(((Book)o1).getPubDate().compareTo(((Book)o2).getPubDate()) == 0){
            return (((Book)o1).getTitle().compareTo(((Book)o2).getTitle()));
        }
        else{
            return ((Book)o2).getPubDate().compareTo(((Book)o1).getPubDate());
        }
    }
}
