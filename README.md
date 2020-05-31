To compile and test the project:

Under Windows, perform `mvn package`. The script will produce a java installer under target. When run, the application has different visuals, compared when run as `java -jar hidpitest.jar`.

The problem is the inclusion of the JFileChooser. When this class is not included, the visuals are as expected.

Referenced in https://github.com/AdoptOpenJDK/openjdk-support/issues/112
