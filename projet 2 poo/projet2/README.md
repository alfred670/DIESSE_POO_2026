# Projet GSM - Modélisation Orientée Objet d’un Réseau Mobile

## Objectif

Ce projet a pour objectif de modéliser un réseau GSM en utilisant les principes fondamentaux de la programmation orientée objet en Java.

L’application permet de représenter les principaux composants d’un réseau mobile :

- Le réseau GSM
- Les stations de base (BTS)
- Les utilisateurs mobiles (MS)
- Les appels téléphoniques
- Les connexions et déconnexions
- La gestion de saturation des cellules

Ce projet permet également d’appliquer :

- l’encapsulation
- l’héritage
- le polymorphisme
- les interfaces
- les exceptions personnalisées
- la gestion des collections d’objets


# Fonctionnalités réalisées

## Gestion du réseau

- Création d’un réseau GSM
- Ajout de BTS
- Affichage global du réseau
- Gestion des fréquences uplink et downlink

## Gestion des BTS

Chaque BTS possède :

- un numéro
- un emplacement
- une hauteur
- un type de milieu (urbain/rural)
- une capacité maximale
- une liste d’utilisateurs connectés

Fonctionnalités :

- ajout d’utilisateurs
- suppression d’utilisateurs
- affichage des informations
- contrôle de saturation


## Gestion des utilisateurs mobiles (MS)

Chaque utilisateur possède :

- nom
- prénom
- mot de passe
- numéro SIM (MSISDN)
- historique d’appels

Fonctionnalités :

- connexion
- déconnexion
- émission d’appels
- consultation de l’historique


## Gestion des types d’utilisateurs

Deux types ont été implémentés :

### Smartphone

- connexion spécifique
- affichage personnalisé

### Tablette

- connexion spécifique
- affichage personnalisé

Cette conception illustre l’héritage et le polymorphisme.


## Gestion des appels

Chaque appel contient :

- numéro destinataire
- durée de communication

Historique sauvegardé dans chaque utilisateur.


## Gestion des exceptions

Exception personnalisée :

### SaturationBTSException

Déclenchée lorsqu’une BTS atteint sa capacité maximale.

Cela permet une gestion robuste des erreurs.


# Architecture du projet

## Package `gsm.model`

Contient les objets métier :

- Reseau
- BTS
- MS
- Smartphone
- Tablette
- Appel


## Package `gsm.interfaces`

Contient :

- Connectable

Permet la connexion/déconnexion polymorphique.


## Package `gsm.exception`

Contient :

- SaturationBTSException


## Package `gsm.main`

Contient :

- TestReseau

Point d’entrée principal du projet.


# Concepts POO utilisés

## Encapsulation

Les attributs sont privés/protégés et manipulés via méthodes.


## Héritage

`Smartphone` et `Tablette` héritent de `MS`.

## Polymorphisme

Les objets enfants redéfinissent :

- `seConnecter()`
- `seDeconnecter()`
- `afficherInfos()`


## Interface

`Connectable` impose :

- connexion
- déconnexion


## Exception personnalisée

Gestion de la saturation BTS.


## Collections

Utilisation de `ArrayList` pour :

- liste des BTS
- liste des utilisateurs
- historique des appels

# Scénario de test exécuté

Création :

- Réseau Orange
- BTS à Bafoussam
- 1 Smartphone
- 1 Tablette

Actions :

- Connexion au réseau
- Ajout à la BTS
- Passage d’appel
- Affichage du réseau
- Consultation historique


# Résultat obtenu

Exemple d’affichage :

```java
Réseau : Orange

===== BTS =====
Numero : 1
Emplacement : Bafoussam
Hauteur : 30.0
Milieu : Urbain
Capacité : 3
Connectés : 2

Appel vers 690112233 (5 min)
```


# Difficultés rencontrées

- gestion correcte des packages Java
- résolution des erreurs NetBeans
- correction du constructeur BTS
- gestion des exceptions personnalisées
- organisation orientée objet propre


# Ce que ce projet m’a appris

Ce projet m’a permis de mieux comprendre :

- la modélisation orientée objet
- la séparation des responsabilités
- l’utilisation des interfaces
- la gestion d’exceptions
- le polymorphisme appliqué
- la structuration professionnelle d’un projet Java


# Perspectives d’amélioration

Améliorations possibles :

- interface graphique JavaFX
- gestion multi-cellules
- handover automatique
- simulation de mobilité
- statistiques temps réel
- gestion avancée des appels

# Conclusion

Ce projet illustre une modélisation réaliste d’un réseau GSM en Java.

Il montre comment la programmation orientée objet permet de représenter efficacement des systèmes télécoms complexes à travers des classes spécialisées, organisées et réutilisables.

Ce travail constitue une base solide pour la conception de systèmes réseaux plus avancés.