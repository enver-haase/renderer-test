renderer-test
==============

Shows how a custom renderer can be included within a Vaadin application.


Workflow
========

To compile the entire project, run "mvn clean install".

To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "mvn clean package"
- test the war file with "mvn jetty:run-war"
