PPA1 - Carlos Henriquez and Adam Wood Project Report

Java and Junit naming and organizational comventions:
Our code was written in java and the testing framework we used was Junit5.
The conventions of Junit are not set in stone and there were many different
styles that we discovered when researching, so we decided to go with the
convention for naming the tests directly after the functionality that they
are testing for. Then we decided to group the test functions together by
the function that they tested in the order that the functions appear in our
ppa1Function class top to bottom. This way it was easy to identify which tests
were for which function and the order in which they would appear.

Installation and Operation Instructions:
1. There are 3 required pieces of software. Install in the order listed to be sure
that there are no dependency issues.

Git: required to download the source code from our repository
https://git-scm.com/downloads
Github: no download in required but an account will be necessary to pull the repository
https://github.com

Java SE Development Kit 12: required to develop Java code on your machine
https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html

Eclipse IDE: Used to run the tests as well as receive code coverage details
https://www.eclipse.org/downloads/

2. Once all of the software is installed, you must pull the repository into your eclipse.
Listed below are a few substeps that walk through the process of going from the eclipse
home page to having the program and tests running in the eclipse workspace.

a) In the top left click File then import in the dropdown menu.
b) In the import menu select the Git dropdown (2nd on current eclipse versions)
   and select Projects from Git. Hit next.
c) Select Clone URI. Hit next.
d) Copy paste this into the URI text box:

https://github.com/carlosh24/PPA-1---Unit-Testing-Functions.git

   Leave the other settings as they are and hit next.
   If it prompts you for a username and password, enter your github information.
e) On the branch selection leave it as it is and hit next.
f) On the local destination you may change the installation directory to any
   folder on your computer that you have write access to.
g) On wizard selection change nothing and hit next.
h) On the import projects page The PPA1 Folder should already be selected.
   If it is hit finish and you are done. If it isn't and finish is greyed
   out, hit the checkbox and then hit finish.

3. Now that the project is installed you can open the source files for the code and tests
by navigating to the PPA1 project in the package explorer and hitting the dropdown. Hitting
the dropdown called src. Hitting the dropdown called (default package). Then double clicking
the files called ppa1Function.java and ppa1FunctionTest.java.

4. You can run the code by clicking the ppa1Interface.java window and navigating to the run 
tab at the top and selecting the run dropdown. The command line interface can now be typed 
into at the terminal in the bottom of the IDE.

5. You can run the tests by clicking the ppa1FunctionTest.java window and selecting Run -> Run as
and the only available option should be Junit Test.

6. Finally you can see the code coverage by having the ppa1FunctionTest.java window open and going to
Run -> Coverage As -> Junit test

TDD Experience:
	- Carlos A. Henriquez Urena: 
My experience with unit testing has been pleasant because i feel 
like doing this testing makes us see what edge cases and more possible outcomes that can happen in our code.
My TDD experience was pleasant but i still prefer coding before testing  since it feels much faster.
But TDD is a really good implementation to make sure your code is working well. The benefits of tdd is less buggy code, 
better understanding on the ways our code is suppose to work or what could make it fail. The drawbacks of TDD are that is a slower process fo coding. 
In my opinion thats my only drawback of TDD. 

	- Adam Wood:
My prior experience with unit testing was very minimal. I had written a few tests for classes and interviews, but rarely utilized them
for my own code. Unit testing and TDD are both very tedious. Its hard to create meaningful test cases sometimes and a lot of the time it
just justifies code that you already knew worked. That is the drawbacks, but there are definitely positives too. While a lot of the time
it felt tedious, a few times it caught errors that probably would have gone unseen, like floating point rounding errors and such. It also
helped us consider things like edge cases and output formats before ever writing code, so we essentially knew the format for how it was
going to be written in. TDD is definitely useful for large projects, probably even essential because it sets the coder on a straight path.
There won't be as many errors in design, because many of the problems will be considered from the start. and solutions coded in from the
start.

	


