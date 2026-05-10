# TP6 - VLAN et segmentation logique (IPPlan-Manager)

## Objectif

Ce TP permet d’ajouter la gestion des VLANs dans IPPlan-Manager afin de transformer les sous-réseaux générés en segments logiques exploitables dans une infrastructure réseau réelle.

L’application devient capable de :
- créer des VLANs
- associer automatiquement des sous-réseaux aux VLANs
- gérer une collection de VLANs
- rechercher et analyser des VLANs

##  Notions étudiées

- VLAN (Virtual Local Area Network)
- Segmentation logique réseau
- Relations entre objets (VLAN ↔ sous-réseaux)
- Gestionnaire métier
- Collections (ArrayList)
- Architecture orientée objet avancée


##  Structure du projet

## Fonctionnalités principales

### Classe VLAN
Chaque VLAN contient :
- un identifiant VLAN (1 à 4094)
- un nom logique
- un sous-réseau associé (ResultatVLSM)
- une description


### GestionnaireVLAN
La classe `GestionnaireVLAN` permet :
- d’ajouter des VLANs
- de lister tous les VLANs
- de rechercher un VLAN par ID
- de compter les VLANs


### Association VLAN ↔ Réseau
Chaque VLAN est directement lié à un résultat VLSM :
- un VLAN = une segmentation logique
- un sous-réseau = une allocation IP
 

## Scénario de test

Besoins réseau simulés :
- TECHNIQUE : 120 hôtes
- WIFI : 80 hôtes
- ADMINISTRATION : 50 hôtes
- SERVEURS : 20 hôtes

Réseau de départ :
- 192.168.1.0


## Résultats obtenus

Le programme génère automatiquement :

- des VLANs numérotés (10, 20, 30…)
- des sous-réseaux VLSM associés
- une segmentation logique complète
- une infrastructure réseau organisée

      ##  Exemple de sortie
VLAN 10 → TECHNIQUE → 192.168.1.0/25  
VLAN 20 → WIFI → 192.168.1.128/25  
VLAN 30 → ADMINISTRATION → 192.168.2.0/26  
 

##  Difficultés rencontrées

- compréhension du lien VLAN ↔ sous-réseau
- gestion des objets imbriqués
- structuration de la logique métier
- organisation des collections de VLANs


##  Réponses aux questions

1. Les VLANs améliorent la sécurité et la segmentation réseau.
2. Un VLAN est lié à un sous-réseau pour isoler les flux.
3. La séparation logique limite les accès non autorisés.
4. GestionnaireVLAN centralise la gestion des VLANs.
5. VLAN contient ResultatVLSM pour lier logique et adresse IP.
6. ArrayList permet de gérer plusieurs VLANs dynamiquement.
7. La séparation des responsabilités rend le code maintenable.
8. Le projet devient une application réseau réaliste.

##  Conclusion

Le TP6 introduit la segmentation logique réseau avec les VLANs. Le projet IPPlan-Manager devient maintenant une architecture complète de gestion d’adressage IP et de segmentation réseau proche des systèmes professionnels.