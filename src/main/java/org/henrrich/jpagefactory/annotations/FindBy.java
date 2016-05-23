package org.henrrich.jpagefactory.annotations;

import org.henrrich.jpagefactory.How;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by henrrich on 13/04/2016.
 *
 * This annotation is intended to be used to specified the element locator strategy for web elements of Unitard framework.
 * It needs to be used together with the page factory pattern and declare on the page/widget class fields that are
 * mapping to the web elements on that page/widget.
 *
 * Usage:
 * <code>
 *     public class MyPage extends GeneralPage {
 *
 *         @FindBy(how = UnitardHow.INPUT, using = "user.name")
 *         private WebElement usernameInput
 *
 *         ...
 *     }
 * </code>
 *
 * The "how", "howWeb" and "howMobile" clauses define the locator strategy.
 * The "howWeb" clause defines the locator strategy for web channel.
 * The "howMobile" clause defines the locator strategy for mobile channel.
 * If the same locator strategy is applicable for both web and mobile channels, the "how" clause can be used to simplify the annotation declaration.
 *
 * The "using", "usingWeb" and "usingMobile" clauses define the concrete locator.
 * The "usingWeb" clause defines the locator for web channel. Can be skipped if the web element is only applicable for mobile channel.
 * The "usingMobile" clause defines the locator for mobile channel. Can be skipped if the web element is only applicable for web channel.
 * If the same locator can be used for both web and mobile channels, the "using" clause can be used to simplify the annotation declaration.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface FindBy {
    How how() default How.UNSET;

    How howWeb() default How.UNSET;

    How howMobile() default How.UNSET;

    String using() default "";

    String usingWeb() default "";

    String usingMobile() default "";
}
