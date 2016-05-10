package org.henrrich.jlocator;

/**
 * Created by henrrich on 13/04/2016.
 */
public enum How {
    UNSET,

    /* JProtractor locators */
    BINDING,
    INPUT,
    MODEL,
    REPEATER,
    SELECTED_OPTION,
    REPEATER_SELECTED_OPTION,
    OPTIONS,
    BUTTON_TEXT,
    PARTIAL_BUTTON_TEXT,

    /* classical selenium locators */
    CLASS_NAME,
    CSS,
    ID,
    ID_OR_NAME,
    LINK_TEXT,
    NAME,
    PARTIAL_LINK_TEXT,
    TAG_NAME,
    XPATH
}
