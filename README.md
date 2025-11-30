<p align="center">
<a href="https://github.com/atgotreaux/site/actions/workflows/tests.yml"><img src="https://github.com/atgotreaux/site/workflows/Tests/badge.svg" alt="Tests"></a>
<a href="https://github.com/atgotreaux/site/actions/workflows/code-style.yml"><img src="https://github.com/atgotreaux/site/workflows/Code%20Style/badge.svg" alt="Code Style"></a>
<a href="https://github.com/atgotreaux/site/actions/workflows/code-coverage.yml"><img src="https://github.com/atgotreaux/site/workflows/Code%20Coverage/badge.svg" alt="Code Coverage"></a>
<a href="https://github.com/atgotreaux/site/actions/workflows/static-analysis.yml"><img src="https://github.com/atgotreaux/site/workflows/Static%20Analysis/badge.svg" alt="Static Analysis"></a>
<a href="https://github.com/atgotreaux/site/actions/workflows/dependency-vulnerabilities.yml"><img src="https://github.com/atgotreaux/site/workflows/Dependency%20Vulnerabilities/badge.svg" alt="Dependency Vulnerabilities"></a>
</p>

Personal website at **[gotreaux.com](https://gotreaux.com/)**.

This project is powered by [**Spring Boot**](https://spring.io/projects/spring-boot/).

## Requirements

* [**Maven 3.9.10+**](https://maven.apache.org/download.cgi)
* [**Java 25**](https://jdk.java.net/25/)

## Installation

1. Import the project into your IDE of choice ([IntelliJ](https://www.jetbrains.com/help/idea/maven-support.html) | [Eclipse](https://projects.eclipse.org/projects/technology.m2e) | [NetBeans](https://netbeans.apache.org/wiki/main/wiki/MavenBestPractices/)).
2. Confirm run configuration for the `com.gotreaux.site.Application` class ([IntelliJ](https://www.jetbrains.com/help/idea/run-debug-configuration.html) | [Eclipse](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.cdt.doc.user%2Ftasks%2Fcdt_t_new_run_config.htm) | [NetBeans](https://netbeans.apache.org/tutorial/main/kb/docs/java/quickstart/)).
3. Build the project with Maven ([Spring Getting Started Guide](https://spring.io/guides/gs/maven/)). `mvn clean package` will create a fat jar if you prefer an executable file. The application will be accessible at `localhost:8080`.