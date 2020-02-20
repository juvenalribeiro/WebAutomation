<p><strong>1. Framework Web Automation Java</strong></p>

<p>This framework is characterized by its simplicity of implementation, has the basic and necessary methods for testing Web applications in browsers Chrome, Firefox, Internet Explorer and Headless mode.</p>

<ul>
	<li>Main technologies used and validated on this framewor></li>
</ul>

<p><strong><em>The versions described below are the versions in which this framework was developed and used in market projects.<br />
Note: The framework has encapsulation features that allow any versioning of the technologies described.</em></strong></p>

<p>Java JDK- 8 Update 241&nbsp;<br />
Cucumber -&nbsp;1.2.5<br />
junit -&nbsp;4.12<br />
selenium-java - 3.6.0<br />
maven-cucumber-reporting - 3.14.0<br />
maven-compiler -&nbsp;3.5.1<br />
Chrome -&nbsp;Version 76.0.3809.87 (Official Build) (64-bit) or bellow.<br />
<em>If you have a diferent version above downgrade your chrome version for a best performance, also you can remove this option &quot;version(&quot;76.0.3809.68&quot;)&quot; from the chrome drive manager to get the latest version of Chrome driver inside CoreQA class maybe is necessary some adjustment to execution.&nbsp;</em></p>

<p><strong>2. Architecture</strong></p>

<p><u>Page Object Oriented&nbsp;</u></p>

<p>The page object model is a design pattern which promotes reusability and modularization of automation objects within a test automation framework.</p>

<p>Inside to the package explorer we find:</p>

<p><strong>Pages</strong> - This package are for the all Pages classes, this means here we can create all specific&nbsp;methods that will be reused for any business flow that is needed for example:&nbsp;<br />
<em>Class LoginPage - Crate the method fillUserName (String name), on this method set the locator for name element and a set text for this field and this method can be called for any other busines flow defined&nbsp;on scenarios. If the Web Element &quot;Name&quot; to changed for &quot;FirstName&quot; the correction of this change will occur only at this code and all flows thas use it will be corrected.&nbsp;</em></p>

<p><strong><em>Steps -&nbsp;</em></strong>This package are for all busines flow are described on cucumber/gherking using BDD methodology references, here we make calls to all methods defined in the &quot;Pages&quot; package, here we create classes and method&nbsp;that make sense for the business and can be reused in the various user stories that are defined in cucumber, this package becomes the library of sentences that can be specified in cucumber. for example:<br />
<em>Class PaymentCreditCard -&nbsp;The credit card payment user story begins by logging in to the system&gt; Select credit card payment option&gt; completing payment data&gt; confirming data&gt; making payment. In&nbsp;this situation maybe is necessary call to a&nbsp;set of methods defined in their respective classes until you reach the goal of the scenario, on the flow described we gona call the method &quot;fillUserName&quot; provided by the class LoginPage&nbsp;providing as variable a String name on the method call.</em></p>

<p><strong>Support -&nbsp;</strong>This package are for the all basic/essentials for the automation work, here we have the Web Driver creation, the driver options, the basic methods for sellenium and any other basic structure as necessary. For example:<br />
<em>Class CoreQA - here are all the basic selenium method like,&nbsp;getText,&nbsp;waitElement and&nbsp;isDisplayed, if the project require&nbsp;this is where other necessary selenium methods are created.</em></p>

<p>Inside this package should be created only methods that can be reused within the framework itself, here it is possible to contribute to the evolution of this tool and not just to the specific project, so in any situation it is necessary to create new classes or tools that have unique characteristics of the project in question here not is the place this type of implementation occours on Page package.&nbsp;</p>

<p><strong>test/feature -&nbsp;</strong>&nbsp;This fold are all the features.file used to decribe the scenarios to test, example:</p>

<p><em>#language: en<br />
@Demo<br />
Feature: Home page of Senta Portal Verifications</em></p>

<p><em>&nbsp; Scenario: People finder a existing person with sucess<br />
&nbsp; &nbsp; Given that accessing the Senta homepage<br />
&nbsp; &nbsp; When the page is loaded<br />
&nbsp; &nbsp; And click on &quot;My Apps&quot; label on HubNav<br />
&nbsp; &nbsp; And open &quot;People Finder&quot; application<br />
&nbsp; &nbsp; And the People Finder is loaded<br />
&nbsp; &nbsp; When search for &quot;Juvenal Ribeiro&quot;<br />
&nbsp; &nbsp; Then name &quot;Ribeiro, Juvenal&quot; is displyed on results</em></p>

<p><strong>Runner -&nbsp;</strong>This package are for the Hooks and Runner classes, both are related to the test execution.<br />
Hook.java - Define the after and before conditions.&nbsp;<br />
Runner.java - Define the tags, glue for cucumber and plugins to be used during test execution.&nbsp;</p>

<p><strong>3. Setup</strong></p>

<p>3.1 - Java<br />
- Go to Java Oracle and download the installation wizard for Java JDK- 8 Update 241.<br />
- Install the java&nbsp;according to the basic wizzard installation step by step.<br />
- Go to environment variables and check if the JAVA_HOME variable are create, if not create the variable named JAVA_HOME with value referring to Path Java \ jdk installed on your system.<br />
- Check the installation on cmd with the command java -version</p>

<p>3.2 - Maven<br />
- Go to Apache Maven Project and dowload the source Apache Maven.<br />
- Put the folder on the same Java path.&nbsp;<br />
- Create a&nbsp;environment variables and create the MAVEN_HOME with value referring the path of maven.<br />
- Add the value &quot;%MAVEN_HOME%\bin&quot; in environment variable &quot;path&quot;.<br />
- Check the installation on cmd with the command mvn -version</p>

<p>&nbsp;3.3 - IDE<br />
&nbsp;&nbsp;Note: you can use an IDE are you confortable, on this configuration the example will be Ecplise IDE.<br />
- Go to Eclipse Project Page and dowload&nbsp;Version: Photon Release (4.8.0) Build id: 20180619-1200<br />
- Install the IDE according to the setup Wizzard.<br />
- Open the IDE and go to Help &gt; Eclipse Market Place &gt; Search for cucumber eclipse Plugin and install.&nbsp;<br />
- The IDE must be restarted.</p>

<p>&nbsp;3.4 - Importing project<br />
- Download the project folder.<br />
- Open IDE and go to file&gt;import&gt;Existing Maven Projects&gt; select the path and finish.&nbsp;</p>

<p>&nbsp;</p>

<p><strong>4. First Run</strong></p>

<p>Inside to the project have a demo for Senta home page, just open the Runner file and Run,&nbsp;Enjoy, explore and contribuite.</p>

<p>The framework it is optimized for chrome and headless, it is possible to run on firefox and internet explorer but adjustments are require, you can set this on BaseSteps.java.<br />
To run the tests on cmd command line:<br />
- Open CMD &gt; go to the project path and run the command mvn -verify<br />
- This execution generated the cucumber report on path: \target\reports\cucumber-html-reports open report-tag-{executionTagName} and check.</p>

<p>&nbsp;</p>
