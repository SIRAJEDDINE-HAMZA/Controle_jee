# Activite-Pratique-du-Controle
<h1><i>1-Objectif :</i><h1>
<h3>Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.</h3>
<ol>
  <li>Micro-service customer-service qui permet de gérer les client</li>
  <li>Micro-service inventory-service qui permet de gérer les produits</li>
  <li>Gateway Spring cloud Gateway avec une Configuration statique du système de routage</li>
  <li>Annuaire Eureka Discrovery Service</li>
  <li>Configuration dynamique des routes de la gateway</li>
  <li>Service de facturation Billing-Service en utilisant Open Feign</li>
  <li>Client Web Angular (Clients, Produits, Factures)</li>
  <li>Déployer le serveur keycloak :</li>
  <dl>
  <dt>- Créer un Realm</dt>
  <dt>- Créer un client à sécuriser</dt>
  <dt>- Créer des utilisateurs</dt>
  <dt>- Créer des rôles</dt>
  <dt>- Affecter les rôles aux utilisateurs</dt>
  <dt>- Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token</dt>
  </dl>
  <li>Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak</li>
</ol>
<h1><i>2-Architecture de l'activité pratique :</i><h1>
<img src="https://user-images.githubusercontent.com/48455549/206859150-63e5c806-86a2-4937-8791-9a7ce2464316.PNG">
<h1><i>3-Simulation :</i><h1>
  <ul>Eureka Service</ul>
 <img src = "https://user-images.githubusercontent.com/86418817/209120950-23069a4a-8163-4844-9247-9b79373e9606.png">
  <ul>Costumor-Service</ul>
 <img src="https://user-images.githubusercontent.com/86418817/209121508-002b484b-be48-4de1-92d2-1ec32a37c1a9.png">
  <ul>Inventory-Service</ul>
 <img src="https://user-images.githubusercontent.com/86418817/209121870-f47295d6-60b7-4949-8aa9-b0b4738c5ae2.png">
  <ul>Billing-Service</ul>
 <img src="https://user-images.githubusercontent.com/86418817/209122455-2077a795-572f-4b7c-9471-0443b7847d00.png">

<h1><i>4-Partie Front Angular :</i><h1>
<ul>Liste des produits</ul>
<ul>Liste des clients</ul>
<ul>Liste des factures d'un client</ul>
<ul>Details d'une facture d'un client</ul>
<h1><i>5-Keycloak :</i><h1>
<ul>authentication with client secret</ul>
<ul>authentication with password</ul>
<ul>authentication with refresh token</ul>
