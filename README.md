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

----------------------------------------------
mvn clean test -Parq-wildfly-remote


Username must be alphanumeric with the exception of the following accepted symbols (",", "-", ".", "/", "=", "@", "\")

add-user.bat  -a -u 'quickstartUser#123' -p '123456' -g 'guest'

quickstartUser
123456
 <secret value="MTIzNDU2" />

## Payara5 + Mysql jar => jdbc connection setting
1. download and copy mysql-connector-j-8.0.33.jar to 
	glassfish/lib/
	domain/domain1/lib/

2. asadmin> run command
	asadmin add-library /path/to/mysql-connector-java-bin.jar

3. add JDBC connect pools:
	if mysql version >= 8.0 the select Mysql8 else Mysql
	*set password is needed!

4. ping and testing ok!



























































