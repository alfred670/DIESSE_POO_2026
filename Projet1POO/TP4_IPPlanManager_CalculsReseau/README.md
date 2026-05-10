# TP4 - Calculs réseau automatiques

##  Objectif

Ce TP introduit les calculs automatiques dans l’application IPPlan-Manager.  
L’objectif est de permettre à l’application de déterminer automatiquement des informations réseau essentielles comme :

- le nombre d’hôtes disponibles
- la classe d’adresse IP
- le masque décimal
- la capacité d’un réseau
- la détection de réseaux privés


##  Notions étudiées

- Méthodes statiques (static)
- Classe utilitaire
- Calculs réseau IPv4
- CIDR et masques de sous-réseau
- Manipulation de chaînes (split)
- Logique algorithmique
- Réutilisation des classes du TP précédent


## Structure du projet

Le projet contient les TP suivants :


## ⚙️ Fonctionnalités ajoutées

### Classe CalculateurReseau

Cette classe permet de :

- calculer le nombre d’hôtes disponibles
- déterminer la classe d’une adresse IP
- convertir un CIDR en masque décimal
- vérifier si une adresse est privée


###  Amélioration de ReseauIP

La classe `ReseauIP` affiche maintenant automatiquement :

- la classe réseau
- le masque décimal
- la capacité maximale
- si le réseau est privé ou public


##  Tests réalisés

- Test avec réseau 192.168.1.0/24
- Test avec réseau 172.16.0.0/16
- Test avec réseau 10.0.0.0/8
- Vérification des classes A, B, C
- Vérification du calcul des hôtes
- Vérification des réseaux privés


## Difficultés rencontrées

- Compréhension du calcul du nombre d’hôtes
- Manipulation des méthodes statiques
- Intégration des calculs dans une classe existante
- Gestion des chaînes IP (split)


##  Réponses aux questions

### 1. Pourquoi une classe utilitaire ?
Pour regrouper les calculs réseau et éviter de les répéter dans plusieurs classes.

### 2. Rôle de static
Permet d’appeler une méthode sans créer d’objet.

### 3. Importance des calculs réseau
Ils permettent d’automatiser la configuration et éviter les erreurs humaines.

### 4. Utilité du CIDR
Il définit la taille du réseau et le nombre d’hôtes disponibles.

### 5. Pourquoi les hôtes dépendent du masque ?
Car le masque définit le nombre de bits disponibles pour les machines.

### 6. Pourquoi des IP privées ?
Pour les réseaux internes non accessibles depuis Internet.

### 7. Séparation logique métier / calcul
Améliore la lisibilité, la maintenance et l’organisation du code.

### 8. Automatisation des calculs
Permet de gagner du temps et de réduire les erreurs réseau.
