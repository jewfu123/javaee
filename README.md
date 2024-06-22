# javaee
some javaee samples

# javaEE sample how to run

cd javaee7-samples
mvn clean install -Dmaven.test.skip=true
cd jpa
cd native-sql-resultset-mapping
mvn clean install -Pwildfly-embedded-arquillian

-->
mvn test
mvn clean install

" You can run mvn test if you want to run Maven phases up to and including test, or mvn clean verify if you want to rebuild and test your project.

You can Use This command and run a Test mvn clean install -U -DskipTests=false

mvn -Dtest=MyResourceTest#test1Post test

$ git clone https://github.com/mkyong/maven-examples.git
$ cd maven-unit-test
$ mvn test
$ mvn -Dtest=TestMessageBuilder test
$ mvn -Dtest=TestMessageBuilder#testHelloWorld test

# Run all the unit test classes.
$ mvn test

# Run a single test class.
$ mvn -Dtest=TestApp1 test

# Run multiple test classes.
$ mvn -Dtest=TestApp1,TestApp2 test

# Run a single test method from a test class.
$ mvn -Dtest=TestApp1#methodname test

# Run all test methods that match pattern 'testHello*' from a test class.
$ mvn -Dtest=TestApp1#testHello* test

# Run all test methods match pattern 'testHello*' and 'testMagic*' from a test class.
$ mvn -Dtest=TestApp1#testHello*+testMagic* test

https://github.com/boot2docker/windows-installer/releases

----------------------------------------------
mvn clean install -pl "test-utils" -am
cd jaspic
mvn clean test -P liberty-ci-managed










































































