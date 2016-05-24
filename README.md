# jpagefactory

## Summary:

JPageFactory is a set of Selenium Java `FindBy` annotations that eases the usage of Selenium page object pattern for automating Angular based web application. 

JPageFactory is implemented based on [JProtractor fork from sergueik](https://github.com/sergueik/jProtractor) and provides the following web elements locating strategies as original Selenium `FindBy` annotations:
* ID
* Name
* XPath
* CSS
* Class Name
* Tag Name
* Link Text / Partial Link Text
   
as well as the following locating strategies from Protractor:
* Binding
* Input
* Model
* Repeater
* Button Text / Partial Button Text
* Options / Selected Options / Repeater Selected Options

JPageFactory also supports defining different locators of the same web element for both desktop web and mobile applications.
 
## Annotation Usage:

*** Find element by Angular binding**
_html_: `<h2>{{latest}}</h2>`
_annotation_: `@FindBy(how = How.BINDING, using = "latest")`

*** Find input element with Angular ng-model**

*** Find element with Angular ng-model**

*** Find elements of Angular ng-repeater**
   