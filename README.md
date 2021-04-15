# Java IDE
This project has two parts:
1) <b>compile:</b> A web service that compiles Java code.
2) <b>web:</b> A simple one page website that provides a code editor for writing and executing Java code. 

## Note
1) Both projects are JDK 11 based Spring Boot projects and can run both on Windows and Linux.
2) <b>compile-0.0.1-SNAPSHOT.jar</b> and <b>web-0.0.1-SNAPSHOT.jar</b> are pre-built versions of the 2 projects mentioned above.
3) To rebuild the projects run <b>mvn clean install</b> inside the <b>compile</b> and <b>web</b> folders.
4) After running the above command, a folder named <b>target</b> will be generated. There you will have your newly built JAR file. 

## How to run?
1) Install JDK 11.
2) Add JDK 11 to the path.
3) Extract <b>java_ide.zip</b>.
4) If on windows then place <b>java_ide</b> folder in <b>D drive</b>. (Path: D:\java_ide)
5) If on linux then place <b>java_ide</b> folder at root or "/" and grant full privilege, i.e., <b>sudo chmod 777 java_ide</b>.
6) There are 2 JAR files in this repository <b>compile-0.0.1-SNAPSHOT.jar</b> and <b>web-0.0.1-SNAPSHOT.jar</b>.
7) Open 2 terminal windows in the folder were you have these JARs.
8) Run <b>java -jar compile-0.0.1-SNAPSHOT.jar</b> in one terminal and in the other run <b>java -jar web-0.0.1-SNAPSHOT.jar</b>.
9) Open browser and visit <b>http://localhost:5600/</b>.
10) Sample Java code snippets are provided in <b>snippets.txt</b> for testing purposes.
