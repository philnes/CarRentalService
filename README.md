# CarRentalService

Vorgabe:
Entwickeln Sie ein RESTful Autoverleih Web Service, welches zumindest folgende Funktionen abbilden soll: 

1. Abfragen verfügbarer Autos
2. Buchen von Autos in verschiedenen Währungen
3. Retournieren von Autos

Für den Zugriff auf das Web Service ist ein Authentifizierungsmechanismus erforderlich.

Für die Währungsumrechnung soll folgendes Web Service verwendet werden: WS2- Währungsumrechung (Python)

Konfiguration:
- Import Exisiting Project into Eclipse
- Deployment Tomcat 8.0 (Download: https://tomcat.apache.org/download-80.cgi)
- Configure Tomcat-Server in Eclipse, s. https://crunchify.com/step-by-step-guide-to-setup-and-install-apache-tomcat-server-in-eclipse-development-environment-ide/
- Rechtsklick auf Server --> Add and Remove... --> Projekt rechts hinzufügen
- Starten des Tomcat-Servers
- Abfrage verfügbarer Autos über localhost:8080/CarRentalService/rest/car
