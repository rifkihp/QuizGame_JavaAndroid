package com.example.quizgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is a correct syntax to output Hello World in Java?","System.out.println(\"Hello World\");","print (\"Hello World\");","Console.WriteLine(\"Hello World\");","echo(\"Hello World\");","System.out.println(\"Hello World\");","");
        final QuestionsList question2 = new QuestionsList("Java is short for JavaScript?","False","True","Maybe","50/50","False","");
        final QuestionsList question3 = new QuestionsList("How do you insert COMMENTS in Java code? ","/*This is a comment","#This is a comment","//This is a comment","<!--This is a comment-->","//This is a comment","");
        final QuestionsList question4 = new QuestionsList("Which data type is used to create a variable that should store text?","string","String","myString","Txt","String","");
        final QuestionsList question5 = new QuestionsList("How do you create a variable with the numeric value 5?","x = 5;","float x = 5;","num x = 5;","int x = 5;","int x = 5;","");
        final QuestionsList question6 = new QuestionsList("How do you create a variable with the floating number 2.8?","x = 2.8f;","float x = 2.8f;","byte x = 2.8f;","int x = 2.8f;","float x = 2.8f;","");
        final QuestionsList question7 = new QuestionsList("Which method can be used to find the length of a string?","getLength()","getSize()","length()","len()","length()","");
        final QuestionsList question8 = new QuestionsList("Which operator is used to add together two values?","The + sign","The * sign","The ^ sign","The & sign","The + sign","");
        final QuestionsList question9 = new QuestionsList("Which method can be used to return a string in upper case letters?","tuc()","upperCase()","touppercase()","toUpperCase()","toUpperCase()","");
        final QuestionsList question10 = new QuestionsList("Which operator can be used to compare two values?","=","==","><","<>","==","");
        final QuestionsList question11 = new QuestionsList("To declare an array in Java, define the variable type with:","{}","()","[]","~~","[]","");
        final QuestionsList question12 = new QuestionsList("How do you create a method in Java?","methodName.","methodName[]","(methodName)","methodName()","methodName()","");
        final QuestionsList question13 = new QuestionsList("How do you call a method in Java?","methodName[];","(methodName);","methodName;","methodName();","methodName();","");
        final QuestionsList question14 = new QuestionsList("Which keyword is used to create a class in Java?","MyClass","class","className","class()","class","");
        final QuestionsList question15 = new QuestionsList("Which method can be used to find the highest value of x and y?","Math.Largest(x,y)","Math.maximum(x,y)","Math.max(x,y)","Math.maxNum(x,y)","Math.max(x,y)","");
        final QuestionsList question16 = new QuestionsList("Which operator is used to multiply numbers?","*","x","%","#","*","");
        final QuestionsList question17 = new QuestionsList("Which keyword is used to import a package from the Java API library?","import","package","lib","getlib","import","");
        final QuestionsList question18 = new QuestionsList("How do you start writing an if statement in Java?","if x > y:","if (x > y)","if x > y then:","if { x > y }","if (x > y)","");
        final QuestionsList question19 = new QuestionsList("How do you start writing a while loop in Java?","x > y while{","while x > y{","while x > y:","while (x > y){","while (x > y){","");
        final QuestionsList question20 = new QuestionsList("Which keyword is used to return a value inside a method?","void","break","get","return","return","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does PHP stand for?","PHP: Hypertext Preprocessor","Private Home Page","Personal Hypertext Processor","Programming Helps People","Personal Hypertext Processor","");
        final QuestionsList question2 = new QuestionsList("PHP server scripts are surrounded by delimiters, which?","<?php...?>","<&>...</&>","<?php>...</?>","<script>...</script>","<?php...?>","");
        final QuestionsList question3 = new QuestionsList("How do you write \"Hello World\" in PHP","\"Hello World\";","echo \"Hello World\";","Document.Write(\"Hello World\");","console.log(\"Hello World\")","echo \"Hello World\";","");
        final QuestionsList question4 = new QuestionsList("All variables in PHP start with which symbol?","$","%","&","!","$","");
        final QuestionsList question5 = new QuestionsList("What is the correct way to end a PHP statement?",".",";","New line","</php>",";","");
        final QuestionsList question6 = new QuestionsList("The PHP syntax is most similar to:","Perl and C","VBScript","JavaScript","Assembler","Perl and C","");
        final QuestionsList question7 = new QuestionsList("How do you get information from a form that is submitted using the \"get\" method?","$_GET[];","Request.Form","Request.QueryString","HTTPGET","$_GET[];","");
        final QuestionsList question8 = new QuestionsList("What is the correct way to include the file \"time.inc\" ?","<?php include file=\"time.inc\"; ?>","<?php include:\"time.inc\"; ?>","<!-- include file=\"time.inc\" -->"," <?php include \"time.inc\"; ?>","<?php include \"time.inc\"; ?>","");
        final QuestionsList question9 = new QuestionsList("What is the correct way to create a function in PHP?","new_function myFunction()","create myFunction()","function myFunction()","func myFunction()","function myFunction()","");
        final QuestionsList question10 = new QuestionsList("What is the correct way to open the file \"time.txt\" as readable?","open(\"time.txt\");","open(\"time.txt\",\"read\");","fopen(\"time.txt\",\"r+\");","fopen(\"time.txt\",\"r\");","fopen(\"time.txt\",\"r\");","");
        final QuestionsList question11 = new QuestionsList("Which superglobal variable holds information about headers, paths, and script locations?","$_SESSION","$_GET","$GLOBALS","$_SERVER","$_SERVER","");
        final QuestionsList question12 = new QuestionsList("What is the correct way to add 1 to the $count variable?","++count","$count=+1","count++;","$count++;","$count++;","");
        final QuestionsList question13 = new QuestionsList("What is a correct way to add a comment in PHP?","/*...*/","<!--...-->","*/.../*","<comment>...</comment>","/*...*/","");
        final QuestionsList question14 = new QuestionsList("Which one of these variables has an illegal name?","$my_Var","$my-Var","$myVar","#myVar","$my-Var","");
        final QuestionsList question15 = new QuestionsList("How do you create a cookie in PHP?","setcookie()","makecookie()","createcookie","selectcookie()","setcookie()","");
        final QuestionsList question16 = new QuestionsList("How do you create an array in PHP?","$cars = array(\"Volvo\", \"BMW\", \"Toyota\");","$cars = \"Volvo\", \"BMW\", \"Toyota\";","$cars = array[\"Volvo\", \"BMW\", \"Toyota\"];","$cars = array{\"Volvo\", \"BMW\", \"Toyota\"};","$cars = array(\"Volvo\", \"BMW\", \"Toyota\");","");
        final QuestionsList question17 = new QuestionsList("Which operator is used to check if two values are equal and of same data type?","!=","===","=","==","===","");
        final QuestionsList question18 = new QuestionsList("Which of the following type of variables are sequences of characters, like 'PHP supports string operations.'?","Strings","Arrays","Objects","Resources","Strings","");
        final QuestionsList question19 = new QuestionsList("Which of the following magic constant of PHP returns function name?","_LINE_","_FILE_","_FUNCTION_","_CLASS_","_FUNCTION_","");
        final QuestionsList question20 = new QuestionsList("Which of the following array represents an array with a numeric index? ","Numeric Array","Associative Array","Multidimentional Array","None of the above","Numeric Array","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);


        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("What is a correct syntax to output \"Hello World\" in Python?","print(\"Hello World\")","echo \"Hello World\"","echo(\"Hello World\");","p(\"Hello World\")","print(\"Hello World\")","");
        final QuestionsList question2 = new QuestionsList("How do you insert COMMENTS in Python code?","#Comment","//Comment","/*Comment*/","%Comment%","#Comment","");
        final QuestionsList question3 = new QuestionsList("Which one is NOT a legal variable name?","Myvar","my-var","_myvar","my_var","my-var","");
        final QuestionsList question4 = new QuestionsList("How do you start writing a while loop in Python?","while (x > y)","x > y while {","while x > y {","while x > y:","while x > y:","");
        final QuestionsList question5 = new QuestionsList("What is the correct file extension for Python files?",".pt",".pyt",".pyth",".py",".py","");
        final QuestionsList question6 = new QuestionsList("How do you start writing a for loop in Python?","for x > y:","for each x in y:","foreach(x in y)","for x in y:","for x in y:","");
        final QuestionsList question7 = new QuestionsList("What is the correct syntax to output the type of a variable or object in Python?","print(typeOf(x))","print(type(x))","print(typeof(x))","print(typeof x)","print(type(x))","");
        final QuestionsList question8 = new QuestionsList("What is the correct way to create a function in Python?","function myfunction():","def myFunction():","create myFunction():","func myFunction():","def myFunction():","");
        final QuestionsList question9 = new QuestionsList("What is a correct syntax to return the first character in a string?","x = sub(\"Hello\", 0, 1)","x = \"Hello\".sub(0, 1)","x = \"Hello\"[0]","x = \"Hello\".charAt(0)","x = \"Hello\"[0]","");
        final QuestionsList question10 = new QuestionsList("Which method can be used to remove any whitespace from both the beginning and the end of a string?","trim()","strip()","len()","ptrim()","strip()","");
        final QuestionsList question11 = new QuestionsList("Which method can be used to return a string in upper case letters?","upper()","toUpperCase()","upperCase()","uppercase()","upper()","");
        final QuestionsList question12 = new QuestionsList("Which method can be used to replace parts of a string?","replaceString()","replace()","switch()","repl()","replace()","");
        final QuestionsList question13 = new QuestionsList("Which operator is used to multiply numbers?","#","x","%","*","*","");
        final QuestionsList question14 = new QuestionsList("Which operator can be used to compare two values?","><","==","=","<>","==","");
        final QuestionsList question15 = new QuestionsList("Which of these collections defines a LIST?","{\"name\": \"apple\", \"color\": \"green\"}","[\"apple\", \"banana\", \"cherry\"]","[\"apple\", \"banana\", \"cherry\"]","{\"apple\", \"banana\", \"cherry\"}","[\"apple\", \"banana\", \"cherry\"]","");
        final QuestionsList question16 = new QuestionsList("Which of these collections defines a TUPLE?","[\"apple\", \"banana\", \"cherry\"]","{\"apple\", \"banana\", \"cherry\"}","(\"apple\", \"banana\", \"cherry\")","{\"name\": \"apple\", \"color\": \"green\"}","(\"apple\", \"banana\", \"cherry\")","");
        final QuestionsList question17 = new QuestionsList("Which of these collections defines a SET?","{\"apple\", \"banana\", \"cherry\"}","(\"apple\", \"banana\", \"cherry\")","[\"apple\", \"banana\", \"cherry\"]","{\"name\": \"apple\", \"color\": \"green\"}","{\"apple\", \"banana\", \"cherry\"}","");
        final QuestionsList question18 = new QuestionsList("Which of these collections defines a DICTIONARY?","(\"apple\", \"banana\", \"cherry\")","[\"apple\", \"banana\", \"cherry\"]","{\"name\": \"apple\", \"color\": \"green\"}","{\"apple\", \"banana\", \"cherry\"}","{\"name\": \"apple\", \"color\": \"green\"}","");
        final QuestionsList question19 = new QuestionsList("Which collection is ordered, changeable, and allows duplicate members?","DICTIONARY","LIST","SET","TUPLE","LIST","");
        final QuestionsList question20 = new QuestionsList("Which collection does not allow duplicate members?","TUPLE","SET","LIST","ARRAY","SET","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> jsQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Inside which HTML element do we put the JavaScript?","<scripting>","<js>","<script>","<javascript>","<script>","");
        final QuestionsList question2 = new QuestionsList("Where is the correct place to insert a JavaScript?","Both the <head> section and the <body> section are correct","The <body> section","The <head> section","Wherever I want","Both the <head> section and the <body> section are correct","");
        final QuestionsList question3 = new QuestionsList("What is the correct syntax for referring to an external script called \"xxx.js\"?","<script href=\"xxx.js\">","<script src=\"xxx.js\">","<script name=\"xxx.js\">","<script source=\"xxx.js\">","<script src=\"xxx.js\">","");
        final QuestionsList question4 = new QuestionsList("How do you write \"Hello World\" in an alert box?","msgBox(\"Hello World\");","msg(\"Hello World\");","alertBox(\"Hello World\");","alert(\"Hello World\");","alert(\"Hello World\");","");
        final QuestionsList question5 = new QuestionsList("How do you create a function in JavaScript?","function = myFunction()","function myFunction()","function:myFunction()","function<>myFunction()","function myFunction()","");
        final QuestionsList question6 = new QuestionsList("How do you call a function named \"myFunction\"?","call function myFunction()","call myFunction()","myFunction()","func myFunction()","myFunction()","");
        final QuestionsList question7 = new QuestionsList("How to write an IF statement in JavaScript?","if (i == 5)","if i = 5 then","if i == 5 then","if i = 5","if (i == 5)","");
        final QuestionsList question8 = new QuestionsList("How to write an IF statement for executing some code if \"i\" is NOT equal to 5?","if (i != 5)","if i <> 5","if i =! 5 then","if (i <> 5)","if (i != 5)","");
        final QuestionsList question9 = new QuestionsList("How does a WHILE loop start?","while (i <= 10; i++)","while (i <= 10)","while i = 1 to 10","while i = 1 : 10","while (i <= 10)","");
        final QuestionsList question10 = new QuestionsList("How does a FOR loop start?","for (i = 0; i <= 5)","for i = 1 to 5","for (i = 0; i <= 5; i++)","for (i <= 5; i++)","for (i = 0; i <= 5; i++)","");
        final QuestionsList question11 = new QuestionsList("How can you add a comment in a JavaScript?","<!--This is a comment-->","//This is a comment","'This is a comment","%This is a comment%","//This is a comment","");
        final QuestionsList question12 = new QuestionsList("What is the correct way to write a JavaScript array?","var colors = \"red\", \"green\", \"blue\"","var colors = 1 = (\"red\"), 2 = (\"green\"), 3 = (\"blue\")","var colors = [\"red\", \"green\", \"blue\"]","var colors = (1:\"red\", 2:\"green\", 3:\"blue\")","var colors = [\"red\", \"green\", \"blue\"]","");
        final QuestionsList question13 = new QuestionsList("How do you round the number 7.25, to the nearest integer?","Math.rnd(7.25)","Math.round(7.25)","round(7.25)","rnd(7.25)","Math.round(7.25)","");
        final QuestionsList question14 = new QuestionsList("How do you find the number with the highest value of x and y?","ceil(x, y)","top(x, y)","Math.ceil(x, y)","Math.max(x, y)","Math.max(x, y)","");
        final QuestionsList question15 = new QuestionsList("How can you detect the client's browser name?","navigator.appName","browser.name","client.navName","nav.client.name","navigator.appName","");
        final QuestionsList question16 = new QuestionsList("Which event occurs when the user clicks on an HTML element?","onmouseover","onmouseclick","onclick","onchange","onclick","");
        final QuestionsList question17 = new QuestionsList("How do you declare a JavaScript variable?","var carName;","v carName;","variable carName;","carName;","var carName;","");
        final QuestionsList question18 = new QuestionsList("Which operator is used to assign a value to a variable?","-","*","x","=","=","");
        final QuestionsList question19 = new QuestionsList("What will the following code return: Boolean(10 > 9)","false","true","NaN","Undefined","true","");
        final QuestionsList question20 = new QuestionsList("How to insert a comment that has more than one line?","//This comment hasmore than one line//","/*This comment has more than one line*/","<!--This comment has more than one line-->","#This comment has more than one line#","/*This comment has more than one line*/","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 13; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "python":
                return pythonQuestions();
            default:
                return jsQuestions();

        }
    }
}
