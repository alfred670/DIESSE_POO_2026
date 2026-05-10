# TP5 - Moteur VLSM (IPPlan-Manager)

## Objectif

Ce TP a pour objectif de développer un moteur VLSM (Variable Length Subnet Mask) permettant de générer automatiquement un plan d’adressage IP à partir de besoins exprimés par l’utilisateur.

L’application devient capable de :
- analyser des besoins en hôtes
- calculer automatiquement les CIDR adaptés
- découper un réseau en sous-réseaux optimisés
- générer un plan d’adressage complet


##  Notions étudiées

- VLSM (Variable Length Subnet Mask)
- Tri de collections (ordre décroissant)
- Algorithmes de découpage réseau
- Conversion IP ↔ entier
- Classes de service métier
- Manipulation d’ArrayList
- Séparation besoin / résultat


##  Structure du projet


##  Fonctionnalités du TP5

###  Gestion des besoins réseau
La classe `BesoinReseau` permet de représenter une demande utilisateur :
- nom du service
- nombre d’hôtes nécessaires


###  Résultat VLSM
La classe `ResultatVLSM` représente un sous-réseau calculé :
- adresse réseau
- CIDR
- masque décimal
- capacité du réseau


###  Moteur VLSM
La classe `MoteurVLSM` :
- trie les besoins du plus grand au plus petit
- calcule automatiquement les CIDR adaptés
- attribue les plages IP sans chevauchement


###  Calculateur réseau enrichi
La classe `CalculateurReseau` permet :
- conversion IP → entier
- entier → IP
- calcul CIDR optimal
- calcul taille de bloc réseau


##  Scénario de test

Besoins testés :
- TECHNIQUE : 120 hôtes
- WIFI : 80 hôtes
- ADMIN : 50 hôtes
- SERVEURS : 20 hôtes
- DIRECTION : 10 hôtes

Réseau de départ :
- 192.168.1.0


## Résultats obtenus

Le programme génère automatiquement un plan VLSM :

- attribution des CIDR adaptés
- découpage optimisé du réseau
- absence de chevauchement
- allocation efficace des adresses IP


## Difficultés rencontrées

- compréhension du principe VLSM
- gestion des conversions IP en entier
- calcul dynamique des blocs réseau
- tri des besoins par ordre décroissant


## Réponses aux questions

1. Le VLSM évite le gaspillage d’adresses IP en adaptant la taille des sous-réseaux.
2. Les grands besoins doivent être traités en premier pour éviter la fragmentation.
3. Un besoin est une demande, un résultat VLSM est une solution calculée.
4. La classe MoteurVLSM contient la logique métier du découpage réseau.
5. La conversion en entier facilite les calculs arithmétiques sur les IP.
6. Elle permet de déterminer le masque adapté au nombre d’hôtes.
7. Parce qu’elles sont réservées au système réseau.
8. Parce qu’il automatise complètement la planification réseau.


## Conclusion

Le TP5 marque l’évolution du projet IPPlan-Manager vers un outil intelligent capable de générer automatiquement un plan d’adressage réseau réaliste basé sur des contraintes réelles.