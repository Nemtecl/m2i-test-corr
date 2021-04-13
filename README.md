#Sujet de TP noté

##Gestion d'un parc forestier
Le projet contient des sources permettant de gérer un parc forestier. Différents types d'arbres sont disponibles. 
Un nouveau module est en cours de développement, afin de récupérer la position géographique de l'utilisateur lors de la saisie de nouveaux arbres à partir d'une API REST, dans le but de pouvoir continuer son développement, il vous est également demandé de tester cette partie de l'application.

Votre objectif sera d'écrire les tests pour l'application fournie. Il vous reviendra de remplir les fichiers de tests préalablement créés afin de couvrir le code de l'application.
Vous aurez à disposition, JUnit5 et Mockito pour l'éxécution de vos tests.
Vos assertions devront être écrites avec la bibliothèque AssertJ, présente dans le pom.xml de l'application. Vous pourrez également vous appuyer sur les plugins Jacoco et allure afin de vérifier votre avancement.

_Pour rappel_ 
* mvn clean test : permet de nettoyer votre repertoire de build et de lancer les tests, il générera également le rapport de couverture de tests en cas de succès de ceux-ci.
* mvn allure:report : permet de générer le rapport de tests via le plugin allure.

###Tests unitaires
Les fichiers nommés *Test.java *UnitTest.java contiennent les tests unitaires

####Sans mock
Comme en TP vous devrez tester la **plus petite portion de code possible** afin de vérifier les **comportements** de l'application

####Avec mocks
Les fichiers dans lesquels vous devrez utiliser des mocks, contiendront l'annotation @Mocks. 

###Tests d'intégration
Comme vous le savez, les tests d'intégration sont des tests bout en bout permettant de vérifier que notre application se comporte correctement une fois intégrée, en appelant les composants extérieurs.

###Rendu
Vous zipperez le dossier **test** contenant votre travail et le renommerez comme suit [prenom].[nom].zip
puis vous l'enverrez à l'adresse email suivante : rousseau.christopher76@gmail.com
