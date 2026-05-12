# TP10 - Application finale IPPlan-Manager

## Objectif

Ce projet constitue l’assemblage final de l’application IPPlan-Manager.  
Il permet de regrouper toutes les fonctionnalités développées dans les TP précédents afin de produire une application console complète de planification d’adressage IP.

L’application permet :
- la saisie des besoins réseau,
- la génération automatique d’un plan VLSM,
- la création des VLANs associés,
- la validation du plan,
- la génération de recommandations techniques,
- la sauvegarde des résultats,
- la génération d’un rapport technique.


## Fonctionnalités réalisées

- Saisie interactive des besoins réseau via console
- Génération automatique du plan d’adressage VLSM
- Calcul des sous-réseaux et capacités
- Création automatique des VLANs
- Validation du plan d’adressage IP
- Détection des incohérences réseau
- Génération de recommandations réseau
- Sauvegarde des résultats en fichiers CSV et TXT
- Génération d’un rapport technique global
- Architecture modulaire en packages (MVC simplifié)

## Organisation du projet

###  model
Contient les objets métier :
- BesoinReseau
- ResultatVLSM
- VLAN
- Recommandation

###  service
Contient la logique métier :
- CalculateurReseau
- MoteurVLSM
- GestionnaireVLAN
- ValidateurPlanAdressage
- MoteurRecommandation
- ApplicationIPPlanManager
- RapportService

###  repository
Gestion des fichiers :
- BesoinRepository
- FichierPlanRepository

### ⚠ exception
Gestion des erreurs :
- AdresseIPInvalideException
- ConflitVLANException
- ChevauchementReseauException

### 🖥 console
Interface utilisateur :
- ConsoleService

###  main
Point d’entrée :
- Ma

## Scénarios testés

### ✔ Scénario 1 : Campus IRT
- ETUDIANTS : 500 hôtes  
- WIFI_INVITES : 200 hôtes  
- ENSEIGNANTS : 120 hôtes  
- LABORATOIRES : 60 hôtes  
- SERVEURS : 30 hôtes  


### ✔ Scénario 2 : PME
- ADMINISTRATION : 50 hôtes  
- COMPTABILITE : 20 hôtes  
- WIFI_INVITES : 80 hôtes  
- SERVEURS : 15 hôtes  
- VOIP : 40 hôtes  

### ✔ Scénario 3 : Entreprise multi-services
- TECHNIQUE : 120 hôtes  
- DIRECTION : 25 hôtes  
- CAMERAS : 60 hôtes  
- SUPPORT : 35 hôtes  
- INVITES : 100


### Fichiers produits :
- *_plan.csv → Plan d’adressage VLSM
- *_vlans.csv → Configuration VLAN
- *_recommandations.txt → Conseils réseau
- *_rapport.txt → Rapport technique complet
- *_besoins.csv → Export des besoins (option fichier)

## Difficultés rencontrées

- Gestion correcte du calcul VLSM et alignement des blocs IP
- Organisation du projet en packages cohérents
- Synchronisation entre génération VLSM et VLAN
- Gestion des exceptions réseau complexes
- Structuration d’une application console complète


## Réponses aux questions

### 1. Pourquoi le TP10 est plus complet ?
Il regroupe toutes les fonctionnalités des TP précédents dans une seule application fonctionnelle.

### 2. Rôle de ApplicationIPPlanManager
C’est l’orchestrateur principal qui coordonne tous les services.

### 3. Pourquoi Main est courte ?
Elle sert uniquement à lancer l’application sans logique métier.

### 4. Importance des packages
Ils permettent une architecture propre, maintenable et professionnelle.

### 5. Pourquoi ConsoleService ?
Pour isoler la gestion des entrées utilisateur.

### 6. Validation adresse réseau
Pour éviter des erreurs de calcul et garantir un plan cohérent.

### 7. Pourquoi recommandations après VLAN ?
Parce qu’elles dépendent de la structure réseau finale.

### 8. Importance de la sauvegarde
Permet la persistance et l’exploitation des résultats.

### 9. Importance du rapport technique
Il permet une documentation professionnelle du projet.

### 10. Améliorations futures
- Interface graphique
- Export PDF
- Base de données
- API REST
- Simulation réseau temps réel


## Conclusion personnelle

Ce projet a permis de comprendre comment une application Java peut être structurée de manière professionnelle en utilisant la programmation orientée objet.  
Il met en évidence l’importance de la séparation des responsabilités, de la modularité et de la réutilisation du code dans un projet logiciel complet.