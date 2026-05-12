# TP9 - Persistance et organisation professionnelle

## Objectif

Ce TP a pour objectif d’ajouter la persistance des données dans l’application IPPlan-Manager.

L’application doit désormais :

- Lire les besoins réseau depuis un fichier CSV
- Générer automatiquement un plan d’adressage VLSM
- Créer les VLANs associés
- Produire des recommandations techniques
- Sauvegarder les résultats dans des fichiers CSV et TXT
- Générer un rapport technique complet

Ce TP introduit également une architecture plus professionnelle avec une séparation claire des responsabilités grâce à l’utilisation de packages Java.


## Notions étudiées

- Persistance des données
- Lecture de fichiers CSV
- Écriture de fichiers texte
- FileWriter
- BufferedReader
- Architecture logicielle en packages
- Repository Pattern
- Services métier
- Génération de rapports
- Organisation professionnelle d’un projet Java


## Fichiers utilisés

### Fichier d’entrée

**exports/besoins.csv**

Contenu :

```csv
Nom;Hotes
ETUDIANTS;500
WIFI_INVITES;200
ENSEIGNANTS;120
LABORATOIRES;60
SERVEURS;30
```


### Fichiers générés

**exports/plan_adressage.csv**

Contient :

- Nom du besoin
- Adresse réseau
- CIDR
- Capacité


**exports/vlans.csv**

Contient :

- ID VLAN
- Nom VLAN
- Adresse réseau associée
- CIDR
- Capacité

---

**exports/recommandations.txt**

Contient les recommandations produites automatiquement.


**exports/rapport_complet.txt**

Rapport final contenant :

- Besoins exprimés
- Plan VLSM
- VLANs créés
- Recommandations techniques


## Scénarios testés

### Scénario principal

- ETUDIANTS : 500 hôtes
- WIFI_INVITES : 200 hôtes
- ENSEIGNANTS : 120 hôtes
- LABORATOIRES : 60 hôtes
- SERVEURS : 30 hôtes

Résultat :

- Génération correcte du plan VLSM
- Création automatique des VLANs
- Détection des grands VLANs
- Détection WiFi invité
- Détection VLAN serveurs
- Génération automatique des fichiers exports


### Scénario PME

- ADMINISTRATION : 50 hôtes
- COMPTABILITE : 20 hôtes
- WIFI_INVITES : 80 hôtes
- SERVEURS : 15 hôtes
- VOIP : 40 hôtes

Résultat :

- Rapport PME généré avec succès
- Détection des recommandations spécifiques


## Difficultés rencontrées

### 1. Réorganisation en packages

Après déplacement des classes, plusieurs imports devaient être corrigés.

Exemple :

```java
import ipplanmanager.model.BesoinReseau;
```

---

### 2. Gestion des erreurs de compilation

Certaines classes ne retrouvaient plus leurs dépendances après changement de package.

Solution :

- Vérification des imports
- Clean and Build Project

---

### 3. Lecture du fichier CSV

Erreur possible si le fichier besoins.csv est absent.

Solution :

Créer le dossier :

```text
exports
```

et y placer :

```text
besoins.csv
```

---

## Réponses aux questions

### 1. Qu’est-ce que la persistance des données ?

La persistance permet de conserver durablement les données dans un support comme un fichier ou une base de données.


### 2. Pourquoi une application professionnelle doit-elle sauvegarder ses résultats ?

Pour permettre leur réutilisation, leur partage, leur analyse future et éviter leur perte après fermeture du programme

### 3. Quelle est la différence entre un fichier CSV et un rapport texte ?

Le CSV est structuré pour être exploité automatiquement par des logiciels.

Le rapport texte est destiné à une lecture humaine.


### 4. Pourquoi a-t-on créé un package repository ?

Pour regrouper les classes responsables de la lecture et de l’écriture des données.


### 5. Pourquoi a-t-on créé un package service ?

Pour regrouper la logique métier et les traitements techniques.


### 6. Pourquoi ne faut-il pas écrire tout le code dans Main ?

Cela rend le programme difficile à maintenir, à tester et à faire évoluer.


### 7. Pourquoi le fichier besoins.csv rend-il l’application plus flexible ?

Il permet de modifier les besoins sans modifier le code source Java.


### 8. Pourquoi la séparation en packages améliore-t-elle la maintenabilité ?

Elle facilite l’organisation, la lisibilité et l’évolution du projet


## Conclusion

Le TP9 marque une étape importante dans l’évolution de IPPlan-Manager.

L’application devient capable de :

- Lire des données externes
- Produire des traitements automatisés
- Sauvegarder ses résultats
- Générer des rapports techniques exploitables