package org.henrrich.jlocator;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

/**
 * Created by henrrich on 14/04/2016.
 */
public class JLocatorElementLocatorFactory implements ElementLocatorFactory {

    private final SearchContext searchContext;
    private Channel channel;

    public JLocatorElementLocatorFactory(SearchContext searchContext) {
        this.searchContext = searchContext;
        this.channel = Channel.WEB;
    }

    public JLocatorElementLocatorFactory(SearchContext searchContext, Channel channel) {
        this.searchContext = searchContext;
        this.channel = channel;
    }

    public ElementLocator createLocator(Field field) {
        return new JLocatorElementLocator(searchContext, new JLocatorAnnotations(field, channel));
    }
}
