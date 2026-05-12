# TP8 - Moteur de recommandations

## Objectif

Ajouter un moteur de recommandations capable d'analyser un plan VLAN et de proposer automatiquement des conseils techniques intelligents à partir des bonnes pratiques réseau.

L'application IPPlan-Manager devient ainsi un assistant capable :

- d'analyser automatiquement les VLANs créés ;
- de détecter certains cas nécessitant une attention particulière ;
- de proposer des recommandations de sécurité et d’optimisation ;
- de démontrer l’utilisation du polymorphisme via les interfaces Java.


## Notions étudiées

Ce TP a permis d'étudier les notions suivantes :

- Interfaces Java
- Polymorphisme
- Règles métier
- Architecture orientée objet
- Séparation des responsabilités
- Extensibilité logicielle
- Analyse intelligente de VLAN
- Génération automatique de recommandations


## Scénarios testés

### Scénario principal

Plan généré automatiquement avec les besoins suivants :

- ETUDIANTS : 500 hôtes
- WIFI_INVITES : 200 hôtes
- ENSEIGNANTS : 120 hôtes
- LABORATOIRES : 60 hôtes
- SERVEURS : 30 hôtes


### Tests effectués

### Test 1 : Détection VLAN WiFi

Le moteur détecte automatiquement :

- WIFI_INVITES

Recommandation produite :

Isolation du réseau WiFi invité.


### Test 2 : Détection VLAN Serveurs

Le moteur détecte automatiquement :

- SERVEURS

Recommandation produite :

Protection renforcée avec ACL et supervision prioritaire.


### Test 3 : Détection grands VLANs

Détection automatique des VLANs ayant une capacité supérieure à 200 hôtes.

Exemples :

- ETUDIANTS
- WIFI_INVITES

Recommandation produite :

Surveiller les broadcasts réseau.


## Recommandations obtenues

Exemple de sortie :

```text
[MOYENNE] VLAN de grande taille :
Le VLAN ETUDIANTS possède une grande capacité.
Il faut surveiller les broadcasts.

[ÉLEVÉE] Isolation du WiFi :
Le VLAN WIFI_INVITES doit être isolé des VLANs internes sensibles.

[MOYENNE] VLAN de grande taille :
Le VLAN WIFI_INVITES possède une grande capacité.
Il faut surveiller les broadcasts.

[ÉLEVÉE] Protection du VLAN Serveurs :
Le VLAN SERVEURS doit être protégé par des ACL et surveillé en priorité.


### Difficultés rencontrées

Plusieurs difficultés ont été rencontrées :

### 1. Erreur de compilation dans RecommandationGrandVLAN

Cause :

La méthode :

```java
getReseauAssocie()
```

n'était pas définie dans la classe VLAN.

Solution :

Ajout du getter dans `VLAN.java`.


### 2. Accès à la capacité réseau

Cause :

La méthode :

```java
getCapacite()
```

était absente de `ResultatVLSM`.

Solution :

Ajout du getter correspondant.


### 3. Liaison entre moteur et règles

Compréhension nécessaire du polymorphisme :

Le moteur manipule des objets de type :

```java
RegleRecommandation
```

mais exécute automatiquement la logique propre à chaque classe.


## Réponses aux questions

### 1. Quel est le rôle d’un moteur de recommandations dans un outil IPAM ?

Il aide l’administrateur à prendre de meilleures décisions techniques en proposant automatiquement des conseils réseau.


### 2. Pourquoi utilise-t-on une interface pour les règles de recommandation ?

Pour imposer une méthode commune à toutes les règles et faciliter l’extensibilité.


### 3. Quelle est la différence entre une classe concrète et une interface ?

Une classe concrète contient une implémentation réelle.  
Une interface définit seulement un contrat.


### 4. Pourquoi la méthode analyser() peut-elle retourner null ?

Parce qu’aucune recommandation n’est nécessaire si aucune condition n’est détectée.


### 5. Pourquoi le moteur illustre-t-il le polymorphisme ?

Parce qu’il manipule plusieurs classes différentes via un même type commun : `RegleRecommandation`.


### 6. Pourquoi créer une classe par règle ?

Cela rend le code plus clair, modulaire, maintenable et extensible.


### 7. Pourquoi un VLAN WiFi invité doit-il être isolé ?

Pour éviter qu’un utilisateur externe accède au réseau interne sensible.


### 8. Pourquoi les grands VLANs doivent-ils être surveillés ?

Parce qu’ils augmentent :

- le trafic broadcast ;
- les risques de saturation ;
- la surface d’attaque ;
- la difficulté de supervision.

## Résultat final

Le TP8 fonctionne correctement :

- génération automatique des VLANs
- analyse intelligente
- recommandations dynamiques
- architecture extensible
- utilisation correcte des interfaces et du polymorphisme

