# multi_gradle
[gradle multiple projects](http://rominirani.com/2014/07/29/gradle-tutorial-part-3-multiple-java-projects/)

**Add Eclipse Project Steps**

1. cd javaprojects
2. gradle build
3. gradle cleanEclipse eclipse
4. ./gradlew cleanEclipse eclipse

**build.gradle in root folder**

1. all sub project have junit
2. api depends on common
3. app depends on api and common
4. common requires Apache Commons Lang 3.3.2
5. api requires Apache Commons Lang 3.3.2 and Apache Log4j 1.2.7
6. app requires Apache Log4j 1.2.7

**Gradle project wrapper init**
1. gradle wrapper

**Git project init**
1. git init
